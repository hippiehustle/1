package o4;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: o4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1277n extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f13583h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f13584i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1277n(t tVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f13584i = tVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1277n) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1277n(this.f13584i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f13583h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            t tVar = this.f13584i;
            C4.e eVar = tVar.J().f13551o;
            C1267d c1267d = new C1267d(tVar, 2);
            this.f13583h = 1;
            Object x8 = eVar.x(c1267d, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
