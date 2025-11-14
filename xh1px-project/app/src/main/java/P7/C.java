package P7;

import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import f6.InterfaceC0714d;

/* loaded from: classes.dex */
public final class C implements InterfaceC0617c, InterfaceC0714d {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0617c f4631d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0622h f4632e;

    public C(InterfaceC0617c interfaceC0617c, InterfaceC0622h interfaceC0622h) {
        this.f4631d = interfaceC0617c;
        this.f4632e = interfaceC0622h;
    }

    @Override // f6.InterfaceC0714d
    public final InterfaceC0714d g() {
        InterfaceC0617c interfaceC0617c = this.f4631d;
        if (interfaceC0617c instanceof InterfaceC0714d) {
            return (InterfaceC0714d) interfaceC0617c;
        }
        return null;
    }

    @Override // d6.InterfaceC0617c
    public final InterfaceC0622h h() {
        return this.f4632e;
    }

    @Override // d6.InterfaceC0617c
    public final void k(Object obj) {
        this.f4631d.k(obj);
    }
}
