package Z3;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: Z3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0368c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f7367h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0372g f7368i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0368c(C0372g c0372g, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f7368i = c0372g;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0368c) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0368c(this.f7368i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f7367h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C0372g c0372g = this.f7368i;
            A4.c cVar = ((C0376k) c0372g.f7376v.getValue()).f7387d;
            D4.t tVar = new D4.t(13, c0372g);
            this.f7367h = 1;
            Object x8 = cVar.x(tVar, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
