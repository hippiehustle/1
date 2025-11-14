package J3;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class x extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0077b f2476h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f2477i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C0077b c0077b, boolean z8, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f2476h = c0077b;
        this.f2477i = z8;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        x xVar = (x) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        Z5.y yVar = Z5.y.f7506a;
        xVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new x(this.f2476h, this.f2477i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        this.f2476h.m(Boolean.valueOf(this.f2477i));
        return Z5.y.f7506a;
    }
}
