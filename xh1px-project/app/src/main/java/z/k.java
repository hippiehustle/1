package z;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public m f16602a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f16603b;

    public static long a(C1849f c1849f, long j) {
        m mVar = c1849f.f16594d;
        ArrayList arrayList = c1849f.k;
        if (mVar instanceof i) {
            return j;
        }
        int size = arrayList.size();
        long j5 = j;
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC1847d interfaceC1847d = (InterfaceC1847d) arrayList.get(i4);
            if (interfaceC1847d instanceof C1849f) {
                C1849f c1849f2 = (C1849f) interfaceC1847d;
                if (c1849f2.f16594d != mVar) {
                    j5 = Math.min(j5, a(c1849f2, c1849f2.f16596f + j));
                }
            }
        }
        C1849f c1849f3 = mVar.f16613i;
        C1849f c1849f4 = mVar.f16612h;
        if (c1849f == c1849f3) {
            long j8 = j - mVar.j();
            return Math.min(Math.min(j5, a(c1849f4, j8)), j8 - c1849f4.f16596f);
        }
        return j5;
    }

    public static long b(C1849f c1849f, long j) {
        m mVar = c1849f.f16594d;
        ArrayList arrayList = c1849f.k;
        if (mVar instanceof i) {
            return j;
        }
        int size = arrayList.size();
        long j5 = j;
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC1847d interfaceC1847d = (InterfaceC1847d) arrayList.get(i4);
            if (interfaceC1847d instanceof C1849f) {
                C1849f c1849f2 = (C1849f) interfaceC1847d;
                if (c1849f2.f16594d != mVar) {
                    j5 = Math.max(j5, b(c1849f2, c1849f2.f16596f + j));
                }
            }
        }
        C1849f c1849f3 = mVar.f16612h;
        C1849f c1849f4 = mVar.f16613i;
        if (c1849f == c1849f3) {
            long j8 = mVar.j() + j;
            return Math.max(Math.max(j5, b(c1849f4, j8)), j8 - c1849f4.f16596f);
        }
        return j5;
    }
}
