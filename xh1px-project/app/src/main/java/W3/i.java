package W3;

import L3.C0109k;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class i extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f6521h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f6522i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f6522i = oVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((i) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new i(this.f6522i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f6521h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            o oVar = this.f6522i;
            C4.e eVar = oVar.J().f6569g;
            A4.d dVar = oVar.f6535w;
            if (dVar != null) {
                C0109k c0109k = new C0109k((A4.a) dVar.f297g, 7);
                this.f6521h = 1;
                Object x8 = eVar.x(c0109k, this);
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (x8 == enumC0646a) {
                    return enumC0646a;
                }
            } else {
                o6.j.i("viewBinding");
                throw null;
            }
        }
        return Z5.y.f7506a;
    }
}
