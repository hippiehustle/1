package m4;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: m4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1090d extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f12503h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i f12504i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1090d(i iVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12504i = iVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1090d) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1090d(this.f12504i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f12503h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            i iVar = this.f12504i;
            W0.d dVar = iVar.G().f12520d;
            C1089c c1089c = new C1089c(iVar, 0);
            this.f12503h = 1;
            Object x8 = dVar.x(c1089c, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
