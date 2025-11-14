package b8;

import I7.u;
import Z5.w;

/* loaded from: classes.dex */
public final class h extends E2.c {

    /* renamed from: f, reason: collision with root package name */
    public final S6.e f9262f;

    /* renamed from: g, reason: collision with root package name */
    public final G5.e f9263g;

    public h(S6.e eVar, a8.b bVar) {
        o6.j.e(bVar, "json");
        this.f9262f = eVar;
        this.f9263g = bVar.f8281b;
    }

    @Override // E2.c, Y7.b
    public final long a() {
        S6.e eVar = this.f9262f;
        String m6 = eVar.m();
        try {
            o6.j.e(m6, "<this>");
            Z5.t Q5 = E2.b.Q(m6);
            if (Q5 != null) {
                return Q5.f7501d;
            }
            u.T(m6);
            throw null;
        } catch (IllegalArgumentException unused) {
            S6.e.q(eVar, "Failed to parse type 'ULong' for input '" + m6 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // Y7.a
    public final int n(X7.f fVar) {
        o6.j.e(fVar, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // E2.c, Y7.b
    public final int t() {
        S6.e eVar = this.f9262f;
        String m6 = eVar.m();
        try {
            o6.j.e(m6, "<this>");
            Z5.r P4 = E2.b.P(m6);
            if (P4 != null) {
                return P4.f7499d;
            }
            u.T(m6);
            throw null;
        } catch (IllegalArgumentException unused) {
            S6.e.q(eVar, "Failed to parse type 'UInt' for input '" + m6 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // Y7.a
    public final G5.e v() {
        return this.f9263g;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    @Override // E2.c, Y7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte x() {
        Z5.p pVar;
        S6.e eVar = this.f9262f;
        String m6 = eVar.m();
        try {
            o6.j.e(m6, "<this>");
            Z5.r P4 = E2.b.P(m6);
            if (P4 != null) {
                int i4 = P4.f7499d;
                if (Integer.compare(Integer.MIN_VALUE ^ i4, -2147483393) <= 0) {
                    pVar = new Z5.p((byte) i4);
                    if (pVar == null) {
                        return pVar.f7497d;
                    }
                    u.T(m6);
                    throw null;
                }
            }
            pVar = null;
            if (pVar == null) {
            }
        } catch (IllegalArgumentException unused) {
            S6.e.q(eVar, "Failed to parse type 'UByte' for input '" + m6 + '\'', 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    @Override // E2.c, Y7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final short z() {
        w wVar;
        S6.e eVar = this.f9262f;
        String m6 = eVar.m();
        try {
            o6.j.e(m6, "<this>");
            Z5.r P4 = E2.b.P(m6);
            if (P4 != null) {
                int i4 = P4.f7499d;
                if (Integer.compare(Integer.MIN_VALUE ^ i4, -2147418113) <= 0) {
                    wVar = new w((short) i4);
                    if (wVar == null) {
                        return wVar.f7504d;
                    }
                    u.T(m6);
                    throw null;
                }
            }
            wVar = null;
            if (wVar == null) {
            }
        } catch (IllegalArgumentException unused) {
            S6.e.q(eVar, "Failed to parse type 'UShort' for input '" + m6 + '\'', 0, null, 6);
            throw null;
        }
    }
}
