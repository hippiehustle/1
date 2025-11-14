package M;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final t.i f3283a = new t.i(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f3284b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3285c;

    /* renamed from: d, reason: collision with root package name */
    public static final t.j f3286d;

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory) new Object());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f3284b = threadPoolExecutor;
        f3285c = new Object();
        f3286d = new t.j(0);
    }

    public static String a(int i4, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < list.size(); i8++) {
            sb.append(((d) list.get(i8)).f3273e);
            sb.append("-");
            sb.append(i4);
            if (i8 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f A[Catch: all -> 0x00b7, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00b7, all -> 0x0076, all -> 0x00a8, NameNotFoundException -> 0x00ad, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:23:0x0065, B:26:0x0072, B:28:0x0093, B:31:0x009f, B:36:0x0077, B:37:0x007a, B:38:0x007b, B:41:0x008e, B:44:0x00a9, B:45:0x00ac, B:47:0x002d, B:49:0x0035, B:52:0x0039, B:54:0x003d, B:56:0x0048, B:65:0x00ad, B:25:0x006c, B:40:0x0088), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g b(String str, Context context, List list, int i4) {
        Typeface typeface;
        int i8;
        Typeface j;
        t.i iVar = f3283a;
        E2.c.I("getFontSync");
        try {
            typeface = (Typeface) iVar.f(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
        if (typeface != null) {
            return new g(typeface);
        }
        i a3 = c.a(context, list);
        List list2 = (List) a3.f3288e;
        int i9 = a3.f3287d;
        if (i9 != 0) {
            if (i9 == 1) {
                i8 = -2;
                if (i8 == 0) {
                    return new g(i8);
                }
                if (list2.size() > 1 && Build.VERSION.SDK_INT >= 29) {
                    E2.b bVar = H.f.f1855a;
                    E2.c.I("TypefaceCompat.createFromFontInfoWithFallback");
                    j = H.f.f1855a.k(context, list2, i4);
                    Trace.endSection();
                    if (j == null) {
                    }
                } else {
                    j[] jVarArr = (j[]) list2.get(0);
                    E2.b bVar2 = H.f.f1855a;
                    E2.c.I("TypefaceCompat.createFromFontInfo");
                    j = H.f.f1855a.j(context, jVarArr, i4);
                    Trace.endSection();
                    if (j == null) {
                        iVar.j(str, j);
                        return new g(j);
                    }
                    return new g(-3);
                }
            }
            i8 = -3;
            if (i8 == 0) {
            }
        } else {
            j[] jVarArr2 = (j[]) list2.get(0);
            if (jVarArr2 != null && jVarArr2.length != 0) {
                int length = jVarArr2.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        int i11 = jVarArr2[i10].f3293e;
                        if (i11 != 0) {
                            if (i11 >= 0) {
                                i8 = i11;
                            }
                        } else {
                            i10++;
                        }
                    } else {
                        i8 = 0;
                        break;
                    }
                }
                if (i8 == 0) {
                }
            }
            i8 = 1;
            if (i8 == 0) {
            }
        }
    }
}
