package P7;

import L7.InterfaceC0163v;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class j extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4653h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f4654i;
    public final /* synthetic */ InterfaceC0234g j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, InterfaceC0234g interfaceC0234g, Object obj, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f4654i = nVar;
        this.j = interfaceC0234g;
        this.k = obj;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((j) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new j(this.f4654i, this.j, this.k, interfaceC0617c);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [f6.j, n6.d] */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f4653h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            ?? r32 = this.f4654i.f4665h;
            this.f4653h = 1;
            Object j = r32.j(this.j, this.k, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (j == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
