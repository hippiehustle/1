package Q0;

import a1.C0414a;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: c, reason: collision with root package name */
    public final b f4720c;

    /* renamed from: e, reason: collision with root package name */
    public R3.r f4722e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4718a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public boolean f4719b = false;

    /* renamed from: d, reason: collision with root package name */
    public float f4721d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public Object f4723f = null;

    /* renamed from: g, reason: collision with root package name */
    public float f4724g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f4725h = -1.0f;

    /* JADX WARN: Multi-variable type inference failed */
    public e(List list) {
        b cVar;
        b bVar;
        if (list.isEmpty()) {
            bVar = new Object();
        } else {
            if (list.size() == 1) {
                cVar = new d(list);
            } else {
                cVar = new c(list);
            }
            bVar = cVar;
        }
        this.f4720c = bVar;
    }

    public final void a(a aVar) {
        this.f4718a.add(aVar);
    }

    public float b() {
        if (this.f4725h == -1.0f) {
            this.f4725h = this.f4720c.b();
        }
        return this.f4725h;
    }

    public final float c() {
        Interpolator interpolator;
        C0414a g8 = this.f4720c.g();
        if (g8 != null && !g8.c() && (interpolator = g8.f7673d) != null) {
            return interpolator.getInterpolation(d());
        }
        return 0.0f;
    }

    public final float d() {
        if (!this.f4719b) {
            C0414a g8 = this.f4720c.g();
            if (g8.c()) {
                return 0.0f;
            }
            return (this.f4721d - g8.b()) / (g8.a() - g8.b());
        }
        return 0.0f;
    }

    public Object e() {
        Object f8;
        float d2 = d();
        R3.r rVar = this.f4722e;
        b bVar = this.f4720c;
        if (rVar == null && bVar.e(d2) && !k()) {
            return this.f4723f;
        }
        C0414a g8 = bVar.g();
        Interpolator interpolator = g8.f7674e;
        Interpolator interpolator2 = g8.f7675f;
        if (interpolator != null && interpolator2 != null) {
            f8 = g(g8, d2, interpolator.getInterpolation(d2), interpolator2.getInterpolation(d2));
        } else {
            f8 = f(g8, c());
        }
        this.f4723f = f8;
        return f8;
    }

    public abstract Object f(C0414a c0414a, float f8);

    public Object g(C0414a c0414a, float f8, float f9, float f10) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void h() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f4718a;
            if (i4 < arrayList.size()) {
                ((a) arrayList.get(i4)).b();
                i4++;
            } else {
                return;
            }
        }
    }

    public void i(float f8) {
        b bVar = this.f4720c;
        if (!bVar.isEmpty()) {
            if (this.f4724g == -1.0f) {
                this.f4724g = bVar.f();
            }
            float f9 = this.f4724g;
            if (f8 < f9) {
                if (f9 == -1.0f) {
                    this.f4724g = bVar.f();
                }
                f8 = this.f4724g;
            } else if (f8 > b()) {
                f8 = b();
            }
            if (f8 != this.f4721d) {
                this.f4721d = f8;
                if (bVar.i(f8)) {
                    h();
                }
            }
        }
    }

    public final void j(R3.r rVar) {
        R3.r rVar2 = this.f4722e;
        if (rVar2 != null) {
            rVar2.getClass();
        }
        this.f4722e = rVar;
    }

    public boolean k() {
        return false;
    }
}
