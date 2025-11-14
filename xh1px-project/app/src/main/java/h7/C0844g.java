package h7;

import n6.InterfaceC1163b;
import w7.AbstractC1759v;
import w7.M;
import w7.X;

/* renamed from: h7.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0844g implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11444d;

    /* renamed from: e, reason: collision with root package name */
    public final C0845h f11445e;

    public /* synthetic */ C0844g(C0845h c0845h, int i4) {
        this.f11444d = i4;
        this.f11445e = c0845h;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f11444d) {
            case 0:
                M m6 = (M) obj;
                o6.j.e(m6, "it");
                if (m6.c()) {
                    return "*";
                }
                AbstractC1759v b4 = m6.b();
                o6.j.d(b4, "getType(...)");
                String V6 = this.f11445e.V(b4);
                if (m6.a() == X.INVARIANT) {
                    return V6;
                }
                return m6.a() + ' ' + V6;
            default:
                AbstractC1759v abstractC1759v = (AbstractC1759v) obj;
                o6.j.b(abstractC1759v);
                return this.f11445e.V(abstractC1759v);
        }
    }
}
