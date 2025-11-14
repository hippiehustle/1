package u0;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: u0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1597B extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f15149h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1609N f15150i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1597B(C1609N c1609n, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f15150i = c1609n;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1597B) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1597B(this.f15150i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f15149h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            this.f15149h = 1;
            Object f8 = this.f15150i.f(this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (f8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
