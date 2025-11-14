package c0;

import android.graphics.Rect;
import android.view.View;
import t0.AbstractC1537c0;
import t0.N;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public int f9382a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9383b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9384c;

    public g(int i4, String str, String str2) {
        this.f9382a = i4;
        this.f9383b = str;
        this.f9384c = str2;
    }

    public static g b(AbstractC1537c0 abstractC1537c0, int i4) {
        if (i4 != 0) {
            if (i4 == 1) {
                return new N(abstractC1537c0, 1);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new N(abstractC1537c0, 0);
    }

    public abstract void a(D0.a aVar);

    public abstract void c(D0.a aVar);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o(View view);

    public abstract int p(View view);

    public abstract void q(int i4);

    public abstract void r(D0.a aVar);

    public abstract void s(D0.a aVar);

    public abstract void t(D0.a aVar);

    public abstract void u(D0.a aVar);

    public abstract N.f v(D0.a aVar);

    public g(AbstractC1537c0 abstractC1537c0) {
        this.f9382a = Integer.MIN_VALUE;
        this.f9384c = new Rect();
        this.f9383b = abstractC1537c0;
    }

    public g(j jVar) {
        this.f9382a = 0;
        this.f9384c = new d();
        this.f9383b = jVar;
    }
}
