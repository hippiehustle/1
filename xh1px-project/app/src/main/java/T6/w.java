package T6;

import a6.AbstractC0436k;
import f7.C0725e;
import java.util.LinkedHashSet;
import java.util.List;
import n6.InterfaceC1162a;
import p7.C1320b;
import p7.C1324f;
import p7.C1330l;
import p7.InterfaceC1333o;

/* loaded from: classes.dex */
public final class w implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5894d;

    /* renamed from: e, reason: collision with root package name */
    public final A f5895e;

    public /* synthetic */ w(A a3, int i4) {
        this.f5894d = i4;
        this.f5895e = a3;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f5894d) {
            case 0:
                C1324f c1324f = C1324f.f13817m;
                InterfaceC1333o.f13843a.getClass();
                C1330l c1330l = C1330l.f13836e;
                o6.j.e(c1324f, "kindFilter");
                List list = c1324f.f13824a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                boolean a3 = c1324f.a(C1324f.f13816l);
                A a4 = this.f5895e;
                K6.b bVar = K6.b.f2733g;
                if (a3) {
                    for (C0725e c0725e : a4.h(c1324f, c1330l)) {
                        c1330l.m(c0725e);
                        F7.l.a(linkedHashSet, a4.d(c0725e, bVar));
                    }
                }
                if (c1324f.a(C1324f.f13815i) && !list.contains(C1320b.f13804a)) {
                    for (C0725e c0725e2 : a4.i(c1324f, c1330l)) {
                        c1330l.m(c0725e2);
                        linkedHashSet.addAll(a4.g(c0725e2, bVar));
                    }
                }
                if (c1324f.a(C1324f.j) && !list.contains(C1320b.f13804a)) {
                    for (C0725e c0725e3 : a4.o(c1324f)) {
                        c1330l.m(c0725e3);
                        linkedHashSet.addAll(a4.f(c0725e3, bVar));
                    }
                }
                return AbstractC0436k.Q0(linkedHashSet);
            case 1:
                return this.f5895e.k();
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return this.f5895e.i(C1324f.f13820p, null);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return this.f5895e.o(C1324f.f13821q);
            default:
                return this.f5895e.h(C1324f.f13819o, null);
        }
    }
}
