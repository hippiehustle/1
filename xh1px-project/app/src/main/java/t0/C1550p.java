package t0;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: t0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1550p {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14924a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f14925b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f14926c;

    /* renamed from: d, reason: collision with root package name */
    public final W5.a f14927d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14928e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14929f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14930g;

    public C1550p(W5.a aVar, ArrayList arrayList, int[] iArr, int[] iArr2) {
        C1549o c1549o;
        int i4;
        C1549o c1549o2;
        int i8;
        int i9;
        int i10;
        this.f14924a = arrayList;
        this.f14925b = iArr;
        this.f14926c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f14927d = aVar;
        RunnableC1538d runnableC1538d = (RunnableC1538d) aVar.f6634e;
        int size = runnableC1538d.f14823d.size();
        this.f14928e = size;
        int size2 = runnableC1538d.f14824e.size();
        this.f14929f = size2;
        this.f14930g = true;
        if (arrayList.isEmpty()) {
            c1549o = null;
        } else {
            c1549o = (C1549o) arrayList.get(0);
        }
        if (c1549o == null || c1549o.f14909a != 0 || c1549o.f14910b != 0) {
            arrayList.add(0, new C1549o(0, 0, 0));
        }
        arrayList.add(new C1549o(size, size2, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1549o c1549o3 = (C1549o) it.next();
            for (int i11 = 0; i11 < c1549o3.f14911c; i11++) {
                int i12 = c1549o3.f14909a + i11;
                int i13 = c1549o3.f14910b + i11;
                if (aVar.D(i12, i13)) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                iArr[i12] = (i13 << 4) | i10;
                iArr2[i13] = (i12 << 4) | i10;
            }
        }
        if (this.f14930g) {
            Iterator it2 = arrayList.iterator();
            int i14 = 0;
            while (it2.hasNext()) {
                C1549o c1549o4 = (C1549o) it2.next();
                while (true) {
                    i4 = c1549o4.f14909a;
                    if (i14 < i4) {
                        if (iArr[i14] == 0) {
                            int size3 = arrayList.size();
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                if (i15 < size3) {
                                    c1549o2 = (C1549o) arrayList.get(i15);
                                    while (true) {
                                        i8 = c1549o2.f14910b;
                                        if (i16 < i8) {
                                            if (iArr2[i16] == 0 && aVar.E(i14, i16)) {
                                                if (aVar.D(i14, i16)) {
                                                    i9 = 8;
                                                } else {
                                                    i9 = 4;
                                                }
                                                iArr[i14] = (i16 << 4) | i9;
                                                iArr2[i16] = i9 | (i14 << 4);
                                            } else {
                                                i16++;
                                            }
                                        }
                                    }
                                }
                                i16 = c1549o2.f14911c + i8;
                                i15++;
                            }
                        }
                        i14++;
                    }
                }
                i14 = c1549o4.f14911c + i4;
            }
        }
    }

    public static C1551q a(ArrayDeque arrayDeque, int i4, boolean z8) {
        C1551q c1551q;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (it.hasNext()) {
                c1551q = (C1551q) it.next();
                if (c1551q.f14931a == i4 && c1551q.f14933c == z8) {
                    it.remove();
                    break;
                }
            } else {
                c1551q = null;
                break;
            }
        }
        while (it.hasNext()) {
            C1551q c1551q2 = (C1551q) it.next();
            if (z8) {
                c1551q2.f14932b--;
            } else {
                c1551q2.f14932b++;
            }
        }
        return c1551q;
    }
}
