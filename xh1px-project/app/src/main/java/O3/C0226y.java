package O3;

import L7.InterfaceC0163v;
import O7.InterfaceC0233f;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: O3.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226y extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4004h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ F f4005i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0226y(F f8, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f4005i = f8;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0226y) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0226y(this.f4005i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f4004h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            F f8 = this.f4005i;
            InterfaceC0233f interfaceC0233f = f8.R().f3928f;
            C0225x c0225x = new C0225x(f8, 0);
            this.f4004h = 1;
            Object x8 = interfaceC0233f.x(c0225x, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
