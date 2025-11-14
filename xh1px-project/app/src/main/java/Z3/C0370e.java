package Z3;

import L7.InterfaceC0163v;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.U;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: Z3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370e extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f7371h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0372g f7372i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0370e(C0372g c0372g, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f7372i = c0372g;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0370e) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0370e(this.f7372i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f7371h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C0372g c0372g = this.f7372i;
            C0369d c0369d = new C0369d(c0372g, null);
            this.f7371h = 1;
            Object h8 = U.h(c0372g, EnumC0504o.f8849g, c0369d, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (h8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
