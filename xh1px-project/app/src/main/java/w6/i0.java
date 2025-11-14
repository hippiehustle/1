package w6;

import h7.AbstractC0842e;
import i7.AbstractC0898m;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class i0 implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15859d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f15860e;

    public /* synthetic */ i0(j0 j0Var, int i4) {
        this.f15859d = i4;
        this.f15860e = j0Var;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f15859d) {
            case 0:
                j0 j0Var = this.f15860e;
                F6.L c6 = j0Var.v().o().c();
                if (c6 == null) {
                    return AbstractC0898m.f(j0Var.v().o(), D6.i.f1043a);
                }
                return c6;
            default:
                return AbstractC0842e.a(this.f15860e, true);
        }
    }
}
