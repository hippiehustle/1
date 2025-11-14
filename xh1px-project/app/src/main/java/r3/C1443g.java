package r3;

import L3.C0109k;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: r3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1443g extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f14326h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1450n f14327i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1443g(C1450n c1450n, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14327i = c1450n;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1443g) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1443g(this.f14327i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f14326h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C1450n c1450n = this.f14327i;
            C4.e eVar = c1450n.t().f14376i;
            A4.d dVar = c1450n.f14341m;
            if (dVar != null) {
                C0109k c0109k = new C0109k((A4.a) dVar.f297g, 21);
                this.f14326h = 1;
                Object x8 = eVar.x(c0109k, this);
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (x8 == enumC0646a) {
                    return enumC0646a;
                }
            } else {
                o6.j.i("viewBinding");
                throw null;
            }
        }
        return y.f7506a;
    }
}
