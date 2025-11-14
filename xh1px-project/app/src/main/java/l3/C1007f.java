package l3;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: l3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1007f extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f12207h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1013l f12208i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007f(C1013l c1013l, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12208i = c1013l;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1007f) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1007f(this.f12208i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f12207h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C1013l c1013l = this.f12208i;
            P7.n nVar = c1013l.G().f12249i;
            C1003b c1003b = new C1003b(c1013l, 1);
            this.f12207h = 1;
            Object x8 = nVar.x(c1003b, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
