package z;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import n1.AbstractC1149a;

/* renamed from: z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1848e {

    /* renamed from: a, reason: collision with root package name */
    public y.e f16583a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16584b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16585c;

    /* renamed from: d, reason: collision with root package name */
    public y.e f16586d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f16587e;

    /* renamed from: f, reason: collision with root package name */
    public A.f f16588f;

    /* renamed from: g, reason: collision with root package name */
    public C1845b f16589g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f16590h;

    /* JADX WARN: Type inference failed for: r10v2, types: [z.k, java.lang.Object] */
    public final void a(C1849f c1849f, int i4, ArrayList arrayList, k kVar) {
        m mVar = c1849f.f16594d;
        k kVar2 = mVar.f16607c;
        C1849f c1849f2 = mVar.f16613i;
        C1849f c1849f3 = mVar.f16612h;
        if (kVar2 == null) {
            y.e eVar = this.f16583a;
            if (mVar != eVar.f16363d) {
                k kVar3 = kVar;
                if (mVar != eVar.f16364e) {
                    if (kVar == null) {
                        ?? obj = new Object();
                        obj.f16602a = null;
                        obj.f16603b = new ArrayList();
                        obj.f16602a = mVar;
                        arrayList.add(obj);
                        kVar3 = obj;
                    }
                    mVar.f16607c = kVar3;
                    kVar3.f16603b.add(mVar);
                    Iterator it = c1849f3.k.iterator();
                    while (it.hasNext()) {
                        InterfaceC1847d interfaceC1847d = (InterfaceC1847d) it.next();
                        if (interfaceC1847d instanceof C1849f) {
                            a((C1849f) interfaceC1847d, i4, arrayList, kVar3);
                        }
                    }
                    Iterator it2 = c1849f2.k.iterator();
                    while (it2.hasNext()) {
                        InterfaceC1847d interfaceC1847d2 = (InterfaceC1847d) it2.next();
                        if (interfaceC1847d2 instanceof C1849f) {
                            a((C1849f) interfaceC1847d2, i4, arrayList, kVar3);
                        }
                    }
                    if (i4 == 1 && (mVar instanceof l)) {
                        Iterator it3 = ((l) mVar).k.k.iterator();
                        while (it3.hasNext()) {
                            InterfaceC1847d interfaceC1847d3 = (InterfaceC1847d) it3.next();
                            if (interfaceC1847d3 instanceof C1849f) {
                                a((C1849f) interfaceC1847d3, i4, arrayList, kVar3);
                            }
                        }
                    }
                    Iterator it4 = c1849f3.f16600l.iterator();
                    while (it4.hasNext()) {
                        a((C1849f) it4.next(), i4, arrayList, kVar3);
                    }
                    Iterator it5 = c1849f2.f16600l.iterator();
                    while (it5.hasNext()) {
                        a((C1849f) it5.next(), i4, arrayList, kVar3);
                    }
                    if (i4 == 1 && (mVar instanceof l)) {
                        Iterator it6 = ((l) mVar).k.f16600l.iterator();
                        while (it6.hasNext()) {
                            a((C1849f) it6.next(), i4, arrayList, kVar3);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0255, code lost:
    
        if (r4[3].f16329d != null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0258, code lost:
    
        r3 = r7;
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x025a, code lost:
    
        r1 = 1;
        r4 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x025d, code lost:
    
        f(r8, 0, r7, 0, r9);
        r11.f16609e.d(r9.l());
        r10.f16609e.d(r9.i());
        r9.f16357a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x027c, code lost:
    
        r1 = r5;
        r5 = r3;
        r3 = r7;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00e5, code lost:
    
        if (r0 != 3) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00e7, code lost:
    
        if (r3 != r1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00e9, code lost:
    
        f(r1, 0, r1, 0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00f2, code lost:
    
        r8 = r9.i();
        f(1, (int) ((r8 * r9.f16343L) + 0.5f), 1, r8, r9);
        r11.f16609e.d(r9.l());
        r10.f16609e.d(r9.i());
        r9.f16357a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0123, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0126, code lost:
    
        if (r0 != 1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0128, code lost:
    
        f(r5, 0, r3, 0, r9);
        r11.f16609e.f16601m = r9.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x013a, code lost:
    
        if (r0 != 2) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x013c, code lost:
    
        r1 = r2[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x013e, code lost:
    
        if (r1 == 1) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0141, code lost:
    
        if (r1 != 4) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0144, code lost:
    
        r7 = r3;
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0147, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0149, code lost:
    
        f(1, (int) ((r12 * r25.l()) + 0.5f), r3, r9.i(), r9);
        r11.f16609e.d(r9.l());
        r10.f16609e.d(r9.i());
        r9.f16357a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0173, code lost:
    
        r7 = r3;
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x017b, code lost:
    
        if (r4[0].f16329d == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0181, code lost:
    
        if (r4[1].f16329d != null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0183, code lost:
    
        f(r5, 0, r7, 0, r9);
        r11.f16609e.d(r9.l());
        r10.f16609e.d(r9.i());
        r9.f16357a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01a1, code lost:
    
        r5 = r1;
        r7 = r3;
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x00c8, code lost:
    
        if (r3 == 2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bf, code lost:
    
        if (r13 == 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d1, code lost:
    
        if (r13 != 3) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d3, code lost:
    
        if (r3 == r1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d6, code lost:
    
        if (r3 != 1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d9, code lost:
    
        r5 = r1;
        r1 = 3;
        r7 = r3;
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a5, code lost:
    
        if (r7 != r1) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01a7, code lost:
    
        if (r13 == r5) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a9, code lost:
    
        if (r13 != r3) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ac, code lost:
    
        r4 = r5;
        r5 = r3;
        r3 = r7;
        r7 = r4;
        r4 = r1;
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0281, code lost:
    
        if (r13 != r4) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0283, code lost:
    
        if (r3 != r4) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0285, code lost:
    
        if (r0 == r1) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0287, code lost:
    
        if (r15 != r1) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x028b, code lost:
    
        if (r15 != 2) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x028d, code lost:
    
        if (r0 != 2) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x028f, code lost:
    
        r0 = r2[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0291, code lost:
    
        if (r0 == r5) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0293, code lost:
    
        if (r0 != r5) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0295, code lost:
    
        r0 = r2[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0297, code lost:
    
        if (r0 == r5) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0299, code lost:
    
        if (r0 != r5) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x029b, code lost:
    
        f(r5, (int) ((r12 * r25.l()) + 0.5f), r5, (int) ((r14 * r25.i()) + 0.5f), r9);
        r11.f16609e.d(r9.l());
        r10.f16609e.d(r9.i());
        r9.f16357a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02ca, code lost:
    
        f(r7, 0, r7, 0, r9);
        r11.f16609e.f16601m = r9.l();
        r10.f16609e.f16601m = r9.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b4, code lost:
    
        if (r15 != r1) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b6, code lost:
    
        if (r13 != r5) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b8, code lost:
    
        f(r5, 0, r5, 0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c0, code lost:
    
        r6 = r9.l();
        r0 = r9.f16343L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c9, code lost:
    
        if (r9.f16344M != (-1)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01cb, code lost:
    
        r0 = 1.0f / r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01cd, code lost:
    
        f(r3, r6, r3, (int) ((r6 * r0) + 0.5f), r9);
        r11.f16609e.d(r9.l());
        r10.f16609e.d(r9.i());
        r9.f16357a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01f1, code lost:
    
        if (r15 != 1) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01f3, code lost:
    
        f(r13, 0, r5, 0, r9);
        r10.f16609e.f16601m = r9.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0206, code lost:
    
        r8 = r5;
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0209, code lost:
    
        if (r15 != 2) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x020b, code lost:
    
        r4 = r2[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x020d, code lost:
    
        if (r4 == r3) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0210, code lost:
    
        if (r4 != 4) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0213, code lost:
    
        r13 = r5;
        r1 = 1;
        r4 = 3;
        r5 = r3;
        r3 = r7;
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x021b, code lost:
    
        f(r5, r9.l(), r3, (int) ((r14 * r25.i()) + 0.5f), r9);
        r11.f16609e.d(r9.l());
        r10.f16609e.d(r9.i());
        r9.f16357a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0245, code lost:
    
        r13 = r5;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x024d, code lost:
    
        if (r4[2].f16329d == null) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(y.e eVar) {
        int i4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList = eVar.f16384d0;
        int[] iArr = eVar.f16362c0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y.d dVar = (y.d) it.next();
            int[] iArr2 = dVar.f16362c0;
            y.c[] cVarArr = dVar.f16338F;
            y.c cVar = dVar.f16333A;
            y.c cVar2 = dVar.f16382y;
            y.c cVar3 = dVar.f16383z;
            y.c cVar4 = dVar.f16381x;
            l lVar = dVar.f16364e;
            j jVar = dVar.f16363d;
            int i15 = iArr2[0];
            int i16 = iArr2[1];
            if (dVar.f16353V == 8) {
                dVar.f16357a = true;
            } else {
                float f8 = dVar.f16372o;
                if (f8 < 1.0f && i15 == 3) {
                    dVar.j = 2;
                }
                float f9 = dVar.f16375r;
                if (f9 < 1.0f && i16 == 3) {
                    dVar.k = 2;
                }
                if (dVar.f16343L > 0.0f) {
                    if (i15 == 3) {
                        i14 = 2;
                        if (i16 == 2 || i16 == 1) {
                            i4 = 3;
                            dVar.j = 3;
                        } else {
                            i4 = 3;
                        }
                    } else {
                        i4 = 3;
                        i14 = 2;
                    }
                    if (i16 == i4 && (i15 == i14 || i15 == 1)) {
                        dVar.k = i4;
                    } else if (i15 == i4 && i16 == i4) {
                        if (dVar.j == 0) {
                            dVar.j = i4;
                        }
                        if (dVar.k == 0) {
                            dVar.k = i4;
                        }
                    }
                } else {
                    i4 = 3;
                }
                if (i15 == i4 && dVar.j == 1 && (cVar4.f16329d == null || cVar3.f16329d == null)) {
                    i15 = 2;
                }
                if (i16 == 3 && dVar.k == 1 && (cVar2.f16329d == null || cVar.f16329d == null)) {
                    i16 = 2;
                }
                jVar.f16608d = i15;
                int i17 = dVar.j;
                jVar.f16605a = i17;
                lVar.f16608d = i16;
                int i18 = dVar.k;
                lVar.f16605a = i18;
                Iterator it2 = it;
                if (i15 != 4 && i15 != 1) {
                    i13 = 2;
                }
                if (i16 != 4) {
                    if (i16 != 1) {
                        i13 = 2;
                    } else {
                        i8 = 1;
                        int l6 = dVar.l();
                        if (i15 != 4) {
                            i9 = (eVar.l() - cVar4.f16330e) - cVar3.f16330e;
                            i10 = i8;
                        } else {
                            i9 = l6;
                            i10 = i15;
                        }
                        int i19 = dVar.i();
                        if (i16 != 4) {
                            i11 = (eVar.i() - cVar2.f16330e) - cVar.f16330e;
                            i12 = i8;
                        } else {
                            i11 = i19;
                            i12 = i16;
                        }
                        f(i10, i9, i12, i11, dVar);
                        jVar.f16609e.d(dVar.l());
                        lVar.f16609e.d(dVar.i());
                        dVar.f16357a = true;
                        it = it2;
                    }
                }
                i8 = 1;
                int l62 = dVar.l();
                if (i15 != 4) {
                }
                int i192 = dVar.i();
                if (i16 != 4) {
                }
                f(i10, i9, i12, i11, dVar);
                jVar.f16609e.d(dVar.l());
                lVar.f16609e.d(dVar.i());
                dVar.f16357a = true;
                it = it2;
            }
        }
    }

    public final void c() {
        y.e eVar = this.f16583a;
        ArrayList arrayList = this.f16590h;
        ArrayList arrayList2 = this.f16587e;
        arrayList2.clear();
        y.e eVar2 = this.f16586d;
        eVar2.f16363d.f();
        l lVar = eVar2.f16364e;
        lVar.f();
        arrayList2.add(eVar2.f16363d);
        arrayList2.add(lVar);
        Iterator it = eVar2.f16384d0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            y.d dVar = (y.d) it.next();
            if (dVar instanceof y.h) {
                m mVar = new m(dVar);
                dVar.f16363d.f();
                dVar.f16364e.f();
                mVar.f16610f = ((y.h) dVar).f16453h0;
                arrayList2.add(mVar);
            } else {
                if (dVar.q()) {
                    if (dVar.f16359b == null) {
                        dVar.f16359b = new C1846c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f16359b);
                } else {
                    arrayList2.add(dVar.f16363d);
                }
                if (dVar.r()) {
                    if (dVar.f16361c == null) {
                        dVar.f16361c = new C1846c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f16361c);
                } else {
                    arrayList2.add(dVar.f16364e);
                }
                if (dVar instanceof y.i) {
                    arrayList2.add(new m(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((m) it2.next()).f();
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            m mVar2 = (m) it3.next();
            if (mVar2.f16606b != eVar2) {
                mVar2.d();
            }
        }
        arrayList.clear();
        e(eVar.f16363d, 0, arrayList);
        e(eVar.f16364e, 1, arrayList);
        this.f16584b = false;
    }

    public final int d(y.e eVar, int i4) {
        m mVar;
        m mVar2;
        ArrayList arrayList;
        int i8;
        long j;
        float f8;
        long j5;
        y.e eVar2 = eVar;
        ArrayList arrayList2 = this.f16590h;
        int size = arrayList2.size();
        long j8 = 0;
        int i9 = 0;
        long j9 = 0;
        while (i9 < size) {
            m mVar3 = ((k) arrayList2.get(i9)).f16602a;
            if (!(mVar3 instanceof C1846c) ? !(i4 != 0 ? (mVar3 instanceof l) : (mVar3 instanceof j)) : ((C1846c) mVar3).f16610f != i4) {
                arrayList = arrayList2;
                i8 = size;
                j = j8;
            } else {
                if (i4 == 0) {
                    mVar = eVar2.f16363d;
                } else {
                    mVar = eVar2.f16364e;
                }
                C1849f c1849f = mVar.f16612h;
                if (i4 == 0) {
                    mVar2 = eVar2.f16363d;
                } else {
                    mVar2 = eVar2.f16364e;
                }
                C1849f c1849f2 = mVar2.f16613i;
                C1849f c1849f3 = mVar3.f16612h;
                C1849f c1849f4 = mVar3.f16613i;
                boolean contains = c1849f3.f16600l.contains(c1849f);
                boolean contains2 = c1849f4.f16600l.contains(c1849f2);
                long j10 = mVar3.j();
                if (contains && contains2) {
                    long b4 = k.b(c1849f3, j8);
                    long a3 = k.a(c1849f4, j8);
                    long j11 = b4 - j10;
                    int i10 = c1849f4.f16596f;
                    arrayList = arrayList2;
                    i8 = size;
                    if (j11 >= (-i10)) {
                        j11 += i10;
                    }
                    long j12 = c1849f3.f16596f;
                    long j13 = ((-a3) - j10) - j12;
                    if (j13 >= j12) {
                        j13 -= j12;
                    }
                    y.d dVar = mVar3.f16606b;
                    if (i4 == 0) {
                        f8 = dVar.f16350S;
                    } else if (i4 == 1) {
                        f8 = dVar.f16351T;
                    } else {
                        dVar.getClass();
                        f8 = -1.0f;
                    }
                    if (f8 > 0.0f) {
                        j5 = (((float) j11) / (1.0f - f8)) + (((float) j13) / f8);
                    } else {
                        j5 = 0;
                    }
                    float f9 = (float) j5;
                    j = (c1849f3.f16596f + ((((f9 * f8) + 0.5f) + j10) + AbstractC1149a.a(1.0f, f8, f9, 0.5f))) - c1849f4.f16596f;
                } else {
                    arrayList = arrayList2;
                    i8 = size;
                    if (contains) {
                        j = Math.max(k.b(c1849f3, c1849f3.f16596f), c1849f3.f16596f + j10);
                    } else if (contains2) {
                        j = Math.max(-k.a(c1849f4, c1849f4.f16596f), (-c1849f4.f16596f) + j10);
                    } else {
                        j = (mVar3.j() + c1849f3.f16596f) - c1849f4.f16596f;
                    }
                }
            }
            j9 = Math.max(j9, j);
            i9++;
            eVar2 = eVar;
            arrayList2 = arrayList;
            size = i8;
            j8 = 0;
        }
        return (int) j9;
    }

    public final void e(m mVar, int i4, ArrayList arrayList) {
        C1849f c1849f = mVar.f16612h;
        C1849f c1849f2 = mVar.f16613i;
        Iterator it = c1849f.k.iterator();
        while (it.hasNext()) {
            InterfaceC1847d interfaceC1847d = (InterfaceC1847d) it.next();
            if (interfaceC1847d instanceof C1849f) {
                a((C1849f) interfaceC1847d, i4, arrayList, null);
            } else if (interfaceC1847d instanceof m) {
                a(((m) interfaceC1847d).f16612h, i4, arrayList, null);
            }
        }
        Iterator it2 = c1849f2.k.iterator();
        while (it2.hasNext()) {
            InterfaceC1847d interfaceC1847d2 = (InterfaceC1847d) it2.next();
            if (interfaceC1847d2 instanceof C1849f) {
                a((C1849f) interfaceC1847d2, i4, arrayList, null);
            } else if (interfaceC1847d2 instanceof m) {
                a(((m) interfaceC1847d2).f16613i, i4, arrayList, null);
            }
        }
        if (i4 == 1) {
            Iterator it3 = ((l) mVar).k.k.iterator();
            while (it3.hasNext()) {
                InterfaceC1847d interfaceC1847d3 = (InterfaceC1847d) it3.next();
                if (interfaceC1847d3 instanceof C1849f) {
                    a((C1849f) interfaceC1847d3, i4, arrayList, null);
                }
            }
        }
    }

    public final void f(int i4, int i8, int i9, int i10, y.d dVar) {
        boolean z8;
        C1845b c1845b = this.f16589g;
        c1845b.f16573a = i4;
        c1845b.f16574b = i9;
        c1845b.f16575c = i8;
        c1845b.f16576d = i10;
        this.f16588f.a(dVar, c1845b);
        dVar.y(c1845b.f16577e);
        dVar.v(c1845b.f16578f);
        dVar.f16380w = c1845b.f16580h;
        int i11 = c1845b.f16579g;
        dVar.f16347P = i11;
        if (i11 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        dVar.f16380w = z8;
    }

    public final void g() {
        boolean z8;
        C1844a c1844a;
        C1848e c1848e = this;
        Iterator it = c1848e.f16583a.f16384d0.iterator();
        while (it.hasNext()) {
            y.d dVar = (y.d) it.next();
            boolean z9 = dVar.f16357a;
            j jVar = dVar.f16363d;
            l lVar = dVar.f16364e;
            if (!z9) {
                int[] iArr = dVar.f16362c0;
                boolean z10 = false;
                int i4 = iArr[0];
                int i8 = iArr[1];
                int i9 = dVar.j;
                int i10 = dVar.k;
                if (i4 != 2 && (i4 != 3 || i9 != 1)) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (i8 == 2 || (i8 == 3 && i10 == 1)) {
                    z10 = true;
                }
                C1850g c1850g = jVar.f16609e;
                boolean z11 = c1850g.j;
                C1850g c1850g2 = lVar.f16609e;
                boolean z12 = c1850g2.j;
                boolean z13 = z8;
                if (z11 && z12) {
                    c1848e.f(1, c1850g.f16597g, 1, c1850g2.f16597g, dVar);
                    dVar.f16357a = true;
                } else if (z11 && z10) {
                    f(1, c1850g.f16597g, 2, c1850g2.f16597g, dVar);
                    if (i8 == 3) {
                        lVar.f16609e.f16601m = dVar.i();
                    } else {
                        lVar.f16609e.d(dVar.i());
                        dVar.f16357a = true;
                    }
                } else if (z12 && z13) {
                    f(2, c1850g.f16597g, 1, c1850g2.f16597g, dVar);
                    if (i4 == 3) {
                        jVar.f16609e.f16601m = dVar.l();
                    } else {
                        jVar.f16609e.d(dVar.l());
                        dVar.f16357a = true;
                    }
                }
                if (dVar.f16357a && (c1844a = lVar.f16604l) != null) {
                    c1844a.d(dVar.f16347P);
                }
                c1848e = this;
            }
        }
    }
}
