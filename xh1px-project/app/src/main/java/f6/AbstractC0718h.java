package f6;

import d6.C0623i;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;

/* renamed from: f6.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0718h extends AbstractC0711a {
    public AbstractC0718h(InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        if (interfaceC0617c != null && interfaceC0617c.h() != C0623i.f10448d) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // d6.InterfaceC0617c
    public final InterfaceC0622h h() {
        return C0623i.f10448d;
    }
}
