package w6;

import I6.AbstractC0065d;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import c7.C0587f;
import f7.C0722b;
import f7.C0723c;
import h6.AbstractC0837b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import n6.InterfaceC1162a;
import n7.C1169b;
import p7.C1332n;
import p7.InterfaceC1333o;

/* loaded from: classes.dex */
public final class P implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15807d;

    /* renamed from: e, reason: collision with root package name */
    public final S f15808e;

    public /* synthetic */ P(S s8, int i4) {
        this.f15807d = i4;
        this.f15808e = s8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Iterable] */
    @Override // n6.InterfaceC1162a
    public final Object a() {
        ?? y4;
        switch (this.f15807d) {
            case 0:
                S s8 = this.f15808e;
                s0 s0Var = s8.f15813c;
                u6.s sVar = S.f15812g[0];
                H6.b bVar = (H6.b) s0Var.a();
                if (bVar != null) {
                    s0 s0Var2 = s8.f15787a;
                    u6.s sVar2 = AbstractC1711C.f15786b[0];
                    Object a3 = s0Var2.a();
                    o6.j.d(a3, "getValue(...)");
                    A4.c cVar = ((H6.e) a3).f2043b;
                    Y6.e eVar = (Y6.e) cVar.f291e;
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cVar.f293g;
                    Class cls = bVar.f2037a;
                    C0722b a4 = AbstractC0065d.a(cls);
                    Object obj = concurrentHashMap.get(a4);
                    if (obj == null) {
                        C0723c c0723c = AbstractC0065d.a(cls).f10793a;
                        Z6.b bVar2 = bVar.f2038b;
                        Z6.a aVar = bVar2.f7517a;
                        Z6.a aVar2 = Z6.a.MULTIFILE_CLASS;
                        if (aVar == aVar2) {
                            String[] strArr = bVar2.f7519c;
                            List list = null;
                            if (aVar != aVar2) {
                                strArr = null;
                            }
                            if (strArr != null) {
                                list = AbstractC0434i.K0(strArr);
                            }
                            if (list == null) {
                                list = a6.s.f7766d;
                            }
                            y4 = new ArrayList();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                C0723c c0723c2 = new C0723c(C1169b.c((String) it.next()).f13019a.replace('/', '.'));
                                C0722b c0722b = new C0722b(c0723c2.b(), c0723c2.f10797a.f());
                                W0.c cVar2 = (W0.c) cVar.f292f;
                                eVar.c().f14575c.getClass();
                                H6.b t8 = q4.X.t(cVar2, c0722b, C0587f.f9721g);
                                if (t8 != null) {
                                    y4.add(t8);
                                }
                            }
                        } else {
                            y4 = E2.d.y(bVar);
                        }
                        B6.p pVar = new B6.p(eVar.c().f14574b, c0723c, 1);
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = y4.iterator();
                        while (it2.hasNext()) {
                            u7.p a9 = eVar.a(pVar, (H6.b) it2.next());
                            if (a9 != null) {
                                arrayList.add(a9);
                            }
                        }
                        InterfaceC1333o f8 = AbstractC0837b.f("package " + c0723c + " (" + bVar + ')', AbstractC0436k.Q0(arrayList));
                        Object putIfAbsent = concurrentHashMap.putIfAbsent(a4, f8);
                        if (putIfAbsent == null) {
                            obj = f8;
                        } else {
                            obj = putIfAbsent;
                        }
                    }
                    o6.j.d(obj, "getOrPut(...)");
                    return (InterfaceC1333o) obj;
                }
                return C1332n.f13842b;
            default:
                s0 s0Var3 = this.f15808e.f15813c;
                u6.s sVar3 = S.f15812g[0];
                H6.b bVar3 = (H6.b) s0Var3.a();
                if (bVar3 != null) {
                    Z6.b bVar4 = bVar3.f2038b;
                    String[] strArr2 = bVar4.f7519c;
                    String[] strArr3 = bVar4.f7521e;
                    if (strArr2 != null && strArr3 != null) {
                        Z5.j h8 = e7.g.h(strArr2, strArr3);
                        return new Z5.o((e7.f) h8.f7485d, (a7.E) h8.f7486e, bVar4.f7518b);
                    }
                }
                return null;
        }
    }
}
