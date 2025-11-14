package O3;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: O3.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227z extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4006h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ F f4007i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0227z(F f8, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f4007i = f8;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C0227z c0227z = (C0227z) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        c0227z.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0227z c0227z = new C0227z(this.f4007i, interfaceC0617c);
        c0227z.f4006h = obj;
        return c0227z;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f4006h;
        Z5.a.d(obj);
        AbstractC0166y.q(interfaceC0163v, null, null, new C0226y(this.f4007i, null), 3);
        return Z5.y.f7506a;
    }
}
