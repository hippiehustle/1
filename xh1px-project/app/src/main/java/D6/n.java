package D6;

import f7.C0723c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import w7.C1757t;

/* loaded from: classes.dex */
public final class n implements j {

    /* renamed from: d, reason: collision with root package name */
    public final j f1051d;

    /* renamed from: e, reason: collision with root package name */
    public final C1757t f1052e;

    public n(j jVar, C1757t c1757t) {
        this.f1051d = jVar;
        this.f1052e = c1757t;
    }

    @Override // D6.j
    public final boolean a(C0723c c0723c) {
        o6.j.e(c0723c, "fqName");
        if (((Boolean) this.f1052e.m(c0723c)).booleanValue()) {
            return this.f1051d.a(c0723c);
        }
        return false;
    }

    @Override // D6.j
    public final c e(C0723c c0723c) {
        o6.j.e(c0723c, "fqName");
        if (((Boolean) this.f1052e.m(c0723c)).booleanValue()) {
            return this.f1051d.e(c0723c);
        }
        return null;
    }

    @Override // D6.j
    public final boolean isEmpty() {
        j jVar = this.f1051d;
        if ((jVar instanceof Collection) && ((Collection) jVar).isEmpty()) {
            return false;
        }
        Iterator it = jVar.iterator();
        while (it.hasNext()) {
            C0723c a3 = ((c) it.next()).a();
            if (a3 != null && ((Boolean) this.f1052e.m(a3)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f1051d) {
            C0723c a3 = ((c) obj).a();
            if (a3 != null && ((Boolean) this.f1052e.m(a3)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }
}
