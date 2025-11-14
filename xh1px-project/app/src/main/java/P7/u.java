package P7;

import L7.InterfaceC0163v;
import O7.C0242o;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class u extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4683h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4684i;
    public final /* synthetic */ C0242o j;
    public final /* synthetic */ InterfaceC0234g k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(C0242o c0242o, InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = c0242o;
        this.k = interfaceC0234g;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((u) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        u uVar = new u(this.j, this.k, interfaceC0617c);
        uVar.f4684i = obj;
        return uVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f4683h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f4684i;
            this.f4683h = 1;
            Object j = this.j.j(interfaceC0163v, this.k, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (j == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
