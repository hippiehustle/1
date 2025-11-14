package y;

import g0.b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import x.C1764c;
import x.C1766e;
import x.C1768g;
import x.C1770i;
import z.C1846c;
import z.C1848e;
import z.l;
import z.m;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: d0, reason: collision with root package name */
    public ArrayList f16384d0 = new ArrayList();

    /* renamed from: e0, reason: collision with root package name */
    public final R.g f16385e0 = new R.g(this);

    /* renamed from: f0, reason: collision with root package name */
    public final C1848e f16386f0;

    /* renamed from: g0, reason: collision with root package name */
    public A.f f16387g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f16388h0;

    /* renamed from: i0, reason: collision with root package name */
    public final C1766e f16389i0;
    public int j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f16390k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f16391l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f16392m0;

    /* renamed from: n0, reason: collision with root package name */
    public b[] f16393n0;

    /* renamed from: o0, reason: collision with root package name */
    public b[] f16394o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f16395p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f16396q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f16397r0;

    /* JADX WARN: Type inference failed for: r0v2, types: [z.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, z.b] */
    public e() {
        ?? obj = new Object();
        obj.f16584b = true;
        obj.f16585c = true;
        obj.f16587e = new ArrayList();
        new ArrayList();
        obj.f16588f = null;
        obj.f16589g = new Object();
        obj.f16590h = new ArrayList();
        obj.f16583a = this;
        obj.f16586d = this;
        this.f16386f0 = obj;
        this.f16387g0 = null;
        this.f16388h0 = false;
        this.f16389i0 = new C1766e();
        this.f16391l0 = 0;
        this.f16392m0 = 0;
        this.f16393n0 = new b[4];
        this.f16394o0 = new b[4];
        this.f16395p0 = 263;
        this.f16396q0 = false;
        this.f16397r0 = false;
    }

    public final void B(d dVar, int i4) {
        if (i4 == 0) {
            int i8 = this.f16391l0 + 1;
            b[] bVarArr = this.f16394o0;
            if (i8 >= bVarArr.length) {
                this.f16394o0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.f16394o0;
            int i9 = this.f16391l0;
            bVarArr2[i9] = new b(dVar, 0, this.f16388h0);
            this.f16391l0 = i9 + 1;
            return;
        }
        if (i4 == 1) {
            int i10 = this.f16392m0 + 1;
            b[] bVarArr3 = this.f16393n0;
            if (i10 >= bVarArr3.length) {
                this.f16393n0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.f16393n0;
            int i11 = this.f16392m0;
            bVarArr4[i11] = new b(dVar, 1, this.f16388h0);
            this.f16392m0 = i11 + 1;
        }
    }

    public final void C(C1766e c1766e) {
        int i4;
        int i8;
        a(c1766e);
        int size = this.f16384d0.size();
        char c6 = 0;
        int i9 = 0;
        boolean z8 = false;
        while (true) {
            i4 = 1;
            if (i9 >= size) {
                break;
            }
            d dVar = (d) this.f16384d0.get(i9);
            boolean[] zArr = dVar.f16340H;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z8 = true;
            }
            i9++;
        }
        if (z8) {
            for (int i10 = 0; i10 < size; i10++) {
                d dVar2 = (d) this.f16384d0.get(i10);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i11 = 0; i11 < aVar.f16455e0; i11++) {
                        d dVar3 = aVar.f16454d0[i11];
                        int i12 = aVar.f16308f0;
                        if (i12 != 0 && i12 != 1) {
                            if (i12 == 2 || i12 == 3) {
                                dVar3.f16340H[1] = true;
                            }
                        } else {
                            dVar3.f16340H[0] = true;
                        }
                    }
                }
            }
        }
        for (int i13 = 0; i13 < size; i13++) {
            d dVar4 = (d) this.f16384d0.get(i13);
            dVar4.getClass();
            if ((dVar4 instanceof g) || (dVar4 instanceof h)) {
                dVar4.a(c1766e);
            }
        }
        int i14 = 0;
        while (i14 < size) {
            d dVar5 = (d) this.f16384d0.get(i14);
            if (dVar5 instanceof e) {
                int[] iArr = dVar5.f16362c0;
                int i15 = iArr[c6];
                int i16 = iArr[i4];
                if (i15 == 2) {
                    dVar5.w(i4);
                }
                if (i16 == 2) {
                    dVar5.x(i4);
                }
                dVar5.a(c1766e);
                if (i15 == 2) {
                    dVar5.w(i15);
                }
                if (i16 == 2) {
                    dVar5.x(i16);
                }
                i8 = i4;
            } else {
                dVar5.f16367h = -1;
                c cVar = dVar5.f16334B;
                int[] iArr2 = dVar5.f16362c0;
                c cVar2 = dVar5.f16333A;
                c cVar3 = dVar5.f16382y;
                c cVar4 = dVar5.f16383z;
                c cVar5 = dVar5.f16381x;
                dVar5.f16368i = -1;
                int[] iArr3 = this.f16362c0;
                i8 = i4;
                if (iArr3[c6] != 2 && iArr2[c6] == 4) {
                    int i17 = cVar5.f16330e;
                    int l6 = l() - cVar4.f16330e;
                    cVar5.f16332g = c1766e.j(cVar5);
                    cVar4.f16332g = c1766e.j(cVar4);
                    c1766e.d(cVar5.f16332g, i17);
                    c1766e.d(cVar4.f16332g, l6);
                    dVar5.f16367h = 2;
                    dVar5.f16345N = i17;
                    int i18 = l6 - i17;
                    dVar5.f16342J = i18;
                    int i19 = dVar5.f16348Q;
                    if (i18 < i19) {
                        dVar5.f16342J = i19;
                    }
                }
                if (iArr3[i8] != 2 && iArr2[i8] == 4) {
                    int i20 = cVar3.f16330e;
                    int i21 = i() - cVar2.f16330e;
                    cVar3.f16332g = c1766e.j(cVar3);
                    cVar2.f16332g = c1766e.j(cVar2);
                    c1766e.d(cVar3.f16332g, i20);
                    c1766e.d(cVar2.f16332g, i21);
                    if (dVar5.f16347P > 0 || dVar5.f16353V == 8) {
                        C1770i j = c1766e.j(cVar);
                        cVar.f16332g = j;
                        c1766e.d(j, dVar5.f16347P + i20);
                    }
                    dVar5.f16368i = 2;
                    dVar5.f16346O = i20;
                    int i22 = i21 - i20;
                    dVar5.K = i22;
                    int i23 = dVar5.f16349R;
                    if (i22 < i23) {
                        dVar5.K = i23;
                    }
                }
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    dVar5.a(c1766e);
                }
            }
            i14++;
            i4 = i8;
            c6 = 0;
        }
        int i24 = i4;
        if (this.f16391l0 > 0) {
            j.a(this, c1766e, 0);
        }
        if (this.f16392m0 > 0) {
            j.a(this, c1766e, i24);
        }
    }

    public final boolean D(int i4, boolean z8) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        C1848e c1848e = this.f16386f0;
        ArrayList arrayList = c1848e.f16587e;
        e eVar = c1848e.f16583a;
        int h8 = eVar.h(0);
        int[] iArr = eVar.f16362c0;
        l lVar = eVar.f16364e;
        z.j jVar = eVar.f16363d;
        int h9 = eVar.h(1);
        int m6 = eVar.m();
        int n3 = eVar.n();
        if (z8 && (h8 == 2 || h9 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    m mVar = (m) it.next();
                    if (mVar.f16610f == i4 && !mVar.k()) {
                        z13 = false;
                        break;
                    }
                } else {
                    z13 = z8;
                    break;
                }
            }
            if (i4 == 0) {
                if (z13 && h8 == 2) {
                    eVar.w(1);
                    eVar.y(c1848e.d(eVar, 0));
                    jVar.f16609e.d(eVar.l());
                }
            } else if (z13 && h9 == 2) {
                eVar.x(1);
                eVar.v(c1848e.d(eVar, 1));
                lVar.f16609e.d(eVar.i());
            }
        }
        if (i4 == 0) {
            z10 = false;
            int i8 = iArr[0];
            if (i8 != 1 && i8 != 4) {
                z9 = true;
                z11 = z10;
            } else {
                int l6 = eVar.l() + m6;
                jVar.f16613i.d(l6);
                jVar.f16609e.d(l6 - m6);
                z9 = true;
                z11 = true;
            }
        } else {
            z9 = true;
            z10 = false;
            int i9 = iArr[1];
            if (i9 == 1 || i9 == 4) {
                int i10 = eVar.i() + n3;
                lVar.f16613i.d(i10);
                lVar.f16609e.d(i10 - n3);
                z11 = true;
            }
            z11 = z10;
        }
        c1848e.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m mVar2 = (m) it2.next();
            if (mVar2.f16610f == i4 && (mVar2.f16606b != eVar || mVar2.f16611g)) {
                mVar2.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m mVar3 = (m) it3.next();
            if (mVar3.f16610f == i4 && (z11 || mVar3.f16606b != eVar)) {
                if (!mVar3.f16612h.j || !mVar3.f16613i.j || (!(mVar3 instanceof C1846c) && !mVar3.f16609e.j)) {
                    z12 = z10;
                    break;
                }
            }
        }
        z12 = z9;
        eVar.w(h8);
        eVar.x(h9);
        return z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0115  */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E() {
        boolean z8;
        boolean z9;
        boolean z10;
        ?? r19;
        int i4;
        boolean z11;
        int max;
        int max2;
        ?? r22;
        ?? r23 = 0;
        this.f16345N = 0;
        this.f16346O = 0;
        int max3 = Math.max(0, l());
        int max4 = Math.max(0, i());
        this.f16396q0 = false;
        this.f16397r0 = false;
        int i8 = this.f16395p0;
        boolean z12 = true;
        if ((i8 & 64) == 64 || (i8 & 128) == 128) {
            z8 = true;
        } else {
            z8 = false;
        }
        C1766e c1766e = this.f16389i0;
        c1766e.getClass();
        c1766e.f16046f = false;
        if (this.f16395p0 != 0 && z8) {
            c1766e.f16046f = true;
        }
        int[] iArr = this.f16362c0;
        int i9 = iArr[1];
        int i10 = iArr[0];
        ArrayList arrayList = this.f16384d0;
        int i11 = 2;
        if (i10 != 2 && i9 != 2) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f16391l0 = 0;
        this.f16392m0 = 0;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            d dVar = (d) this.f16384d0.get(i12);
            if (dVar instanceof e) {
                ((e) dVar).E();
            }
        }
        int i13 = 0;
        boolean z13 = false;
        boolean z14 = true;
        while (z14) {
            boolean z15 = z12;
            int i14 = i13 + 1;
            try {
                c1766e.r();
                this.f16391l0 = r23;
                this.f16392m0 = r23;
                f(c1766e);
                int i15 = r23;
                while (i15 < size) {
                    z10 = r23;
                    try {
                        ((d) this.f16384d0.get(i15)).f(c1766e);
                        i15++;
                        r23 = z10 ? 1 : 0;
                    } catch (Exception e9) {
                        e = e9;
                        e.printStackTrace();
                        i4 = i11;
                        r19 = iArr;
                        System.out.println("EXCEPTION : " + e);
                        boolean[] zArr = j.f16456a;
                        if (z14) {
                        }
                        if (!z9) {
                        }
                        z11 = z10 ? 1 : 0;
                        max = Math.max(this.f16348Q, l());
                        if (max > l()) {
                        }
                        max2 = Math.max(this.f16349R, i());
                        if (max2 > i()) {
                        }
                        if (!z13) {
                        }
                        z14 = z11;
                        i13 = i14;
                        r23 = z10 ? 1 : 0;
                        iArr = r19;
                        z12 = true;
                    }
                }
                z10 = r23;
                C(c1766e);
            } catch (Exception e10) {
                e = e10;
                z10 = r23;
            }
            try {
                C1768g c1768g = c1766e.f16042b;
                if (c1766e.f16046f) {
                    int i16 = z10 ? 1 : 0;
                    while (true) {
                        if (i16 < c1766e.f16049i) {
                            if (!c1766e.f16045e[i16].f16038e) {
                                c1766e.o(c1768g);
                                break;
                            }
                            i16++;
                        } else {
                            for (int i17 = z10 ? 1 : 0; i17 < c1766e.f16049i; i17++) {
                                C1764c c1764c = c1766e.f16045e[i17];
                                c1764c.f16034a.f16064e = c1764c.f16035b;
                            }
                        }
                    }
                } else {
                    c1766e.o(c1768g);
                }
                r19 = iArr;
                i4 = i11;
                z14 = z15 ? 1 : 0;
            } catch (Exception e11) {
                e = e11;
                z14 = z15 ? 1 : 0;
                e.printStackTrace();
                i4 = i11;
                r19 = iArr;
                System.out.println("EXCEPTION : " + e);
                boolean[] zArr2 = j.f16456a;
                if (z14) {
                }
                if (!z9) {
                }
                z11 = z10 ? 1 : 0;
                max = Math.max(this.f16348Q, l());
                if (max > l()) {
                }
                max2 = Math.max(this.f16349R, i());
                if (max2 > i()) {
                }
                if (!z13) {
                }
                z14 = z11;
                i13 = i14;
                r23 = z10 ? 1 : 0;
                iArr = r19;
                z12 = true;
            }
            boolean[] zArr22 = j.f16456a;
            if (z14) {
                zArr22[i4] = z10;
                A(c1766e);
                int size2 = this.f16384d0.size();
                for (int i18 = z10 ? 1 : 0; i18 < size2; i18++) {
                    ((d) this.f16384d0.get(i18)).A(c1766e);
                }
            } else {
                A(c1766e);
                for (int i19 = z10 ? 1 : 0; i19 < size; i19++) {
                    ((d) this.f16384d0.get(i19)).A(c1766e);
                }
            }
            if (!z9 && i14 < 8 && zArr22[i4]) {
                int i20 = z10 ? 1 : 0;
                int i21 = i20;
                int i22 = i21;
                while (i20 < size) {
                    d dVar2 = (d) this.f16384d0.get(i20);
                    i21 = Math.max(i21, dVar2.l() + dVar2.f16345N);
                    i22 = Math.max(i22, dVar2.i() + dVar2.f16346O);
                    i20++;
                }
                int max5 = Math.max(this.f16348Q, i21);
                int max6 = Math.max(this.f16349R, i22);
                int i23 = i4;
                if (i10 == i23 && l() < max5) {
                    y(max5);
                    r19[z10 ? 1 : 0] = i23;
                    z11 = z15 ? 1 : 0;
                    z13 = z11;
                } else {
                    z11 = z10 ? 1 : 0;
                }
                if (i9 == i23 && i() < max6) {
                    v(max6);
                    r19[z15 ? 1 : 0] = i23;
                    z11 = z15 ? 1 : 0;
                    z13 = z11;
                }
            } else {
                z11 = z10 ? 1 : 0;
            }
            max = Math.max(this.f16348Q, l());
            if (max > l()) {
                y(max);
                r19[z10 ? 1 : 0] = z15 ? 1 : 0;
                z11 = z15 ? 1 : 0;
                z13 = z11;
            }
            max2 = Math.max(this.f16349R, i());
            if (max2 > i()) {
                v(max2);
                r19[z15 ? 1 : 0] = z15 ? 1 : 0;
                z11 = z15 ? 1 : 0;
                z13 = z11;
            }
            if (!z13) {
                if (r19[z10 ? 1 : 0] == 2 && max3 > 0 && l() > max3) {
                    boolean z16 = z15 ? 1 : 0;
                    this.f16396q0 = z16;
                    r19[z10 ? 1 : 0] = z16 ? 1 : 0;
                    y(max3);
                    z11 = z16 ? 1 : 0;
                    z13 = z11;
                    r22 = z16;
                } else {
                    r22 = z15 ? 1 : 0;
                }
                i11 = 2;
                if (r19[r22] == 2 && max4 > 0 && i() > max4) {
                    this.f16397r0 = r22;
                    r19[r22] = r22;
                    v(max4);
                    z14 = true;
                    z13 = true;
                    i13 = i14;
                    r23 = z10 ? 1 : 0;
                    iArr = r19;
                    z12 = true;
                }
            } else {
                i11 = 2;
            }
            z14 = z11;
            i13 = i14;
            r23 = z10 ? 1 : 0;
            iArr = r19;
            z12 = true;
        }
        char c6 = r23;
        int[] iArr2 = iArr;
        this.f16384d0 = arrayList;
        if (z13) {
            iArr2[c6] = i10;
            iArr2[1] = i9;
        }
        u(c1766e.k);
    }

    @Override // y.d
    public final void s() {
        this.f16389i0.r();
        this.j0 = 0;
        this.f16390k0 = 0;
        this.f16384d0.clear();
        super.s();
    }

    @Override // y.d
    public final void u(b0 b0Var) {
        super.u(b0Var);
        int size = this.f16384d0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((d) this.f16384d0.get(i4)).u(b0Var);
        }
    }

    @Override // y.d
    public final void z(boolean z8, boolean z9) {
        super.z(z8, z9);
        int size = this.f16384d0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((d) this.f16384d0.get(i4)).z(z8, z9);
        }
    }
}
