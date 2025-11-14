package S4;

import D4.t;
import L7.InterfaceC0163v;
import P7.n;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class d extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f5367h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f5368i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f5368i = hVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((d) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new d(this.f5368i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f5367h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            h hVar = this.f5368i;
            n nVar = ((k) hVar.f5379t.getValue()).f5391e;
            t tVar = new t(12, hVar);
            this.f5367h = 1;
            Object x8 = nVar.x(tVar, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
