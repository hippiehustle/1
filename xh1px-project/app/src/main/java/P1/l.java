package P1;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class l extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4466h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f4467i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f4467i = oVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((l) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new l(this.f4467i, interfaceC0617c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f4466h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            N1.c cVar = this.f4467i.f4471a;
            ?? abstractC0720j = new AbstractC0720j(2, null);
            this.f4466h = 1;
            Object b4 = cVar.b(abstractC0720j, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (b4 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
