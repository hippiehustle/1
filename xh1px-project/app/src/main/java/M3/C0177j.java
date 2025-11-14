package M3;

import L3.C0106h;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;
import o.p1;

/* renamed from: M3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177j extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f3444h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0183p f3445i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0177j(C0183p c0183p, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f3445i = c0183p;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0177j) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0177j(this.f3445i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f3444h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C0183p c0183p = this.f3445i;
            Q q6 = c0183p.J().k;
            p1 p1Var = c0183p.f3458w;
            if (p1Var != null) {
                C0106h c0106h = new C0106h((A.i) p1Var.j, 3);
                this.f3444h = 1;
                Object x8 = q6.x(c0106h, this);
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
