package k4;

import J3.C0079d;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: k4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0979k extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f12102h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0982n f12103i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0979k(C0982n c0982n, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12103i = c0982n;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0979k) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0979k(this.f12103i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f12102h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C0982n c0982n = this.f12103i;
            g0.L l6 = ((C0985q) c0982n.f12109J.getValue()).f12116b;
            C0079d c0079d = new C0079d(4, c0982n);
            this.f12102h = 1;
            Object x8 = l6.x(c0079d, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
