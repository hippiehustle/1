package B7;

import j7.InterfaceC0943b;
import o6.j;
import w7.E;
import w7.J;
import w7.K;
import w7.M;
import w7.X;

/* loaded from: classes.dex */
public final class c extends K {
    @Override // w7.K
    public final M g(J j) {
        InterfaceC0943b interfaceC0943b;
        j.e(j, "key");
        if (j instanceof InterfaceC0943b) {
            interfaceC0943b = (InterfaceC0943b) j;
        } else {
            interfaceC0943b = null;
        }
        if (interfaceC0943b == null) {
            return null;
        }
        if (interfaceC0943b.b().c()) {
            return new E(interfaceC0943b.b().b(), X.OUT_VARIANCE);
        }
        return interfaceC0943b.b();
    }
}
