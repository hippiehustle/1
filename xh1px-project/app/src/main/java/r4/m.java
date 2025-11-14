package r4;

import L7.InterfaceC0163v;
import O7.i0;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class m extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f14403h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f14404i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, String str, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14404i = nVar;
        this.j = str;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((m) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new m(this.f14404i, this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f14403h;
        y yVar = y.f7506a;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return yVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        i0 i0Var = this.f14404i.f14407d;
        this.f14403h = 1;
        i0Var.n(this.j, this);
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (yVar == enumC0646a) {
            return enumC0646a;
        }
        return yVar;
    }
}
