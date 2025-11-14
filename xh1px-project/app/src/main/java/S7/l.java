package S7;

import L7.AbstractC0160s;
import d6.InterfaceC0622h;

/* loaded from: classes.dex */
public final class l extends AbstractC0160s {

    /* renamed from: f, reason: collision with root package name */
    public static final l f5470f = new AbstractC0160s();

    @Override // L7.AbstractC0160s
    public final void N(InterfaceC0622h interfaceC0622h, Runnable runnable) {
        e.f5458g.f5460f.d(runnable, true, false);
    }

    @Override // L7.AbstractC0160s
    public final void O(InterfaceC0622h interfaceC0622h, Runnable runnable) {
        e.f5458g.f5460f.d(runnable, true, true);
    }

    @Override // L7.AbstractC0160s
    public final AbstractC0160s Q(int i4) {
        Q7.b.a(i4);
        if (i4 >= k.f5467d) {
            return this;
        }
        return super.Q(i4);
    }

    @Override // L7.AbstractC0160s
    public final String toString() {
        return "Dispatchers.IO";
    }
}
