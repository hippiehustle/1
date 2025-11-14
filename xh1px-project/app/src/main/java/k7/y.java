package k7;

import C6.A;
import C6.AbstractC0021w;
import C6.InterfaceC0004e;
import w7.AbstractC1759v;
import w7.z;

/* loaded from: classes.dex */
public final class y extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12154b = 0;

    public y(byte b4) {
        super(Byte.valueOf(b4));
    }

    @Override // k7.g
    public final AbstractC1759v a(A a3) {
        z l6;
        z l8;
        z l9;
        z l10;
        switch (this.f12154b) {
            case 0:
                o6.j.e(a3, "module");
                InterfaceC0004e d2 = AbstractC0021w.d(a3, z6.m.f16755S);
                if (d2 == null || (l6 = d2.l()) == null) {
                    return y7.l.c(y7.k.NOT_FOUND_UNSIGNED_TYPE, "UByte");
                }
                return l6;
            case 1:
                o6.j.e(a3, "module");
                InterfaceC0004e d3 = AbstractC0021w.d(a3, z6.m.f16757U);
                if (d3 == null || (l8 = d3.l()) == null) {
                    return y7.l.c(y7.k.NOT_FOUND_UNSIGNED_TYPE, "UInt");
                }
                return l8;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o6.j.e(a3, "module");
                InterfaceC0004e d9 = AbstractC0021w.d(a3, z6.m.f16758V);
                if (d9 == null || (l9 = d9.l()) == null) {
                    return y7.l.c(y7.k.NOT_FOUND_UNSIGNED_TYPE, "ULong");
                }
                return l9;
            default:
                o6.j.e(a3, "module");
                InterfaceC0004e d10 = AbstractC0021w.d(a3, z6.m.f16756T);
                if (d10 == null || (l10 = d10.l()) == null) {
                    return y7.l.c(y7.k.NOT_FOUND_UNSIGNED_TYPE, "UShort");
                }
                return l10;
        }
    }

    @Override // k7.g
    public final String toString() {
        switch (this.f12154b) {
            case 0:
                return ((Number) this.f12144a).intValue() + ".toUByte()";
            case 1:
                return ((Number) this.f12144a).intValue() + ".toUInt()";
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return ((Number) this.f12144a).longValue() + ".toULong()";
            default:
                return ((Number) this.f12144a).intValue() + ".toUShort()";
        }
    }

    public y(short s8) {
        super(Short.valueOf(s8));
    }

    public y(int i4) {
        super(Integer.valueOf(i4));
    }

    public y(long j) {
        super(Long.valueOf(j));
    }
}
