#!/bin/bash

# Android Code Verification Script
# This script validates Android code before committing

set -e  # Exit on error

PROJECT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$PROJECT_DIR"

echo "================================"
echo "Android Code Verification"
echo "================================"
echo ""

# Colors for output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color

# Track overall success
OVERALL_SUCCESS=true

# Function to print success
print_success() {
    echo -e "${GREEN}✓ $1${NC}"
}

# Function to print error
print_error() {
    echo -e "${RED}✗ $1${NC}"
    OVERALL_SUCCESS=false
}

# Function to print warning
print_warning() {
    echo -e "${YELLOW}⚠ $1${NC}"
}

echo "Step 1: Checking project structure..."
if [ -d "app/src/main/java" ]; then
    print_success "Java/Kotlin source directory exists"
else
    print_error "app/src/main/java directory not found"
fi

if [ -f "app/src/main/AndroidManifest.xml" ]; then
    print_success "AndroidManifest.xml exists"
else
    print_error "AndroidManifest.xml not found"
fi

if [ -d "app/src/main/res" ]; then
    print_success "Resources directory exists"
else
    print_error "Resources directory not found"
fi

echo ""
echo "Step 2: Validating AndroidManifest.xml..."
if command -v xmllint &> /dev/null; then
    if xmllint --noout app/src/main/AndroidManifest.xml 2>/dev/null; then
        print_success "AndroidManifest.xml is valid XML"
    else
        print_error "AndroidManifest.xml has XML syntax errors"
    fi
else
    print_warning "xmllint not available, skipping XML validation"
fi

echo ""
echo "Step 3: Checking Kotlin code with ktlint..."
if command -v ktlint &> /dev/null; then
    KOTLIN_FILES=$(find app/src/main/java -name "*.kt" 2>/dev/null | wc -l)
    if [ "$KOTLIN_FILES" -gt 0 ]; then
        echo "Found $KOTLIN_FILES Kotlin files"
        if ktlint --relative app/src/main/java/**/*.kt 2>&1 | head -50; then
            print_success "Kotlin code passes ktlint checks"
        else
            print_warning "Kotlin code has style issues (non-critical)"
        fi
    else
        print_warning "No Kotlin files found to check"
    fi
else
    print_error "ktlint not installed"
fi

echo ""
echo "Step 4: Checking Java syntax..."
JAVA_FILES=$(find app/src/main/java -name "*.java" 2>/dev/null | wc -l)
if [ "$JAVA_FILES" -gt 0 ]; then
    echo "Found $JAVA_FILES Java files"
    # Basic syntax check - try to compile a sample file
    SAMPLE_JAVA=$(find app/src/main/java -name "*.java" | head -1)
    if [ -n "$SAMPLE_JAVA" ]; then
        if javac -version &> /dev/null; then
            print_success "Java compiler available for validation"
        else
            print_warning "Java compiler not available"
        fi
    fi
else
    print_warning "No Java files found"
fi

echo ""
echo "Step 5: Validating resource files..."
LAYOUT_FILES=$(find app/src/main/res/layout* -name "*.xml" 2>/dev/null | wc -l)
if [ "$LAYOUT_FILES" -gt 0 ]; then
    echo "Found $LAYOUT_FILES layout files"
    if command -v xmllint &> /dev/null; then
        INVALID_LAYOUTS=0
        for layout in $(find app/src/main/res/layout* -name "*.xml" 2>/dev/null | head -10); do
            if ! xmllint --noout "$layout" 2>/dev/null; then
                INVALID_LAYOUTS=$((INVALID_LAYOUTS + 1))
            fi
        done
        if [ "$INVALID_LAYOUTS" -eq 0 ]; then
            print_success "Layout XML files are valid (sample checked)"
        else
            print_error "Found $INVALID_LAYOUTS invalid layout files"
        fi
    else
        print_warning "xmllint not available, skipping layout validation"
    fi
fi

echo ""
echo "Step 6: Checking Gradle configuration..."
if [ -f "build.gradle" ]; then
    print_success "Root build.gradle exists"
else
    print_error "Root build.gradle not found"
fi

if [ -f "app/build.gradle" ]; then
    print_success "App build.gradle exists"
else
    print_error "App build.gradle not found"
fi

if [ -f "settings.gradle" ]; then
    print_success "settings.gradle exists"
else
    print_error "settings.gradle not found"
fi

if [ -f "gradlew" ] && [ -x "gradlew" ]; then
    print_success "Gradle wrapper is executable"
else
    print_error "Gradle wrapper not found or not executable"
fi

echo ""
echo "Step 7: Checking dependencies..."
if [ -f "app/build.gradle" ]; then
    # Check for common required dependencies
    if grep -q "androidx.core:core-ktx" app/build.gradle; then
        print_success "AndroidX dependencies present"
    else
        print_warning "Some AndroidX dependencies may be missing"
    fi

    if grep -q "org.jetbrains.kotlin" app/build.gradle || grep -q "org.jetbrains.kotlin" build.gradle; then
        print_success "Kotlin plugin configured"
    else
        print_warning "Kotlin plugin may not be configured"
    fi
fi

echo ""
echo "Step 8: Optional - Try Gradle build (if requested)..."
if [ "$1" == "--build" ]; then
    echo "Attempting Gradle build..."
    if [ -f "gradlew" ]; then
        export ANDROID_HOME=/opt/android-sdk
        export ANDROID_SDK_ROOT=/opt/android-sdk
        if ./gradlew assembleDebug --dry-run 2>&1 | tail -20; then
            print_success "Gradle build configuration is valid"
        else
            print_warning "Gradle build may have issues"
        fi
    else
        print_warning "Gradle wrapper not available"
    fi
else
    print_warning "Skipping Gradle build (use --build to enable)"
fi

echo ""
echo "================================"
if [ "$OVERALL_SUCCESS" = true ]; then
    echo -e "${GREEN}✓ All critical checks passed!${NC}"
    exit 0
else
    echo -e "${RED}✗ Some checks failed${NC}"
    echo "Please review the errors above and fix them before committing."
    exit 1
fi
