package L7;

import d6.InterfaceC0622h;
import java.util.concurrent.locks.LockSupport;

/* renamed from: L7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0145c extends AbstractC0143a {

    /* renamed from: g, reason: collision with root package name */
    public final Thread f3203g;

    /* renamed from: h, reason: collision with root package name */
    public final P f3204h;

    public C0145c(InterfaceC0622h interfaceC0622h, Thread thread, P p8) {
        super(interfaceC0622h, true);
        this.f3203g = thread;
        this.f3204h = p8;
    }

    @Override // L7.d0
    public final void q(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f3203g;
        if (!o6.j.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
