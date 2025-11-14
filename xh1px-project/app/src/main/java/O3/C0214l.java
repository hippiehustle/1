package O3;

import D4.C0040p;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: O3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0214l extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f3981h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0219q f3982i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0214l(C0219q c0219q, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f3982i = c0219q;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0214l) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0214l(this.f3982i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f3981h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C0219q c0219q = this.f3982i;
            C0040p c0040p = c0219q.t().f3938r;
            C0224w c0224w = c0219q.f3991n;
            if (c0224w != null) {
                D4.t tVar = new D4.t(7, c0224w);
                this.f3981h = 1;
                Object x8 = c0040p.x(tVar, this);
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (x8 == enumC0646a) {
                    return enumC0646a;
                }
            } else {
                o6.j.i("extrasAdapter");
                throw null;
            }
        }
        return Z5.y.f7506a;
    }
}
