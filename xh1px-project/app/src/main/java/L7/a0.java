package L7;

import d6.InterfaceC0617c;

/* loaded from: classes.dex */
public final class a0 extends C0150h {

    /* renamed from: l, reason: collision with root package name */
    public final C0156n f3199l;

    public a0(C0156n c0156n, InterfaceC0617c interfaceC0617c) {
        super(1, interfaceC0617c);
        this.f3199l = c0156n;
    }

    @Override // L7.C0150h
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // L7.C0150h
    public final Throwable t(d0 d0Var) {
        Throwable c6;
        C0156n c0156n = this.f3199l;
        c0156n.getClass();
        Object obj = d0.f3210d.get(c0156n);
        if ((obj instanceof c0) && (c6 = ((c0) obj).c()) != null) {
            return c6;
        }
        if (obj instanceof C0158p) {
            return ((C0158p) obj).f3235a;
        }
        return d0Var.z();
    }
}
