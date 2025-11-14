package v4;

import L7.InterfaceC0163v;
import O7.i0;
import Z5.y;
import d5.C0611c;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: v4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1668c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f15520h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1674i f15521i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1668c(C1674i c1674i, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f15521i = c1674i;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1668c) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1668c(this.f15521i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f15520h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return y.f7506a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        C1674i c1674i = this.f15521i;
        i0 i0Var = c1674i.t().f15540e;
        A4.a aVar = c1674i.f15533m;
        if (aVar != null) {
            C0611c c0611c = new C0611c((A4.c) aVar.f281f, 5);
            this.f15520h = 1;
            i0Var.x(c0611c, this);
            return EnumC0646a.f10656d;
        }
        o6.j.i("viewBinding");
        throw null;
    }
}
