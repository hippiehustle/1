package t0;

import android.view.View;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public c0.g f14740a;

    /* renamed from: b, reason: collision with root package name */
    public int f14741b;

    /* renamed from: c, reason: collision with root package name */
    public int f14742c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14743d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14744e;

    public F() {
        d();
    }

    public final void a() {
        int m6;
        if (this.f14743d) {
            m6 = this.f14740a.i();
        } else {
            m6 = this.f14740a.m();
        }
        this.f14742c = m6;
    }

    public final void b(View view, int i4) {
        int n3;
        if (this.f14743d) {
            int d2 = this.f14740a.d(view);
            c0.g gVar = this.f14740a;
            if (Integer.MIN_VALUE == gVar.f9382a) {
                n3 = 0;
            } else {
                n3 = gVar.n() - gVar.f9382a;
            }
            this.f14742c = n3 + d2;
        } else {
            this.f14742c = this.f14740a.g(view);
        }
        this.f14741b = i4;
    }

    public final void c(View view, int i4) {
        int n3;
        c0.g gVar = this.f14740a;
        if (Integer.MIN_VALUE == gVar.f9382a) {
            n3 = 0;
        } else {
            n3 = gVar.n() - gVar.f9382a;
        }
        if (n3 >= 0) {
            b(view, i4);
            return;
        }
        this.f14741b = i4;
        if (this.f14743d) {
            int i8 = (this.f14740a.i() - n3) - this.f14740a.d(view);
            this.f14742c = this.f14740a.i() - i8;
            if (i8 > 0) {
                int e9 = this.f14742c - this.f14740a.e(view);
                int m6 = this.f14740a.m();
                int min = e9 - (Math.min(this.f14740a.g(view) - m6, 0) + m6);
                if (min < 0) {
                    this.f14742c = Math.min(i8, -min) + this.f14742c;
                    return;
                }
                return;
            }
            return;
        }
        int g8 = this.f14740a.g(view);
        int m8 = g8 - this.f14740a.m();
        this.f14742c = g8;
        if (m8 > 0) {
            int i9 = (this.f14740a.i() - Math.min(0, (this.f14740a.i() - n3) - this.f14740a.d(view))) - (this.f14740a.e(view) + g8);
            if (i9 < 0) {
                this.f14742c -= Math.min(m8, -i9);
            }
        }
    }

    public final void d() {
        this.f14741b = -1;
        this.f14742c = Integer.MIN_VALUE;
        this.f14743d = false;
        this.f14744e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f14741b + ", mCoordinate=" + this.f14742c + ", mLayoutFromEnd=" + this.f14743d + ", mValid=" + this.f14744e + '}';
    }
}
