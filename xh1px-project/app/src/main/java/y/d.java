package y;

import android.view.View;
import g0.b0;
import java.util.ArrayList;
import n1.AbstractC1149a;
import x.AbstractC1769h;
import x.C1764c;
import x.C1766e;
import x.C1770i;
import z.C1846c;
import z.C1849f;
import z.l;
import z.m;

/* loaded from: classes.dex */
public class d {

    /* renamed from: A, reason: collision with root package name */
    public final c f16333A;

    /* renamed from: B, reason: collision with root package name */
    public final c f16334B;

    /* renamed from: C, reason: collision with root package name */
    public final c f16335C;

    /* renamed from: D, reason: collision with root package name */
    public final c f16336D;

    /* renamed from: E, reason: collision with root package name */
    public final c f16337E;

    /* renamed from: F, reason: collision with root package name */
    public final c[] f16338F;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f16339G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean[] f16340H;

    /* renamed from: I, reason: collision with root package name */
    public d f16341I;

    /* renamed from: J, reason: collision with root package name */
    public int f16342J;
    public int K;

    /* renamed from: L, reason: collision with root package name */
    public float f16343L;

    /* renamed from: M, reason: collision with root package name */
    public int f16344M;

    /* renamed from: N, reason: collision with root package name */
    public int f16345N;

    /* renamed from: O, reason: collision with root package name */
    public int f16346O;

    /* renamed from: P, reason: collision with root package name */
    public int f16347P;

    /* renamed from: Q, reason: collision with root package name */
    public int f16348Q;

    /* renamed from: R, reason: collision with root package name */
    public int f16349R;

    /* renamed from: S, reason: collision with root package name */
    public float f16350S;

    /* renamed from: T, reason: collision with root package name */
    public float f16351T;

    /* renamed from: U, reason: collision with root package name */
    public View f16352U;

    /* renamed from: V, reason: collision with root package name */
    public int f16353V;

    /* renamed from: W, reason: collision with root package name */
    public String f16354W;

    /* renamed from: X, reason: collision with root package name */
    public int f16355X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public final float[] f16356Z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f16357a = false;

    /* renamed from: a0, reason: collision with root package name */
    public final d[] f16358a0;

    /* renamed from: b, reason: collision with root package name */
    public C1846c f16359b;

    /* renamed from: b0, reason: collision with root package name */
    public final d[] f16360b0;

    /* renamed from: c, reason: collision with root package name */
    public C1846c f16361c;

    /* renamed from: c0, reason: collision with root package name */
    public final int[] f16362c0;

    /* renamed from: d, reason: collision with root package name */
    public final z.j f16363d;

    /* renamed from: e, reason: collision with root package name */
    public final l f16364e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f16365f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f16366g;

    /* renamed from: h, reason: collision with root package name */
    public int f16367h;

    /* renamed from: i, reason: collision with root package name */
    public int f16368i;
    public int j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f16369l;

    /* renamed from: m, reason: collision with root package name */
    public int f16370m;

    /* renamed from: n, reason: collision with root package name */
    public int f16371n;

    /* renamed from: o, reason: collision with root package name */
    public float f16372o;

    /* renamed from: p, reason: collision with root package name */
    public int f16373p;

    /* renamed from: q, reason: collision with root package name */
    public int f16374q;

    /* renamed from: r, reason: collision with root package name */
    public float f16375r;

    /* renamed from: s, reason: collision with root package name */
    public int f16376s;

    /* renamed from: t, reason: collision with root package name */
    public float f16377t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f16378u;

    /* renamed from: v, reason: collision with root package name */
    public float f16379v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f16380w;

    /* renamed from: x, reason: collision with root package name */
    public final c f16381x;

    /* renamed from: y, reason: collision with root package name */
    public final c f16382y;

    /* renamed from: z, reason: collision with root package name */
    public final c f16383z;

    /* JADX WARN: Type inference failed for: r2v0, types: [z.j, z.m] */
    /* JADX WARN: Type inference failed for: r2v1, types: [z.m, z.l] */
    public d() {
        ?? mVar = new m(this);
        mVar.f16612h.f16595e = 4;
        mVar.f16613i.f16595e = 5;
        mVar.f16610f = 0;
        this.f16363d = mVar;
        ?? mVar2 = new m(this);
        C1849f c1849f = new C1849f(mVar2);
        mVar2.k = c1849f;
        mVar2.f16604l = null;
        mVar2.f16612h.f16595e = 6;
        mVar2.f16613i.f16595e = 7;
        c1849f.f16595e = 8;
        mVar2.f16610f = 1;
        this.f16364e = mVar2;
        this.f16365f = new boolean[]{true, true};
        this.f16366g = new int[]{0, 0, 0, 0};
        this.f16367h = -1;
        this.f16368i = -1;
        this.j = 0;
        this.k = 0;
        this.f16369l = new int[2];
        this.f16370m = 0;
        this.f16371n = 0;
        this.f16372o = 1.0f;
        this.f16373p = 0;
        this.f16374q = 0;
        this.f16375r = 1.0f;
        this.f16376s = -1;
        this.f16377t = 1.0f;
        this.f16378u = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f16379v = 0.0f;
        this.f16380w = false;
        c cVar = new c(this, 2);
        this.f16381x = cVar;
        c cVar2 = new c(this, 3);
        this.f16382y = cVar2;
        c cVar3 = new c(this, 4);
        this.f16383z = cVar3;
        c cVar4 = new c(this, 5);
        this.f16333A = cVar4;
        c cVar5 = new c(this, 6);
        this.f16334B = cVar5;
        c cVar6 = new c(this, 8);
        this.f16335C = cVar6;
        c cVar7 = new c(this, 9);
        this.f16336D = cVar7;
        c cVar8 = new c(this, 7);
        this.f16337E = cVar8;
        this.f16338F = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList arrayList = new ArrayList();
        this.f16339G = arrayList;
        this.f16340H = new boolean[2];
        this.f16362c0 = new int[]{1, 1};
        this.f16341I = null;
        this.f16342J = 0;
        this.K = 0;
        this.f16343L = 0.0f;
        this.f16344M = -1;
        this.f16345N = 0;
        this.f16346O = 0;
        this.f16347P = 0;
        this.f16350S = 0.5f;
        this.f16351T = 0.5f;
        this.f16353V = 0;
        this.f16354W = null;
        this.f16355X = 0;
        this.Y = 0;
        this.f16356Z = new float[]{-1.0f, -1.0f};
        this.f16358a0 = new d[]{null, null};
        this.f16360b0 = new d[]{null, null};
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public void A(C1766e c1766e) {
        int i4;
        int i8;
        c1766e.getClass();
        int m6 = C1766e.m(this.f16381x);
        int m8 = C1766e.m(this.f16382y);
        int m9 = C1766e.m(this.f16383z);
        int m10 = C1766e.m(this.f16333A);
        z.j jVar = this.f16363d;
        C1849f c1849f = jVar.f16612h;
        if (c1849f.j) {
            C1849f c1849f2 = jVar.f16613i;
            if (c1849f2.j) {
                m6 = c1849f.f16597g;
                m9 = c1849f2.f16597g;
            }
        }
        l lVar = this.f16364e;
        C1849f c1849f3 = lVar.f16612h;
        if (c1849f3.j) {
            C1849f c1849f4 = lVar.f16613i;
            if (c1849f4.j) {
                m8 = c1849f3.f16597g;
                m10 = c1849f4.f16597g;
            }
        }
        int i9 = m10 - m8;
        if (m9 - m6 < 0 || i9 < 0 || m6 == Integer.MIN_VALUE || m6 == Integer.MAX_VALUE || m8 == Integer.MIN_VALUE || m8 == Integer.MAX_VALUE || m9 == Integer.MIN_VALUE || m9 == Integer.MAX_VALUE || m10 == Integer.MIN_VALUE || m10 == Integer.MAX_VALUE) {
            m6 = 0;
            m8 = 0;
            m9 = 0;
            m10 = 0;
        }
        int i10 = m9 - m6;
        int i11 = m10 - m8;
        this.f16345N = m6;
        this.f16346O = m8;
        if (this.f16353V == 8) {
            this.f16342J = 0;
            this.K = 0;
            return;
        }
        int[] iArr = this.f16362c0;
        if (iArr[0] == 1 && i10 < (i8 = this.f16342J)) {
            i10 = i8;
        }
        if (iArr[1] == 1 && i11 < (i4 = this.K)) {
            i11 = i4;
        }
        this.f16342J = i10;
        this.K = i11;
        int i12 = this.f16349R;
        if (i11 < i12) {
            this.K = i12;
        }
        int i13 = this.f16348Q;
        if (i10 < i13) {
            this.f16342J = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x04ad, code lost:
    
        if (r58.f16353V == r10) goto L276;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:230:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x02db A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(C1766e c1766e) {
        c cVar;
        C1770i c1770i;
        c cVar2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int i4;
        boolean z12;
        boolean z13;
        l lVar;
        C1770i c1770i2;
        char c6;
        int i8;
        int i9;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10;
        int[] iArr;
        C1770i c1770i3;
        C1770i c1770i4;
        boolean z17;
        boolean[] zArr;
        c cVar3;
        C1770i c1770i5;
        int i11;
        boolean z18;
        boolean z19;
        boolean z20;
        Object obj;
        C1770i c1770i6;
        C1770i c1770i7;
        boolean z21;
        int i12;
        int[] iArr2;
        c cVar4;
        l lVar2;
        C1849f c1849f;
        C1770i c1770i8;
        C1770i c1770i9;
        C1770i c1770i10;
        int i13;
        int i14;
        int i15;
        int i16;
        C1770i c1770i11;
        C1770i c1770i12;
        int i17;
        int i18;
        boolean z22;
        C1770i c1770i13;
        boolean z23;
        int i19;
        C1770i c1770i14;
        C1770i c1770i15;
        int i20;
        int i21;
        boolean z24;
        int i22;
        boolean z25;
        boolean q6;
        int i23;
        boolean r8;
        boolean z26;
        boolean z27;
        C1766e c1766e2 = c1766e;
        c cVar5 = this.f16381x;
        C1770i j = c1766e2.j(cVar5);
        c cVar6 = this.f16383z;
        C1770i j5 = c1766e2.j(cVar6);
        c cVar7 = this.f16382y;
        C1770i j8 = c1766e2.j(cVar7);
        c cVar8 = this.f16333A;
        C1770i j9 = c1766e2.j(cVar8);
        c cVar9 = this.f16334B;
        C1770i j10 = c1766e2.j(cVar9);
        z.j jVar = this.f16363d;
        C1849f c1849f2 = jVar.f16612h;
        boolean z28 = c1849f2.j;
        boolean[] zArr2 = this.f16365f;
        l lVar3 = this.f16364e;
        if (z28 && jVar.f16613i.j && lVar3.f16612h.j && lVar3.f16613i.j) {
            c1766e2.d(j, c1849f2.f16597g);
            c1766e2.d(j5, jVar.f16613i.f16597g);
            c1766e2.d(j8, lVar3.f16612h.f16597g);
            c1766e2.d(j9, lVar3.f16613i.f16597g);
            c1766e2.d(j10, lVar3.k.f16597g);
            d dVar = this.f16341I;
            if (dVar != null) {
                int[] iArr3 = dVar.f16362c0;
                if (iArr3[0] == 2) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                if (iArr3[1] == 2) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                if (z26 && zArr2[0] && !q()) {
                    c1766e2.f(c1766e2.j(this.f16341I.f16383z), j5, 0, 8);
                }
                if (z27 && zArr2[1] && !r()) {
                    c1766e2.f(c1766e2.j(this.f16341I.f16333A), j9, 0, 8);
                    return;
                }
                return;
            }
            return;
        }
        d dVar2 = this.f16341I;
        if (dVar2 != null) {
            int[] iArr4 = dVar2.f16362c0;
            c1770i = j8;
            if (iArr4[0] == 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (iArr4[1] == 2) {
                i22 = 0;
                z24 = true;
            } else {
                z24 = false;
                i22 = 0;
            }
            if (p(i22)) {
                z25 = z24;
                ((e) this.f16341I).B(this, i22);
                q6 = true;
                i23 = 1;
            } else {
                z25 = z24;
                q6 = q();
                i23 = 1;
            }
            if (p(i23)) {
                z10 = q6;
                ((e) this.f16341I).B(this, i23);
                r8 = true;
            } else {
                z10 = q6;
                r8 = r();
            }
            if (!z10 && z9) {
                z11 = r8;
                if (this.f16353V != 8 && cVar5.f16329d == null && cVar6.f16329d == null) {
                    cVar = cVar5;
                    c1766e2.f(c1766e2.j(this.f16341I.f16383z), j5, 0, 1);
                } else {
                    cVar = cVar5;
                }
            } else {
                cVar = cVar5;
                z11 = r8;
            }
            if (!z11 && z25 && this.f16353V != 8 && cVar7.f16329d == null && cVar8.f16329d == null && cVar9 == null) {
                c1766e2.f(c1766e2.j(this.f16341I.f16333A), j9, 0, 1);
            }
            cVar2 = cVar6;
            z8 = z25;
        } else {
            cVar = cVar5;
            c1770i = j8;
            cVar2 = cVar6;
            z8 = false;
            z9 = false;
            z10 = false;
            z11 = false;
        }
        int i24 = this.f16342J;
        int i25 = this.f16348Q;
        if (i24 >= i25) {
            i25 = i24;
        }
        c cVar10 = cVar2;
        int i26 = this.K;
        boolean z29 = z8;
        int i27 = this.f16349R;
        if (i26 < i27) {
            i4 = i27;
        } else {
            i4 = i26;
        }
        int[] iArr5 = this.f16362c0;
        int i28 = iArr5[0];
        if (i28 != 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i29 = iArr5[1];
        if (i29 != 3) {
            z13 = true;
        } else {
            z13 = false;
        }
        int i30 = this.f16344M;
        this.f16376s = i30;
        float f8 = this.f16343L;
        this.f16377t = f8;
        int i31 = this.j;
        int i32 = this.k;
        if (f8 > 0.0f) {
            lVar = lVar3;
            if (this.f16353V != 8) {
                c6 = 3;
                if (i28 == 3 && i31 == 0) {
                    i21 = 3;
                } else {
                    i21 = i31;
                }
                if (i29 == 3 && i32 == 0) {
                    c1770i2 = j10;
                    i9 = 3;
                } else {
                    c1770i2 = j10;
                    i9 = i32;
                }
                if (i28 == 3 && i29 == 3 && i21 == 3 && i9 == 3) {
                    if (i30 == -1) {
                        if (z12 && !z13) {
                            this.f16376s = 0;
                        } else if (!z12 && z13) {
                            this.f16376s = 1;
                            if (i30 == -1) {
                                this.f16377t = 1.0f / f8;
                            }
                        }
                    }
                    if (this.f16376s == 0 && (!cVar7.f() || !cVar8.f())) {
                        this.f16376s = 1;
                    } else if (this.f16376s == 1 && (!cVar.f() || !cVar10.f())) {
                        this.f16376s = 0;
                    }
                    if (this.f16376s == -1 && (!cVar7.f() || !cVar8.f() || !cVar.f() || !cVar10.f())) {
                        if (cVar7.f() && cVar8.f()) {
                            this.f16376s = 0;
                        } else if (cVar.f() && cVar10.f()) {
                            this.f16377t = 1.0f / this.f16377t;
                            this.f16376s = 1;
                        }
                    }
                    if (this.f16376s == -1) {
                        int i33 = this.f16370m;
                        if (i33 > 0 && this.f16373p == 0) {
                            this.f16376s = 0;
                        } else if (i33 == 0 && this.f16373p > 0) {
                            this.f16377t = 1.0f / this.f16377t;
                            this.f16376s = 1;
                        }
                    }
                    c6 = 3;
                } else if (i28 == 3 && i21 == 3) {
                    this.f16376s = 0;
                    int i34 = (int) (f8 * i26);
                    c6 = 3;
                    i25 = i34;
                    if (i29 != 3) {
                        i8 = 4;
                        z14 = false;
                        int[] iArr6 = this.f16369l;
                        iArr6[0] = i8;
                        iArr6[1] = i9;
                        if (!z14) {
                        }
                        z15 = false;
                        if (iArr5[0] != 2) {
                        }
                        z16 = false;
                        if (z16) {
                        }
                        c cVar11 = this.f16337E;
                        boolean z30 = !cVar11.f();
                        boolean[] zArr3 = this.f16340H;
                        boolean z31 = zArr3[0];
                        boolean z32 = zArr3[1];
                        i10 = this.f16367h;
                        int[] iArr7 = this.f16378u;
                        C1770i c1770i16 = null;
                        if (i10 != 2) {
                        }
                        c1849f = lVar2.f16612h;
                        if (!c1849f.j) {
                        }
                        c1770i8 = c1770i5;
                        c1770i9 = c1770i6;
                        c1770i10 = c1770i7;
                        i13 = 1;
                        i14 = 0;
                        i15 = 8;
                        i16 = 1;
                        if (this.f16368i == 2) {
                        }
                        if (i16 != 0) {
                        }
                        if (z14) {
                        }
                        if (cVar4.f()) {
                        }
                    }
                } else if (i29 == 3 && i9 == 3) {
                    this.f16376s = 1;
                    if (i30 == -1) {
                        this.f16377t = 1.0f / f8;
                    }
                    i4 = (int) (this.f16377t * i24);
                    i8 = i21;
                    if (i28 != 3) {
                        i9 = 4;
                        z14 = false;
                        int[] iArr62 = this.f16369l;
                        iArr62[0] = i8;
                        iArr62[1] = i9;
                        if (!z14 && ((i20 = this.f16376s) == 0 || i20 == -1)) {
                            z15 = true;
                            if (iArr5[0] != 2 && (this instanceof e)) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                i25 = 0;
                            }
                            c cVar112 = this.f16337E;
                            boolean z302 = !cVar112.f();
                            boolean[] zArr32 = this.f16340H;
                            boolean z312 = zArr32[0];
                            boolean z322 = zArr32[1];
                            i10 = this.f16367h;
                            int[] iArr72 = this.f16378u;
                            C1770i c1770i162 = null;
                            if (i10 != 2) {
                                C1849f c1849f3 = jVar.f16612h;
                                if (c1849f3.j && jVar.f16613i.j) {
                                    c1766e2.d(j, c1849f3.f16597g);
                                    c1766e2.d(j5, jVar.f16613i.f16597g);
                                    if (this.f16341I != null && z9 && zArr2[0] && !q()) {
                                        c1766e2.f(c1766e2.j(this.f16341I.f16383z), j5, 0, 8);
                                    }
                                    iArr = iArr72;
                                    c1770i3 = j;
                                    c1770i4 = j5;
                                    z17 = z9;
                                    zArr = zArr2;
                                    cVar3 = cVar9;
                                    c1770i5 = c1770i;
                                    i11 = i8;
                                    z18 = z10;
                                    z19 = z11;
                                    z20 = z29;
                                    obj = cVar8;
                                    c1770i6 = j9;
                                    lVar2 = lVar;
                                    c1770i7 = c1770i2;
                                    z21 = z302;
                                    i12 = i9;
                                    iArr2 = iArr5;
                                    cVar4 = cVar112;
                                } else {
                                    d dVar3 = this.f16341I;
                                    if (dVar3 != null) {
                                        c1770i14 = c1766e2.j(dVar3.f16383z);
                                    } else {
                                        c1770i14 = null;
                                    }
                                    d dVar4 = this.f16341I;
                                    if (dVar4 != null) {
                                        c1770i15 = c1766e2.j(dVar4.f16381x);
                                    } else {
                                        c1770i15 = null;
                                    }
                                    z17 = z9;
                                    zArr = zArr2;
                                    iArr = iArr72;
                                    C1770i c1770i17 = c1770i;
                                    i11 = i8;
                                    i12 = i9;
                                    C1770i c1770i18 = c1770i14;
                                    z20 = z29;
                                    boolean z33 = z302;
                                    c1770i4 = j5;
                                    z18 = z10;
                                    z19 = z11;
                                    obj = cVar8;
                                    c1770i6 = j9;
                                    cVar3 = cVar9;
                                    c1770i3 = j;
                                    c1770i7 = c1770i2;
                                    c1770i5 = c1770i17;
                                    iArr2 = iArr5;
                                    cVar4 = cVar112;
                                    c1766e2 = c1766e;
                                    c(c1766e2, true, z17, z20, zArr2[0], c1770i15, c1770i18, iArr5[0], z16, this.f16381x, this.f16383z, this.f16345N, i25, this.f16348Q, iArr72[0], this.f16350S, z15, z18, z19, z312, i11, i12, this.f16370m, this.f16371n, this.f16372o, z33);
                                    lVar2 = lVar;
                                    z21 = z33;
                                }
                            } else {
                                iArr = iArr72;
                                c1770i3 = j;
                                c1770i4 = j5;
                                z17 = z9;
                                zArr = zArr2;
                                cVar3 = cVar9;
                                c1770i5 = c1770i;
                                i11 = i8;
                                z18 = z10;
                                z19 = z11;
                                z20 = z29;
                                obj = cVar8;
                                c1770i6 = j9;
                                c1770i7 = c1770i2;
                                z21 = z302;
                                i12 = i9;
                                iArr2 = iArr5;
                                cVar4 = cVar112;
                                lVar2 = lVar;
                            }
                            c1849f = lVar2.f16612h;
                            if (!c1849f.j && lVar2.f16613i.j) {
                                c1770i8 = c1770i5;
                                c1766e2.d(c1770i8, c1849f.f16597g);
                                c1770i9 = c1770i6;
                                c1766e2.d(c1770i9, lVar2.f16613i.f16597g);
                                c1770i10 = c1770i7;
                                c1766e2.d(c1770i10, lVar2.k.f16597g);
                                d dVar5 = this.f16341I;
                                if (dVar5 != null && !z19 && z20) {
                                    i13 = 1;
                                    if (zArr[1]) {
                                        i14 = 0;
                                        i15 = 8;
                                        c1766e2.f(c1766e2.j(dVar5.f16333A), c1770i9, 0, 8);
                                        i16 = i14;
                                    }
                                } else {
                                    i13 = 1;
                                }
                                i14 = 0;
                                i15 = 8;
                                i16 = i14;
                            } else {
                                c1770i8 = c1770i5;
                                c1770i9 = c1770i6;
                                c1770i10 = c1770i7;
                                i13 = 1;
                                i14 = 0;
                                i15 = 8;
                                i16 = 1;
                            }
                            if (this.f16368i == 2) {
                                i16 = i14;
                            }
                            if (i16 != 0) {
                                if (iArr2[i13] == 2 && (this instanceof e)) {
                                    i17 = i13;
                                } else {
                                    i17 = i14;
                                }
                                if (i17 != 0) {
                                    i18 = i14;
                                } else {
                                    i18 = i4;
                                }
                                if (z14 && ((i19 = this.f16376s) == i13 || i19 == -1)) {
                                    z22 = i13;
                                } else {
                                    z22 = i14;
                                }
                                d dVar6 = this.f16341I;
                                if (dVar6 != null) {
                                    c1770i13 = c1766e2.j(dVar6.f16333A);
                                } else {
                                    c1770i13 = null;
                                }
                                d dVar7 = this.f16341I;
                                if (dVar7 != null) {
                                    c1770i162 = c1766e2.j(dVar7.f16382y);
                                }
                                int i35 = this.f16347P;
                                int i36 = i13;
                                if (i35 <= 0) {
                                    z23 = z21;
                                }
                                c1766e2.e(c1770i10, c1770i8, i35, i15);
                                Object obj2 = cVar3.f16329d;
                                if (obj2 != null) {
                                    c1766e2.e(c1770i10, c1766e2.j(obj2), i14, i15);
                                    if (z20) {
                                        c1766e2.f(c1770i13, c1766e2.j(obj), i14, 5);
                                    }
                                    z23 = i14;
                                } else {
                                    z23 = z21;
                                    if (this.f16353V == i15) {
                                        c1766e2.e(c1770i10, c1770i8, i14, i15);
                                        z23 = z21;
                                    }
                                }
                                c1770i11 = c1770i8;
                                c1770i12 = c1770i9;
                                c1766e2 = c1766e;
                                c(c1766e2, false, z20, z17, zArr[i36], c1770i162, c1770i13, iArr2[i36], i17, this.f16382y, this.f16333A, this.f16346O, i18, this.f16349R, iArr[i36], this.f16351T, z22, z19, z18, z322, i12, i11, this.f16373p, this.f16374q, this.f16375r, z23);
                            } else {
                                c1770i11 = c1770i8;
                                c1770i12 = c1770i9;
                            }
                            if (z14) {
                                if (this.f16376s == 1) {
                                    float f9 = this.f16377t;
                                    C1764c k = c1766e2.k();
                                    k.f16037d.g(c1770i12, -1.0f);
                                    k.f16037d.g(c1770i11, 1.0f);
                                    k.f16037d.g(c1770i4, f9);
                                    k.f16037d.g(c1770i3, -f9);
                                    c1766e2.c(k);
                                } else {
                                    float f10 = this.f16377t;
                                    C1764c k6 = c1766e2.k();
                                    k6.f16037d.g(c1770i4, -1.0f);
                                    k6.f16037d.g(c1770i3, 1.0f);
                                    k6.f16037d.g(c1770i12, f10);
                                    k6.f16037d.g(c1770i11, -f10);
                                    c1766e2.c(k6);
                                }
                            }
                            if (cVar4.f()) {
                                c cVar12 = cVar4;
                                d dVar8 = cVar12.f16329d.f16327b;
                                float radians = (float) Math.toRadians(this.f16379v + 90.0f);
                                int c9 = cVar12.c();
                                C1770i j11 = c1766e2.j(g(2));
                                C1770i j12 = c1766e2.j(g(3));
                                C1770i j13 = c1766e2.j(g(4));
                                C1770i j14 = c1766e2.j(g(5));
                                C1770i j15 = c1766e2.j(dVar8.g(2));
                                C1770i j16 = c1766e2.j(dVar8.g(3));
                                C1770i j17 = c1766e2.j(dVar8.g(4));
                                C1770i j18 = c1766e2.j(dVar8.g(5));
                                C1764c k8 = c1766e2.k();
                                double d2 = radians;
                                double sin = Math.sin(d2);
                                double d3 = c9;
                                k8.f16037d.g(j16, 0.5f);
                                k8.f16037d.g(j18, 0.5f);
                                k8.f16037d.g(j12, -0.5f);
                                k8.f16037d.g(j14, -0.5f);
                                k8.f16035b = -((float) (sin * d3));
                                c1766e2.c(k8);
                                C1764c k9 = c1766e2.k();
                                float cos = (float) (Math.cos(d2) * d3);
                                k9.f16037d.g(j15, 0.5f);
                                k9.f16037d.g(j17, 0.5f);
                                k9.f16037d.g(j11, -0.5f);
                                k9.f16037d.g(j13, -0.5f);
                                k9.f16035b = -cos;
                                c1766e2.c(k9);
                                return;
                            }
                            return;
                        }
                        z15 = false;
                        if (iArr5[0] != 2) {
                        }
                        z16 = false;
                        if (z16) {
                        }
                        c cVar1122 = this.f16337E;
                        boolean z3022 = !cVar1122.f();
                        boolean[] zArr322 = this.f16340H;
                        boolean z3122 = zArr322[0];
                        boolean z3222 = zArr322[1];
                        i10 = this.f16367h;
                        int[] iArr722 = this.f16378u;
                        C1770i c1770i1622 = null;
                        if (i10 != 2) {
                        }
                        c1849f = lVar2.f16612h;
                        if (!c1849f.j) {
                        }
                        c1770i8 = c1770i5;
                        c1770i9 = c1770i6;
                        c1770i10 = c1770i7;
                        i13 = 1;
                        i14 = 0;
                        i15 = 8;
                        i16 = 1;
                        if (this.f16368i == 2) {
                        }
                        if (i16 != 0) {
                        }
                        if (z14) {
                        }
                        if (cVar4.f()) {
                        }
                    }
                    z14 = true;
                    int[] iArr622 = this.f16369l;
                    iArr622[0] = i8;
                    iArr622[1] = i9;
                    if (!z14) {
                        z15 = true;
                        if (iArr5[0] != 2) {
                        }
                        z16 = false;
                        if (z16) {
                        }
                        c cVar11222 = this.f16337E;
                        boolean z30222 = !cVar11222.f();
                        boolean[] zArr3222 = this.f16340H;
                        boolean z31222 = zArr3222[0];
                        boolean z32222 = zArr3222[1];
                        i10 = this.f16367h;
                        int[] iArr7222 = this.f16378u;
                        C1770i c1770i16222 = null;
                        if (i10 != 2) {
                        }
                        c1849f = lVar2.f16612h;
                        if (!c1849f.j) {
                        }
                        c1770i8 = c1770i5;
                        c1770i9 = c1770i6;
                        c1770i10 = c1770i7;
                        i13 = 1;
                        i14 = 0;
                        i15 = 8;
                        i16 = 1;
                        if (this.f16368i == 2) {
                        }
                        if (i16 != 0) {
                        }
                        if (z14) {
                        }
                        if (cVar4.f()) {
                        }
                    }
                    z15 = false;
                    if (iArr5[0] != 2) {
                    }
                    z16 = false;
                    if (z16) {
                    }
                    c cVar112222 = this.f16337E;
                    boolean z302222 = !cVar112222.f();
                    boolean[] zArr32222 = this.f16340H;
                    boolean z312222 = zArr32222[0];
                    boolean z322222 = zArr32222[1];
                    i10 = this.f16367h;
                    int[] iArr72222 = this.f16378u;
                    C1770i c1770i162222 = null;
                    if (i10 != 2) {
                    }
                    c1849f = lVar2.f16612h;
                    if (!c1849f.j) {
                    }
                    c1770i8 = c1770i5;
                    c1770i9 = c1770i6;
                    c1770i10 = c1770i7;
                    i13 = 1;
                    i14 = 0;
                    i15 = 8;
                    i16 = 1;
                    if (this.f16368i == 2) {
                    }
                    if (i16 != 0) {
                    }
                    if (z14) {
                    }
                    if (cVar4.f()) {
                    }
                }
                i8 = i21;
                z14 = true;
                int[] iArr6222 = this.f16369l;
                iArr6222[0] = i8;
                iArr6222[1] = i9;
                if (!z14) {
                }
                z15 = false;
                if (iArr5[0] != 2) {
                }
                z16 = false;
                if (z16) {
                }
                c cVar1122222 = this.f16337E;
                boolean z3022222 = !cVar1122222.f();
                boolean[] zArr322222 = this.f16340H;
                boolean z3122222 = zArr322222[0];
                boolean z3222222 = zArr322222[1];
                i10 = this.f16367h;
                int[] iArr722222 = this.f16378u;
                C1770i c1770i1622222 = null;
                if (i10 != 2) {
                }
                c1849f = lVar2.f16612h;
                if (!c1849f.j) {
                }
                c1770i8 = c1770i5;
                c1770i9 = c1770i6;
                c1770i10 = c1770i7;
                i13 = 1;
                i14 = 0;
                i15 = 8;
                i16 = 1;
                if (this.f16368i == 2) {
                }
                if (i16 != 0) {
                }
                if (z14) {
                }
                if (cVar4.f()) {
                }
            }
        } else {
            lVar = lVar3;
        }
        c1770i2 = j10;
        c6 = 3;
        i8 = i31;
        i9 = i32;
        z14 = false;
        int[] iArr62222 = this.f16369l;
        iArr62222[0] = i8;
        iArr62222[1] = i9;
        if (!z14) {
        }
        z15 = false;
        if (iArr5[0] != 2) {
        }
        z16 = false;
        if (z16) {
        }
        c cVar11222222 = this.f16337E;
        boolean z30222222 = !cVar11222222.f();
        boolean[] zArr3222222 = this.f16340H;
        boolean z31222222 = zArr3222222[0];
        boolean z32222222 = zArr3222222[1];
        i10 = this.f16367h;
        int[] iArr7222222 = this.f16378u;
        C1770i c1770i16222222 = null;
        if (i10 != 2) {
        }
        c1849f = lVar2.f16612h;
        if (!c1849f.j) {
        }
        c1770i8 = c1770i5;
        c1770i9 = c1770i6;
        c1770i10 = c1770i7;
        i13 = 1;
        i14 = 0;
        i15 = 8;
        i16 = 1;
        if (this.f16368i == 2) {
        }
        if (i16 != 0) {
        }
        if (z14) {
        }
        if (cVar4.f()) {
        }
    }

    public boolean b() {
        if (this.f16353V != 8) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C1766e c1766e, boolean z8, boolean z9, boolean z10, boolean z11, C1770i c1770i, C1770i c1770i2, int i4, boolean z12, c cVar, c cVar2, int i8, int i9, int i10, int i11, float f8, boolean z13, boolean z14, boolean z15, boolean z16, int i12, int i13, int i14, int i15, float f9, boolean z17) {
        boolean z18;
        int i16;
        boolean z19;
        int i17;
        int i18;
        boolean z20;
        boolean z21;
        C1770i j;
        C1770i j5;
        C1770i c1770i3;
        C1770i c1770i4;
        C1770i c1770i5;
        boolean z22;
        C1770i c1770i6;
        int i19;
        boolean z23;
        c cVar3;
        C1770i c1770i7;
        boolean z24;
        int i20;
        int i21;
        boolean z25;
        boolean z26;
        int i22;
        boolean z27;
        int i23;
        boolean z28;
        boolean z29;
        d dVar;
        C1770i c1770i8;
        C1770i c1770i9;
        C1770i c1770i10;
        int i24;
        boolean z30;
        int i25;
        int i26;
        d dVar2;
        int i27;
        int i28;
        boolean z31;
        int i29;
        int i30;
        int i31;
        int i32;
        boolean z32;
        boolean z33;
        int i33;
        C1766e c1766e2 = c1766e;
        int i34 = i14;
        int i35 = i15;
        C1770i j8 = c1766e2.j(cVar);
        C1770i j9 = c1766e2.j(cVar2);
        C1770i j10 = c1766e2.j(cVar.f16329d);
        C1770i j11 = c1766e2.j(cVar2.f16329d);
        boolean f10 = cVar.f();
        boolean f11 = cVar2.f();
        boolean f12 = this.f16337E.f();
        int i36 = f11 ? (f10 ? 1 : 0) + 1 : f10 ? 1 : 0;
        if (f12) {
            i36++;
        }
        int i37 = i36;
        int i38 = z13 ? 3 : i12;
        int b4 = AbstractC1769h.b(i4);
        boolean z34 = (b4 == 0 || b4 == 1 || b4 != 2 || i38 == 4) ? false : true;
        if (this.f16353V == 8) {
            i16 = 0;
            z18 = false;
        } else {
            z18 = z34;
            i16 = i9;
        }
        if (z17) {
            if (!f10 && !f11 && !f12) {
                c1766e2.d(j8, i8);
            } else if (f10 && !f11) {
                z19 = z18;
                i17 = 8;
                c1766e2.e(j8, j10, cVar.c(), 8);
            }
            z19 = z18;
            i17 = 8;
        } else {
            z19 = z18;
            i17 = 8;
        }
        if (z19) {
            if (i37 == 2 || z13 || !(i38 == 1 || i38 == 0)) {
                if (i34 == -2) {
                    i34 = i16;
                }
                if (i35 == -2) {
                    i35 = i16;
                }
                if (i16 > 0 && i38 != 1) {
                    i16 = 0;
                }
                if (i34 > 0) {
                    c1766e2.f(j9, j8, i34, 8);
                    i16 = Math.max(i16, i34);
                }
                if (i35 > 0) {
                    if (!z9 || i38 != 1) {
                        c1766e2.g(j9, j8, i35, 8);
                    }
                    i16 = Math.min(i16, i35);
                }
                if (i38 == 1) {
                    if (z9) {
                        c1766e2.e(j9, j8, i16, 8);
                    } else if (z14) {
                        c1766e2.e(j9, j8, i16, 5);
                        c1766e2.g(j9, j8, i16, 8);
                    } else {
                        c1766e2.e(j9, j8, i16, 5);
                        c1766e2.g(j9, j8, i16, 8);
                    }
                } else {
                    if (i38 != 2) {
                        i18 = i34;
                        z20 = z19;
                        z21 = true;
                        if (!z17) {
                            c1770i3 = c1770i2;
                            c1770i4 = j8;
                            c1770i5 = j9;
                            z22 = z21;
                            c1770i6 = c1770i;
                            i19 = 2;
                        } else {
                            if (!z14) {
                                if ((f10 || f11 || f12) && (!f10 || f11)) {
                                    if (f10 || !f11) {
                                        c1770i7 = j11;
                                        if (f10 && f11) {
                                            d dVar3 = cVar.f16329d.f16327b;
                                            d dVar4 = cVar2.f16329d.f16327b;
                                            z24 = z21;
                                            d dVar5 = this.f16341I;
                                            int i39 = 6;
                                            if (z20) {
                                                if (i38 == 0) {
                                                    if (i35 == 0 && i18 == 0) {
                                                        i32 = 8;
                                                        z32 = false;
                                                        z33 = true;
                                                        i33 = 8;
                                                    } else {
                                                        i32 = 5;
                                                        z32 = true;
                                                        z33 = false;
                                                        i33 = 5;
                                                    }
                                                    if ((dVar3 instanceof a) || (dVar4 instanceof a)) {
                                                        z26 = z32;
                                                        i23 = i33;
                                                        z25 = false;
                                                        i20 = i38;
                                                        i21 = 6;
                                                        z27 = z33;
                                                        i22 = 4;
                                                    } else {
                                                        i23 = i33;
                                                        z25 = false;
                                                        z27 = z33;
                                                        i22 = i32;
                                                        z26 = z32;
                                                        i20 = i38;
                                                        i21 = 6;
                                                    }
                                                } else {
                                                    if (i38 == 1) {
                                                        i20 = i38;
                                                        i21 = 6;
                                                        z25 = true;
                                                        z26 = true;
                                                        i22 = 4;
                                                        z27 = false;
                                                    } else if (i38 == 3) {
                                                        i20 = i38;
                                                        if (this.f16376s == -1) {
                                                            i21 = z15 ? z9 ? 5 : 4 : 8;
                                                            z25 = true;
                                                            z26 = true;
                                                            i22 = 5;
                                                            z27 = true;
                                                        } else {
                                                            if (z13) {
                                                                if (i13 == 2 || i13 == 1) {
                                                                    i30 = 4;
                                                                    i31 = 5;
                                                                } else {
                                                                    i30 = 5;
                                                                    i31 = 8;
                                                                }
                                                                i22 = i30;
                                                                i23 = i31;
                                                                i21 = 6;
                                                                z25 = true;
                                                                z26 = true;
                                                            } else {
                                                                if (i35 > 0) {
                                                                    i21 = 6;
                                                                    z25 = true;
                                                                    z26 = true;
                                                                    i22 = 5;
                                                                } else if (i35 != 0 || i18 != 0) {
                                                                    i21 = 6;
                                                                    z25 = true;
                                                                    z26 = true;
                                                                    i22 = 4;
                                                                } else if (z15) {
                                                                    i23 = (dVar3 == dVar5 || dVar4 == dVar5) ? 5 : 4;
                                                                    i21 = 6;
                                                                    z25 = true;
                                                                    z26 = true;
                                                                    i22 = 4;
                                                                } else {
                                                                    i21 = 6;
                                                                    z25 = true;
                                                                    z26 = true;
                                                                    i22 = 8;
                                                                }
                                                                z27 = true;
                                                                i23 = 5;
                                                            }
                                                            z27 = true;
                                                        }
                                                    } else {
                                                        i20 = i38;
                                                        i21 = 6;
                                                        z25 = false;
                                                        z26 = false;
                                                    }
                                                    i23 = 8;
                                                }
                                                if (z25 || j10 != c1770i7 || dVar3 == dVar5) {
                                                    z28 = z25;
                                                    z29 = true;
                                                } else {
                                                    z28 = false;
                                                    z29 = false;
                                                }
                                                if (z26) {
                                                    dVar = dVar3;
                                                    c1770i8 = j8;
                                                    c1770i9 = j9;
                                                    c1770i10 = j10;
                                                    i24 = i18;
                                                    z30 = z20;
                                                    i25 = i20;
                                                    i26 = 8;
                                                    dVar2 = dVar4;
                                                    c1766e2 = c1766e;
                                                } else {
                                                    if (this.f16353V == 8) {
                                                        i21 = 4;
                                                    }
                                                    c1770i8 = j8;
                                                    c1770i9 = j9;
                                                    int i40 = i21;
                                                    c1770i10 = j10;
                                                    i26 = 8;
                                                    i24 = i18;
                                                    z30 = z20;
                                                    i25 = i20;
                                                    dVar = dVar3;
                                                    dVar2 = dVar4;
                                                    c1766e2 = c1766e;
                                                    c1766e2.b(c1770i8, c1770i10, cVar.c(), f8, c1770i7, c1770i9, cVar2.c(), i40);
                                                }
                                                if (this.f16353V != i26) {
                                                    return;
                                                }
                                                if (z28) {
                                                    int i41 = (!z9 || c1770i10 == c1770i7 || z30 || !((dVar instanceof a) || (dVar2 instanceof a))) ? i23 : 6;
                                                    c1766e2.f(c1770i8, c1770i10, cVar.c(), i41);
                                                    c1766e2.g(c1770i9, c1770i7, -cVar2.c(), i41);
                                                    i23 = i41;
                                                }
                                                if (!z9 || !z16 || (dVar instanceof a) || (dVar2 instanceof a)) {
                                                    i27 = i22;
                                                    i28 = i23;
                                                    z31 = z29;
                                                } else {
                                                    i27 = 6;
                                                    i28 = 6;
                                                    z31 = true;
                                                }
                                                if (z31) {
                                                    if (z27 && (!z15 || z10)) {
                                                        if (dVar != dVar5 && dVar2 != dVar5) {
                                                            i39 = i27;
                                                        }
                                                        if ((dVar instanceof h) || (dVar2 instanceof h)) {
                                                            i39 = 5;
                                                        }
                                                        if ((dVar instanceof a) || (dVar2 instanceof a)) {
                                                            i39 = 5;
                                                        }
                                                        i27 = Math.max(z15 ? 5 : i39, i27);
                                                    }
                                                    if (z9) {
                                                        i27 = Math.min(i28, i27);
                                                        if (z13 && !z15 && (dVar == dVar5 || dVar2 == dVar5)) {
                                                            i29 = 4;
                                                            c1766e2.e(c1770i8, c1770i10, cVar.c(), i29);
                                                            c1766e2.e(c1770i9, c1770i7, -cVar2.c(), i29);
                                                        }
                                                    }
                                                    i29 = i27;
                                                    c1766e2.e(c1770i8, c1770i10, cVar.c(), i29);
                                                    c1766e2.e(c1770i9, c1770i7, -cVar2.c(), i29);
                                                }
                                                if (z9) {
                                                    int c6 = c1770i == c1770i10 ? cVar.c() : 0;
                                                    if (c1770i10 != c1770i) {
                                                        c1766e2.f(c1770i8, c1770i, c6, 5);
                                                    }
                                                }
                                                if (z9 && z30 && i10 == 0 && i24 == 0) {
                                                    if (z30 && i25 == 3) {
                                                        c1766e2.f(c1770i9, c1770i8, 0, 8);
                                                    } else {
                                                        c1766e2.f(c1770i9, c1770i8, 0, 5);
                                                    }
                                                }
                                            } else {
                                                i20 = i38;
                                                i21 = 6;
                                                z25 = true;
                                                z26 = true;
                                            }
                                            i22 = 4;
                                            z27 = false;
                                            i23 = 5;
                                            if (z25) {
                                            }
                                            z28 = z25;
                                            z29 = true;
                                            if (z26) {
                                            }
                                            if (this.f16353V != i26) {
                                            }
                                        }
                                    } else {
                                        c1770i7 = j11;
                                        c1766e2.e(j9, c1770i7, -cVar2.c(), 8);
                                        if (z9) {
                                            c1766e2.f(j8, c1770i, 0, 5);
                                        }
                                    }
                                    c1770i9 = j9;
                                    z24 = z21;
                                } else {
                                    c1770i9 = j9;
                                    z24 = z21;
                                    c1770i7 = j11;
                                }
                                if (z9 && z24) {
                                    int c9 = cVar2.f16329d != null ? cVar2.c() : 0;
                                    if (c1770i7 != c1770i2) {
                                        c1766e2.f(c1770i2, c1770i9, c9, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            c1770i3 = c1770i2;
                            c1770i4 = j8;
                            c1770i5 = j9;
                            z22 = z21;
                            i19 = 2;
                            c1770i6 = c1770i;
                        }
                        if (i37 < i19 && z9 && z22) {
                            c1766e2.f(c1770i4, c1770i6, 0, 8);
                            c cVar4 = this.f16334B;
                            boolean z35 = z8 || cVar4.f16329d == null;
                            if (z8 || (cVar3 = cVar4.f16329d) == null) {
                                z23 = z35;
                            } else {
                                d dVar6 = cVar3.f16327b;
                                if (dVar6.f16343L != 0.0f) {
                                    int[] iArr = dVar6.f16362c0;
                                    if (iArr[0] == 3 && iArr[1] == 3) {
                                        z23 = true;
                                    }
                                }
                                z23 = false;
                            }
                            if (z23) {
                                c1766e2.f(c1770i3, c1770i5, 0, 8);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    int i42 = cVar.f16328c;
                    if (i42 != 3 && i42 != 5) {
                        j = c1766e2.j(this.f16341I.g(2));
                        j5 = c1766e2.j(this.f16341I.g(4));
                    } else {
                        j = c1766e2.j(this.f16341I.g(3));
                        j5 = c1766e2.j(this.f16341I.g(5));
                    }
                    C1764c k = c1766e2.k();
                    k.f16037d.g(j9, -1.0f);
                    k.f16037d.g(j8, 1.0f);
                    k.f16037d.g(j5, f9);
                    k.f16037d.g(j, -f9);
                    c1766e2.c(k);
                    z21 = z11;
                    i18 = i34;
                }
            } else {
                int max = Math.max(i34, i16);
                if (i35 > 0) {
                    max = Math.min(i35, max);
                }
                c1766e2.e(j9, j8, max, 8);
                z21 = z11;
                i18 = i34;
            }
            z20 = false;
            if (!z17) {
            }
            if (i37 < i19) {
                return;
            } else {
                return;
            }
        }
        if (z12) {
            c1766e2.e(j9, j8, 0, 3);
            if (i10 > 0) {
                c1766e2.f(j9, j8, i10, i17);
            }
            if (i11 < Integer.MAX_VALUE) {
                c1766e2.g(j9, j8, i11, i17);
            }
        } else {
            c1766e2.e(j9, j8, i16, i17);
        }
        z21 = z11;
        z20 = z19;
        i18 = i34;
        if (!z17) {
        }
        if (i37 < i19) {
        }
    }

    public final void d(int i4, d dVar, int i8, int i9) {
        boolean z8;
        if (i4 == 7) {
            if (i8 == 7) {
                c g8 = g(2);
                c g9 = g(4);
                c g10 = g(3);
                c g11 = g(5);
                boolean z9 = true;
                if ((g8 != null && g8.f()) || (g9 != null && g9.f())) {
                    z8 = false;
                } else {
                    d(2, dVar, 2, 0);
                    d(4, dVar, 4, 0);
                    z8 = true;
                }
                if ((g10 != null && g10.f()) || (g11 != null && g11.f())) {
                    z9 = false;
                } else {
                    d(3, dVar, 3, 0);
                    d(5, dVar, 5, 0);
                }
                if (z8 && z9) {
                    g(7).a(dVar.g(7), 0);
                    return;
                } else if (z8) {
                    g(8).a(dVar.g(8), 0);
                    return;
                } else {
                    if (z9) {
                        g(9).a(dVar.g(9), 0);
                        return;
                    }
                    return;
                }
            }
            if (i8 != 2 && i8 != 4) {
                if (i8 == 3 || i8 == 5) {
                    d(3, dVar, i8, 0);
                    d(5, dVar, i8, 0);
                    g(7).a(dVar.g(i8), 0);
                    return;
                }
                return;
            }
            d(2, dVar, i8, 0);
            d(4, dVar, i8, 0);
            g(7).a(dVar.g(i8), 0);
            return;
        }
        if (i4 == 8 && (i8 == 2 || i8 == 4)) {
            c g12 = g(2);
            c g13 = dVar.g(i8);
            c g14 = g(4);
            g12.a(g13, 0);
            g14.a(g13, 0);
            g(8).a(g13, 0);
            return;
        }
        if (i4 == 9 && (i8 == 3 || i8 == 5)) {
            c g15 = dVar.g(i8);
            g(3).a(g15, 0);
            g(5).a(g15, 0);
            g(9).a(g15, 0);
            return;
        }
        if (i4 == 8 && i8 == 8) {
            g(2).a(dVar.g(2), 0);
            g(4).a(dVar.g(4), 0);
            g(8).a(dVar.g(i8), 0);
            return;
        }
        if (i4 == 9 && i8 == 9) {
            g(3).a(dVar.g(3), 0);
            g(5).a(dVar.g(5), 0);
            g(9).a(dVar.g(i8), 0);
            return;
        }
        c g16 = g(i4);
        c g17 = dVar.g(i8);
        if (g16.g(g17)) {
            if (i4 == 6) {
                c g18 = g(3);
                c g19 = g(5);
                if (g18 != null) {
                    g18.h();
                }
                if (g19 != null) {
                    g19.h();
                }
                i9 = 0;
            } else if (i4 != 3 && i4 != 5) {
                if (i4 == 2 || i4 == 4) {
                    c g20 = g(7);
                    if (g20.f16329d != g17) {
                        g20.h();
                    }
                    c d2 = g(i4).d();
                    c g21 = g(8);
                    if (g21.f()) {
                        d2.h();
                        g21.h();
                    }
                }
            } else {
                c g22 = g(6);
                if (g22 != null) {
                    g22.h();
                }
                c g23 = g(7);
                if (g23.f16329d != g17) {
                    g23.h();
                }
                c d3 = g(i4).d();
                c g24 = g(9);
                if (g24.f()) {
                    d3.h();
                    g24.h();
                }
            }
            g16.a(g17, i9);
        }
    }

    public final void e(c cVar, c cVar2, int i4) {
        if (cVar.f16327b == this) {
            d(cVar.f16328c, cVar2.f16327b, cVar2.f16328c, i4);
        }
    }

    public final void f(C1766e c1766e) {
        c1766e.j(this.f16381x);
        c1766e.j(this.f16382y);
        c1766e.j(this.f16383z);
        c1766e.j(this.f16333A);
        if (this.f16347P > 0) {
            c1766e.j(this.f16334B);
        }
    }

    public c g(int i4) {
        switch (AbstractC1769h.b(i4)) {
            case 0:
                return null;
            case 1:
                return this.f16381x;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return this.f16382y;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return this.f16383z;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return this.f16333A;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return this.f16334B;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return this.f16337E;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return this.f16335C;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return this.f16336D;
            default:
                throw new AssertionError(AbstractC1149a.o(i4));
        }
    }

    public final int h(int i4) {
        int[] iArr = this.f16362c0;
        if (i4 == 0) {
            return iArr[0];
        }
        if (i4 != 1) {
            return 0;
        }
        return iArr[1];
    }

    public final int i() {
        if (this.f16353V == 8) {
            return 0;
        }
        return this.K;
    }

    public final d j(int i4) {
        c cVar;
        c cVar2;
        if (i4 == 0) {
            c cVar3 = this.f16383z;
            c cVar4 = cVar3.f16329d;
            if (cVar4 != null && cVar4.f16329d == cVar3) {
                return cVar4.f16327b;
            }
            return null;
        }
        if (i4 == 1 && (cVar2 = (cVar = this.f16333A).f16329d) != null && cVar2.f16329d == cVar) {
            return cVar2.f16327b;
        }
        return null;
    }

    public final d k(int i4) {
        c cVar;
        c cVar2;
        if (i4 == 0) {
            c cVar3 = this.f16381x;
            c cVar4 = cVar3.f16329d;
            if (cVar4 != null && cVar4.f16329d == cVar3) {
                return cVar4.f16327b;
            }
            return null;
        }
        if (i4 == 1 && (cVar2 = (cVar = this.f16382y).f16329d) != null && cVar2.f16329d == cVar) {
            return cVar2.f16327b;
        }
        return null;
    }

    public final int l() {
        if (this.f16353V == 8) {
            return 0;
        }
        return this.f16342J;
    }

    public final int m() {
        d dVar = this.f16341I;
        if (dVar != null && (dVar instanceof e)) {
            return ((e) dVar).j0 + this.f16345N;
        }
        return this.f16345N;
    }

    public final int n() {
        d dVar = this.f16341I;
        if (dVar != null && (dVar instanceof e)) {
            return ((e) dVar).f16390k0 + this.f16346O;
        }
        return this.f16346O;
    }

    public final void o(int i4, int i8, int i9, int i10, d dVar) {
        g(i4).b(dVar.g(i8), i9, i10, true);
    }

    public final boolean p(int i4) {
        c cVar;
        c cVar2;
        int i8 = i4 * 2;
        c[] cVarArr = this.f16338F;
        c cVar3 = cVarArr[i8];
        c cVar4 = cVar3.f16329d;
        if (cVar4 != null && cVar4.f16329d != cVar3 && (cVar2 = (cVar = cVarArr[i8 + 1]).f16329d) != null && cVar2.f16329d == cVar) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        c cVar = this.f16381x;
        c cVar2 = cVar.f16329d;
        if (cVar2 == null || cVar2.f16329d != cVar) {
            c cVar3 = this.f16383z;
            c cVar4 = cVar3.f16329d;
            if (cVar4 != null && cVar4.f16329d == cVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean r() {
        c cVar = this.f16382y;
        c cVar2 = cVar.f16329d;
        if (cVar2 == null || cVar2.f16329d != cVar) {
            c cVar3 = this.f16333A;
            c cVar4 = cVar3.f16329d;
            if (cVar4 != null && cVar4.f16329d == cVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void s() {
        this.f16381x.h();
        this.f16382y.h();
        this.f16383z.h();
        this.f16333A.h();
        this.f16334B.h();
        this.f16335C.h();
        this.f16336D.h();
        this.f16337E.h();
        this.f16341I = null;
        this.f16379v = 0.0f;
        this.f16342J = 0;
        this.K = 0;
        this.f16343L = 0.0f;
        this.f16344M = -1;
        this.f16345N = 0;
        this.f16346O = 0;
        this.f16347P = 0;
        this.f16348Q = 0;
        this.f16349R = 0;
        this.f16350S = 0.5f;
        this.f16351T = 0.5f;
        int[] iArr = this.f16362c0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f16352U = null;
        this.f16353V = 0;
        this.f16355X = 0;
        this.Y = 0;
        float[] fArr = this.f16356Z;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f16367h = -1;
        this.f16368i = -1;
        int[] iArr2 = this.f16378u;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.j = 0;
        this.k = 0;
        this.f16372o = 1.0f;
        this.f16375r = 1.0f;
        this.f16371n = Integer.MAX_VALUE;
        this.f16374q = Integer.MAX_VALUE;
        this.f16370m = 0;
        this.f16373p = 0;
        this.f16376s = -1;
        this.f16377t = 1.0f;
        boolean[] zArr = this.f16365f;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.f16340H;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public final void t() {
        d dVar = this.f16341I;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList arrayList = this.f16339G;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((c) arrayList.get(i4)).h();
        }
    }

    public String toString() {
        String str = "";
        StringBuilder a3 = AbstractC1769h.a("");
        if (this.f16354W != null) {
            str = A.j.r(new StringBuilder("id: "), this.f16354W, " ");
        }
        a3.append(str);
        a3.append("(");
        a3.append(this.f16345N);
        a3.append(", ");
        a3.append(this.f16346O);
        a3.append(") - (");
        a3.append(this.f16342J);
        a3.append(" x ");
        return AbstractC1149a.h(a3, this.K, ")");
    }

    public void u(b0 b0Var) {
        this.f16381x.i();
        this.f16382y.i();
        this.f16383z.i();
        this.f16333A.i();
        this.f16334B.i();
        this.f16337E.i();
        this.f16335C.i();
        this.f16336D.i();
    }

    public final void v(int i4) {
        this.K = i4;
        int i8 = this.f16349R;
        if (i4 < i8) {
            this.K = i8;
        }
    }

    public final void w(int i4) {
        this.f16362c0[0] = i4;
    }

    public final void x(int i4) {
        this.f16362c0[1] = i4;
    }

    public final void y(int i4) {
        this.f16342J = i4;
        int i8 = this.f16348Q;
        if (i4 < i8) {
            this.f16342J = i8;
        }
    }

    public void z(boolean z8, boolean z9) {
        int i4;
        int i8;
        z.j jVar = this.f16363d;
        boolean z10 = z8 & jVar.f16611g;
        l lVar = this.f16364e;
        boolean z11 = z9 & lVar.f16611g;
        int i9 = jVar.f16612h.f16597g;
        int i10 = lVar.f16612h.f16597g;
        int i11 = jVar.f16613i.f16597g;
        int i12 = lVar.f16613i.f16597g;
        int i13 = i12 - i10;
        if (i11 - i9 < 0 || i13 < 0 || i9 == Integer.MIN_VALUE || i9 == Integer.MAX_VALUE || i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE) {
            i11 = 0;
            i12 = 0;
            i9 = 0;
            i10 = 0;
        }
        int i14 = i11 - i9;
        int i15 = i12 - i10;
        if (z10) {
            this.f16345N = i9;
        }
        if (z11) {
            this.f16346O = i10;
        }
        if (this.f16353V == 8) {
            this.f16342J = 0;
            this.K = 0;
            return;
        }
        int[] iArr = this.f16362c0;
        if (z10) {
            if (iArr[0] == 1 && i14 < (i8 = this.f16342J)) {
                i14 = i8;
            }
            this.f16342J = i14;
            int i16 = this.f16348Q;
            if (i14 < i16) {
                this.f16342J = i16;
            }
        }
        if (z11) {
            if (iArr[1] == 1 && i15 < (i4 = this.K)) {
                i15 = i4;
            }
            this.K = i15;
            int i17 = this.f16349R;
            if (i15 < i17) {
                this.K = i17;
            }
        }
    }
}
