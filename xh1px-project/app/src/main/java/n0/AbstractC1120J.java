package n0;

import P.C0267o;
import a6.AbstractC0436k;
import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;

/* renamed from: n0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1120J {

    /* renamed from: a, reason: collision with root package name */
    public C1134l f12738a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12739b;

    public abstract AbstractC1143u a();

    public final C1134l b() {
        C1134l c1134l = this.f12738a;
        if (c1134l != null) {
            return c1134l;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void d(List list, C1148z c1148z) {
        H7.f fVar = new H7.f(new H7.g(H7.m.W(AbstractC0436k.k0(list), new M7.c(this, 14, c1148z)), false, new H7.o(2)));
        while (fVar.hasNext()) {
            b().g((C1131i) fVar.next());
        }
    }

    public void e(C1134l c1134l) {
        this.f12738a = c1134l;
        this.f12739b = true;
    }

    public void f(C1131i c1131i) {
        AbstractC1143u abstractC1143u = c1131i.f12759e;
        if (abstractC1143u == null) {
            abstractC1143u = null;
        }
        if (abstractC1143u == null) {
            return;
        }
        C1111A c1111a = new C1111A();
        c1111a.f12714b = true;
        boolean z8 = c1111a.f12714b;
        boolean z9 = c1111a.f12715c;
        int i4 = c1111a.f12716d;
        boolean z10 = c1111a.f12717e;
        C0267o c0267o = c1111a.f12713a;
        c(abstractC1143u, null, new C1148z(z8, z9, i4, false, z10, c0267o.f4298a, c0267o.f4299b, -1, -1));
        b().d(c1131i);
    }

    public Bundle h() {
        return null;
    }

    public void i(C1131i c1131i, boolean z8) {
        List list = (List) b().f12771e.f4088d.f();
        if (list.contains(c1131i)) {
            ListIterator listIterator = list.listIterator(list.size());
            C1131i c1131i2 = null;
            while (j()) {
                c1131i2 = (C1131i) listIterator.previous();
                if (o6.j.a(c1131i2, c1131i)) {
                    break;
                }
            }
            if (c1131i2 != null) {
                b().e(c1131i2, z8);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + c1131i + " which does not exist in back stack " + list).toString());
    }

    public boolean j() {
        return true;
    }

    public void g(Bundle bundle) {
    }

    public AbstractC1143u c(AbstractC1143u abstractC1143u, Bundle bundle, C1148z c1148z) {
        return abstractC1143u;
    }
}
