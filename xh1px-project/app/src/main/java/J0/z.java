package J0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final E f2347a;

    /* renamed from: b, reason: collision with root package name */
    public static final C5.g f2348b;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, J0.E] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, J0.E] */
    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f2347a = new Object();
        } else {
            f2347a = new Object();
        }
        f2348b = new C5.g(Float.class, "translationAlpha", 8);
        new C5.g(Rect.class, "clipBounds", 9);
    }

    public static void a(View view, int i4, int i8, int i9, int i10) {
        f2347a.M0(view, i4, i8, i9, i10);
    }

    public static void b(View view, int i4) {
        f2347a.u0(view, i4);
    }
}
