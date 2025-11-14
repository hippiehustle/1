package f6;

import L7.C0150h;
import d6.C0618d;
import d6.InterfaceC0617c;
import d6.InterfaceC0620f;
import d6.InterfaceC0622h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: f6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0713c extends AbstractC0711a {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0622h f10782e;

    /* renamed from: f, reason: collision with root package name */
    public transient InterfaceC0617c f10783f;

    public AbstractC0713c(InterfaceC0617c interfaceC0617c, InterfaceC0622h interfaceC0622h) {
        super(interfaceC0617c);
        this.f10782e = interfaceC0622h;
    }

    @Override // d6.InterfaceC0617c
    public InterfaceC0622h h() {
        InterfaceC0622h interfaceC0622h = this.f10782e;
        o6.j.b(interfaceC0622h);
        return interfaceC0622h;
    }

    @Override // f6.AbstractC0711a
    public void w() {
        C0150h c0150h;
        InterfaceC0617c interfaceC0617c = this.f10783f;
        if (interfaceC0617c != null && interfaceC0617c != this) {
            InterfaceC0620f B8 = h().B(C0618d.f10447d);
            o6.j.b(B8);
            Q7.f fVar = (Q7.f) interfaceC0617c;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Q7.f.k;
            do {
            } while (atomicReferenceFieldUpdater.get(fVar) == Q7.b.f4933c);
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            if (obj instanceof C0150h) {
                c0150h = (C0150h) obj;
            } else {
                c0150h = null;
            }
            if (c0150h != null) {
                c0150h.q();
            }
        }
        this.f10783f = C0712b.f10781d;
    }

    public AbstractC0713c(InterfaceC0617c interfaceC0617c) {
        this(interfaceC0617c, interfaceC0617c != null ? interfaceC0617c.h() : null);
    }
}
