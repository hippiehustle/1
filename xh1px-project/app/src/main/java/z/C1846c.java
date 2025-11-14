package z;

import java.util.ArrayList;
import java.util.Iterator;
import n1.AbstractC1149a;

/* renamed from: z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1846c extends m {
    public final ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public int f16582l;

    public C1846c(y.d dVar, int i4) {
        super(dVar);
        y.d dVar2;
        InterfaceC1847d interfaceC1847d;
        int i8;
        InterfaceC1847d interfaceC1847d2;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f16610f = i4;
        y.d dVar3 = this.f16606b;
        y.d k = dVar3.k(i4);
        while (true) {
            dVar2 = dVar3;
            dVar3 = k;
            if (dVar3 == null) {
                break;
            } else {
                k = dVar3.k(this.f16610f);
            }
        }
        this.f16606b = dVar2;
        int i9 = this.f16610f;
        if (i9 == 0) {
            interfaceC1847d = dVar2.f16363d;
        } else if (i9 == 1) {
            interfaceC1847d = dVar2.f16364e;
        } else {
            interfaceC1847d = null;
        }
        arrayList.add(interfaceC1847d);
        y.d j = dVar2.j(this.f16610f);
        while (j != null) {
            int i10 = this.f16610f;
            if (i10 == 0) {
                interfaceC1847d2 = j.f16363d;
            } else if (i10 == 1) {
                interfaceC1847d2 = j.f16364e;
            } else {
                interfaceC1847d2 = null;
            }
            arrayList.add(interfaceC1847d2);
            j = j.j(this.f16610f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            int i11 = this.f16610f;
            if (i11 == 0) {
                mVar.f16606b.f16359b = this;
            } else if (i11 == 1) {
                mVar.f16606b.f16361c = this;
            }
        }
        if (this.f16610f == 0 && ((y.e) this.f16606b.f16341I).f16388h0 && arrayList.size() > 1) {
            this.f16606b = ((m) arrayList.get(arrayList.size() - 1)).f16606b;
        }
        if (this.f16610f == 0) {
            i8 = this.f16606b.f16355X;
        } else {
            i8 = this.f16606b.Y;
        }
        this.f16582l = i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x019a, code lost:
    
        if (r1 != r10) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01bf, code lost:
    
        r3.d(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01bc, code lost:
    
        r14 = r14 + 1;
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01ba, code lost:
    
        if (r1 != r10) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x03b1, code lost:
    
        r2 = r2 - r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00df  */
    @Override // z.InterfaceC1847d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC1847d interfaceC1847d) {
        boolean z8;
        int i4;
        int i8;
        boolean z9;
        float f8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f9;
        int i13;
        int i14;
        float f10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int max;
        int i24;
        int i25;
        boolean z10;
        boolean z11;
        int i26;
        C1849f c1849f = this.f16612h;
        if (c1849f.j) {
            C1849f c1849f2 = this.f16613i;
            if (c1849f2.j) {
                y.d dVar = this.f16606b.f16341I;
                if (dVar != null && (dVar instanceof y.e)) {
                    z8 = ((y.e) dVar).f16388h0;
                } else {
                    z8 = false;
                }
                int i27 = c1849f2.f16597g - c1849f.f16597g;
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i28 = 0;
                while (true) {
                    i4 = -1;
                    i8 = 8;
                    if (i28 < size) {
                        if (((m) arrayList.get(i28)).f16606b.f16353V != 8) {
                            break;
                        } else {
                            i28++;
                        }
                    } else {
                        i28 = -1;
                        break;
                    }
                }
                int i29 = size - 1;
                int i30 = i29;
                while (true) {
                    if (i30 < 0) {
                        break;
                    }
                    if (((m) arrayList.get(i30)).f16606b.f16353V != 8) {
                        i4 = i30;
                        break;
                    }
                    i30--;
                }
                int i31 = 0;
                while (i31 < 2) {
                    f8 = 0.0f;
                    int i32 = 0;
                    i11 = 0;
                    int i33 = 0;
                    int i34 = 0;
                    while (i32 < size) {
                        m mVar = (m) arrayList.get(i32);
                        y.d dVar2 = mVar.f16606b;
                        boolean z12 = z8;
                        if (dVar2.f16353V == i8) {
                            i25 = i31;
                        } else {
                            i34++;
                            if (i32 > 0 && i32 >= i28) {
                                i11 += mVar.f16612h.f16596f;
                            }
                            C1850g c1850g = mVar.f16609e;
                            int i35 = c1850g.f16597g;
                            i25 = i31;
                            if (mVar.f16608d != 3) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                int i36 = this.f16610f;
                                if (i36 != 0 || dVar2.f16363d.f16609e.j) {
                                    if (i36 != 1 || dVar2.f16364e.f16609e.j) {
                                        z11 = z10;
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                z11 = z10;
                                if (mVar.f16605a == 1 && i25 == 0) {
                                    i26 = c1850g.f16601m;
                                    i33++;
                                } else if (c1850g.j) {
                                    i26 = i35;
                                }
                                z11 = true;
                                if (z11) {
                                    i33++;
                                    float f11 = dVar2.f16356Z[this.f16610f];
                                    if (f11 >= 0.0f) {
                                        f8 += f11;
                                    }
                                } else {
                                    i11 += i26;
                                }
                                if (i32 < i29 && i32 < i4) {
                                    i11 += -mVar.f16613i.f16596f;
                                }
                            }
                            i26 = i35;
                            if (z11) {
                            }
                            if (i32 < i29) {
                                i11 += -mVar.f16613i.f16596f;
                            }
                        }
                        i32++;
                        z8 = z12;
                        i31 = i25;
                        i8 = 8;
                    }
                    z9 = z8;
                    int i37 = i31;
                    if (i11 >= i27 && i33 != 0) {
                        i31 = i37 + 1;
                        z8 = z9;
                        i8 = 8;
                    } else {
                        i9 = i33;
                        i10 = i34;
                        break;
                    }
                }
                z9 = z8;
                f8 = 0.0f;
                i9 = 0;
                i10 = 0;
                i11 = 0;
                int i38 = c1849f.f16597g;
                if (z9) {
                    i38 = c1849f2.f16597g;
                }
                float f12 = 0.5f;
                if (i11 > i27) {
                    if (z9) {
                        i38 += (int) (((i11 - i27) / 2.0f) + 0.5f);
                    } else {
                        i38 -= (int) (((i11 - i27) / 2.0f) + 0.5f);
                    }
                }
                if (i9 > 0) {
                    float f13 = i27 - i11;
                    int i39 = (int) ((f13 / i9) + 0.5f);
                    int i40 = 0;
                    int i41 = 0;
                    while (i40 < size) {
                        float f14 = f12;
                        m mVar2 = (m) arrayList.get(i40);
                        int i42 = i38;
                        y.d dVar3 = mVar2.f16606b;
                        int i43 = i9;
                        C1850g c1850g2 = mVar2.f16609e;
                        float f15 = f13;
                        int i44 = i39;
                        if (dVar3.f16353V == 8 || mVar2.f16608d != 3 || c1850g2.j) {
                            i22 = i40;
                        } else {
                            if (f8 > 0.0f) {
                                i21 = (int) (((dVar3.f16356Z[this.f16610f] * f15) / f8) + f14);
                            } else {
                                i21 = i44;
                            }
                            if (this.f16610f == 0) {
                                int i45 = dVar3.f16371n;
                                int i46 = dVar3.f16370m;
                                i22 = i40;
                                if (mVar2.f16605a == 1) {
                                    i24 = Math.min(i21, c1850g2.f16601m);
                                } else {
                                    i24 = i21;
                                }
                                max = Math.max(i46, i24);
                                if (i45 > 0) {
                                    max = Math.min(i45, max);
                                }
                            } else {
                                i22 = i40;
                                int i47 = dVar3.f16374q;
                                int i48 = dVar3.f16373p;
                                if (mVar2.f16605a == 1) {
                                    i23 = Math.min(i21, c1850g2.f16601m);
                                } else {
                                    i23 = i21;
                                }
                                max = Math.max(i48, i23);
                                if (i47 > 0) {
                                    max = Math.min(i47, max);
                                }
                            }
                        }
                        i40 = i22 + 1;
                        i38 = i42;
                        f12 = f14;
                        i9 = i43;
                        f13 = f15;
                        i39 = i44;
                    }
                    i12 = i38;
                    f9 = f12;
                    int i49 = i9;
                    if (i41 > 0) {
                        i9 = i49 - i41;
                        i11 = 0;
                        for (int i50 = 0; i50 < size; i50++) {
                            m mVar3 = (m) arrayList.get(i50);
                            if (mVar3.f16606b.f16353V != 8) {
                                if (i50 > 0 && i50 >= i28) {
                                    i11 += mVar3.f16612h.f16596f;
                                }
                                i11 += mVar3.f16609e.f16597g;
                                if (i50 < i29 && i50 < i4) {
                                    i11 += -mVar3.f16613i.f16596f;
                                }
                            }
                        }
                    } else {
                        i9 = i49;
                    }
                    i14 = 2;
                    if (this.f16582l == 2 && i41 == 0) {
                        i13 = 0;
                        this.f16582l = 0;
                    } else {
                        i13 = 0;
                    }
                } else {
                    i12 = i38;
                    f9 = 0.5f;
                    i13 = 0;
                    i14 = 2;
                }
                if (i11 > i27) {
                    this.f16582l = i14;
                }
                if (i10 > 0 && i9 == 0 && i28 == i4) {
                    this.f16582l = i14;
                }
                int i51 = this.f16582l;
                if (i51 == 1) {
                    if (i10 > 1) {
                        i19 = (i27 - i11) / (i10 - 1);
                    } else if (i10 == 1) {
                        i19 = (i27 - i11) / 2;
                    } else {
                        i19 = i13;
                    }
                    if (i9 > 0) {
                        i19 = i13;
                    }
                    int i52 = i12;
                    for (int i53 = i13; i53 < size; i53++) {
                        if (z9) {
                            i20 = size - (i53 + 1);
                        } else {
                            i20 = i53;
                        }
                        m mVar4 = (m) arrayList.get(i20);
                        y.d dVar4 = mVar4.f16606b;
                        C1849f c1849f3 = mVar4.f16613i;
                        C1849f c1849f4 = mVar4.f16612h;
                        if (dVar4.f16353V == 8) {
                            c1849f4.d(i52);
                            c1849f3.d(i52);
                        } else {
                            if (i53 > 0) {
                                if (z9) {
                                    i52 -= i19;
                                } else {
                                    i52 += i19;
                                }
                            }
                            if (i53 > 0 && i53 >= i28) {
                                if (z9) {
                                    i52 -= c1849f4.f16596f;
                                } else {
                                    i52 += c1849f4.f16596f;
                                }
                            }
                            if (z9) {
                                c1849f3.d(i52);
                            } else {
                                c1849f4.d(i52);
                            }
                            C1850g c1850g3 = mVar4.f16609e;
                            int i54 = c1850g3.f16597g;
                            if (mVar4.f16608d == 3 && mVar4.f16605a == 1) {
                                i54 = c1850g3.f16601m;
                            }
                            if (z9) {
                                i52 -= i54;
                            } else {
                                i52 += i54;
                            }
                            if (z9) {
                                c1849f4.d(i52);
                            } else {
                                c1849f3.d(i52);
                            }
                            mVar4.f16611g = true;
                            if (i53 < i29 && i53 < i4) {
                                if (z9) {
                                    i52 -= -c1849f3.f16596f;
                                } else {
                                    i52 += -c1849f3.f16596f;
                                }
                            }
                        }
                    }
                    return;
                }
                if (i51 == 0) {
                    int i55 = (i27 - i11) / (i10 + 1);
                    if (i9 > 0) {
                        i55 = i13;
                    }
                    int i56 = i12;
                    for (int i57 = i13; i57 < size; i57++) {
                        if (z9) {
                            i17 = size - (i57 + 1);
                        } else {
                            i17 = i57;
                        }
                        m mVar5 = (m) arrayList.get(i17);
                        y.d dVar5 = mVar5.f16606b;
                        C1849f c1849f5 = mVar5.f16613i;
                        C1849f c1849f6 = mVar5.f16612h;
                        if (dVar5.f16353V == 8) {
                            c1849f6.d(i56);
                            c1849f5.d(i56);
                        } else {
                            if (z9) {
                                i18 = i56 - i55;
                            } else {
                                i18 = i56 + i55;
                            }
                            if (i57 > 0 && i57 >= i28) {
                                if (z9) {
                                    i18 -= c1849f6.f16596f;
                                } else {
                                    i18 += c1849f6.f16596f;
                                }
                            }
                            if (z9) {
                                c1849f5.d(i18);
                            } else {
                                c1849f6.d(i18);
                            }
                            C1850g c1850g4 = mVar5.f16609e;
                            int i58 = c1850g4.f16597g;
                            if (mVar5.f16608d == 3 && mVar5.f16605a == 1) {
                                i58 = Math.min(i58, c1850g4.f16601m);
                            }
                            if (z9) {
                                i56 = i18 - i58;
                            } else {
                                i56 = i18 + i58;
                            }
                            if (z9) {
                                c1849f6.d(i56);
                            } else {
                                c1849f5.d(i56);
                            }
                            if (i57 < i29 && i57 < i4) {
                                if (z9) {
                                    i56 -= -c1849f5.f16596f;
                                } else {
                                    i56 += -c1849f5.f16596f;
                                }
                            }
                        }
                    }
                    return;
                }
                if (i51 == 2) {
                    if (this.f16610f == 0) {
                        f10 = this.f16606b.f16350S;
                    } else {
                        f10 = this.f16606b.f16351T;
                    }
                    if (z9) {
                        f10 = 1.0f - f10;
                    }
                    int i59 = (int) (((i27 - i11) * f10) + f9);
                    if (i59 < 0 || i9 > 0) {
                        i59 = i13;
                    }
                    if (z9) {
                        i15 = i12 - i59;
                    } else {
                        i15 = i12 + i59;
                    }
                    for (int i60 = i13; i60 < size; i60++) {
                        if (z9) {
                            i16 = size - (i60 + 1);
                        } else {
                            i16 = i60;
                        }
                        m mVar6 = (m) arrayList.get(i16);
                        y.d dVar6 = mVar6.f16606b;
                        C1849f c1849f7 = mVar6.f16613i;
                        C1849f c1849f8 = mVar6.f16612h;
                        if (dVar6.f16353V == 8) {
                            c1849f8.d(i15);
                            c1849f7.d(i15);
                        } else {
                            if (i60 > 0 && i60 >= i28) {
                                if (z9) {
                                    i15 -= c1849f8.f16596f;
                                } else {
                                    i15 += c1849f8.f16596f;
                                }
                            }
                            if (z9) {
                                c1849f7.d(i15);
                            } else {
                                c1849f8.d(i15);
                            }
                            C1850g c1850g5 = mVar6.f16609e;
                            int i61 = c1850g5.f16597g;
                            if (mVar6.f16608d == 3 && mVar6.f16605a == 1) {
                                i61 = c1850g5.f16601m;
                            }
                            i15 += i61;
                            if (z9) {
                                c1849f8.d(i15);
                            } else {
                                c1849f7.d(i15);
                            }
                            if (i60 < i29 && i60 < i4) {
                                if (z9) {
                                    i15 -= -c1849f7.f16596f;
                                } else {
                                    i15 += -c1849f7.f16596f;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // z.m
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((m) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        y.d dVar = ((m) arrayList.get(0)).f16606b;
        y.d dVar2 = ((m) arrayList.get(size - 1)).f16606b;
        int i4 = this.f16610f;
        C1849f c1849f = this.f16613i;
        C1849f c1849f2 = this.f16612h;
        if (i4 == 0) {
            y.c cVar = dVar.f16381x;
            y.c cVar2 = dVar2.f16383z;
            C1849f i8 = m.i(cVar, 0);
            int c6 = cVar.c();
            y.d m6 = m();
            if (m6 != null) {
                c6 = m6.f16381x.c();
            }
            if (i8 != null) {
                m.b(c1849f2, i8, c6);
            }
            C1849f i9 = m.i(cVar2, 0);
            int c9 = cVar2.c();
            y.d n3 = n();
            if (n3 != null) {
                c9 = n3.f16383z.c();
            }
            if (i9 != null) {
                m.b(c1849f, i9, -c9);
            }
        } else {
            y.c cVar3 = dVar.f16382y;
            y.c cVar4 = dVar2.f16333A;
            C1849f i10 = m.i(cVar3, 1);
            int c10 = cVar3.c();
            y.d m8 = m();
            if (m8 != null) {
                c10 = m8.f16382y.c();
            }
            if (i10 != null) {
                m.b(c1849f2, i10, c10);
            }
            C1849f i11 = m.i(cVar4, 1);
            int c11 = cVar4.c();
            y.d n8 = n();
            if (n8 != null) {
                c11 = n8.f16333A.c();
            }
            if (i11 != null) {
                m.b(c1849f, i11, -c11);
            }
        }
        c1849f2.f16591a = this;
        c1849f.f16591a = this;
    }

    @Override // z.m
    public final void e() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i4 < arrayList.size()) {
                ((m) arrayList.get(i4)).e();
                i4++;
            } else {
                return;
            }
        }
    }

    @Override // z.m
    public final void f() {
        this.f16607c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((m) it.next()).f();
        }
    }

    @Override // z.m
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i4 = 0; i4 < size; i4++) {
            j = r5.f16613i.f16596f + ((m) arrayList.get(i4)).j() + j + r5.f16612h.f16596f;
        }
        return j;
    }

    @Override // z.m
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!((m) arrayList.get(i4)).k()) {
                return false;
            }
        }
        return true;
    }

    public final y.d m() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i4 < arrayList.size()) {
                y.d dVar = ((m) arrayList.get(i4)).f16606b;
                if (dVar.f16353V != 8) {
                    return dVar;
                }
                i4++;
            } else {
                return null;
            }
        }
    }

    public final y.d n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            y.d dVar = ((m) arrayList.get(size)).f16606b;
            if (dVar.f16353V != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        if (this.f16610f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        String concat = "ChainRun ".concat(str);
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            concat = AbstractC1149a.g(AbstractC1149a.g(concat, "<") + mVar, "> ");
        }
        return concat;
    }
}
