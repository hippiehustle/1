package r0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import t7.C1594d;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final v.h f14253a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f14254b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static C1594d f14255c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return g.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t7.d] */
    public static C1594d b() {
        ?? obj = new Object();
        f14255c = obj;
        v.h hVar = f14253a;
        hVar.getClass();
        if (v.g.f15478i.b(hVar, null, obj)) {
            v.g.b(hVar);
        }
        return f14255c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z8) {
        boolean z9;
        boolean z10;
        boolean z11;
        h a3;
        h hVar;
        int i4;
        if (z8 || f14255c == null) {
            synchronized (f14254b) {
                if (!z8) {
                    if (f14255c != null) {
                        return;
                    }
                }
                int i8 = 0;
                try {
                    AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (openFd.getLength() > 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        openFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z9 = false;
                }
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 28 && i9 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    if (file.exists() && length > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    if (file2.exists() && length2 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    try {
                        long a4 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a3 = h.a(file3);
                            } catch (IOException unused2) {
                                b();
                                return;
                            }
                        } else {
                            a3 = null;
                        }
                        if (a3 != null && a3.f14251c == a4 && (i4 = a3.f14250b) != 2) {
                            i8 = i4;
                            if (z8 && z11 && i8 != 1) {
                                i8 = 2;
                            }
                            if (a3 != null && a3.f14250b == 2 && i8 == 1 && length < a3.f14252d) {
                                i8 = 3;
                            }
                            hVar = new h(1, i8, a4, length2);
                            if (a3 != null || !a3.equals(hVar)) {
                                hVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z10) {
                            i8 = 1;
                        } else if (z11) {
                            i8 = 2;
                        }
                        if (z8) {
                            i8 = 2;
                        }
                        if (a3 != null) {
                            i8 = 3;
                        }
                        hVar = new h(1, i8, a4, length2);
                        if (a3 != null) {
                        }
                        hVar.b(file3);
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
