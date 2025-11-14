package k4;

import L7.InterfaceC0163v;
import androidx.lifecycle.EnumC0504o;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: k4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0980l extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f12104h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0982n f12105i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0980l(C0982n c0982n, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12105i = c0982n;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0980l) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0980l(this.f12105i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f12104h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C0982n c0982n = this.f12105i;
            C0979k c0979k = new C0979k(c0982n, null);
            this.f12104h = 1;
            Object h8 = androidx.lifecycle.U.h(c0982n, EnumC0504o.f8849g, c0979k, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (h8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
