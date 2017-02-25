# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in C:\Users\Alex\AppData\Local\Android\sdk/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

-dontskipnonpubliclibraryclassmembers
#-dontshrink
#-dontoptimize

-dontwarn org.**
-dontwarn javax.**
-dontwarn java.**

-keep class org.** { *; }
-keep class javax.** { *; }
-keep class java.** { *; }

#-keep public class * extends android.app.Activity
#-keep public class * extends android.app.Application
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keep public class * extends android.app.backup.BackupAgentHelper
-keep public class * extends android.preference.Preference

#third party
-dontwarn com.tagview.**
-dontwarn com.vincentbrison.**
-dontwarn com.facebook.**
-dontwarn com.android.**
-dontwarn com.github.**
-dontwarn com.fasterxml.**
-dontwarn com.jakewharton.**
-dontwarn com.google.**
-dontwarn com.loopj.**
-dontwarn co.lujun.**

-keep class com.tagview.** { *; }
-keep class com.vincentbrison.** { *; }
-keep class com.facebook.** { *; }
-keep class com.android.** { *; }
-keep class com.github.** { *; }
-keep class com.fasterxml.** { *; }
-keep class com.jakewharton.** { *; }
-keep class com.google.** { *; }
-keepnames @com.google.android.gms.common.annotation.KeepName class *
-keepclassmembernames class * {
    @com.google.android.gms.common.annotation.KeepName *;
}
-keep class com.loopj.** { *; }
-keep class co.lujun.** { *; }

#config
-keep class com.investorz.data.** { *; }

-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

-keep class * implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator *;
}

-keepclasseswithmembers class * {
    void onClick*(...);
}

-keepclasseswithmembers class * {
    *** *Callback(...);
}