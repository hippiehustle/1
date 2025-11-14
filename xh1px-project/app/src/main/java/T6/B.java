package T6;

import C6.InterfaceC0004e;
import a6.AbstractC0436k;
import java.util.Collection;

/* loaded from: classes.dex */
public final class B implements F7.a {

    /* renamed from: d, reason: collision with root package name */
    public static final B f5802d = new Object();

    @Override // F7.a
    public final Iterable b(Object obj) {
        int i4 = D.f5806p;
        Collection d2 = ((InterfaceC0004e) obj).B().d();
        o6.j.d(d2, "getSupertypes(...)");
        return new H7.q(0, H7.m.X(AbstractC0436k.k0(d2), m.f5864i));
    }
}
