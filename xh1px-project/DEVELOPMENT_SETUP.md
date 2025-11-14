# Android Development Setup Guide

This document describes the development environment setup for working with this Android project.

## Installed Tools

### 1. Android SDK Command Line Tools
- **Location**: `/opt/android-sdk`
- **Version**: SDK Tools 12.0
- **Components**: Command-line tools, platform-tools (when available)

### 2. Gradle Wrapper
- **Files**: `gradlew` (Linux/Mac), `gradlew.bat` (Windows)
- **Version**: 8.2
- **Purpose**: Build automation without requiring local Gradle installation

### 3. ktlint
- **Version**: 1.0.1
- **Location**: `/usr/local/bin/ktlint`
- **Purpose**: Kotlin code style validation and linting

### 4. Verification Scripts
- **verify-android-code.sh**: Comprehensive project validation
- **check-android-syntax**: Quick file syntax checking (available system-wide)

## Usage

### Running Code Verification

Before committing code, run the verification script:

```bash
cd xh1px-project
./verify-android-code.sh
```

To include a Gradle build dry-run:

```bash
./verify-android-code.sh --build
```

### Checking Individual Files

To quickly check syntax of individual files:

```bash
# Check a Kotlin file
check-android-syntax app/src/main/java/com/example/MyFile.kt

# Check a Java file
check-android-syntax app/src/main/java/com/example/MyFile.java

# Check an XML file
check-android-syntax app/src/main/res/layout/activity_main.xml
```

### Running ktlint Manually

```bash
# Check all Kotlin files
ktlint app/src/main/java/**/*.kt

# Auto-fix formatting issues
ktlint -F app/src/main/java/**/*.kt

# Check specific file
ktlint app/src/main/java/com/example/MyFile.kt
```

### Building with Gradle

```bash
cd xh1px-project

# List all available tasks
./gradlew tasks

# Build debug APK
./gradlew assembleDebug

# Build release APK
./gradlew assembleRelease

# Run lint checks
./gradlew lint

# Clean build
./gradlew clean
```

## Environment Variables

For Gradle and Android SDK to work properly, set these environment variables:

```bash
export ANDROID_HOME=/opt/android-sdk
export ANDROID_SDK_ROOT=/opt/android-sdk
export PATH=$PATH:$ANDROID_HOME/cmdline-tools/latest/bin:$ANDROID_HOME/platform-tools
```

You can source the environment setup script:

```bash
source /opt/android-sdk/setup-env.sh
```

## What Gets Verified

The `verify-android-code.sh` script checks:

1. ✅ **Project Structure** - Ensures required directories exist
2. ✅ **AndroidManifest.xml** - Validates XML syntax
3. ✅ **Kotlin Code** - Runs ktlint for style and syntax
4. ✅ **Java Code** - Checks Java files are present
5. ✅ **Resource Files** - Validates XML in layout files
6. ✅ **Gradle Configuration** - Ensures build files are present
7. ✅ **Dependencies** - Checks for required libraries
8. ⚠️  **Gradle Build** - Optional dry-run build test

## Benefits for AI Code Generation

With this setup, Claude can:

- ✅ Validate Kotlin syntax before committing
- ✅ Check XML resources for validity
- ✅ Verify Android project structure
- ✅ Ensure Gradle configuration is correct
- ✅ Catch common errors early
- ✅ Maintain consistent code style

## Limitations

Due to network/environment constraints:

- ⚠️ Full Android SDK packages may not be available
- ⚠️ Gradle builds may require internet for first run
- ⚠️ Some Android SDK tools may not function
- ✅ Basic validation and linting works offline

## Adding More Tools

To install additional tools for validation:

### Install xmllint (XML validation)
```bash
apt-get install libxml2-utils
```

### Install Android SDK packages (if network available)
```bash
/opt/android-sdk/cmdline-tools/latest/bin/sdkmanager "platform-tools" "build-tools;34.0.0"
```

## Workflow Recommendation

When working with Android code:

1. **Before writing code**: Understand the existing structure
2. **While writing code**: Follow Android conventions
3. **After writing code**: Run `./verify-android-code.sh`
4. **Before committing**: Ensure all checks pass
5. **Optional**: Run `./gradlew build` for full validation

## Troubleshooting

### Gradle wrapper fails
```bash
# Re-download gradle wrapper
cd xh1px-project/gradle/wrapper
wget https://raw.githubusercontent.com/gradle/gradle/master/gradle/wrapper/gradle-wrapper.jar
```

### ktlint reports too many issues
```bash
# Auto-fix most issues
ktlint -F app/src/main/java/**/*.kt
```

### SDK not found errors
```bash
# Set environment variables
export ANDROID_HOME=/opt/android-sdk
export ANDROID_SDK_ROOT=/opt/android-sdk
```

## Files Created

This setup created the following files:

```
/opt/android-sdk/                      # Android SDK
  ├── cmdline-tools/latest/            # SDK command-line tools
  └── setup-env.sh                     # Environment setup script

/usr/local/bin/
  ├── ktlint                           # Kotlin linter
  └── check-android-syntax             # Quick syntax checker

xh1px-project/
  ├── gradlew                          # Gradle wrapper (Linux/Mac)
  ├── gradlew.bat                      # Gradle wrapper (Windows)
  ├── verify-android-code.sh           # Verification script
  └── DEVELOPMENT_SETUP.md             # This file
```

## Next Steps

1. Run initial verification: `./verify-android-code.sh`
2. Try a sample edit and validate it
3. Run ktlint to see code style
4. Attempt a Gradle build (if SDK components available)

---

**Last Updated**: 2025-11-14
**Environment**: Linux (Ubuntu)
**Purpose**: Improve AI-assisted Android development accuracy
