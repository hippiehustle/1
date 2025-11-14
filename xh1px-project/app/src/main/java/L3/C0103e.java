package L3;

import L7.InterfaceC0163v;
import O7.InterfaceC0233f;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: L3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103e extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f2848h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w f2849i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0103e(w wVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f2849i = wVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0103e) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0103e(this.f2849i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f2848h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            w wVar = this.f2849i;
            InterfaceC0233f interfaceC0233f = wVar.J().f2830g;
            C0102d c0102d = new C0102d(wVar, 0);
            this.f2848h = 1;
            Object x8 = interfaceC0233f.x(c0102d, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
