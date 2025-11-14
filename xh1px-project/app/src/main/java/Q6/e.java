package Q6;

import D6.o;
import D6.p;
import I6.t;
import a6.AbstractC0438m;
import a6.q;
import a6.u;
import a6.x;
import f7.C0722b;
import f7.C0723c;
import f7.C0725e;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import z6.m;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f4918a = x.P0(new Z5.j("PACKAGE", EnumSet.noneOf(p.class)), new Z5.j("TYPE", EnumSet.of(p.f1060f, p.f1070r)), new Z5.j("ANNOTATION_TYPE", EnumSet.of(p.f1061g)), new Z5.j("TYPE_PARAMETER", EnumSet.of(p.f1062h)), new Z5.j("FIELD", EnumSet.of(p.j)), new Z5.j("LOCAL_VARIABLE", EnumSet.of(p.k)), new Z5.j("PARAMETER", EnumSet.of(p.f1064l)), new Z5.j("CONSTRUCTOR", EnumSet.of(p.f1065m)), new Z5.j("METHOD", EnumSet.of(p.f1066n, p.f1067o, p.f1068p)), new Z5.j("TYPE_USE", EnumSet.of(p.f1069q)));

    /* renamed from: b, reason: collision with root package name */
    public static final Object f4919b = x.P0(new Z5.j("RUNTIME", o.f1053d), new Z5.j("CLASS", o.f1054e), new Z5.j("SOURCE", o.f1055f));

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, java.lang.Object] */
    public static k7.b a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof t) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) f4918a.get(C0725e.e(((t) it.next()).f2213b.name()).b());
            if (iterable == null) {
                iterable = u.f7768d;
            }
            q.f0(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            p pVar = (p) it2.next();
            C0723c c0723c = m.f16787u;
            o6.j.e(c0723c, "topLevelFqName");
            arrayList3.add(new k7.i(new C0722b(c0723c.b(), c0723c.f10797a.f()), C0725e.e(pVar.name())));
        }
        return new k7.b(arrayList3, d.f4917d);
    }
}
