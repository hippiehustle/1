package M3;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: M3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174g extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f3438h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0183p f3439i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0174g(C0183p c0183p, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f3439i = c0183p;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0174g) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0174g(this.f3439i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f3438h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C0183p c0183p = this.f3439i;
            C4.e eVar = c0183p.J().f3421h;
            C0170c c0170c = new C0170c(c0183p, 1);
            this.f3438h = 1;
            Object x8 = eVar.x(c0170c, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
