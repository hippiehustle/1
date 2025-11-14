package a5;

import Z5.y;
import a0.C0407b;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: a5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0422f extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7743h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ EnumC0424h f7744i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0422f(EnumC0424h enumC0424h, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f7744i = enumC0424h;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C0422f c0422f = (C0422f) p((InterfaceC0617c) obj2, (C0407b) obj);
        y yVar = y.f7506a;
        c0422f.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0422f c0422f = new C0422f(this.f7744i, interfaceC0617c);
        c0422f.f7743h = obj;
        return c0422f;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        C0407b c0407b = (C0407b) this.f7743h;
        Z5.a.d(obj);
        c0407b.d(C0423g.f7745b, this.f7744i.name());
        return y.f7506a;
    }
}
