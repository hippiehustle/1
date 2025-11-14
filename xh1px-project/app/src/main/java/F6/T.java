package F6;

import C6.InterfaceC0001b;
import f7.C0725e;
import n6.InterfaceC1162a;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public final class T extends U {

    /* renamed from: p, reason: collision with root package name */
    public final Z5.n f1511p;

    public T(InterfaceC0001b interfaceC0001b, U u8, int i4, D6.j jVar, C0725e c0725e, AbstractC1759v abstractC1759v, boolean z8, boolean z9, boolean z10, AbstractC1759v abstractC1759v2, C6.O o7, InterfaceC1162a interfaceC1162a) {
        super(interfaceC0001b, u8, i4, jVar, c0725e, abstractC1759v, z8, z9, z10, abstractC1759v2, o7);
        this.f1511p = new Z5.n(interfaceC1162a);
    }

    @Override // F6.U
    public final U M0(A6.f fVar, C0725e c0725e, int i4) {
        D6.j annotations = getAnnotations();
        o6.j.d(annotations, "<get-annotations>(...)");
        AbstractC1759v b4 = b();
        o6.j.d(b4, "getType(...)");
        return new T(fVar, null, i4, annotations, c0725e, b4, N0(), this.f1512l, this.f1513m, this.f1514n, C6.O.f726a, new B6.j(7, this));
    }
}
