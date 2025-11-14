package u7;

import C6.F;
import C6.InterfaceC0007h;
import F6.B;
import a6.AbstractC0436k;
import a7.E;
import a7.Z;
import a7.g0;
import c7.AbstractC0582a;
import c7.C0590i;
import c7.InterfaceC0588g;
import f7.C0722b;
import f7.C0723c;
import f7.C0725e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import p7.C1324f;
import q4.X;
import s7.C1518i;

/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: g, reason: collision with root package name */
    public final F f15437g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15438h;

    /* renamed from: i, reason: collision with root package name */
    public final C0723c f15439i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(F f8, E e9, InterfaceC0588g interfaceC0588g, AbstractC0582a abstractC0582a, Y6.g gVar, C1518i c1518i, String str, InterfaceC1162a interfaceC1162a) {
        super(r0, r2, r3, r4, interfaceC1162a);
        o6.j.e(e9, "proto");
        o6.j.e(interfaceC0588g, "nameResolver");
        o6.j.e(abstractC0582a, "metadataVersion");
        o6.j.e(c1518i, "components");
        o6.j.e(str, "debugName");
        Z z8 = e9.j;
        o6.j.d(z8, "getTypeTable(...)");
        B b4 = new B(z8);
        C0590i c0590i = C0590i.f9728b;
        g0 g0Var = e9.k;
        o6.j.d(g0Var, "getVersionRequirementTable(...)");
        F3.m a3 = c1518i.a(f8, interfaceC0588g, b4, X.r(g0Var), abstractC0582a, gVar);
        List list = e9.f7810g;
        o6.j.d(list, "getFunctionList(...)");
        List list2 = e9.f7811h;
        o6.j.d(list2, "getPropertyList(...)");
        List list3 = e9.f7812i;
        o6.j.d(list3, "getTypeAliasList(...)");
        this.f15437g = f8;
        this.f15438h = str;
        this.f15439i = ((F6.E) f8).f1461i;
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1335q
    public final Collection a(C1324f c1324f, InterfaceC1163b interfaceC1163b) {
        o6.j.e(c1324f, "kindFilter");
        List i4 = i(c1324f, interfaceC1163b);
        Iterable iterable = ((C1518i) this.f15433b.f1371d).k;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a6.q.f0(arrayList, ((E6.c) it.next()).c(this.f15439i));
        }
        return AbstractC0436k.C0(i4, arrayList);
    }

    @Override // u7.o, p7.AbstractC1334p, p7.InterfaceC1335q
    public final InterfaceC0007h d(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        o6.j.e(bVar, "location");
        X.M(((C1518i) this.f15433b.f1371d).f14581i, bVar, this.f15437g, c0725e);
        return super.d(c0725e, bVar);
    }

    @Override // u7.o
    public final C0722b l(C0725e c0725e) {
        o6.j.e(c0725e, "name");
        return new C0722b(this.f15439i, c0725e);
    }

    @Override // u7.o
    public final Set n() {
        return a6.u.f7768d;
    }

    @Override // u7.o
    public final Set o() {
        return a6.u.f7768d;
    }

    @Override // u7.o
    public final Set p() {
        return a6.u.f7768d;
    }

    @Override // u7.o
    public final boolean q(C0725e c0725e) {
        o6.j.e(c0725e, "name");
        if (!super.q(c0725e)) {
            Iterable iterable = ((C1518i) this.f15433b.f1371d).k;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (((E6.c) it.next()).a(this.f15439i, c0725e)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.f15438h;
    }

    @Override // u7.o
    public final void h(ArrayList arrayList, InterfaceC1163b interfaceC1163b) {
    }
}
