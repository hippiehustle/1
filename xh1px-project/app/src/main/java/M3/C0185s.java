package M3;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: M3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185s extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f3463h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0190x f3464i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0185s(C0190x c0190x, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f3464i = c0190x;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0185s) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0185s(this.f3464i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f3463h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C0190x c0190x = this.f3464i;
            A4.c cVar = c0190x.G().f3359f;
            r rVar = new r(c0190x, 0);
            this.f3463h = 1;
            Object x8 = cVar.x(rVar, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
