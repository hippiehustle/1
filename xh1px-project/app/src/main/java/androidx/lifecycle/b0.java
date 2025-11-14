package androidx.lifecycle;

import k0.AbstractC0948c;
import u6.InterfaceC1642c;

/* loaded from: classes.dex */
public interface b0 {
    default Z a(Class cls, AbstractC0948c abstractC0948c) {
        o6.j.e(cls, "modelClass");
        o6.j.e(abstractC0948c, "extras");
        return b(cls);
    }

    default Z b(Class cls) {
        o6.j.e(cls, "modelClass");
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default Z c(InterfaceC1642c interfaceC1642c, AbstractC0948c abstractC0948c) {
        o6.j.e(interfaceC1642c, "modelClass");
        o6.j.e(abstractC0948c, "extras");
        return a(h2.a.k(interfaceC1642c), abstractC0948c);
    }
}
