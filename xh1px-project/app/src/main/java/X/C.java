package X;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class C extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f6641h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC0720j f6642i;
    public final /* synthetic */ C0334b j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C(InterfaceC1164c interfaceC1164c, C0334b c0334b, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f6642i = (AbstractC0720j) interfaceC1164c;
        this.j = c0334b;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C(this.f6642i, this.j, interfaceC0617c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f6641h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        Object obj2 = this.j.f6711b;
        this.f6641h = 1;
        Object l6 = this.f6642i.l(obj2, this);
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (l6 == enumC0646a) {
            return enumC0646a;
        }
        return l6;
    }
}
