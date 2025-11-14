package O3;

import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0 f3948e;

    public /* synthetic */ c0(k0 k0Var, int i4) {
        this.f3947d = i4;
        this.f3948e = k0Var;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f3947d) {
            case 0:
                k0 k0Var = this.f3948e;
                k0Var.c(new c0(k0Var, 1));
                break;
            default:
                k0 k0Var2 = this.f3948e;
                k0Var2.i().o().d(k0Var2.h(), new P3.e(new b0(k0Var2, 1)), false);
                break;
        }
        return Z5.y.f7506a;
    }
}
