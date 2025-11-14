package F6;

import f7.C0723c;
import f7.C0725e;
import i.AbstractC0862a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import n6.InterfaceC1163b;
import p7.AbstractC1334p;
import p7.C1321c;
import p7.C1324f;

/* loaded from: classes.dex */
public final class O extends AbstractC1334p {

    /* renamed from: b, reason: collision with root package name */
    public final C6.A f1504b;

    /* renamed from: c, reason: collision with root package name */
    public final C0723c f1505c;

    public O(C6.A a3, C0723c c0723c) {
        o6.j.e(a3, "moduleDescriptor");
        o6.j.e(c0723c, "fqName");
        this.f1504b = a3;
        this.f1505c = c0723c;
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1335q
    public final Collection a(C1324f c1324f, InterfaceC1163b interfaceC1163b) {
        o6.j.e(c1324f, "kindFilter");
        if (c1324f.a(C1324f.f13814h)) {
            C0723c c0723c = this.f1505c;
            if (!c0723c.f10797a.c() || !c1324f.f13824a.contains(C1321c.f13806a)) {
                C6.A a3 = this.f1504b;
                Collection n3 = a3.n(c0723c, interfaceC1163b);
                ArrayList arrayList = new ArrayList(n3.size());
                Iterator it = n3.iterator();
                while (it.hasNext()) {
                    C0725e f8 = ((C0723c) it.next()).f10797a.f();
                    if (((Boolean) interfaceC1163b.m(f8)).booleanValue()) {
                        y yVar = null;
                        if (!f8.f10805e) {
                            y yVar2 = (y) a3.U(c0723c.a(f8));
                            if (!((Boolean) AbstractC0862a.j(yVar2.j, y.f1608l[1])).booleanValue()) {
                                yVar = yVar2;
                            }
                        }
                        F7.l.a(arrayList, yVar);
                    }
                }
                return arrayList;
            }
        }
        return a6.s.f7766d;
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public final Set e() {
        return a6.u.f7768d;
    }

    public final String toString() {
        return "subpackages of " + this.f1505c + " from " + this.f1504b;
    }
}
