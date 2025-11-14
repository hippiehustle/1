package X3;

import L3.C0106h;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class j extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f6897h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f6898i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f6898i = pVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((j) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new j(this.f6898i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f6897h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            p pVar = this.f6898i;
            w wVar = pVar.J().f6878i;
            A4.d dVar = pVar.f6911w;
            if (dVar != null) {
                C0106h c0106h = new C0106h((A.i) dVar.f298h, 17);
                this.f6897h = 1;
                Object x8 = wVar.x(c0106h, this);
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
