#!/bin/bash

echo "================================"
echo "xh1px Build Fixer Script"
echo "================================"
echo ""

# Colors
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
NC='\033[0m'

# Track success
SUCCESS=true

echo "Step 1: Cleaning project..."
if [ -f "gradlew" ]; then
    ./gradlew clean
    echo -e "${GREEN}✓ Project cleaned${NC}"
else
    echo -e "${RED}✗ gradlew not found${NC}"
    SUCCESS=false
fi

echo ""
echo "Step 2: Checking SDK configuration..."
if [ -z "$ANDROID_HOME" ] && [ -z "$ANDROID_SDK_ROOT" ]; then
    echo -e "${YELLOW}⚠ ANDROID_HOME not set${NC}"
    echo "  Set it with: export ANDROID_HOME=/path/to/android-sdk"
    SUCCESS=false
else
    echo -e "${GREEN}✓ SDK configured${NC}"
fi

echo ""
echo "Step 3: Checking local.properties..."
if [ -f "local.properties" ]; then
    echo -e "${GREEN}✓ local.properties exists${NC}"
else
    echo -e "${YELLOW}⚠ Creating local.properties${NC}"
    if [ -n "$ANDROID_HOME" ]; then
        echo "sdk.dir=$ANDROID_HOME" > local.properties
        echo -e "${GREEN}✓ Created local.properties${NC}"
    else
        echo -e "${RED}✗ Cannot create local.properties (ANDROID_HOME not set)${NC}"
        SUCCESS=false
    fi
fi

echo ""
echo "Step 4: Syncing Gradle dependencies..."
if [ -f "gradlew" ]; then
    ./gradlew dependencies --refresh-dependencies
    if [ $? -eq 0 ]; then
        echo -e "${GREEN}✓ Dependencies synced${NC}"
    else
        echo -e "${RED}✗ Dependency sync failed${NC}"
        SUCCESS=false
    fi
fi

echo ""
echo "Step 5: Generating resources..."
if [ -f "gradlew" ]; then
    ./gradlew generateDebugResources
    if [ $? -eq 0 ]; then
        echo -e "${GREEN}✓ Resources generated${NC}"
    else
        echo -e "${YELLOW}⚠ Resource generation had warnings${NC}"
    fi
fi

echo ""
echo "Step 6: Building debug APK..."
if [ -f "gradlew" ]; then
    ./gradlew assembleDebug
    if [ $? -eq 0 ]; then
        echo -e "${GREEN}✓ Build successful!${NC}"
        echo ""
        echo "APK location:"
        find app/build/outputs/apk -name "*.apk" 2>/dev/null
    else
        echo -e "${RED}✗ Build failed${NC}"
        echo ""
        echo "Common fixes:"
        echo "1. Check error messages above"
        echo "2. Run: ./gradlew build --stacktrace"
        echo "3. Update SDK: sdkmanager --update"
        echo "4. Clear caches: rm -rf ~/.gradle/caches/"
        SUCCESS=false
    fi
fi

echo ""
echo "================================"
if [ "$SUCCESS" = true ]; then
    echo -e "${GREEN}✓ All checks passed!${NC}"
    exit 0
else
    echo -e "${RED}✗ Some checks failed${NC}"
    echo "Review errors above and fix them."
    exit 1
fi
