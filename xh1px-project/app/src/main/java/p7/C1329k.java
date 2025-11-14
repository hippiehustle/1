package p7;

import C6.InterfaceC0001b;
import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import a6.AbstractC0436k;
import f7.C0725e;
import i7.AbstractC0898m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;

/* renamed from: p7.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1329k implements InterfaceC1333o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13834b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13835c;

    public C1329k(InterfaceC1333o interfaceC1333o) {
        this.f13835c = interfaceC1333o;
    }

    @Override // p7.InterfaceC1335q
    public Collection a(C1324f c1324f, InterfaceC1163b interfaceC1163b) {
        switch (this.f13834b) {
            case 1:
                o6.j.e(c1324f, "kindFilter");
                Collection i4 = i(c1324f, interfaceC1163b);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : i4) {
                    if (((InterfaceC0010k) obj) instanceof InterfaceC0001b) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                return AbstractC0436k.C0(AbstractC0898m.o(arrayList, C1330l.f13839h), arrayList2);
            default:
                return i(c1324f, interfaceC1163b);
        }
    }

    @Override // p7.InterfaceC1333o
    public final Set b() {
        return l().b();
    }

    @Override // p7.InterfaceC1333o
    public final Set c() {
        return l().c();
    }

    @Override // p7.InterfaceC1335q
    public final InterfaceC0007h d(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        o6.j.e(bVar, "location");
        return l().d(c0725e, bVar);
    }

    @Override // p7.InterfaceC1333o
    public final Set e() {
        return l().e();
    }

    @Override // p7.InterfaceC1333o
    public Collection f(C0725e c0725e, K6.b bVar) {
        switch (this.f13834b) {
            case 1:
                o6.j.e(c0725e, "name");
                return AbstractC0898m.o(k(c0725e, bVar), C1330l.f13838g);
            default:
                return k(c0725e, bVar);
        }
    }

    @Override // p7.InterfaceC1333o
    public Collection g(C0725e c0725e, K6.b bVar) {
        switch (this.f13834b) {
            case 1:
                o6.j.e(c0725e, "name");
                return AbstractC0898m.o(j(c0725e, bVar), C1330l.f13837f);
            default:
                return j(c0725e, bVar);
        }
    }

    public final InterfaceC1333o h() {
        if (l() instanceof C1329k) {
            InterfaceC1333o l6 = l();
            o6.j.c(l6, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
            return ((C1329k) l6).h();
        }
        return l();
    }

    public final Collection i(C1324f c1324f, InterfaceC1163b interfaceC1163b) {
        o6.j.e(c1324f, "kindFilter");
        return l().a(c1324f, interfaceC1163b);
    }

    public final Collection j(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        return l().g(c0725e, bVar);
    }

    public final Collection k(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        return l().f(c0725e, bVar);
    }

    public final InterfaceC1333o l() {
        switch (this.f13834b) {
            case 0:
                return (InterfaceC1333o) ((v7.i) this.f13835c).a();
            default:
                return (InterfaceC1333o) this.f13835c;
        }
    }

    public C1329k(v7.n nVar, InterfaceC1162a interfaceC1162a) {
        o6.j.e(nVar, "storageManager");
        this.f13835c = new v7.h((v7.k) nVar, new C1328j(0, interfaceC1162a));
    }
}
