package A;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import x.AbstractC1769h;
import z.C1845b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f72a;

    /* renamed from: b, reason: collision with root package name */
    public int f73b;

    /* renamed from: c, reason: collision with root package name */
    public int f74c;

    /* renamed from: d, reason: collision with root package name */
    public int f75d;

    /* renamed from: e, reason: collision with root package name */
    public int f76e;

    /* renamed from: f, reason: collision with root package name */
    public int f77f;

    /* renamed from: g, reason: collision with root package name */
    public int f78g;

    public f(ConstraintLayout constraintLayout) {
        this.f72a = constraintLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x022e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0224 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0219 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(y.d dVar, C1845b c1845b) {
        int i4;
        int i8;
        boolean z8;
        int b4;
        int i9;
        int makeMeasureSpec;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        e eVar;
        int measuredWidth;
        int measuredHeight;
        int baseline;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int i16;
        int childMeasureSpec;
        boolean z20;
        boolean z21;
        int i17;
        if (dVar == null) {
            return;
        }
        y.c cVar = dVar.f16383z;
        y.c cVar2 = dVar.f16381x;
        int[] iArr = dVar.f16366g;
        if (dVar.f16353V == 8) {
            c1845b.f16577e = 0;
            c1845b.f16578f = 0;
            c1845b.f16579g = 0;
            return;
        }
        int i18 = c1845b.f16573a;
        int i19 = c1845b.f16574b;
        int i20 = c1845b.f16575c;
        int i21 = c1845b.f16576d;
        int i22 = this.f73b + this.f74c;
        int i23 = this.f75d;
        View view = dVar.f16352U;
        int b9 = AbstractC1769h.b(i18);
        if (b9 != 0) {
            if (b9 != 1) {
                if (b9 != 2) {
                    if (b9 != 3) {
                        i4 = 2;
                        z8 = false;
                        i8 = 0;
                        b4 = AbstractC1769h.b(i19);
                        if (b4 != 0) {
                            if (b4 != 1) {
                                if (b4 != i4) {
                                    if (b4 != 3) {
                                        i9 = 3;
                                        z9 = false;
                                        makeMeasureSpec = 0;
                                    } else {
                                        int i24 = this.f78g;
                                        if (cVar2 != null) {
                                            i16 = dVar.f16382y.f16330e;
                                        } else {
                                            i16 = 0;
                                        }
                                        if (cVar != null) {
                                            i16 += dVar.f16333A.f16330e;
                                        }
                                        makeMeasureSpec = ViewGroup.getChildMeasureSpec(i24, i22 + i16, -1);
                                        iArr[3] = -1;
                                        z9 = false;
                                        i9 = 3;
                                    }
                                } else {
                                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f78g, i22, -2);
                                    if (dVar.k == 1) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    iArr[3] = 0;
                                    if (c1845b.j) {
                                        if (z18 && iArr[2] != 0 && iArr[1] != dVar.i()) {
                                            z19 = true;
                                        } else {
                                            z19 = false;
                                        }
                                        if (!z18 || z19) {
                                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.i(), 1073741824);
                                            z9 = false;
                                            i9 = 3;
                                        }
                                    }
                                    z9 = true;
                                    i9 = 3;
                                }
                            } else {
                                int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f78g, i22, -2);
                                i9 = 3;
                                iArr[3] = -2;
                                makeMeasureSpec = childMeasureSpec2;
                                z9 = true;
                            }
                        } else {
                            i9 = 3;
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
                            iArr[3] = i21;
                            z9 = false;
                        }
                        if (i18 == i9) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i19 == i9) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i19 == 4 && i19 != 1) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        if (i18 == 4 && i18 != 1) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        if (!z10 && dVar.f16343L > 0.0f) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (!z11 && dVar.f16343L > 0.0f) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        eVar = (e) view.getLayoutParams();
                        if (c1845b.j && z10 && dVar.j == 0 && z11 && dVar.k == 0) {
                            i11 = 0;
                            i14 = 0;
                            baseline = 0;
                        } else {
                            if (!(view instanceof t) && (dVar instanceof y.g)) {
                                ((t) view).h((y.g) dVar, i8, makeMeasureSpec);
                            } else {
                                view.measure(i8, makeMeasureSpec);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            if (z8) {
                                iArr[0] = measuredWidth;
                                iArr[2] = measuredHeight;
                            } else {
                                iArr[0] = 0;
                                iArr[2] = 0;
                            }
                            if (z9) {
                                iArr[1] = measuredHeight;
                                iArr[3] = measuredWidth;
                            } else {
                                iArr[1] = 0;
                                iArr[3] = 0;
                            }
                            i10 = dVar.f16370m;
                            if (i10 > 0) {
                                i11 = Math.max(i10, measuredWidth);
                            } else {
                                i11 = measuredWidth;
                            }
                            i12 = dVar.f16371n;
                            if (i12 > 0) {
                                i11 = Math.min(i12, i11);
                            }
                            i13 = dVar.f16373p;
                            if (i13 > 0) {
                                i14 = Math.max(i13, measuredHeight);
                            } else {
                                i14 = measuredHeight;
                            }
                            i15 = dVar.f16374q;
                            if (i15 > 0) {
                                i14 = Math.min(i15, i14);
                            }
                            if (!z14 && z12) {
                                i11 = (int) ((i14 * dVar.f16343L) + 0.5f);
                            } else if (z15 && z13) {
                                i14 = (int) ((i11 / dVar.f16343L) + 0.5f);
                            }
                            if (measuredWidth == i11 || measuredHeight != i14) {
                                if (measuredWidth != i11) {
                                    i8 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                                }
                                if (measuredHeight != i14) {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                                }
                                view.measure(i8, makeMeasureSpec);
                                i11 = view.getMeasuredWidth();
                                i14 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                        }
                        if (baseline != -1) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (i11 != c1845b.f16575c && i14 == c1845b.f16576d) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        c1845b.f16581i = z17;
                        if (eVar.f36X) {
                            z16 = true;
                        }
                        if (z16 && baseline != -1 && dVar.f16347P != baseline) {
                            c1845b.f16581i = true;
                        }
                        c1845b.f16577e = i11;
                        c1845b.f16578f = i14;
                        c1845b.f16580h = z16;
                        c1845b.f16579g = baseline;
                    }
                    int i25 = this.f77f;
                    if (cVar2 != null) {
                        i17 = cVar2.f16330e;
                    } else {
                        i17 = 0;
                    }
                    if (cVar != null) {
                        i4 = 2;
                        i17 += cVar.f16330e;
                    } else {
                        i4 = 2;
                    }
                    i8 = ViewGroup.getChildMeasureSpec(i25, i23 + i17, -1);
                    iArr[i4] = -1;
                } else {
                    i4 = 2;
                    childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f77f, i23, -2);
                    if (dVar.j == 1) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    iArr[2] = 0;
                    if (c1845b.j) {
                        if (z20 && iArr[3] != 0 && iArr[0] != dVar.l()) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if (!z20 || z21) {
                            i8 = View.MeasureSpec.makeMeasureSpec(dVar.l(), 1073741824);
                        }
                    }
                }
            } else {
                i4 = 2;
                childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f77f, i23, -2);
                iArr[2] = -2;
            }
            i8 = childMeasureSpec;
            z8 = true;
            b4 = AbstractC1769h.b(i19);
            if (b4 != 0) {
            }
            if (i18 == i9) {
            }
            if (i19 == i9) {
            }
            if (i19 == 4) {
            }
            z12 = true;
            if (i18 == 4) {
            }
            z13 = true;
            if (!z10) {
            }
            z14 = false;
            if (!z11) {
            }
            z15 = false;
            eVar = (e) view.getLayoutParams();
            if (c1845b.j) {
            }
            if (!(view instanceof t)) {
            }
            view.measure(i8, makeMeasureSpec);
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            baseline = view.getBaseline();
            if (z8) {
            }
            if (z9) {
            }
            i10 = dVar.f16370m;
            if (i10 > 0) {
            }
            i12 = dVar.f16371n;
            if (i12 > 0) {
            }
            i13 = dVar.f16373p;
            if (i13 > 0) {
            }
            i15 = dVar.f16374q;
            if (i15 > 0) {
            }
            if (!z14) {
            }
            if (z15) {
                i14 = (int) ((i11 / dVar.f16343L) + 0.5f);
            }
            if (measuredWidth == i11) {
            }
            if (measuredWidth != i11) {
            }
            if (measuredHeight != i14) {
            }
            view.measure(i8, makeMeasureSpec);
            i11 = view.getMeasuredWidth();
            i14 = view.getMeasuredHeight();
            baseline = view.getBaseline();
            if (baseline != -1) {
            }
            if (i11 != c1845b.f16575c) {
            }
            z17 = true;
            c1845b.f16581i = z17;
            if (eVar.f36X) {
            }
            if (z16) {
                c1845b.f16581i = true;
            }
            c1845b.f16577e = i11;
            c1845b.f16578f = i14;
            c1845b.f16580h = z16;
            c1845b.f16579g = baseline;
        }
        i4 = 2;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i20, 1073741824);
        iArr[2] = i20;
        i8 = makeMeasureSpec2;
        z8 = false;
        b4 = AbstractC1769h.b(i19);
        if (b4 != 0) {
        }
        if (i18 == i9) {
        }
        if (i19 == i9) {
        }
        if (i19 == 4) {
        }
        z12 = true;
        if (i18 == 4) {
        }
        z13 = true;
        if (!z10) {
        }
        z14 = false;
        if (!z11) {
        }
        z15 = false;
        eVar = (e) view.getLayoutParams();
        if (c1845b.j) {
        }
        if (!(view instanceof t)) {
        }
        view.measure(i8, makeMeasureSpec);
        measuredWidth = view.getMeasuredWidth();
        measuredHeight = view.getMeasuredHeight();
        baseline = view.getBaseline();
        if (z8) {
        }
        if (z9) {
        }
        i10 = dVar.f16370m;
        if (i10 > 0) {
        }
        i12 = dVar.f16371n;
        if (i12 > 0) {
        }
        i13 = dVar.f16373p;
        if (i13 > 0) {
        }
        i15 = dVar.f16374q;
        if (i15 > 0) {
        }
        if (!z14) {
        }
        if (z15) {
        }
        if (measuredWidth == i11) {
        }
        if (measuredWidth != i11) {
        }
        if (measuredHeight != i14) {
        }
        view.measure(i8, makeMeasureSpec);
        i11 = view.getMeasuredWidth();
        i14 = view.getMeasuredHeight();
        baseline = view.getBaseline();
        if (baseline != -1) {
        }
        if (i11 != c1845b.f16575c) {
        }
        z17 = true;
        c1845b.f16581i = z17;
        if (eVar.f36X) {
        }
        if (z16) {
        }
        c1845b.f16577e = i11;
        c1845b.f16578f = i14;
        c1845b.f16580h = z16;
        c1845b.f16579g = baseline;
    }
}
