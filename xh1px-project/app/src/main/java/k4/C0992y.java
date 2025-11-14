package k4;

import L3.C0106h;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: k4.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0992y extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f12131h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ H f12132i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0992y(H h8, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12132i = h8;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0992y) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0992y(this.f12132i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f12131h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            H h8 = this.f12132i;
            P p8 = h8.J().f12070h;
            F3.d dVar = h8.f12022w;
            if (dVar != null) {
                C0106h c0106h = new C0106h((A.i) dVar.f1326h, 26);
                this.f12131h = 1;
                Object x8 = p8.x(c0106h, this);
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
