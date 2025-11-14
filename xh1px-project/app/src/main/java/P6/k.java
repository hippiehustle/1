package P6;

import C6.InterfaceC0001b;
import C6.InterfaceC0004e;
import C6.M;
import i7.InterfaceC0891f;

/* loaded from: classes.dex */
public final class k implements InterfaceC0891f {
    @Override // i7.InterfaceC0891f
    public final int a() {
        return 3;
    }

    @Override // i7.InterfaceC0891f
    public final int b(InterfaceC0001b interfaceC0001b, InterfaceC0001b interfaceC0001b2, InterfaceC0004e interfaceC0004e) {
        o6.j.e(interfaceC0001b, "superDescriptor");
        o6.j.e(interfaceC0001b2, "subDescriptor");
        if ((interfaceC0001b2 instanceof M) && (interfaceC0001b instanceof M)) {
            M m6 = (M) interfaceC0001b2;
            M m8 = (M) interfaceC0001b;
            if (o6.j.a(m6.getName(), m8.getName())) {
                if (D2.f.w(m6) && D2.f.w(m8)) {
                    return 1;
                }
                if (D2.f.w(m6) || D2.f.w(m8)) {
                    return 2;
                }
                return 3;
            }
            return 3;
        }
        return 3;
    }
}
