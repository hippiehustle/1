package Z3;

import O7.V;
import O7.i0;
import android.content.Context;
import androidx.lifecycle.Z;
import b6.C0533a;
import b6.C0535c;
import b6.C0538f;
import d6.InterfaceC0617c;
import i2.C0880a;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import k2.AbstractC0951a;
import l1.C0999a;

/* renamed from: Z3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0376k extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final H3.n f7385b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f7386c;

    /* renamed from: d, reason: collision with root package name */
    public final A4.c f7387d;

    public C0376k(Context context, H3.n nVar) {
        List list;
        C3.a aVar;
        i0 i0Var;
        f2.a aVar2;
        o6.j.e(nVar, "editionRepository");
        this.f7385b = nVar;
        C0538f c0538f = new C0538f();
        H3.y yVar = nVar.f1950e;
        AbstractC0951a c6 = yVar.c();
        C3.e eVar = yVar.f1980a;
        InterfaceC0617c interfaceC0617c = null;
        if (c6 != null) {
            C0535c a3 = eVar.a();
            E3.a aVar3 = (E3.a) eVar.f601h.f();
            if (aVar3 != null && (aVar = aVar3.f1193m) != null && (i0Var = aVar.f894h) != null && (aVar2 = (f2.a) i0Var.f()) != null && (aVar2 instanceof f2.o)) {
                list = ((f2.o) aVar2).f10756g;
            } else {
                list = null;
            }
            list = list == null ? a6.s.f7766d : list;
            e(c0538f, c6.getId(), list);
            ListIterator listIterator = a3.listIterator(0);
            while (true) {
                C0533a c0533a = (C0533a) listIterator;
                if (!c0533a.hasNext()) {
                    break;
                } else {
                    e(c0538f, ((AbstractC0951a) c0533a.next()).getId(), list);
                }
            }
        }
        i0 c9 = V.c(c0538f.c());
        this.f7386c = c9;
        this.f7387d = new A4.c(this.f7385b.f1950e.f1985f, c9, new N3.i(this, context, interfaceC0617c, 1), 27);
    }

    public static void e(C0538f c0538f, C0999a c0999a, List list) {
        f2.n nVar;
        Object obj;
        C0999a c0999a2;
        Iterator it = list.iterator();
        while (true) {
            nVar = null;
            if (it.hasNext()) {
                obj = it.next();
                if (o6.j.a(((C0880a) obj).f11755c, c0999a)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C0880a c0880a = (C0880a) obj;
        if (c0880a != null) {
            c0999a2 = c0880a.f11753a;
        } else {
            c0999a2 = null;
        }
        if (c0880a != null) {
            nVar = c0880a.f11756d;
        }
        c0538f.put(c0999a, new Z5.j(c0999a2, nVar));
    }
}
