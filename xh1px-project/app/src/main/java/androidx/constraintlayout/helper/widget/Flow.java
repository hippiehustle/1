package androidx.constraintlayout.helper.widget;

import A.s;
import A.t;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import y.c;
import y.d;
import y.e;
import y.f;
import y.g;
import y.h;
import y.i;
import z.C1845b;

/* loaded from: classes.dex */
public class Flow extends t {

    /* renamed from: l, reason: collision with root package name */
    public final g f8514l;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, z.b] */
    /* JADX WARN: Type inference failed for: r9v1, types: [y.g, y.i] */
    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7d = new int[32];
        this.f12i = new HashMap();
        this.f9f = context;
        super.e(attributeSet);
        ?? iVar = new i();
        iVar.f16429f0 = 0;
        iVar.f16430g0 = 0;
        iVar.f16431h0 = 0;
        iVar.f16432i0 = 0;
        iVar.j0 = 0;
        iVar.f16433k0 = 0;
        iVar.f16434l0 = false;
        iVar.f16435m0 = 0;
        iVar.f16436n0 = 0;
        iVar.f16437o0 = new Object();
        iVar.f16438p0 = null;
        iVar.f16439q0 = -1;
        iVar.f16440r0 = -1;
        iVar.f16441s0 = -1;
        iVar.f16442t0 = -1;
        iVar.f16443u0 = -1;
        iVar.f16444v0 = -1;
        iVar.f16445w0 = 0.5f;
        iVar.f16446x0 = 0.5f;
        iVar.f16447y0 = 0.5f;
        iVar.f16448z0 = 0.5f;
        iVar.f16414A0 = 0.5f;
        iVar.f16415B0 = 0.5f;
        iVar.f16416C0 = 0;
        iVar.f16417D0 = 0;
        iVar.f16418E0 = 2;
        iVar.f16419F0 = 2;
        iVar.f16420G0 = 0;
        iVar.f16421H0 = -1;
        iVar.f16422I0 = 0;
        iVar.f16423J0 = new ArrayList();
        iVar.f16424K0 = null;
        iVar.f16425L0 = null;
        iVar.f16426M0 = null;
        iVar.f16428O0 = 0;
        this.f8514l = iVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.f179b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 0) {
                    this.f8514l.f16422I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar = this.f8514l;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar.f16429f0 = dimensionPixelSize;
                    gVar.f16430g0 = dimensionPixelSize;
                    gVar.f16431h0 = dimensionPixelSize;
                    gVar.f16432i0 = dimensionPixelSize;
                } else if (index == 11) {
                    g gVar2 = this.f8514l;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f16431h0 = dimensionPixelSize2;
                    gVar2.j0 = dimensionPixelSize2;
                    gVar2.f16433k0 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.f8514l.f16432i0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f8514l.j0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f8514l.f16429f0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f8514l.f16433k0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f8514l.f16430g0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 37) {
                    this.f8514l.f16420G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 27) {
                    this.f8514l.f16439q0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 36) {
                    this.f8514l.f16440r0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 21) {
                    this.f8514l.f16441s0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 29) {
                    this.f8514l.f16443u0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 23) {
                    this.f8514l.f16442t0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 31) {
                    this.f8514l.f16444v0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 25) {
                    this.f8514l.f16445w0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 20) {
                    this.f8514l.f16447y0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 28) {
                    this.f8514l.f16414A0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 22) {
                    this.f8514l.f16448z0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 30) {
                    this.f8514l.f16415B0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 34) {
                    this.f8514l.f16446x0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 24) {
                    this.f8514l.f16418E0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 33) {
                    this.f8514l.f16419F0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 26) {
                    this.f8514l.f16416C0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 35) {
                    this.f8514l.f16417D0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 32) {
                    this.f8514l.f16421H0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
        }
        this.f10g = this.f8514l;
        g();
    }

    @Override // A.c
    public final void f(d dVar, boolean z8) {
        g gVar = this.f8514l;
        int i4 = gVar.f16431h0;
        if (i4 <= 0 && gVar.f16432i0 <= 0) {
            return;
        }
        if (z8) {
            gVar.j0 = gVar.f16432i0;
            gVar.f16433k0 = i4;
        } else {
            gVar.j0 = i4;
            gVar.f16433k0 = gVar.f16432i0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x054f  */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v6 */
    @Override // A.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(g gVar, int i4, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        f fVar;
        char c6;
        ?? r28;
        boolean z8;
        int i16;
        boolean z9;
        int i17;
        boolean z10;
        int i18;
        boolean z11;
        d dVar;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z12;
        boolean z13;
        int i24;
        d dVar2;
        d[] dVarArr;
        int i25;
        A.f fVar2;
        boolean z14;
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        int i26 = 0;
        if (gVar != null) {
            ArrayList arrayList = gVar.f16423J0;
            if (gVar.f16455e0 > 0) {
                C1845b c1845b = gVar.f16437o0;
                d dVar3 = gVar.f16341I;
                if (dVar3 != null) {
                    fVar2 = ((e) dVar3).f16387g0;
                } else {
                    fVar2 = null;
                }
                if (fVar2 == null) {
                    gVar.f16435m0 = 0;
                    gVar.f16436n0 = 0;
                    gVar.f16434l0 = false;
                    setMeasuredDimension(gVar.f16435m0, gVar.f16436n0);
                    return;
                }
                int i27 = 0;
                while (i27 < gVar.f16455e0) {
                    d dVar4 = gVar.f16454d0[i27];
                    if (dVar4 != null && !(dVar4 instanceof h)) {
                        int h8 = dVar4.h(i26);
                        int h9 = dVar4.h(1);
                        if (h8 != 3 || dVar4.j == 1 || h9 != 3 || dVar4.k == 1) {
                            if (h8 == 3) {
                                h8 = 2;
                            }
                            if (h9 == 3) {
                                h9 = 2;
                            }
                            c1845b.f16573a = h8;
                            c1845b.f16574b = h9;
                            c1845b.f16575c = dVar4.l();
                            c1845b.f16576d = dVar4.i();
                            fVar2.a(dVar4, c1845b);
                            dVar4.y(c1845b.f16577e);
                            dVar4.v(c1845b.f16578f);
                            int i28 = c1845b.f16579g;
                            dVar4.f16347P = i28;
                            if (i28 > 0) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            dVar4.f16380w = z14;
                        }
                    }
                    i27++;
                    i26 = 0;
                }
            }
            int i29 = gVar.j0;
            int i30 = gVar.f16433k0;
            int i31 = gVar.f16429f0;
            int i32 = gVar.f16430g0;
            int[] iArr2 = new int[2];
            int i33 = (size - i29) - i30;
            int i34 = gVar.f16422I0;
            if (i34 == 1) {
                i33 = (size2 - i31) - i32;
            }
            if (i34 == 0) {
                if (gVar.f16439q0 == -1) {
                    i25 = 0;
                    gVar.f16439q0 = 0;
                } else {
                    i25 = 0;
                }
                if (gVar.f16440r0 == -1) {
                    gVar.f16440r0 = i25;
                }
            } else {
                if (gVar.f16439q0 == -1) {
                    gVar.f16439q0 = 0;
                }
                if (gVar.f16440r0 == -1) {
                    gVar.f16440r0 = 0;
                }
            }
            d[] dVarArr2 = gVar.f16454d0;
            int i35 = 0;
            int i36 = 0;
            while (true) {
                i9 = gVar.f16455e0;
                i10 = i31;
                if (i35 >= i9) {
                    break;
                }
                if (gVar.f16454d0[i35].f16353V == 8) {
                    i36++;
                }
                i35++;
                i31 = i10;
            }
            if (i36 > 0) {
                dVarArr2 = new d[i9 - i36];
                int i37 = 0;
                int i38 = 0;
                while (i37 < gVar.f16455e0) {
                    d dVar5 = gVar.f16454d0[i37];
                    int i39 = i37;
                    if (dVar5.f16353V != 8) {
                        dVarArr2[i38] = dVar5;
                        i38++;
                    }
                    i37 = i39 + 1;
                }
                i11 = i38;
            } else {
                i11 = i9;
            }
            d[] dVarArr3 = dVarArr2;
            gVar.f16427N0 = dVarArr3;
            gVar.f16428O0 = i11;
            int i40 = gVar.f16420G0;
            if (i40 != 0) {
                if (i40 != 1) {
                    if (i40 != 2) {
                        i12 = i32;
                        iArr = iArr2;
                        i13 = i29;
                        i14 = i30;
                        i15 = i10;
                    } else {
                        int i41 = gVar.f16422I0;
                        if (i41 == 0) {
                            i22 = gVar.f16421H0;
                            if (i22 <= 0) {
                                int i42 = 0;
                                int i43 = 0;
                                int i44 = 0;
                                while (i42 < i11) {
                                    int i45 = i42;
                                    if (i42 > 0) {
                                        i43 += gVar.f16416C0;
                                    }
                                    d dVar6 = dVarArr3[i45];
                                    if (dVar6 != null) {
                                        int D7 = gVar.D(dVar6, i33) + i43;
                                        if (D7 > i33) {
                                            break;
                                        }
                                        i44++;
                                        i43 = D7;
                                    }
                                    i42 = i45 + 1;
                                }
                                i22 = i44;
                            }
                            i21 = 0;
                        } else {
                            int i46 = gVar.f16421H0;
                            if (i46 <= 0) {
                                int i47 = 0;
                                int i48 = 0;
                                i21 = 0;
                                while (i47 < i11) {
                                    int i49 = i47;
                                    if (i47 > 0) {
                                        i48 += gVar.f16417D0;
                                    }
                                    d dVar7 = dVarArr3[i49];
                                    if (dVar7 != null) {
                                        int C8 = gVar.C(dVar7, i33) + i48;
                                        if (C8 > i33) {
                                            break;
                                        }
                                        i21++;
                                        i48 = C8;
                                    }
                                    i47 = i49 + 1;
                                }
                            } else {
                                i21 = i46;
                            }
                            i22 = 0;
                        }
                        if (gVar.f16426M0 == null) {
                            gVar.f16426M0 = new int[2];
                        }
                        if ((i21 == 0 && i41 == 1) || (i22 == 0 && i41 == 0)) {
                            i23 = i22;
                            z12 = true;
                        } else {
                            i23 = i22;
                            z12 = false;
                        }
                        while (!z12) {
                            if (i41 == 0) {
                                z13 = z12;
                                i24 = i32;
                                i21 = (int) Math.ceil(i11 / i23);
                            } else {
                                z13 = z12;
                                i24 = i32;
                                i23 = (int) Math.ceil(i11 / i21);
                            }
                            d[] dVarArr4 = gVar.f16425L0;
                            if (dVarArr4 != null && dVarArr4.length >= i23) {
                                Arrays.fill(dVarArr4, (Object) null);
                            } else {
                                gVar.f16425L0 = new d[i23];
                            }
                            d[] dVarArr5 = gVar.f16424K0;
                            if (dVarArr5 != null && dVarArr5.length >= i21) {
                                Arrays.fill(dVarArr5, (Object) null);
                            } else {
                                gVar.f16424K0 = new d[i21];
                            }
                            int i50 = 0;
                            while (i50 < i23) {
                                int i51 = 0;
                                while (i51 < i21) {
                                    int i52 = (i51 * i23) + i50;
                                    int i53 = i50;
                                    if (i41 == 1) {
                                        i52 = (i53 * i21) + i51;
                                    }
                                    int i54 = i52;
                                    int i55 = i41;
                                    if (i54 >= dVarArr3.length || (dVar2 = dVarArr3[i54]) == null) {
                                        dVarArr = dVarArr3;
                                    } else {
                                        int D8 = gVar.D(dVar2, i33);
                                        dVarArr = dVarArr3;
                                        d dVar8 = gVar.f16425L0[i53];
                                        if (dVar8 == null || dVar8.l() < D8) {
                                            gVar.f16425L0[i53] = dVar2;
                                        }
                                        int C9 = gVar.C(dVar2, i33);
                                        d dVar9 = gVar.f16424K0[i51];
                                        if (dVar9 == null || dVar9.i() < C9) {
                                            gVar.f16424K0[i51] = dVar2;
                                        }
                                    }
                                    i51++;
                                    i41 = i55;
                                    i50 = i53;
                                    dVarArr3 = dVarArr;
                                }
                                i50++;
                            }
                            d[] dVarArr6 = dVarArr3;
                            int i56 = i41;
                            int i57 = 0;
                            for (int i58 = 0; i58 < i23; i58++) {
                                d dVar10 = gVar.f16425L0[i58];
                                if (dVar10 != null) {
                                    if (i58 > 0) {
                                        i57 += gVar.f16416C0;
                                    }
                                    i57 = gVar.D(dVar10, i33) + i57;
                                }
                            }
                            int i59 = 0;
                            int i60 = 0;
                            while (i59 < i21) {
                                d dVar11 = gVar.f16424K0[i59];
                                int i61 = i59;
                                if (dVar11 != null) {
                                    if (i59 > 0) {
                                        i60 += gVar.f16417D0;
                                    }
                                    i60 = gVar.C(dVar11, i33) + i60;
                                }
                                i59 = i61 + 1;
                            }
                            iArr2[0] = i57;
                            iArr2[1] = i60;
                            if (i56 == 0) {
                                if (i57 > i33 && i23 > 1) {
                                    i23--;
                                    z12 = z13;
                                }
                                z12 = true;
                            } else {
                                if (i60 > i33 && i21 > 1) {
                                    i21--;
                                    z12 = z13;
                                }
                                z12 = true;
                            }
                            i41 = i56;
                            i32 = i24;
                            dVarArr3 = dVarArr6;
                        }
                        int[] iArr3 = gVar.f16426M0;
                        iArr3[0] = i23;
                        iArr3[1] = i21;
                        r28 = 1;
                        iArr = iArr2;
                        i13 = i29;
                        i14 = i30;
                        i15 = i10;
                        i12 = i32;
                        c6 = 0;
                        int i62 = iArr[c6] + i13 + i14;
                        int i63 = iArr[r28] + i15 + i12;
                        if (mode != 1073741824) {
                            if (mode == Integer.MIN_VALUE) {
                                size = Math.min(i62, size);
                            } else if (mode == 0) {
                                size = i62;
                            } else {
                                size = 0;
                            }
                        }
                        if (mode2 != 1073741824) {
                            if (mode2 == Integer.MIN_VALUE) {
                                size2 = Math.min(i63, size2);
                            } else if (mode2 == 0) {
                                size2 = i63;
                            } else {
                                size2 = 0;
                            }
                        }
                        gVar.f16435m0 = size;
                        gVar.f16436n0 = size2;
                        gVar.y(size);
                        gVar.v(size2);
                        if (gVar.f16455e0 <= 0) {
                            z8 = r28;
                        } else {
                            z8 = false;
                        }
                        gVar.f16434l0 = z8;
                    }
                } else {
                    int i64 = gVar.f16422I0;
                    c cVar = gVar.f16333A;
                    c cVar2 = gVar.f16383z;
                    if (i11 == 0) {
                        iArr = iArr2;
                        i13 = i29;
                        i14 = i30;
                        i15 = i10;
                        i12 = i32;
                    } else {
                        arrayList.clear();
                        int i65 = i33;
                        i13 = i29;
                        i14 = i30;
                        i15 = i10;
                        i12 = i32;
                        iArr = iArr2;
                        int i66 = 3;
                        f fVar3 = new f(gVar, i64, gVar.f16381x, gVar.f16382y, gVar.f16383z, gVar.f16333A, i65);
                        arrayList.add(fVar3);
                        if (i64 == 0) {
                            f fVar4 = fVar3;
                            int i67 = 0;
                            i16 = 0;
                            int i68 = 0;
                            while (i67 < i11) {
                                d dVar12 = dVarArr3[i67];
                                int D9 = gVar.D(dVar12, i65);
                                int i69 = i67;
                                if (dVar12.f16362c0[0] == i66) {
                                    i16++;
                                }
                                int i70 = i16;
                                if ((i68 == i65 || gVar.f16416C0 + i68 + D9 > i65) && fVar4.f16399b != null) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (!z11 && i69 > 0 && (i20 = gVar.f16421H0) > 0 && i69 % i20 == 0) {
                                    z11 = true;
                                }
                                if (z11) {
                                    i19 = i69;
                                    dVar = dVar12;
                                    f fVar5 = new f(gVar, i64, gVar.f16381x, gVar.f16382y, gVar.f16383z, gVar.f16333A, i65);
                                    fVar5.f16409n = i19;
                                    arrayList.add(fVar5);
                                    fVar4 = fVar5;
                                } else {
                                    dVar = dVar12;
                                    i19 = i69;
                                    if (i19 > 0) {
                                        i68 = gVar.f16416C0 + D9 + i68;
                                        fVar4.a(dVar);
                                        i67 = i19 + 1;
                                        i16 = i70;
                                        i66 = 3;
                                    }
                                }
                                i68 = D9;
                                fVar4.a(dVar);
                                i67 = i19 + 1;
                                i16 = i70;
                                i66 = 3;
                            }
                        } else {
                            f fVar6 = fVar3;
                            int i71 = 0;
                            int i72 = 0;
                            int i73 = 0;
                            while (i71 < i11) {
                                d dVar13 = dVarArr3[i71];
                                int C10 = gVar.C(dVar13, i65);
                                if (dVar13.f16362c0[1] == 3) {
                                    i72++;
                                }
                                int i74 = i72;
                                if ((i73 == i65 || gVar.f16417D0 + i73 + C10 > i65) && fVar6.f16399b != null) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (!z9 && i71 > 0 && (i17 = gVar.f16421H0) > 0 && i71 % i17 == 0) {
                                    z9 = true;
                                }
                                if (z9) {
                                    f fVar7 = new f(gVar, i64, gVar.f16381x, gVar.f16382y, gVar.f16383z, gVar.f16333A, i65);
                                    fVar7.f16409n = i71;
                                    arrayList.add(fVar7);
                                    fVar6 = fVar7;
                                } else if (i71 > 0) {
                                    i73 = gVar.f16417D0 + C10 + i73;
                                    fVar6.a(dVar13);
                                    i71++;
                                    i72 = i74;
                                }
                                i73 = C10;
                                fVar6.a(dVar13);
                                i71++;
                                i72 = i74;
                            }
                            i16 = i72;
                        }
                        int size3 = arrayList.size();
                        c cVar3 = gVar.f16381x;
                        c cVar4 = gVar.f16382y;
                        int i75 = gVar.j0;
                        int i76 = gVar.f16429f0;
                        int i77 = gVar.f16433k0;
                        int i78 = gVar.f16430g0;
                        int[] iArr4 = gVar.f16362c0;
                        int i79 = i64;
                        if (iArr4[0] != 2 && iArr4[1] != 2) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (i16 > 0 && z10) {
                            for (int i80 = 0; i80 < size3; i80++) {
                                f fVar8 = (f) arrayList.get(i80);
                                if (i79 == 0) {
                                    fVar8.e(i65 - fVar8.d());
                                } else {
                                    fVar8.e(i65 - fVar8.c());
                                }
                            }
                        }
                        c cVar5 = cVar4;
                        int i81 = i75;
                        int i82 = i76;
                        int i83 = i77;
                        int i84 = i78;
                        c cVar6 = cVar;
                        c cVar7 = cVar3;
                        c cVar8 = cVar2;
                        int i85 = 0;
                        int i86 = 0;
                        int i87 = 0;
                        while (i85 < size3) {
                            f fVar9 = (f) arrayList.get(i85);
                            if (i79 == 0) {
                                if (i85 < size3 - 1) {
                                    cVar6 = ((f) arrayList.get(i85 + 1)).f16399b.f16382y;
                                    i84 = 0;
                                } else {
                                    i84 = gVar.f16430g0;
                                    cVar6 = cVar;
                                }
                                c cVar9 = fVar9.f16399b.f16333A;
                                i18 = i79;
                                fVar9.f(i18, cVar7, cVar5, cVar8, cVar6, i81, i82, i83, i84, i65);
                                i86 = Math.max(i86, fVar9.d());
                                int c9 = fVar9.c() + i87;
                                if (i85 > 0) {
                                    c9 += gVar.f16417D0;
                                }
                                i87 = c9;
                                cVar5 = cVar9;
                                i82 = 0;
                            } else {
                                i18 = i79;
                                if (i85 < size3 - 1) {
                                    cVar8 = ((f) arrayList.get(i85 + 1)).f16399b.f16381x;
                                    i83 = 0;
                                } else {
                                    i83 = gVar.f16433k0;
                                    cVar8 = cVar2;
                                }
                                c cVar10 = fVar9.f16399b.f16383z;
                                fVar9.f(i18, cVar7, cVar5, cVar8, cVar6, i81, i82, i83, i84, i65);
                                int d2 = fVar9.d() + i86;
                                int max = Math.max(i87, fVar9.c());
                                if (i85 > 0) {
                                    d2 += gVar.f16416C0;
                                }
                                i87 = max;
                                i86 = d2;
                                cVar7 = cVar10;
                                i81 = 0;
                            }
                            i85++;
                            i79 = i18;
                        }
                        iArr[0] = i86;
                        iArr[1] = i87;
                    }
                }
                c6 = 0;
                r28 = 1;
                int i622 = iArr[c6] + i13 + i14;
                int i632 = iArr[r28] + i15 + i12;
                if (mode != 1073741824) {
                }
                if (mode2 != 1073741824) {
                }
                gVar.f16435m0 = size;
                gVar.f16436n0 = size2;
                gVar.y(size);
                gVar.v(size2);
                if (gVar.f16455e0 <= 0) {
                }
                gVar.f16434l0 = z8;
            } else {
                i12 = i32;
                int i88 = i33;
                iArr = iArr2;
                i13 = i29;
                i14 = i30;
                i15 = i10;
                int i89 = gVar.f16422I0;
                if (i11 != 0) {
                    if (arrayList.size() == 0) {
                        fVar = new f(gVar, i89, gVar.f16381x, gVar.f16382y, gVar.f16383z, gVar.f16333A, i88);
                        arrayList.add(fVar);
                    } else {
                        f fVar10 = (f) arrayList.get(0);
                        fVar10.f16400c = 0;
                        fVar10.f16399b = null;
                        fVar10.f16407l = 0;
                        fVar10.f16408m = 0;
                        fVar10.f16409n = 0;
                        fVar10.f16410o = 0;
                        fVar10.f16411p = 0;
                        fVar10.f(i89, gVar.f16381x, gVar.f16382y, gVar.f16383z, gVar.f16333A, gVar.j0, gVar.f16429f0, gVar.f16433k0, gVar.f16430g0, i88);
                        fVar = fVar10;
                    }
                    for (int i90 = 0; i90 < i11; i90++) {
                        fVar.a(dVarArr3[i90]);
                    }
                    c6 = 0;
                    iArr[0] = fVar.d();
                    r28 = 1;
                    iArr[1] = fVar.c();
                    int i6222 = iArr[c6] + i13 + i14;
                    int i6322 = iArr[r28] + i15 + i12;
                    if (mode != 1073741824) {
                    }
                    if (mode2 != 1073741824) {
                    }
                    gVar.f16435m0 = size;
                    gVar.f16436n0 = size2;
                    gVar.y(size);
                    gVar.v(size2);
                    if (gVar.f16455e0 <= 0) {
                    }
                    gVar.f16434l0 = z8;
                }
                c6 = 0;
                r28 = 1;
                int i62222 = iArr[c6] + i13 + i14;
                int i63222 = iArr[r28] + i15 + i12;
                if (mode != 1073741824) {
                }
                if (mode2 != 1073741824) {
                }
                gVar.f16435m0 = size;
                gVar.f16436n0 = size2;
                gVar.y(size);
                gVar.v(size2);
                if (gVar.f16455e0 <= 0) {
                }
                gVar.f16434l0 = z8;
            }
            setMeasuredDimension(gVar.f16435m0, gVar.f16436n0);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // A.c, android.view.View
    public final void onMeasure(int i4, int i8) {
        h(this.f8514l, i4, i8);
    }

    public void setFirstHorizontalBias(float f8) {
        this.f8514l.f16447y0 = f8;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i4) {
        this.f8514l.f16441s0 = i4;
        requestLayout();
    }

    public void setFirstVerticalBias(float f8) {
        this.f8514l.f16448z0 = f8;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i4) {
        this.f8514l.f16442t0 = i4;
        requestLayout();
    }

    public void setHorizontalAlign(int i4) {
        this.f8514l.f16418E0 = i4;
        requestLayout();
    }

    public void setHorizontalBias(float f8) {
        this.f8514l.f16445w0 = f8;
        requestLayout();
    }

    public void setHorizontalGap(int i4) {
        this.f8514l.f16416C0 = i4;
        requestLayout();
    }

    public void setHorizontalStyle(int i4) {
        this.f8514l.f16439q0 = i4;
        requestLayout();
    }

    public void setMaxElementsWrap(int i4) {
        this.f8514l.f16421H0 = i4;
        requestLayout();
    }

    public void setOrientation(int i4) {
        this.f8514l.f16422I0 = i4;
        requestLayout();
    }

    public void setPadding(int i4) {
        g gVar = this.f8514l;
        gVar.f16429f0 = i4;
        gVar.f16430g0 = i4;
        gVar.f16431h0 = i4;
        gVar.f16432i0 = i4;
        requestLayout();
    }

    public void setPaddingBottom(int i4) {
        this.f8514l.f16430g0 = i4;
        requestLayout();
    }

    public void setPaddingLeft(int i4) {
        this.f8514l.j0 = i4;
        requestLayout();
    }

    public void setPaddingRight(int i4) {
        this.f8514l.f16433k0 = i4;
        requestLayout();
    }

    public void setPaddingTop(int i4) {
        this.f8514l.f16429f0 = i4;
        requestLayout();
    }

    public void setVerticalAlign(int i4) {
        this.f8514l.f16419F0 = i4;
        requestLayout();
    }

    public void setVerticalBias(float f8) {
        this.f8514l.f16446x0 = f8;
        requestLayout();
    }

    public void setVerticalGap(int i4) {
        this.f8514l.f16417D0 = i4;
        requestLayout();
    }

    public void setVerticalStyle(int i4) {
        this.f8514l.f16440r0 = i4;
        requestLayout();
    }

    public void setWrapMode(int i4) {
        this.f8514l.f16420G0 = i4;
        requestLayout();
    }
}
