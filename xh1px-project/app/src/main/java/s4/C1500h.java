package s4;

import L7.InterfaceC0163v;
import Z5.y;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.U;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: s4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1500h extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f14538h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1502j f14539i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1500h(C1502j c1502j, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14539i = c1502j;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1500h) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1500h(this.f14539i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f14538h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C1502j c1502j = this.f14539i;
            C1499g c1499g = new C1499g(c1502j, null);
            this.f14538h = 1;
            Object h8 = U.h(c1502j, EnumC0504o.f8849g, c1499g, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (h8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
