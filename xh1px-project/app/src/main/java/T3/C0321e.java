package T3;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: T3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321e extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f5718h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f5719i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0321e(o oVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f5719i = oVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C0321e c0321e = (C0321e) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        c0321e.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0321e c0321e = new C0321e(this.f5719i, interfaceC0617c);
        c0321e.f5718h = obj;
        return c0321e;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f5718h;
        Z5.a.d(obj);
        AbstractC0166y.q(interfaceC0163v, null, null, new C0320d(this.f5719i, null), 3);
        return Z5.y.f7506a;
    }
}
