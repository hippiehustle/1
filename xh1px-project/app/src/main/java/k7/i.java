package k7;

import C6.A;
import C6.AbstractC0021w;
import C6.EnumC0005f;
import C6.InterfaceC0004e;
import f7.C0722b;
import f7.C0725e;
import i7.AbstractC0890e;
import w7.AbstractC1759v;
import w7.z;

/* loaded from: classes.dex */
public final class i extends g {

    /* renamed from: b, reason: collision with root package name */
    public final C0722b f12145b;

    /* renamed from: c, reason: collision with root package name */
    public final C0725e f12146c;

    public i(C0722b c0722b, C0725e c0725e) {
        super(new Z5.j(c0722b, c0725e));
        this.f12145b = c0722b;
        this.f12146c = c0725e;
    }

    @Override // k7.g
    public final AbstractC1759v a(A a3) {
        z l6;
        o6.j.e(a3, "module");
        C0722b c0722b = this.f12145b;
        InterfaceC0004e d2 = AbstractC0021w.d(a3, c0722b);
        if (d2 != null) {
            int i4 = AbstractC0890e.f11774a;
            if (!AbstractC0890e.m(d2, EnumC0005f.f743f)) {
                d2 = null;
            }
            if (d2 != null && (l6 = d2.l()) != null) {
                return l6;
            }
        }
        return y7.l.c(y7.k.ERROR_ENUM_TYPE, c0722b.toString(), this.f12146c.f10804d);
    }

    @Override // k7.g
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12145b.f());
        sb.append('.');
        sb.append(this.f12146c);
        return sb.toString();
    }
}
