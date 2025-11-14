package k3;

import D4.t;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: k3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0955b extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f11976h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0958e f11977i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0955b(C0958e c0958e, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f11977i = c0958e;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0955b) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0955b(this.f11977i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f11976h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C0958e c0958e = this.f11977i;
            A4.c cVar = ((C0964k) c0958e.f11984w.getValue()).f11997c;
            t tVar = new t(18, c0958e);
            this.f11976h = 1;
            Object x8 = cVar.x(tVar, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
