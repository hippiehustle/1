package O3;

import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class j0 implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0 f3976e;

    public /* synthetic */ j0(k0 k0Var, int i4) {
        this.f3975d = i4;
        this.f3976e = k0Var;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f3975d) {
            case 0:
                return this.f3976e.i().n();
            default:
                return new D4.y(this.f3976e.i().m(), 13);
        }
    }
}
