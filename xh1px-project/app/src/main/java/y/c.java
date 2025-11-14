package y;

import java.util.HashSet;
import java.util.Iterator;
import n1.AbstractC1149a;
import x.AbstractC1769h;
import x.C1770i;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public final d f16327b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16328c;

    /* renamed from: d, reason: collision with root package name */
    public c f16329d;

    /* renamed from: g, reason: collision with root package name */
    public C1770i f16332g;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f16326a = null;

    /* renamed from: e, reason: collision with root package name */
    public int f16330e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f16331f = -1;

    public c(d dVar, int i4) {
        this.f16327b = dVar;
        this.f16328c = i4;
    }

    public final void a(c cVar, int i4) {
        b(cVar, i4, -1, false);
    }

    public final boolean b(c cVar, int i4, int i8, boolean z8) {
        if (cVar == null) {
            h();
            return true;
        }
        if (!z8 && !g(cVar)) {
            return false;
        }
        this.f16329d = cVar;
        if (cVar.f16326a == null) {
            cVar.f16326a = new HashSet();
        }
        this.f16329d.f16326a.add(this);
        if (i4 > 0) {
            this.f16330e = i4;
        } else {
            this.f16330e = 0;
        }
        this.f16331f = i8;
        return true;
    }

    public final int c() {
        c cVar;
        if (this.f16327b.f16353V == 8) {
            return 0;
        }
        int i4 = this.f16331f;
        if (i4 > -1 && (cVar = this.f16329d) != null && cVar.f16327b.f16353V == 8) {
            return i4;
        }
        return this.f16330e;
    }

    public final c d() {
        int i4 = this.f16328c;
        int b4 = AbstractC1769h.b(i4);
        d dVar = this.f16327b;
        switch (b4) {
            case 0:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return null;
            case 1:
                return dVar.f16383z;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return dVar.f16333A;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return dVar.f16381x;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return dVar.f16382y;
            default:
                throw new AssertionError(AbstractC1149a.o(i4));
        }
    }

    public final boolean e() {
        HashSet hashSet = this.f16326a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).d().f()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        if (this.f16329d != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0024. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(c cVar) {
        boolean z8;
        boolean z9;
        if (cVar != null) {
            d dVar = cVar.f16327b;
            int i4 = cVar.f16328c;
            int i8 = this.f16328c;
            if (i4 == i8) {
                if (i8 != 6 || (dVar.f16380w && this.f16327b.f16380w)) {
                    return true;
                }
            } else {
                switch (AbstractC1769h.b(i8)) {
                    case 0:
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                        break;
                    case 1:
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        if (i4 != 2 && i4 != 4) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (dVar instanceof h) {
                            if (z8 || i4 == 8) {
                            }
                        } else {
                            return z8;
                        }
                        break;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        if (i4 != 3 && i4 != 5) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (dVar instanceof h) {
                            if (z9 || i4 == 9) {
                            }
                        } else {
                            return z9;
                        }
                        break;
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (i4 == 6 || i4 == 8 || i4 == 9) {
                        }
                        break;
                    default:
                        throw new AssertionError(AbstractC1149a.o(i8));
                }
            }
        }
        return false;
    }

    public final void h() {
        HashSet hashSet;
        c cVar = this.f16329d;
        if (cVar != null && (hashSet = cVar.f16326a) != null) {
            hashSet.remove(this);
        }
        this.f16329d = null;
        this.f16330e = 0;
        this.f16331f = -1;
    }

    public final void i() {
        C1770i c1770i = this.f16332g;
        if (c1770i == null) {
            this.f16332g = new C1770i(1);
        } else {
            c1770i.c();
        }
    }

    public final String toString() {
        return this.f16327b.f16354W + ":" + AbstractC1149a.o(this.f16328c);
    }
}
