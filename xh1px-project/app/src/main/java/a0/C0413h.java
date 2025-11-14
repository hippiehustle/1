package a0;

import Z5.y;
import a6.x;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: a0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0413h extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f7668h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7669i;
    public final /* synthetic */ AbstractC0720j j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0413h(InterfaceC1164c interfaceC1164c, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = (AbstractC0720j) interfaceC1164c;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0413h) p((InterfaceC0617c) obj2, (C0407b) obj)).v(y.f7506a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0413h c0413h = new C0413h(this.j, interfaceC0617c);
        c0413h.f7669i = obj;
        return c0413h;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [f6.j, n6.c] */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f7668h;
        if (i4 != 0) {
            if (i4 == 1) {
                C0407b c0407b = (C0407b) this.f7669i;
                Z5.a.d(obj);
                return c0407b;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        C0407b c0407b2 = new C0407b(x.T0(((C0407b) this.f7669i).a()), false);
        this.f7669i = c0407b2;
        this.f7668h = 1;
        Object l6 = this.j.l(c0407b2, this);
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (l6 == enumC0646a) {
            return enumC0646a;
        }
        return c0407b2;
    }
}
