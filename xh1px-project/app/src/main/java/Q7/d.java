package Q7;

import L7.InterfaceC0163v;
import d6.InterfaceC0622h;

/* loaded from: classes.dex */
public final class d implements InterfaceC0163v {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0622h f4940d;

    public d(InterfaceC0622h interfaceC0622h) {
        this.f4940d = interfaceC0622h;
    }

    @Override // L7.InterfaceC0163v
    public final InterfaceC0622h p() {
        return this.f4940d;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f4940d + ')';
    }
}
