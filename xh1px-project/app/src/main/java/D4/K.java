package D4;

import L7.InterfaceC0163v;
import O7.i0;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class K extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ P f919h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f920i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(P p8, int i4, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f919h = p8;
        this.f920i = i4;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        K k = (K) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        k.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new K(this.f919h, this.f920i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        i0 i0Var = this.f919h.f932d;
        Integer num = new Integer(this.f920i);
        i0Var.getClass();
        i0Var.h(null, num);
        return Z5.y.f7506a;
    }
}
