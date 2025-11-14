package o3;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: o3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1244o extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1233d f13473h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1244o(C1233d c1233d, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f13473h = c1233d;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1244o c1244o = (C1244o) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c1244o.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1244o(this.f13473h, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        this.f13473h.a();
        return y.f7506a;
    }
}
