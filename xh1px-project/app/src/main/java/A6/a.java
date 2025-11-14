package A6;

import C6.A;
import C6.InterfaceC0004e;
import F6.C;
import F6.y;
import I7.v;
import a6.AbstractC0436k;
import a6.u;
import f7.C0722b;
import f7.C0723c;
import f7.C0725e;
import i.AbstractC0862a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import t7.C1593c;

/* loaded from: classes.dex */
public final class a implements E6.c {

    /* renamed from: a, reason: collision with root package name */
    public final v7.k f387a;

    /* renamed from: b, reason: collision with root package name */
    public final A f388b;

    public a(v7.k kVar, C c6) {
        o6.j.e(c6, "module");
        this.f387a = kVar;
        this.f388b = c6;
    }

    @Override // E6.c
    public final boolean a(C0723c c0723c, C0725e c0725e) {
        o6.j.e(c0723c, "packageFqName");
        o6.j.e(c0725e, "name");
        String b4 = c0725e.b();
        o6.j.d(b4, "asString(...)");
        if ((v.a0(b4, "Function") || v.a0(b4, "KFunction") || v.a0(b4, "SuspendFunction") || v.a0(b4, "KSuspendFunction")) && m.f407b.a(c0723c, b4) != null) {
            return true;
        }
        return false;
    }

    @Override // E6.c
    public final InterfaceC0004e b(C0722b c0722b) {
        C0723c c0723c;
        l a3;
        o6.j.e(c0722b, "classId");
        if (!c0722b.f10795c && !c0722b.g()) {
            String str = c0722b.f10794b.f10797a.f10800a;
            if (I7.m.b0(str, "Function", false) && (a3 = m.f407b.a((c0723c = c0722b.f10793a), str)) != null) {
                k kVar = a3.f405a;
                int i4 = a3.f406b;
                List list = (List) AbstractC0862a.j(((y) this.f388b.U(c0723c)).f1611i, y.f1608l[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof C1593c) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                if (AbstractC0436k.r0(arrayList2) == null) {
                    return new c(this.f387a, (C1593c) AbstractC0436k.p0(arrayList), kVar, i4);
                }
                throw new ClassCastException();
            }
            return null;
        }
        return null;
    }

    @Override // E6.c
    public final Collection c(C0723c c0723c) {
        o6.j.e(c0723c, "packageFqName");
        return u.f7768d;
    }
}
