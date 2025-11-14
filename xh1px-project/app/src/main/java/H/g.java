package H;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class g extends E2.b {

    /* renamed from: d, reason: collision with root package name */
    public static Class f1857d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Constructor f1858e = null;

    /* renamed from: f, reason: collision with root package name */
    public static Method f1859f = null;

    /* renamed from: g, reason: collision with root package name */
    public static Method f1860g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f1861h = false;

    public static boolean R(Object obj, String str, int i4, boolean z8) {
        S();
        try {
            return ((Boolean) f1859f.invoke(obj, str, Integer.valueOf(i4), Boolean.valueOf(z8))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    public static void S() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f1861h) {
            return;
        }
        f1861h = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e9) {
            Log.e("TypefaceCompatApi21Impl", e9.getClass().getName(), e9);
            method = null;
            cls = null;
            method2 = null;
        }
        f1858e = constructor;
        f1857d = cls;
        f1859f = method2;
        f1860g = method;
    }

    @Override // E2.b
    public Typeface i(Context context, G.f fVar, Resources resources, int i4) {
        S();
        try {
            Object newInstance = f1858e.newInstance(null);
            for (G.g gVar : fVar.f1653a) {
                File Y = E2.c.Y(context);
                if (Y == null) {
                    return null;
                }
                try {
                    if (!E2.c.P(Y, resources, gVar.f1659f)) {
                        return null;
                    }
                    if (!R(newInstance, Y.getPath(), gVar.f1655b, gVar.f1656c)) {
                        return null;
                    }
                    Y.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    Y.delete();
                }
            }
            S();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f1857d, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f1860g.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e9) {
                throw new RuntimeException(e9);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // E2.b
    public Typeface j(Context context, M.j[] jVarArr, int i4) {
        File file;
        String readlink;
        if (jVarArr.length >= 1) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(q(jVarArr, i4).f3289a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                } else {
                    try {
                        try {
                            readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                        } catch (Throwable th) {
                            try {
                                openFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (ErrnoException unused) {
                    }
                    try {
                        if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                            file = new File(readlink);
                            if (file != null && file.canRead()) {
                                Typeface createFromFile = Typeface.createFromFile(file);
                                openFileDescriptor.close();
                                return createFromFile;
                            }
                            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                            Typeface l6 = l(context, fileInputStream);
                            fileInputStream.close();
                            openFileDescriptor.close();
                            return l6;
                        }
                        Typeface l62 = l(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return l62;
                    } finally {
                    }
                    file = null;
                    if (file != null) {
                        Typeface createFromFile2 = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile2;
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
