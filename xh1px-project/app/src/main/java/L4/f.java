package L4;

import F4.s;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class f extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f2910h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f2911i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i4, j jVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f2911i = jVar;
        this.j = i4;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((f) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new f(this.j, this.f2911i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f2910h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        s sVar = this.f2911i.f2921d;
        this.f2910h = 1;
        Object b4 = sVar.b(this.j, this);
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (b4 == enumC0646a) {
            return enumC0646a;
        }
        return b4;
    }
}
