package j3;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: j3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0919e extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f11860h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0934t f11861i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0919e(C0934t c0934t, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f11861i = c0934t;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0919e) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0919e(this.f11861i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f11860h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C0934t c0934t = this.f11861i;
            C0939y c0939y = c0934t.G().f11851m;
            C0917c c0917c = new C0917c(c0934t, 1);
            this.f11860h = 1;
            Object x8 = c0939y.x(c0917c, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
