package O7;

import P7.AbstractC0284a;
import P7.AbstractC0285b;
import P7.AbstractC0286c;
import d6.InterfaceC0617c;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class j0 extends AbstractC0286c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f4153a = new AtomicReference(null);

    @Override // P7.AbstractC0286c
    public final boolean a(AbstractC0284a abstractC0284a) {
        AtomicReference atomicReference = this.f4153a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(V.f4105b);
        return true;
    }

    @Override // P7.AbstractC0286c
    public final InterfaceC0617c[] b(AbstractC0284a abstractC0284a) {
        this.f4153a.set(null);
        return AbstractC0285b.f4639a;
    }
}
