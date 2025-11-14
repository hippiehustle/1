package T6;

import C6.AbstractC0021w;
import C6.InterfaceC0004e;
import I6.AbstractC0065d;
import I6.C0066e;
import f7.C0722b;
import f7.C0723c;
import f7.C0725e;
import g0.L;
import java.util.ArrayList;
import java.util.Iterator;
import n6.InterfaceC1162a;

/* renamed from: T6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330e implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5823d;

    /* renamed from: e, reason: collision with root package name */
    public final C0331f f5824e;

    public /* synthetic */ C0330e(C0331f c0331f, int i4) {
        this.f5823d = i4;
        this.f5824e = c0331f;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        Z5.j jVar;
        switch (this.f5823d) {
            case 0:
                return AbstractC0065d.a(h2.a.k(h2.a.g(this.f5824e.f5827b.f2196a))).a();
            case 1:
                C0331f c0331f = this.f5824e;
                C0723c a3 = c0331f.a();
                C0066e c0066e = c0331f.f5827b;
                A4.a aVar = c0331f.f5826a;
                if (a3 == null) {
                    return y7.l.c(y7.k.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, c0066e.toString());
                }
                S6.a aVar2 = (S6.a) aVar.f280e;
                C6.A a4 = aVar2.f5410o;
                InterfaceC0004e c6 = B6.e.c(a3, a4.o());
                if (c6 == null) {
                    I6.o oVar = new I6.o(h2.a.k(h2.a.g(c0066e.f2196a)));
                    W0.d dVar = aVar2.k;
                    dVar.getClass();
                    L l6 = (L) dVar.f6489e;
                    if (l6 != null) {
                        c6 = l6.U(oVar);
                        if (c6 == null) {
                            c6 = AbstractC0021w.f(a4, new C0722b(a3.b(), a3.f10797a.f()), aVar2.f5401d.c().f14582l);
                        }
                    } else {
                        o6.j.i("resolver");
                        throw null;
                    }
                }
                return c6.l();
            default:
                C0331f c0331f2 = this.f5824e;
                ArrayList b4 = c0331f2.f5827b.b();
                ArrayList arrayList = new ArrayList();
                Iterator it = b4.iterator();
                while (it.hasNext()) {
                    W6.a aVar3 = (W6.a) it.next();
                    C0725e c0725e = ((I6.f) aVar3).f2197a;
                    if (c0725e == null) {
                        c0725e = P6.w.f4598b;
                    }
                    k7.g d2 = c0331f2.d(aVar3);
                    if (d2 != null) {
                        jVar = new Z5.j(c0725e, d2);
                    } else {
                        jVar = null;
                    }
                    if (jVar != null) {
                        arrayList.add(jVar);
                    }
                }
                return a6.x.R0(arrayList);
        }
    }
}
