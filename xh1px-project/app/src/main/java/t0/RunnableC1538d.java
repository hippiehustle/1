package t0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: t0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1538d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f14823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f14824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14825f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1539e f14826g;

    public RunnableC1538d(C1539e c1539e, List list, List list2, int i4) {
        this.f14826g = c1539e;
        this.f14823d = list;
        this.f14824e = list2;
        this.f14825f = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00af, code lost:
    
        if (r6[(r3 + 1) + r8] > r6[(r3 - 1) + r8]) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
    /* JADX WARN: Type inference failed for: r14v26, types: [t0.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [t0.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v23, types: [t0.s, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i4;
        C1552s c1552s;
        int i8;
        r rVar;
        C1549o c1549o;
        int i9;
        int i10;
        int i11;
        C1552s c1552s2;
        int i12;
        C1552s c1552s3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        W5.a aVar = new W5.a(28, this);
        int size = this.f14823d.size();
        int size2 = this.f14824e.size();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ?? obj = new Object();
        int i28 = 0;
        obj.f14934a = 0;
        obj.f14935b = size;
        obj.f14936c = 0;
        obj.f14937d = size2;
        arrayList2.add(obj);
        int i29 = size + size2;
        int i30 = 1;
        int i31 = (((i29 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i31];
        int i32 = i31 / 2;
        int[] iArr2 = new int[i31];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            r rVar2 = (r) arrayList2.remove(arrayList2.size() - i30);
            if (rVar2.b() >= i30 && rVar2.a() >= i30) {
                int a3 = ((rVar2.a() + rVar2.b()) + i30) / 2;
                int i33 = i30 + i32;
                iArr[i33] = rVar2.f14934a;
                iArr2[i33] = rVar2.f14935b;
                int i34 = i28;
                while (i34 < a3) {
                    if (Math.abs(rVar2.b() - rVar2.a()) % 2 == i30) {
                        i9 = i30;
                    } else {
                        i9 = i28;
                    }
                    int b4 = rVar2.b() - rVar2.a();
                    int i35 = -i34;
                    int i36 = i35;
                    while (true) {
                        if (i36 <= i34) {
                            if (i36 != i35) {
                                if (i36 != i34) {
                                    i18 = i36;
                                } else {
                                    i18 = i36;
                                }
                                i19 = iArr[(i18 - 1) + i32];
                                i20 = i19 + 1;
                                i4 = i32;
                                i21 = ((i20 - rVar2.f14934a) + rVar2.f14936c) - i18;
                                if (i34 == 0 && i20 == i19) {
                                    i22 = i20;
                                    i23 = i21 - 1;
                                } else {
                                    i22 = i20;
                                    i23 = i21;
                                }
                                int i37 = a3;
                                i24 = i21;
                                i25 = i22;
                                i11 = i37;
                                i26 = i9;
                                while (i25 < rVar2.f14935b && i24 < rVar2.f14937d && aVar.E(i25, i24)) {
                                    i25++;
                                    i24++;
                                }
                                iArr[i18 + i4] = i25;
                                if (i26 == 0) {
                                    int i38 = b4 - i18;
                                    i27 = b4;
                                    if (i38 >= i35 + 1 && i38 <= i34 - 1 && iArr2[i38 + i4] <= i25) {
                                        ?? obj2 = new Object();
                                        obj2.f14944a = i19;
                                        obj2.f14945b = i23;
                                        obj2.f14946c = i25;
                                        obj2.f14947d = i24;
                                        i10 = 0;
                                        obj2.f14948e = false;
                                        c1552s2 = obj2;
                                        break;
                                    }
                                } else {
                                    i27 = b4;
                                }
                                i28 = 0;
                                i36 = i18 + 2;
                                i32 = i4;
                                a3 = i11;
                                i9 = i26;
                                b4 = i27;
                            } else {
                                i18 = i36;
                            }
                            i19 = iArr[i18 + 1 + i32];
                            i20 = i19;
                            i4 = i32;
                            i21 = ((i20 - rVar2.f14934a) + rVar2.f14936c) - i18;
                            if (i34 == 0) {
                            }
                            i22 = i20;
                            i23 = i21;
                            int i372 = a3;
                            i24 = i21;
                            i25 = i22;
                            i11 = i372;
                            i26 = i9;
                            while (i25 < rVar2.f14935b) {
                                i25++;
                                i24++;
                            }
                            iArr[i18 + i4] = i25;
                            if (i26 == 0) {
                            }
                            i28 = 0;
                            i36 = i18 + 2;
                            i32 = i4;
                            a3 = i11;
                            i9 = i26;
                            b4 = i27;
                        } else {
                            i10 = i28;
                            i4 = i32;
                            i11 = a3;
                            c1552s2 = null;
                            break;
                        }
                    }
                    if (c1552s2 != null) {
                        c1552s = c1552s2;
                        break;
                    }
                    if ((rVar2.b() - rVar2.a()) % 2 == 0) {
                        i12 = 1;
                    } else {
                        i12 = i10;
                    }
                    int b9 = rVar2.b() - rVar2.a();
                    int i39 = i35;
                    while (true) {
                        if (i39 <= i34) {
                            if (i39 != i35 && (i39 == i34 || iArr2[i39 + 1 + i4] >= iArr2[(i39 - 1) + i4])) {
                                i13 = iArr2[(i39 - 1) + i4];
                                i14 = i13 - 1;
                            } else {
                                i13 = iArr2[i39 + 1 + i4];
                                i14 = i13;
                            }
                            int i40 = rVar2.f14937d - ((rVar2.f14935b - i14) - i39);
                            if (i34 != 0 && i14 == i13) {
                                i15 = i40;
                                i40++;
                            } else {
                                i15 = i40;
                            }
                            int i41 = i15;
                            int i42 = i12;
                            int i43 = i14;
                            int i44 = i41;
                            int i45 = b9;
                            while (i43 > rVar2.f14934a && i44 > rVar2.f14936c) {
                                i16 = i39;
                                if (!aVar.E(i43 - 1, i44 - 1)) {
                                    break;
                                }
                                i43--;
                                i44--;
                                i39 = i16;
                            }
                            i16 = i39;
                            iArr2[i16 + i4] = i43;
                            if (i42 != 0 && (i17 = i45 - i16) >= i35 && i17 <= i34 && iArr[i17 + i4] >= i43) {
                                ?? obj3 = new Object();
                                obj3.f14944a = i43;
                                obj3.f14945b = i44;
                                obj3.f14946c = i13;
                                obj3.f14947d = i40;
                                obj3.f14948e = true;
                                c1552s3 = obj3;
                                break;
                            }
                            i39 = i16 + 2;
                            i12 = i42;
                            b9 = i45;
                        } else {
                            c1552s3 = null;
                            break;
                        }
                    }
                    if (c1552s3 != null) {
                        c1552s = c1552s3;
                        break;
                    }
                    i34++;
                    i32 = i4;
                    a3 = i11;
                    i30 = 1;
                    i28 = 0;
                }
            }
            i4 = i32;
            c1552s = null;
            if (c1552s != null) {
                if (c1552s.a() > 0) {
                    int i46 = c1552s.f14947d;
                    int i47 = c1552s.f14945b;
                    int i48 = i46 - i47;
                    int i49 = c1552s.f14946c;
                    int i50 = c1552s.f14944a;
                    int i51 = i49 - i50;
                    if (i48 != i51) {
                        if (c1552s.f14948e) {
                            c1549o = new C1549o(i50, i47, c1552s.a());
                        } else if (i48 > i51) {
                            c1549o = new C1549o(i50, i47 + 1, c1552s.a());
                        } else {
                            c1549o = new C1549o(i50 + 1, i47, c1552s.a());
                        }
                    } else {
                        c1549o = new C1549o(i50, i47, i51);
                    }
                    arrayList.add(c1549o);
                }
                if (arrayList3.isEmpty()) {
                    i8 = 1;
                    rVar = new Object();
                } else {
                    i8 = 1;
                    rVar = (r) arrayList3.remove(arrayList3.size() - 1);
                }
                rVar.f14934a = rVar2.f14934a;
                rVar.f14936c = rVar2.f14936c;
                rVar.f14935b = c1552s.f14944a;
                rVar.f14937d = c1552s.f14945b;
                arrayList2.add(rVar);
                rVar2.f14935b = rVar2.f14935b;
                rVar2.f14937d = rVar2.f14937d;
                rVar2.f14934a = c1552s.f14946c;
                rVar2.f14936c = c1552s.f14947d;
                arrayList2.add(rVar2);
            } else {
                i8 = 1;
                arrayList3.add(rVar2);
            }
            i30 = i8;
            i32 = i4;
            i28 = 0;
        }
        Collections.sort(arrayList, AbstractC1534b.f14802c);
        this.f14826g.f14834c.execute(new E.b(this, new C1550p(aVar, arrayList, iArr, iArr2), 9, false));
    }
}
