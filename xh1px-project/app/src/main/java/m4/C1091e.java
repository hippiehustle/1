package m4;

import L7.InterfaceC0163v;
import M3.W;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: m4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1091e extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f12505h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f12506i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1091e(i iVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12506i = iVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1091e) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1091e(this.f12506i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f12505h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            i iVar = this.f12506i;
            W w8 = iVar.G().f12519c;
            C1089c c1089c = new C1089c(iVar, 1);
            this.f12505h = 1;
            Object x8 = w8.x(c1089c, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
