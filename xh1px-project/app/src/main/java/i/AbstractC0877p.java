package i;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import t.C1523a;

/* renamed from: i.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0877p {

    /* renamed from: d, reason: collision with root package name */
    public static final ExecutorC0875n f11722d = new ExecutorC0875n((ExecutorC0876o) new Object());

    /* renamed from: e, reason: collision with root package name */
    public static final int f11723e = -100;

    /* renamed from: f, reason: collision with root package name */
    public static L.d f11724f = null;

    /* renamed from: g, reason: collision with root package name */
    public static L.d f11725g = null;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f11726h = null;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f11727i = false;
    public static final t.f j = new t.f(0);
    public static final Object k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final Object f11728l = new Object();

    public static boolean c(Context context) {
        if (f11726h == null) {
            try {
                int i4 = I.f11612d;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) I.class), H.a() | 128).metaData;
                if (bundle != null) {
                    f11726h = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f11726h = Boolean.FALSE;
            }
        }
        return f11726h.booleanValue();
    }

    public static void f(LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C) {
        synchronized (k) {
            try {
                t.f fVar = j;
                fVar.getClass();
                C1523a c1523a = new C1523a(fVar);
                while (c1523a.hasNext()) {
                    AbstractC0877p abstractC0877p = (AbstractC0877p) ((WeakReference) c1523a.next()).get();
                    if (abstractC0877p == layoutInflaterFactory2C0860C || abstractC0877p == null) {
                        c1523a.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract boolean g(int i4);

    public abstract void h(int i4);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void k(CharSequence charSequence);
}
