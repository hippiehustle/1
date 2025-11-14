package D3;

import A1.e;
import O7.L;
import O7.V;
import O7.g0;
import O7.i0;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m1.InterfaceC1051a;
import m1.InterfaceC1053c;
import m1.InterfaceC1054d;
import n6.InterfaceC1163b;
import o6.C1282a;
import o6.j;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1163b f887a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f888b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f889c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f890d;

    /* renamed from: e, reason: collision with root package name */
    public final L f891e;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f892f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f893g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f894h;

    /* renamed from: i, reason: collision with root package name */
    public final L f895i;
    public final A4.c j;

    public /* synthetic */ d(e eVar, g0 g0Var, int i4) {
        this((i4 & 1) != 0 ? null : eVar, (i4 & 2) == 0, g0Var);
    }

    public static int b(ArrayList arrayList, InterfaceC1053c interfaceC1053c) {
        Iterator it = arrayList.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (j.a(((InterfaceC1053c) it.next()).getId(), interfaceC1053c.getId())) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public void a() {
        List list;
        InterfaceC1053c interfaceC1053c = (InterfaceC1053c) this.f893g.f();
        if (interfaceC1053c != null && (list = (List) this.f889c.f()) != null) {
            ArrayList S02 = AbstractC0436k.S0(list);
            int b4 = b(S02, interfaceC1053c);
            if (b4 == -1) {
                g();
                return;
            }
            S02.remove(b4);
            i(S02);
            g();
        }
    }

    public boolean c(InterfaceC1053c interfaceC1053c, Object obj) {
        if (interfaceC1053c != null) {
            return ((InterfaceC1051a) interfaceC1053c).d();
        }
        return false;
    }

    public final void d(List list) {
        j.e(list, "referenceItems");
        i0 i0Var = this.f888b;
        i0Var.getClass();
        i0Var.h(null, list);
        List Q02 = AbstractC0436k.Q0(list);
        i0 i0Var2 = this.f889c;
        i0Var2.getClass();
        i0Var2.h(null, Q02);
    }

    public void e(InterfaceC1053c interfaceC1053c) {
        j.e(interfaceC1053c, "item");
        if (((List) this.f889c.f()) == null) {
            return;
        }
        i0 i0Var = this.f892f;
        i0Var.getClass();
        i0Var.h(null, interfaceC1053c);
        i0 i0Var2 = this.f893g;
        i0Var2.getClass();
        i0Var2.h(null, interfaceC1053c);
    }

    public final void f() {
        g();
        this.f888b.g(null);
        this.f889c.g(null);
    }

    public void g() {
        this.f892f.g(null);
        this.f893g.g(null);
    }

    public final void h(InterfaceC1053c interfaceC1053c) {
        j.e(interfaceC1053c, "item");
        i0 i0Var = this.f893g;
        if (((InterfaceC1053c) i0Var.f()) == null) {
            return;
        }
        i0Var.getClass();
        i0Var.h(null, interfaceC1053c);
    }

    public final void i(ArrayList arrayList) {
        List Q02 = AbstractC0436k.Q0(arrayList);
        if (!Q02.isEmpty() && (AbstractC0436k.r0(Q02) instanceof InterfaceC1054d)) {
            int i4 = 0;
            for (Object obj : Q02) {
                int i8 = i4 + 1;
                if (i4 >= 0) {
                    ((InterfaceC1054d) obj).e(i4);
                    i4 = i8;
                } else {
                    AbstractC0437l.c0();
                    throw null;
                }
            }
        }
        i0 i0Var = this.f889c;
        i0Var.getClass();
        i0Var.h(null, Q02);
        InterfaceC1163b interfaceC1163b = this.f887a;
        if (interfaceC1163b != null) {
            interfaceC1163b.m(Q02);
        }
    }

    public final void j() {
        List list;
        InterfaceC1053c interfaceC1053c = (InterfaceC1053c) this.f893g.f();
        if (interfaceC1053c != null && (list = (List) this.f889c.f()) != null) {
            ArrayList S02 = AbstractC0436k.S0(list);
            int b4 = b(S02, interfaceC1053c);
            if (b4 == -1) {
                S02.add(interfaceC1053c);
            } else {
                S02.set(b4, interfaceC1053c);
            }
            i(S02);
            g();
        }
    }

    public d(InterfaceC1163b interfaceC1163b, boolean z8, g0 g0Var) {
        j.e(g0Var, "parentItem");
        this.f887a = interfaceC1163b;
        i0 c6 = V.c(null);
        this.f888b = c6;
        i0 c9 = V.c(null);
        this.f889c = c9;
        this.f890d = c9;
        this.f891e = V.h(c6, c9, g0Var, new c(z8, this, null));
        i0 c10 = V.c(null);
        this.f892f = c10;
        i0 c11 = V.c(null);
        this.f893g = c11;
        this.f894h = c11;
        this.f895i = V.h(c10, c11, g0Var, new b(this, null, 0));
        this.j = new A4.c(c9, c11, new C1282a(3, this, d.class, "buildAllItemList", "buildAllItemList(Ljava/util/List;Lcom/buzbuz/smartautoclicker/core/base/interfaces/Identifiable;)Ljava/util/List;", 4), 27);
    }
}
