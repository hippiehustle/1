package A0;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;
import u0.u;

/* loaded from: classes.dex */
public final class c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f193h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u f194i;
    public final /* synthetic */ n2.h j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(u uVar, n2.h hVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f194i = uVar;
        this.j = hVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((c) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new c(this.f194i, this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f193h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        u uVar = this.f194i;
        if (uVar.i()) {
            uVar.j();
        }
        b bVar = new b(false, uVar, null, this.j);
        this.f193h = 1;
        Object n3 = uVar.n(true, bVar, this);
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (n3 == enumC0646a) {
            return enumC0646a;
        }
        return n3;
    }
}
