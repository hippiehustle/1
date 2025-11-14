package w6;

import h7.AbstractC0842e;
import i7.AbstractC0898m;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class k0 implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15868d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f15869e;

    public /* synthetic */ k0(l0 l0Var, int i4) {
        this.f15868d = i4;
        this.f15869e = l0Var;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f15868d) {
            case 0:
                l0 l0Var = this.f15869e;
                F6.M i4 = l0Var.v().o().i();
                if (i4 == null) {
                    return AbstractC0898m.g(l0Var.v().o(), D6.i.f1043a);
                }
                return i4;
            default:
                return AbstractC0842e.a(this.f15869e, false);
        }
    }
}
