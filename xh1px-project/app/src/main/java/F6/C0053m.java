package F6;

import C6.AbstractC0021w;
import a6.AbstractC0436k;
import f7.C0723c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n6.InterfaceC1163b;

/* renamed from: F6.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053m implements C6.I {

    /* renamed from: a, reason: collision with root package name */
    public final List f1543a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1544b;

    public C0053m(String str, List list) {
        o6.j.e(str, "debugName");
        this.f1543a = list;
        this.f1544b = str;
        list.size();
        AbstractC0436k.V0(list).size();
    }

    @Override // C6.I
    public final void a(C0723c c0723c, ArrayList arrayList) {
        o6.j.e(c0723c, "fqName");
        Iterator it = this.f1543a.iterator();
        while (it.hasNext()) {
            AbstractC0021w.b((C6.I) it.next(), c0723c, arrayList);
        }
    }

    @Override // C6.I
    public final boolean b(C0723c c0723c) {
        o6.j.e(c0723c, "fqName");
        List list = this.f1543a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!AbstractC0021w.h((C6.I) it.next(), c0723c)) {
                return false;
            }
        }
        return true;
    }

    @Override // C6.I
    public final Collection n(C0723c c0723c, InterfaceC1163b interfaceC1163b) {
        o6.j.e(c0723c, "fqName");
        HashSet hashSet = new HashSet();
        Iterator it = this.f1543a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((C6.I) it.next()).n(c0723c, interfaceC1163b));
        }
        return hashSet;
    }

    public final String toString() {
        return this.f1544b;
    }
}
