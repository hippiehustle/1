package w0;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class h extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f15588h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1164c f15589i;
    public final /* synthetic */ o6.u j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InterfaceC1164c interfaceC1164c, o6.u uVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f15589i = interfaceC1164c;
        this.j = uVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((h) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new h(this.f15589i, this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f15588h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        Object obj2 = this.j.f13642d;
        this.f15588h = 1;
        Object l6 = this.f15589i.l(obj2, this);
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (l6 == enumC0646a) {
            return enumC0646a;
        }
        return l6;
    }
}
