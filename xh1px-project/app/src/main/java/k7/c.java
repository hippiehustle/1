package k7;

import C6.A;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12141b = 1;

    public /* synthetic */ c(Object obj) {
        super(obj);
    }

    @Override // k7.g
    public final AbstractC1759v a(A a3) {
        switch (this.f12141b) {
            case 0:
                o6.j.e(a3, "module");
                z6.h o7 = a3.o();
                o7.getClass();
                return o7.t(z6.j.f16722i);
            case 1:
                o6.j.e(a3, "module");
                z6.h o8 = a3.o();
                o8.getClass();
                return o8.t(z6.j.f16727p);
            default:
                o6.j.e(a3, "module");
                z6.h o9 = a3.o();
                o9.getClass();
                return o9.t(z6.j.f16725n);
        }
    }

    @Override // k7.g
    public String toString() {
        switch (this.f12141b) {
            case 1:
                return ((Number) this.f12144a).doubleValue() + ".toDouble()";
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return ((Number) this.f12144a).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public c(double d2) {
        super(Double.valueOf(d2));
    }

    public c(float f8) {
        super(Float.valueOf(f8));
    }
}
