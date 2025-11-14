package y;

import java.util.ArrayList;
import n1.AbstractC1149a;
import x.AbstractC1769h;
import x.C1764c;
import x.C1766e;
import x.C1770i;

/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: d0, reason: collision with root package name */
    public float f16449d0 = -1.0f;

    /* renamed from: e0, reason: collision with root package name */
    public int f16450e0 = -1;

    /* renamed from: f0, reason: collision with root package name */
    public int f16451f0 = -1;

    /* renamed from: g0, reason: collision with root package name */
    public c f16452g0 = this.f16382y;

    /* renamed from: h0, reason: collision with root package name */
    public int f16453h0 = 0;

    public h() {
        this.f16339G.clear();
        this.f16339G.add(this.f16452g0);
        int length = this.f16338F.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f16338F[i4] = this.f16452g0;
        }
    }

    @Override // y.d
    public final void A(C1766e c1766e) {
        if (this.f16341I == null) {
            return;
        }
        c cVar = this.f16452g0;
        c1766e.getClass();
        int m6 = C1766e.m(cVar);
        if (this.f16453h0 == 1) {
            this.f16345N = m6;
            this.f16346O = 0;
            v(this.f16341I.i());
            y(0);
            return;
        }
        this.f16345N = 0;
        this.f16346O = m6;
        y(this.f16341I.l());
        v(0);
    }

    public final void B(int i4) {
        if (this.f16453h0 != i4) {
            this.f16453h0 = i4;
            ArrayList arrayList = this.f16339G;
            arrayList.clear();
            if (this.f16453h0 == 1) {
                this.f16452g0 = this.f16381x;
            } else {
                this.f16452g0 = this.f16382y;
            }
            arrayList.add(this.f16452g0);
            c[] cVarArr = this.f16338F;
            int length = cVarArr.length;
            for (int i8 = 0; i8 < length; i8++) {
                cVarArr[i8] = this.f16452g0;
            }
        }
    }

    @Override // y.d
    public final void a(C1766e c1766e) {
        boolean z8;
        e eVar = (e) this.f16341I;
        if (eVar != null) {
            c g8 = eVar.g(2);
            c g9 = eVar.g(4);
            d dVar = this.f16341I;
            boolean z9 = true;
            if (dVar != null && dVar.f16362c0[0] == 2) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (this.f16453h0 == 0) {
                g8 = eVar.g(3);
                g9 = eVar.g(5);
                d dVar2 = this.f16341I;
                if (dVar2 == null || dVar2.f16362c0[1] != 2) {
                    z9 = false;
                }
                z8 = z9;
            }
            if (this.f16450e0 != -1) {
                C1770i j = c1766e.j(this.f16452g0);
                c1766e.e(j, c1766e.j(g8), this.f16450e0, 8);
                if (z8) {
                    c1766e.f(c1766e.j(g9), j, 0, 5);
                    return;
                }
                return;
            }
            if (this.f16451f0 != -1) {
                C1770i j5 = c1766e.j(this.f16452g0);
                C1770i j8 = c1766e.j(g9);
                c1766e.e(j5, j8, -this.f16451f0, 8);
                if (z8) {
                    c1766e.f(j5, c1766e.j(g8), 0, 5);
                    c1766e.f(j8, j5, 0, 5);
                    return;
                }
                return;
            }
            if (this.f16449d0 != -1.0f) {
                C1770i j9 = c1766e.j(this.f16452g0);
                C1770i j10 = c1766e.j(g9);
                float f8 = this.f16449d0;
                C1764c k = c1766e.k();
                k.f16037d.g(j9, -1.0f);
                k.f16037d.g(j10, f8);
                c1766e.c(k);
            }
        }
    }

    @Override // y.d
    public final boolean b() {
        return true;
    }

    @Override // y.d
    public final c g(int i4) {
        switch (AbstractC1769h.b(i4)) {
            case 0:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return null;
            case 1:
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                if (this.f16453h0 == 1) {
                    return this.f16452g0;
                }
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                if (this.f16453h0 == 0) {
                    return this.f16452g0;
                }
                break;
        }
        throw new AssertionError(AbstractC1149a.o(i4));
    }
}
