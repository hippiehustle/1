package E;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.Xml;
import i.AbstractActivityC0870i;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f1098a = new Object();

    public static Intent a(Context context, ComponentName componentName) {
        String c6 = c(context, componentName);
        if (c6 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), c6);
        if (c(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static Intent b(AbstractActivityC0870i abstractActivityC0870i) {
        Intent parentActivityIntent = abstractActivityC0870i.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String c6 = c(abstractActivityC0870i, abstractActivityC0870i.getComponentName());
            if (c6 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(abstractActivityC0870i, c6);
            try {
                if (c(abstractActivityC0870i, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + c6 + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    public static String c(Context context, ComponentName componentName) {
        int i4;
        String string;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            i4 = 269222528;
        } else {
            i4 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i4);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r5 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (r5 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(Context context, String str) {
        synchronized (f1098a) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    try {
                        newSerializer.setOutput(openFileOutput, null);
                        newSerializer.startDocument("UTF-8", Boolean.TRUE);
                        newSerializer.startTag(null, "locales");
                        newSerializer.attribute(null, "application_locales", str);
                        newSerializer.endTag(null, "locales");
                        newSerializer.endDocument();
                    } catch (Throwable th) {
                        if (openFileOutput != null) {
                            try {
                                openFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e9) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e9);
                }
            } catch (FileNotFoundException unused2) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r2 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r1.isEmpty() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        r8.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002e, code lost:
    
        if (r5 != 4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x003b, code lost:
    
        if (r3.getName().equals("locales") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0053, code lost:
    
        if (r2 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String e(Context context) {
        String str;
        synchronized (f1098a) {
            str = "";
            try {
                FileInputStream openFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                try {
                    try {
                        XmlPullParser newPullParser = Xml.newPullParser();
                        newPullParser.setInput(openFileInput, "UTF-8");
                        int depth = newPullParser.getDepth();
                        while (true) {
                            int next = newPullParser.next();
                            if (next != 1) {
                                if (next == 3 && newPullParser.getDepth() <= depth) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    } catch (IOException | XmlPullParserException unused) {
                        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (Throwable th) {
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused3) {
                return "";
            }
        }
        return str;
    }
}
