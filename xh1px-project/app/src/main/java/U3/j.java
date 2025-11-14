package U3;

import L3.C0112n;
import L7.InterfaceC0163v;
import O7.i0;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class j extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f6113h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f6114i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f6114i = oVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((j) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new j(this.f6114i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f6113h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return Z5.y.f7506a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        o oVar = this.f6114i;
        i0 i0Var = oVar.J().j;
        F3.c cVar = oVar.f6125w;
        if (cVar != null) {
            C0112n c0112n = new C0112n(cVar.f1321i, 2);
            this.f6113h = 1;
            i0Var.x(c0112n, this);
            return EnumC0646a.f10656d;
        }
        o6.j.i("viewBinding");
        throw null;
    }
}
