package l3;

import L3.C0106h;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: l3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1005d extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f12203h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1013l f12204i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1005d(C1013l c1013l, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12204i = c1013l;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1005d) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1005d(this.f12204i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f12203h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C1013l c1013l = this.f12204i;
            C4.e eVar = c1013l.G().f12245e;
            F3.c cVar = c1013l.f12224z;
            if (cVar != null) {
                C0106h c0106h = new C0106h(cVar.f1318f, 27);
                this.f12203h = 1;
                Object x8 = eVar.x(c0106h, this);
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
