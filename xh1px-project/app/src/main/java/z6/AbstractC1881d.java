package z6;

import a6.AbstractC0436k;
import a6.AbstractC0438m;
import f7.C0722b;
import f7.C0723c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: z6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1881d {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f16708a;

    static {
        Set<j> set = j.f16721h;
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(set, 10));
        for (j jVar : set) {
            o6.j.e(jVar, "primitiveType");
            arrayList.add(n.k.a(jVar.f16729d));
        }
        ArrayList D02 = AbstractC0436k.D0(AbstractC0436k.D0(AbstractC0436k.D0(arrayList, m.f16772f.g()), m.f16776h.g()), m.j.g());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = D02.iterator();
        while (it.hasNext()) {
            C0723c c0723c = (C0723c) it.next();
            o6.j.e(c0723c, "topLevelFqName");
            linkedHashSet.add(new C0722b(c0723c.b(), c0723c.f10797a.f()));
        }
        f16708a = linkedHashSet;
    }
}
