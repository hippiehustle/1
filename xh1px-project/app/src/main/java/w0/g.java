package w0;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class g extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f15586h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1164c f15587i;
    public final /* synthetic */ x j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC1164c interfaceC1164c, x xVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f15587i = interfaceC1164c;
        this.j = xVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((g) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new g(this.f15587i, this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f15586h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        this.f15586h = 1;
        Object l6 = this.f15587i.l(this.j, this);
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (l6 == enumC0646a) {
            return enumC0646a;
        }
        return l6;
    }
}
