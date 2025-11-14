package C6;

import a6.AbstractC0436k;
import f7.C0723c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class H implements I {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f720a;

    public H(ArrayList arrayList) {
        this.f720a = arrayList;
    }

    @Override // C6.I
    public final void a(C0723c c0723c, ArrayList arrayList) {
        o6.j.e(c0723c, "fqName");
        Iterator it = this.f720a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (o6.j.a(((F6.E) ((F) next)).f1461i, c0723c)) {
                arrayList.add(next);
            }
        }
    }

    @Override // C6.I
    public final boolean b(C0723c c0723c) {
        o6.j.e(c0723c, "fqName");
        ArrayList arrayList = this.f720a;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (o6.j.a(((F6.E) ((F) it.next())).f1461i, c0723c)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override // C6.I
    public final Collection n(C0723c c0723c, InterfaceC1163b interfaceC1163b) {
        o6.j.e(c0723c, "fqName");
        return H7.m.Y(new H7.g(H7.m.W(AbstractC0436k.k0(this.f720a), r.f769f), true, new G(c0723c, 0)));
    }
}
