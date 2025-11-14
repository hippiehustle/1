package y;

import java.util.ArrayList;
import x.C1764c;
import x.C1766e;
import x.C1770i;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f16456a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0267, code lost:
    
        if (r8.f16327b == r6) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0106, code lost:
    
        if (r5.f16327b == r7) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:251:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(e eVar, C1766e c1766e, int i4) {
        int i8;
        b[] bVarArr;
        int i9;
        float f8;
        boolean z8;
        float f9;
        boolean z9;
        boolean z10;
        boolean z11;
        d dVar;
        boolean z12;
        d dVar2;
        boolean z13;
        C1766e c1766e2;
        C1770i c1770i;
        C1770i c1770i2;
        c cVar;
        C1770i c1770i3;
        int i10;
        d dVar3;
        boolean z14;
        int i11;
        C1770i c1770i4;
        c cVar2;
        C1770i c1770i5;
        C1770i c1770i6;
        d dVar4;
        d dVar5;
        int i12;
        int i13;
        c cVar3;
        int i14;
        c cVar4;
        c cVar5;
        C1770i c1770i7;
        c cVar6;
        C1770i c1770i8;
        C1770i c1770i9;
        C1770i c1770i10;
        float f10;
        int size;
        ArrayList arrayList;
        int i15;
        int i16;
        d dVar6;
        float f11;
        int i17;
        int i18;
        boolean z15;
        int i19;
        b[] bVarArr2;
        d dVar7;
        int i20;
        int i21;
        boolean z16;
        boolean z17;
        int i22;
        c cVar7;
        d dVar8;
        e eVar2 = eVar;
        C1766e c1766e3 = c1766e;
        if (i4 == 0) {
            i8 = eVar2.f16391l0;
            bVarArr = eVar2.f16394o0;
            i9 = 0;
        } else {
            i8 = eVar2.f16392m0;
            bVarArr = eVar2.f16393n0;
            i9 = 2;
        }
        int i23 = i8;
        b[] bVarArr3 = bVarArr;
        int i24 = 0;
        while (i24 < i23) {
            b bVar = bVarArr3[i24];
            boolean z18 = bVar.f16325q;
            d dVar9 = bVar.f16311a;
            int i25 = 3;
            C1770i c1770i11 = null;
            int i26 = 8;
            if (!z18) {
                int i27 = bVar.f16320l;
                int i28 = i27 * 2;
                d dVar10 = dVar9;
                d dVar11 = dVar10;
                boolean z19 = false;
                f8 = 0.0f;
                while (!z19) {
                    bVar.f16319i++;
                    d[] dVarArr = dVar10.f16360b0;
                    c[] cVarArr = dVar10.f16338F;
                    dVarArr[i27] = null;
                    dVar10.f16358a0[i27] = null;
                    if (dVar10.f16353V != i26) {
                        dVar10.h(i27);
                        cVarArr[i28].c();
                        int i29 = i28 + 1;
                        cVarArr[i29].c();
                        cVarArr[i28].c();
                        cVarArr[i29].c();
                        if (bVar.f16312b == null) {
                            bVar.f16312b = dVar10;
                        }
                        bVar.f16314d = dVar10;
                        int i30 = dVar10.f16362c0[i27];
                        if (i30 == i25) {
                            int i31 = dVar10.f16369l[i27];
                            if (i31 != 0 && i31 != i25 && i31 != 2) {
                                i22 = i27;
                            } else {
                                bVar.j++;
                                float f12 = dVar10.f16356Z[i27];
                                if (f12 > 0.0f) {
                                    i22 = i27;
                                    bVar.k += f12;
                                } else {
                                    i22 = i27;
                                }
                                if (dVar10.f16353V != 8 && i30 == 3 && (i31 == 0 || i31 == 3)) {
                                    if (f12 < 0.0f) {
                                        bVar.f16322n = true;
                                    } else {
                                        bVar.f16323o = true;
                                    }
                                    if (bVar.f16318h == null) {
                                        bVar.f16318h = new ArrayList();
                                    }
                                    bVar.f16318h.add(dVar10);
                                }
                                if (bVar.f16316f == null) {
                                    bVar.f16316f = dVar10;
                                }
                                d dVar12 = bVar.f16317g;
                                if (dVar12 != null) {
                                    dVar12.f16358a0[i22] = dVar10;
                                }
                                bVar.f16317g = dVar10;
                            }
                            if (i22 == 0) {
                                if (dVar10.j == 0 && dVar10.f16370m == 0) {
                                    int i32 = dVar10.f16371n;
                                }
                            } else if (dVar10.k == 0 && dVar10.f16373p == 0) {
                                int i33 = dVar10.f16374q;
                            }
                            if (dVar11 != dVar10) {
                                dVar11.f16360b0[i22] = dVar10;
                            }
                            cVar7 = cVarArr[i28 + 1].f16329d;
                            if (cVar7 != null) {
                                dVar8 = cVar7.f16327b;
                                c cVar8 = dVar8.f16338F[i28].f16329d;
                                if (cVar8 != null) {
                                }
                            }
                            dVar8 = null;
                            if (dVar8 != null) {
                                dVar8 = dVar10;
                                z19 = true;
                            }
                            dVar11 = dVar10;
                            i25 = 3;
                            i26 = 8;
                            dVar10 = dVar8;
                            i27 = i22;
                        }
                    }
                    i22 = i27;
                    if (dVar11 != dVar10) {
                    }
                    cVar7 = cVarArr[i28 + 1].f16329d;
                    if (cVar7 != null) {
                    }
                    dVar8 = null;
                    if (dVar8 != null) {
                    }
                    dVar11 = dVar10;
                    i25 = 3;
                    i26 = 8;
                    dVar10 = dVar8;
                    i27 = i22;
                }
                int i34 = i27;
                d dVar13 = bVar.f16312b;
                if (dVar13 != null) {
                    dVar13.f16338F[i28].c();
                }
                d dVar14 = bVar.f16314d;
                if (dVar14 != null) {
                    dVar14.f16338F[i28 + 1].c();
                }
                bVar.f16313c = dVar10;
                if (i34 == 0 && bVar.f16321m) {
                    bVar.f16315e = dVar10;
                } else {
                    bVar.f16315e = dVar9;
                }
                if (bVar.f16323o && bVar.f16322n) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                bVar.f16324p = z17;
            } else {
                f8 = 0.0f;
            }
            bVar.f16325q = true;
            d dVar15 = bVar.f16313c;
            d dVar16 = bVar.f16312b;
            d dVar17 = bVar.f16314d;
            d dVar18 = bVar.f16315e;
            float f13 = bVar.k;
            int[] iArr = eVar2.f16362c0;
            c[] cVarArr2 = eVar2.f16338F;
            if (iArr[i4] == 2) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (i4 == 0) {
                int i35 = dVar18.f16355X;
                if (i35 == 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                f9 = f13;
                if (i35 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i35 == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                dVar = dVar9;
                z12 = z8;
                z9 = z16;
            } else {
                f9 = f13;
                int i36 = dVar18.Y;
                if (i36 == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (i36 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i36 == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                dVar = dVar9;
                z12 = z8;
            }
            boolean z20 = z10;
            boolean z21 = false;
            while (!z21) {
                c[] cVarArr3 = dVar.f16338F;
                int[] iArr2 = dVar.f16362c0;
                c cVar9 = cVarArr3[i9];
                if (z11) {
                    i18 = 1;
                } else {
                    i18 = 4;
                }
                int c6 = cVar9.c();
                c[] cVarArr4 = cVarArr2;
                boolean z22 = z11;
                if (iArr2[i4] == 3 && dVar.f16369l[i4] == 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                c cVar10 = cVar9.f16329d;
                if (cVar10 != null && dVar != dVar9) {
                    c6 = cVar10.c() + c6;
                }
                int i37 = c6;
                if (z22 && dVar != dVar9 && dVar != dVar16) {
                    i18 = 5;
                }
                boolean z23 = z15;
                c cVar11 = cVar9.f16329d;
                if (cVar11 != null) {
                    if (dVar == dVar16) {
                        i19 = i23;
                        bVarArr2 = bVarArr3;
                        c1766e3.f(cVar9.f16332g, cVar11.f16332g, i37, 6);
                    } else {
                        i19 = i23;
                        bVarArr2 = bVarArr3;
                        c1766e3.f(cVar9.f16332g, cVar11.f16332g, i37, 8);
                    }
                    if (z23 && !z22) {
                        i21 = 5;
                    } else {
                        i21 = i18;
                    }
                    c1766e3.e(cVar9.f16332g, cVar9.f16329d.f16332g, i37, i21);
                } else {
                    i19 = i23;
                    bVarArr2 = bVarArr3;
                }
                if (z12) {
                    if (dVar.f16353V != 8 && iArr2[i4] == 3) {
                        i20 = 0;
                        c1766e3.f(cVarArr3[i9 + 1].f16332g, cVarArr3[i9].f16332g, 0, 5);
                    } else {
                        i20 = 0;
                    }
                    c1766e3.f(cVarArr3[i9].f16332g, cVarArr4[i9].f16332g, i20, 8);
                }
                c cVar12 = cVarArr3[i9 + 1].f16329d;
                if (cVar12 != null) {
                    dVar7 = cVar12.f16327b;
                    c cVar13 = dVar7.f16338F[i9].f16329d;
                    if (cVar13 != null) {
                    }
                }
                dVar7 = null;
                if (dVar7 != null) {
                    dVar = dVar7;
                } else {
                    z21 = true;
                }
                cVarArr2 = cVarArr4;
                z11 = z22;
                i23 = i19;
                bVarArr3 = bVarArr2;
            }
            c[] cVarArr5 = cVarArr2;
            boolean z24 = z11;
            int i38 = i23;
            b[] bVarArr4 = bVarArr3;
            if (dVar17 != null) {
                int i39 = i9 + 1;
                if (dVar15.f16338F[i39].f16329d != null) {
                    c cVar14 = dVar17.f16338F[i39];
                    if (dVar17.f16362c0[i4] == 3 && dVar17.f16369l[i4] == 0 && !z24) {
                        c cVar15 = cVar14.f16329d;
                        if (cVar15.f16327b == eVar2) {
                            c1766e3.e(cVar14.f16332g, cVar15.f16332g, -cVar14.c(), 5);
                            c1766e3.g(cVar14.f16332g, dVar15.f16338F[i39].f16329d.f16332g, -cVar14.c(), 6);
                        }
                    }
                    if (z24) {
                        c cVar16 = cVar14.f16329d;
                        if (cVar16.f16327b == eVar2) {
                            c1766e3.e(cVar14.f16332g, cVar16.f16332g, -cVar14.c(), 4);
                        }
                    }
                    c1766e3.g(cVar14.f16332g, dVar15.f16338F[i39].f16329d.f16332g, -cVar14.c(), 6);
                }
            }
            if (z12) {
                int i40 = i9 + 1;
                C1770i c1770i12 = cVarArr5[i40].f16332g;
                c cVar17 = dVar15.f16338F[i40];
                c1766e3.f(c1770i12, cVar17.f16332g, cVar17.c(), 8);
            }
            ArrayList arrayList2 = bVar.f16318h;
            if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                if (bVar.f16322n && !bVar.f16324p) {
                    f9 = bVar.j;
                }
                d dVar19 = null;
                float f14 = f8;
                int i41 = 0;
                while (i41 < size) {
                    d dVar20 = (d) arrayList2.get(i41);
                    float[] fArr = dVar20.f16356Z;
                    c[] cVarArr6 = dVar20.f16338F;
                    float f15 = fArr[i4];
                    if (f15 < f8) {
                        if (bVar.f16324p) {
                            arrayList = arrayList2;
                            i15 = size;
                            c1766e3.e(cVarArr6[i9 + 1].f16332g, cVarArr6[i9].f16332g, 0, 4);
                            i16 = i41;
                            f11 = f8;
                            i17 = i9;
                            i41 = i16 + 1;
                            i9 = i17;
                            arrayList2 = arrayList;
                            size = i15;
                            f8 = f11;
                        } else {
                            f15 = 1.0f;
                        }
                    }
                    arrayList = arrayList2;
                    i15 = size;
                    if (f15 == f8) {
                        i16 = i41;
                        c1766e3.e(cVarArr6[i9 + 1].f16332g, cVarArr6[i9].f16332g, 0, 8);
                        f11 = f8;
                        i17 = i9;
                        i41 = i16 + 1;
                        i9 = i17;
                        arrayList2 = arrayList;
                        size = i15;
                        f8 = f11;
                    } else {
                        i16 = i41;
                        if (dVar19 != null) {
                            c[] cVarArr7 = dVar19.f16338F;
                            C1770i c1770i13 = cVarArr7[i9].f16332g;
                            int i42 = i9 + 1;
                            C1770i c1770i14 = cVarArr7[i42].f16332g;
                            C1770i c1770i15 = cVarArr6[i9].f16332g;
                            C1770i c1770i16 = cVarArr6[i42].f16332g;
                            C1764c k = c1766e3.k();
                            dVar6 = dVar20;
                            float f16 = f8;
                            k.f16035b = f16;
                            f11 = f16;
                            if (f9 == f16 || f14 == f15) {
                                i17 = i9;
                                k.f16037d.g(c1770i13, 1.0f);
                                k.f16037d.g(c1770i14, -1.0f);
                                k.f16037d.g(c1770i16, 1.0f);
                                k.f16037d.g(c1770i15, -1.0f);
                            } else {
                                if (f14 == f11) {
                                    k.f16037d.g(c1770i13, 1.0f);
                                    k.f16037d.g(c1770i14, -1.0f);
                                } else if (f15 == f8) {
                                    k.f16037d.g(c1770i15, 1.0f);
                                    k.f16037d.g(c1770i16, -1.0f);
                                } else {
                                    float f17 = (f14 / f9) / (f15 / f9);
                                    i17 = i9;
                                    k.f16037d.g(c1770i13, 1.0f);
                                    k.f16037d.g(c1770i14, -1.0f);
                                    k.f16037d.g(c1770i16, f17);
                                    k.f16037d.g(c1770i15, -f17);
                                }
                                i17 = i9;
                            }
                            c1766e3.c(k);
                        } else {
                            dVar6 = dVar20;
                            f11 = f8;
                            i17 = i9;
                        }
                        f14 = f15;
                        dVar19 = dVar6;
                        i41 = i16 + 1;
                        i9 = i17;
                        arrayList2 = arrayList;
                        size = i15;
                        f8 = f11;
                    }
                }
            }
            int i43 = i9;
            if (dVar16 == null || (dVar16 != dVar17 && !z24)) {
                dVar2 = dVar17;
                if (z9 && dVar16 != null) {
                    int i44 = bVar.j;
                    if (i44 > 0 && bVar.f16319i == i44) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    d dVar21 = dVar16;
                    d dVar22 = dVar21;
                    while (dVar21 != null) {
                        c[] cVarArr8 = dVar21.f16338F;
                        d dVar23 = dVar21.f16360b0[i4];
                        while (true) {
                            if (dVar23 != null) {
                                i11 = 8;
                                if (dVar23.f16353V != 8) {
                                    break;
                                } else {
                                    dVar23 = dVar23.f16360b0[i4];
                                }
                            } else {
                                i11 = 8;
                                break;
                            }
                        }
                        if (dVar23 == null && dVar21 != dVar2) {
                            dVar4 = dVar9;
                            dVar5 = dVar22;
                            i12 = i11;
                        } else {
                            c cVar18 = cVarArr8[i43];
                            C1770i c1770i17 = cVar18.f16332g;
                            c cVar19 = cVar18.f16329d;
                            if (cVar19 != null) {
                                c1770i4 = cVar19.f16332g;
                            } else {
                                c1770i4 = null;
                            }
                            if (dVar22 != dVar21) {
                                c1770i4 = dVar22.f16338F[i43 + 1].f16332g;
                            } else if (dVar21 == dVar16 && dVar22 == dVar21) {
                                c cVar20 = dVar9.f16338F[i43].f16329d;
                                if (cVar20 != null) {
                                    c1770i4 = cVar20.f16332g;
                                } else {
                                    c1770i4 = null;
                                }
                            }
                            int c9 = cVar18.c();
                            int i45 = i43 + 1;
                            int c10 = cVarArr8[i45].c();
                            if (dVar23 != null) {
                                cVar2 = dVar23.f16338F[i43];
                                c1770i5 = cVar2.f16332g;
                                c1770i6 = cVarArr8[i45].f16332g;
                            } else {
                                cVar2 = dVar15.f16338F[i45].f16329d;
                                if (cVar2 != null) {
                                    c1770i5 = cVar2.f16332g;
                                } else {
                                    c1770i5 = null;
                                }
                                c1770i6 = cVarArr8[i45].f16332g;
                            }
                            if (cVar2 != null) {
                                c10 += cVar2.c();
                            }
                            if (dVar22 != null) {
                                c9 += dVar22.f16338F[i45].c();
                            }
                            if (c1770i17 != null && c1770i4 != null && c1770i5 != null && c1770i6 != null) {
                                if (dVar21 == dVar16) {
                                    c9 = dVar16.f16338F[i43].c();
                                }
                                if (dVar21 == dVar2) {
                                    c10 = dVar2.f16338F[i45].c();
                                }
                                if (z14) {
                                    i13 = 8;
                                } else {
                                    i13 = 5;
                                }
                                dVar4 = dVar9;
                                dVar5 = dVar22;
                                i12 = 8;
                                c1766e.b(c1770i17, c1770i4, c9, 0.5f, c1770i5, c1770i6, c10, i13);
                            } else {
                                dVar4 = dVar9;
                                dVar5 = dVar22;
                                i12 = 8;
                            }
                        }
                        if (dVar21.f16353V != i12) {
                            dVar5 = dVar21;
                        }
                        dVar21 = dVar23;
                        dVar22 = dVar5;
                        dVar9 = dVar4;
                    }
                } else if (z20 && dVar16 != null) {
                    int i46 = bVar.j;
                    if (i46 > 0 && bVar.f16319i == i46) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    d dVar24 = dVar16;
                    d dVar25 = dVar24;
                    while (dVar24 != null) {
                        c[] cVarArr9 = dVar24.f16338F;
                        d dVar26 = dVar24.f16360b0[i4];
                        while (dVar26 != null && dVar26.f16353V == 8) {
                            dVar26 = dVar26.f16360b0[i4];
                        }
                        if (dVar24 != dVar16 && dVar24 != dVar2 && dVar26 != null) {
                            if (dVar26 == dVar2) {
                                dVar26 = null;
                            }
                            c cVar21 = cVarArr9[i43];
                            C1770i c1770i18 = cVar21.f16332g;
                            int i47 = i43 + 1;
                            C1770i c1770i19 = dVar25.f16338F[i47].f16332g;
                            int c11 = cVar21.c();
                            int c12 = cVarArr9[i47].c();
                            if (dVar26 != null) {
                                cVar = dVar26.f16338F[i43];
                                c1770i3 = cVar.f16332g;
                                c cVar22 = cVar.f16329d;
                                if (cVar22 != null) {
                                    c1770i2 = cVar22.f16332g;
                                } else {
                                    c1770i2 = null;
                                }
                            } else {
                                c cVar23 = dVar2.f16338F[i43];
                                if (cVar23 != null) {
                                    c1770i = cVar23.f16332g;
                                } else {
                                    c1770i = null;
                                }
                                C1770i c1770i20 = c1770i;
                                c1770i2 = cVarArr9[i47].f16332g;
                                cVar = cVar23;
                                c1770i3 = c1770i20;
                            }
                            if (cVar != null) {
                                c12 += cVar.c();
                            }
                            int c13 = dVar25.f16338F[i47].c() + c11;
                            if (z13) {
                                i10 = 8;
                            } else {
                                i10 = 4;
                            }
                            if (c1770i18 != null && c1770i19 != null && c1770i3 != null && c1770i2 != null) {
                                dVar3 = dVar26;
                                c1766e.b(c1770i18, c1770i19, c13, 0.5f, c1770i3, c1770i2, c12, i10);
                            } else {
                                dVar3 = dVar26;
                            }
                            dVar26 = dVar3;
                        }
                        if (dVar24.f16353V != 8) {
                            dVar25 = dVar24;
                        }
                        dVar24 = dVar26;
                    }
                    c1766e2 = c1766e;
                    c cVar24 = dVar16.f16338F[i43];
                    c cVar25 = dVar9.f16338F[i43].f16329d;
                    int i48 = i43 + 1;
                    c cVar26 = dVar2.f16338F[i48];
                    c cVar27 = dVar15.f16338F[i48].f16329d;
                    if (cVar25 != null) {
                        if (dVar16 != dVar2) {
                            c1766e2.e(cVar24.f16332g, cVar25.f16332g, cVar24.c(), 5);
                        } else if (cVar27 != null) {
                            c1766e2.b(cVar24.f16332g, cVar25.f16332g, cVar24.c(), 0.5f, cVar26.f16332g, cVar27.f16332g, cVar26.c(), 5);
                        }
                    }
                    if (cVar27 != null && dVar16 != dVar2) {
                        c1766e2.e(cVar26.f16332g, cVar27.f16332g, -cVar26.c(), 5);
                    }
                    if ((!z9 || z20) && dVar16 != null && dVar16 != dVar2) {
                        c[] cVarArr10 = dVar16.f16338F;
                        cVar3 = cVarArr10[i43];
                        i14 = i43 + 1;
                        cVar4 = dVar2.f16338F[i14];
                        cVar5 = cVar3.f16329d;
                        if (cVar5 == null) {
                            c1770i7 = cVar5.f16332g;
                        } else {
                            c1770i7 = null;
                        }
                        cVar6 = cVar4.f16329d;
                        if (cVar6 == null) {
                            c1770i8 = cVar6.f16332g;
                        } else {
                            c1770i8 = null;
                        }
                        if (dVar15 != dVar2) {
                            c cVar28 = dVar15.f16338F[i14].f16329d;
                            if (cVar28 != null) {
                                c1770i11 = cVar28.f16332g;
                            }
                            c1770i8 = c1770i11;
                        }
                        if (dVar16 == dVar2) {
                            cVar4 = cVarArr10[i14];
                        }
                        if (c1770i7 != null && c1770i8 != null) {
                            c1766e2.b(cVar3.f16332g, c1770i7, cVar3.c(), 0.5f, c1770i8, cVar4.f16332g, dVar2.f16338F[i14].c(), 5);
                        }
                    }
                    i24++;
                    eVar2 = eVar;
                    c1766e3 = c1766e;
                    i9 = i43;
                    i23 = i38;
                    bVarArr3 = bVarArr4;
                }
            } else {
                c cVar29 = dVar9.f16338F[i43];
                int i49 = i43 + 1;
                c cVar30 = dVar15.f16338F[i49];
                c cVar31 = cVar29.f16329d;
                if (cVar31 != null) {
                    c1770i9 = cVar31.f16332g;
                } else {
                    c1770i9 = null;
                }
                c cVar32 = cVar30.f16329d;
                if (cVar32 != null) {
                    c1770i10 = cVar32.f16332g;
                } else {
                    c1770i10 = null;
                }
                c cVar33 = dVar16.f16338F[i43];
                c cVar34 = dVar17.f16338F[i49];
                if (c1770i9 != null && c1770i10 != null) {
                    if (i4 == 0) {
                        f10 = dVar18.f16350S;
                    } else {
                        f10 = dVar18.f16351T;
                    }
                    C1770i c1770i21 = c1770i9;
                    dVar2 = dVar17;
                    c1766e3.b(cVar33.f16332g, c1770i21, cVar33.c(), f10, c1770i10, cVar34.f16332g, cVar34.c(), 7);
                } else {
                    dVar2 = dVar17;
                }
            }
            c1766e2 = c1766e;
            if (!z9) {
            }
            c[] cVarArr102 = dVar16.f16338F;
            cVar3 = cVarArr102[i43];
            i14 = i43 + 1;
            cVar4 = dVar2.f16338F[i14];
            cVar5 = cVar3.f16329d;
            if (cVar5 == null) {
            }
            cVar6 = cVar4.f16329d;
            if (cVar6 == null) {
            }
            if (dVar15 != dVar2) {
            }
            if (dVar16 == dVar2) {
            }
            if (c1770i7 != null) {
                c1766e2.b(cVar3.f16332g, c1770i7, cVar3.c(), 0.5f, c1770i8, cVar4.f16332g, dVar2.f16338F[i14].c(), 5);
            }
            i24++;
            eVar2 = eVar;
            c1766e3 = c1766e;
            i9 = i43;
            i23 = i38;
            bVarArr3 = bVarArr4;
        }
    }
}
