package L7;

import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class I extends Z {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3177h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f3178i;

    public /* synthetic */ I(int i4, Object obj) {
        this.f3177h = i4;
        this.f3178i = obj;
    }

    @Override // L7.Z
    public final boolean k() {
        switch (this.f3177h) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override // L7.Z
    public final void l(Throwable th) {
        switch (this.f3177h) {
            case 0:
                ((H) this.f3178i).b();
                return;
            case 1:
                ((InterfaceC1163b) this.f3178i).m(th);
                return;
            default:
                a0 a0Var = (a0) this.f3178i;
                Object obj = d0.f3210d.get(j());
                if (obj instanceof C0158p) {
                    a0Var.k(Z5.a.b(((C0158p) obj).f3235a));
                    return;
                } else {
                    a0Var.k(AbstractC0166y.y(obj));
                    return;
                }
        }
    }
}
