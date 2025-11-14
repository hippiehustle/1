package O3;

import L7.InterfaceC0163v;
import androidx.lifecycle.EnumC0504o;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class D extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f3864h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ F f3865i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(F f8, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f3865i = f8;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((D) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new D(this.f3865i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f3864h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            F f8 = this.f3865i;
            C c6 = new C(f8, null);
            this.f3864h = 1;
            Object h8 = androidx.lifecycle.U.h(f8, EnumC0504o.f8849g, c6, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (h8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
