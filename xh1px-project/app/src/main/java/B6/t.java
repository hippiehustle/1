package B6;

import C6.F;
import C6.I;
import C6.InterfaceC0011l;
import F6.C;
import f7.C0723c;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import n6.InterfaceC1163b;
import s7.C1518i;
import t7.C1591a;
import t7.C1593c;
import t7.C1594d;

/* loaded from: classes.dex */
public final class t implements I {

    /* renamed from: a, reason: collision with root package name */
    public final v7.k f514a;

    /* renamed from: b, reason: collision with root package name */
    public final C f515b;

    /* renamed from: c, reason: collision with root package name */
    public C1518i f516c;

    /* renamed from: d, reason: collision with root package name */
    public final U1.c f517d;

    public t(v7.k kVar, W0.c cVar, C c6) {
        this.f514a = kVar;
        this.f515b = c6;
        this.f517d = kVar.c(new n(21, this));
    }

    @Override // C6.I
    public final void a(C0723c c0723c, ArrayList arrayList) {
        o6.j.e(c0723c, "fqName");
        F7.l.a(arrayList, this.f517d.m(c0723c));
    }

    @Override // C6.I
    public final boolean b(C0723c c0723c) {
        InterfaceC0011l c6;
        o6.j.e(c0723c, "fqName");
        U1.c cVar = this.f517d;
        Object obj = ((ConcurrentHashMap) cVar.f6025e).get(c0723c);
        if (obj != null && obj != v7.j.f15556e) {
            c6 = (F) cVar.m(c0723c);
        } else {
            c6 = c(c0723c);
        }
        if (c6 == null) {
            return true;
        }
        return false;
    }

    public final C1593c c(C0723c c0723c) {
        InputStream m6;
        o6.j.e(c0723c, "fqName");
        if (!c0723c.c(z6.n.j)) {
            m6 = null;
        } else {
            C1591a.f15138m.getClass();
            m6 = C1594d.m(C1591a.a(c0723c));
        }
        if (m6 == null) {
            return null;
        }
        return h4.g.e(c0723c, this.f514a, this.f515b, m6);
    }

    @Override // C6.I
    public final Collection n(C0723c c0723c, InterfaceC1163b interfaceC1163b) {
        o6.j.e(c0723c, "fqName");
        return a6.u.f7768d;
    }
}
