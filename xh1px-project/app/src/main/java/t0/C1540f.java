package t0;

/* renamed from: t0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1540f implements M {

    /* renamed from: d, reason: collision with root package name */
    public final M f14839d;

    /* renamed from: e, reason: collision with root package name */
    public int f14840e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f14841f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f14842g = -1;

    public C1540f(g0.L l6) {
        this.f14839d = l6;
    }

    @Override // t0.M
    public final void G(int i4, int i8) {
        int i9;
        int i10;
        int i11;
        if (this.f14840e == 3 && i4 <= (i10 = this.f14842g + (i9 = this.f14841f)) && (i11 = i4 + i8) >= i9) {
            this.f14841f = Math.min(i4, i9);
            this.f14842g = Math.max(i10, i11) - this.f14841f;
        } else {
            a();
            this.f14841f = i4;
            this.f14842g = i8;
            this.f14840e = 3;
        }
    }

    @Override // t0.M
    public final void H(int i4, int i8) {
        int i9;
        if (this.f14840e == 1 && i4 >= (i9 = this.f14841f)) {
            int i10 = this.f14842g;
            if (i4 <= i9 + i10) {
                this.f14842g = i10 + i8;
                this.f14841f = Math.min(i4, i9);
                return;
            }
        }
        a();
        this.f14841f = i4;
        this.f14842g = i8;
        this.f14840e = 1;
    }

    public final void a() {
        int i4 = this.f14840e;
        if (i4 == 0) {
            return;
        }
        M m6 = this.f14839d;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    m6.G(this.f14841f, this.f14842g);
                }
            } else {
                m6.j(this.f14841f, this.f14842g);
            }
        } else {
            m6.H(this.f14841f, this.f14842g);
        }
        this.f14840e = 0;
    }

    @Override // t0.M
    public final void j(int i4, int i8) {
        int i9;
        if (this.f14840e == 2 && (i9 = this.f14841f) >= i4 && i9 <= i4 + i8) {
            this.f14842g += i8;
            this.f14841f = i4;
        } else {
            a();
            this.f14841f = i4;
            this.f14842g = i8;
            this.f14840e = 2;
        }
    }

    @Override // t0.M
    public final void k(int i4, int i8) {
        a();
        this.f14839d.k(i4, i8);
    }
}
