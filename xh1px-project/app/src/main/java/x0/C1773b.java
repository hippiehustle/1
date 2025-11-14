package x0;

import f6.AbstractC0713c;
import n6.InterfaceC1164c;
import t2.C1562a;
import w0.InterfaceC1684b;

/* renamed from: x0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1773b implements InterfaceC1684b {

    /* renamed from: d, reason: collision with root package name */
    public final C1562a f16080d;

    public C1773b(C1562a c1562a) {
        this.f16080d = c1562a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ((E0.b) this.f16080d.f15048d).close();
    }

    @Override // w0.InterfaceC1684b
    public final Object s(boolean z8, InterfaceC1164c interfaceC1164c, AbstractC0713c abstractC0713c) {
        E0.b bVar = (E0.b) this.f16080d.f15048d;
        bVar.getClass();
        return interfaceC1164c.l(new C1775d(new C1772a(bVar.J())), abstractC0713c);
    }
}
