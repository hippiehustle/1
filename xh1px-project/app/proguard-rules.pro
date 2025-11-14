# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Keep line numbers for debugging
-keepattributes SourceFile,LineNumberTable
-renamesourcefileattribute SourceFile

# Keep annotations
-keepattributes *Annotation*
-keepattributes Signature
-keepattributes InnerClasses
-keepattributes EnclosingMethod

# Keep native methods
-keepclasseswithmembernames class * {
    native <methods>;
}

# Keep application class
-keep class com.buzbuz.smartautoclicker.application.SmartAutoClickerApplication { *; }

# Keep all activities, services, and broadcast receivers
-keep public class * extends android.app.Activity
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keep public class * extends android.app.Application

# Keep accessibility service
-keep class com.buzbuz.smartautoclicker.SmartAutoClickerService { *; }

# Keep Room entities and DAOs
-keep class * extends androidx.room.RoomDatabase
-keep @androidx.room.Entity class *
-keep @androidx.room.Dao class *
-dontwarn androidx.room.paging.**

# Keep Room generated classes
-keep class com.buzbuz.smartautoclicker.core.database.** { *; }
-keep class com.buzbuz.smartautoclicker.core.dumb.data.database.** { *; }

# Keep OpenCV classes
-keep class org.opencv.** { *; }

# Keep detection classes (uses native code)
-keep class com.buzbuz.smartautoclicker.core.detection.** { *; }

# Keep data classes and their fields
-keepclassmembers class * {
    @androidx.room.ColumnInfo *;
    @androidx.room.PrimaryKey *;
}

# Keep Parcelable implementations
-keep class * implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator *;
}

# Keep serializable classes
-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}

# Keep Kotlin metadata
-keep class kotlin.Metadata { *; }

# Keep coroutines
-keepnames class kotlinx.coroutines.internal.MainDispatcherFactory {}
-keepnames class kotlinx.coroutines.CoroutineExceptionHandler {}
-keepclassmembernames class kotlinx.** {
    volatile <fields>;
}

# Keep navigation components
-keep class androidx.navigation.** { *; }

# Keep data binding
-keep class androidx.databinding.** { *; }
-keep class * extends androidx.databinding.ViewDataBinding { *; }

# Keep view binding
-keep class * extends androidx.viewbinding.ViewBinding { *; }

# Suppress warnings
-dontwarn org.conscrypt.**
-dontwarn org.bouncycastle.**
-dontwarn org.openjsse.**

# R8 optimizations
-allowaccessmodification
-repackageclasses ''
