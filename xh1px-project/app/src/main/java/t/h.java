package t;

import java.util.ConcurrentModificationException;
import u.AbstractC1595a;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f14659a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f14660b = new Object();

    public static final void a(k kVar) {
        int i4 = kVar.f14674g;
        int[] iArr = kVar.f14672e;
        Object[] objArr = kVar.f14673f;
        int i8 = 0;
        for (int i9 = 0; i9 < i4; i9++) {
            Object obj = objArr[i9];
            if (obj != f14660b) {
                if (i9 != i8) {
                    iArr[i8] = iArr[i9];
                    objArr[i8] = obj;
                    objArr[i9] = null;
                }
                i8++;
            }
        }
        kVar.f14671d = false;
        kVar.f14674g = i8;
    }

    public static final void b(f fVar, int i4) {
        fVar.f14652d = new int[i4];
        fVar.f14653e = new Object[i4];
    }

    public static final int c(f fVar, Object obj, int i4) {
        int i8 = fVar.f14654f;
        if (i8 == 0) {
            return -1;
        }
        try {
            int a3 = AbstractC1595a.a(i8, i4, fVar.f14652d);
            if (a3 < 0 || o6.j.a(obj, fVar.f14653e[a3])) {
                return a3;
            }
            int i9 = a3 + 1;
            while (i9 < i8 && fVar.f14652d[i9] == i4) {
                if (o6.j.a(obj, fVar.f14653e[i9])) {
                    return i9;
                }
                i9++;
            }
            for (int i10 = a3 - 1; i10 >= 0 && fVar.f14652d[i10] == i4; i10--) {
                if (o6.j.a(obj, fVar.f14653e[i10])) {
                    return i10;
                }
            }
            return ~i9;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
