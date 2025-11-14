package t0;

/* renamed from: t0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1541g {

    /* renamed from: a, reason: collision with root package name */
    public long f14843a = 0;

    /* renamed from: b, reason: collision with root package name */
    public C1541g f14844b;

    public final void a(int i4) {
        if (i4 >= 64) {
            C1541g c1541g = this.f14844b;
            if (c1541g != null) {
                c1541g.a(i4 - 64);
                return;
            }
            return;
        }
        this.f14843a &= ~(1 << i4);
    }

    public final int b(int i4) {
        C1541g c1541g = this.f14844b;
        if (c1541g == null) {
            if (i4 >= 64) {
                return Long.bitCount(this.f14843a);
            }
            return Long.bitCount(this.f14843a & ((1 << i4) - 1));
        }
        if (i4 < 64) {
            return Long.bitCount(this.f14843a & ((1 << i4) - 1));
        }
        return Long.bitCount(this.f14843a) + c1541g.b(i4 - 64);
    }

    public final void c() {
        if (this.f14844b == null) {
            this.f14844b = new C1541g();
        }
    }

    public final boolean d(int i4) {
        if (i4 >= 64) {
            c();
            return this.f14844b.d(i4 - 64);
        }
        if ((this.f14843a & (1 << i4)) != 0) {
            return true;
        }
        return false;
    }

    public final void e(int i4, boolean z8) {
        boolean z9;
        if (i4 >= 64) {
            c();
            this.f14844b.e(i4 - 64, z8);
            return;
        }
        long j = this.f14843a;
        if ((Long.MIN_VALUE & j) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        long j5 = (1 << i4) - 1;
        this.f14843a = ((j & (~j5)) << 1) | (j & j5);
        if (z8) {
            h(i4);
        } else {
            a(i4);
        }
        if (!z9 && this.f14844b == null) {
            return;
        }
        c();
        this.f14844b.e(0, z9);
    }

    public final boolean f(int i4) {
        boolean z8;
        if (i4 >= 64) {
            c();
            return this.f14844b.f(i4 - 64);
        }
        long j = 1 << i4;
        long j5 = this.f14843a;
        if ((j5 & j) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        long j8 = j5 & (~j);
        this.f14843a = j8;
        long j9 = j - 1;
        this.f14843a = (j8 & j9) | Long.rotateRight((~j9) & j8, 1);
        C1541g c1541g = this.f14844b;
        if (c1541g != null) {
            if (c1541g.d(0)) {
                h(63);
            }
            this.f14844b.f(0);
        }
        return z8;
    }

    public final void g() {
        this.f14843a = 0L;
        C1541g c1541g = this.f14844b;
        if (c1541g != null) {
            c1541g.g();
        }
    }

    public final void h(int i4) {
        if (i4 >= 64) {
            c();
            this.f14844b.h(i4 - 64);
        } else {
            this.f14843a |= 1 << i4;
        }
    }

    public final String toString() {
        if (this.f14844b == null) {
            return Long.toBinaryString(this.f14843a);
        }
        return this.f14844b.toString() + "xx" + Long.toBinaryString(this.f14843a);
    }
}
