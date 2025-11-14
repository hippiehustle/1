package P;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class e0 extends i0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f4260e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f4261f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f4262g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f4263h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f4264c;

    /* renamed from: d, reason: collision with root package name */
    public H.c f4265d;

    public e0() {
        this.f4264c = i();
    }

    private static WindowInsets i() {
        if (!f4261f) {
            try {
                f4260e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e9);
            }
            f4261f = true;
        }
        Field field = f4260e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e10);
            }
        }
        if (!f4263h) {
            try {
                f4262g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            f4263h = true;
        }
        Constructor constructor = f4262g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e12);
            }
        }
        return null;
    }

    @Override // P.i0
    public t0 b() {
        a();
        t0 g8 = t0.g(null, this.f4264c);
        H.c[] cVarArr = this.f4278b;
        p0 p0Var = g8.f4308a;
        p0Var.o(cVarArr);
        p0Var.q(this.f4265d);
        return g8;
    }

    @Override // P.i0
    public void e(H.c cVar) {
        this.f4265d = cVar;
    }

    @Override // P.i0
    public void g(H.c cVar) {
        WindowInsets windowInsets = this.f4264c;
        if (windowInsets != null) {
            this.f4264c = windowInsets.replaceSystemWindowInsets(cVar.f1848a, cVar.f1849b, cVar.f1850c, cVar.f1851d);
        }
    }

    public e0(t0 t0Var) {
        super(t0Var);
        this.f4264c = t0Var.f();
    }
}
