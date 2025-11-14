# xh1px - Smart Auto Clicker

This project is a reverse-engineered Android application scaffolding generated from an APK file.

## Project Information

- **Package Name**: `com.buzbuz.smartautoclicker`
- **Version**: 3.4.0 (Build 80)
- **Min SDK**: 24 (Android 7.0)
- **Target SDK**: 35 (Android 15)
- **Compile SDK**: 35

## App Description

xh1px is a smart auto-clicker app for Android that uses:
- Accessibility Services to perform automated clicking
- Media Projection for screen capture
- OpenCV for image detection and processing
- Room Database for data persistence

## Features

- Auto-clicking functionality
- Image detection and matching
- Scenario-based automation
- Quick Settings Tile integration
- Tutorial system
- Multi-language support

## Project Structure

```
xh1px-project/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/          # Decompiled source code
│   │       │   └── com/buzbuz/smartautoclicker/
│   │       ├── res/           # Resources (layouts, drawables, values)
│   │       ├── assets/        # Asset files
│   │       ├── jniLibs/       # Native libraries (.so files)
│   │       └── AndroidManifest.xml
│   ├── build.gradle           # App-level build configuration
│   └── proguard-rules.pro     # ProGuard rules
├── gradle/
│   └── wrapper/               # Gradle wrapper files
├── build.gradle               # Project-level build configuration
├── settings.gradle            # Project settings
└── gradle.properties          # Gradle properties
```

## Key Components

### Main Application
- **Application Class**: `SmartAutoClickerApplication`
- **Main Activity**: `ScenarioActivity`
- **Settings Activity**: `SettingsActivity`

### Core Modules
- **Database**: Room database for storing scenarios and actions
- **Detection**: Image detection and matching using OpenCV
- **UI**: Custom views and UI components

### Features
- **QSTile**: Quick Settings Tile for quick scenario launching
- **Smart Config**: Configuration UI for automation scenarios
- **Tutorial**: Interactive tutorial system

### Native Libraries
The app includes OpenCV native libraries for all major architectures:
- arm64-v8a
- armeabi-v7a
- x86
- x86_64

Libraries include:
- libopencv_core.so
- libopencv_imgproc.so
- libsmartautoclicker.so
- libdatastore_shared_counter.so

## Dependencies

Key dependencies used in this project:
- AndroidX Core, AppCompat, ConstraintLayout
- Material Design Components
- Lifecycle Components (ViewModel, LiveData)
- Navigation Component
- Room Database
- Kotlin Coroutines
- DataStore Preferences
- Lottie Animations
- OpenCV (via native libraries)

## Permissions

Required permissions:
- `FOREGROUND_SERVICE`
- `FOREGROUND_SERVICE_MEDIA_PROJECTION`
- `SYSTEM_ALERT_WINDOW`
- `WAKE_LOCK`
- `POST_NOTIFICATIONS`

## Building the Project

### Prerequisites
- Android Studio Hedgehog or newer
- JDK 17
- Android SDK with API 35

### Build Instructions

1. Open the project in Android Studio
2. Sync Gradle files
3. Build the project:
   ```bash
   ./gradlew build
   ```

### Important Notes

⚠️ **Decompilation Limitations**:
- The source code is decompiled and may not be 100% accurate
- Variable names and some code structures may be different from the original
- Comments and documentation from the original source are not preserved
- Some optimizations may make the code harder to understand

⚠️ **Native Code**:
- Native libraries (.so files) are included but cannot be reverse-engineered to source
- The app relies heavily on OpenCV for image processing

⚠️ **Build Warnings**:
- You may encounter build errors due to decompilation artifacts
- Some dependencies versions may need adjustment
- Resource IDs and references should be verified

## Project Type

This is an **educational/reference project** created by reverse-engineering an APK file. It demonstrates:
- Android app architecture
- Accessibility Service implementation
- Media Projection usage
- OpenCV integration
- Room Database patterns
- Modern Android development practices

## License

This is a reverse-engineered project for educational purposes. The original app and its source code belong to the original developers. This scaffolding should be used for learning and reference only.

## Disclaimer

This project was generated from an APK file using automated decompilation tools (apktool and jadx). The code structure and functionality are approximations of the original application. This project is intended for educational purposes to understand Android app architecture and should not be used for redistribution or commercial purposes.

---

**Generated**: 2025-11-14
**Tools Used**: apktool 2.7.0, jadx 1.5.0
