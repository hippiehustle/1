package w6;

import F6.C0053m;
import I6.AbstractC0065d;
import P6.C0279b;
import a6.AbstractC0434i;
import a6.AbstractC0437l;
import c7.C0587f;
import f7.C0725e;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import s7.C1518i;
import s7.C1519j;
import t7.C1591a;
import w7.C1749k;
import x7.C1828j;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f15906a = new ConcurrentHashMap();

    /* JADX WARN: Type inference failed for: r21v0, types: [java.lang.Object, Y6.e] */
    /* JADX WARN: Type inference failed for: r34v0, types: [java.lang.Object, X6.d] */
    /* JADX WARN: Type inference failed for: r39v0, types: [java.lang.Object, Y6.f] */
    public static final H6.e a(Class cls) {
        v7.k kVar;
        P6.A a3;
        P6.A a4;
        B6.l lVar;
        E6.b bVar;
        E6.d dVar;
        C1519j c1519j = C1519j.f14594f;
        o6.j.e(cls, "<this>");
        ClassLoader d2 = AbstractC0065d.d(cls);
        z0 z0Var = new z0(d2);
        ConcurrentHashMap concurrentHashMap = f15906a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(z0Var);
        if (weakReference != null) {
            H6.e eVar = (H6.e) weakReference.get();
            if (eVar != null) {
                return eVar;
            }
            concurrentHashMap.remove(z0Var, weakReference);
        }
        W0.c cVar = new W0.c(7, d2);
        ClassLoader classLoader = Z5.y.class.getClassLoader();
        o6.j.d(classLoader, "getClassLoader(...)");
        W0.c cVar2 = new W0.c(7, classLoader);
        W0.d dVar2 = new W0.d(8, d2);
        String str = "runtime module for " + d2;
        H6.d dVar3 = H6.d.f2040b;
        H6.d dVar4 = H6.d.f2041c;
        o6.j.e(str, "moduleName");
        v7.k kVar2 = new v7.k("DeserializationComponentsForJava.ModuleData");
        B6.l lVar2 = new B6.l(kVar2);
        F6.C c6 = new F6.C(C0725e.g("<" + str + '>'), kVar2, lVar2, 56);
        v7.m mVar = kVar2.f15561a;
        mVar.lock();
        try {
            if (lVar2.f16715a == null) {
                lVar2.f16715a = c6;
                mVar.unlock();
                lVar2.f489f = new B6.i(c6, 0);
                ?? obj = new Object();
                W0.d dVar5 = new W0.d(24, false);
                A4.a aVar = new A4.a(kVar2, c6);
                Y6.f fVar = Y6.f.f7220c;
                Z5.f fVar2 = new Z5.f(1, 9, 0);
                P6.r rVar = P6.q.f4581d;
                Z5.f fVar3 = rVar.f4584b;
                if (fVar3 != null && fVar3.f7481f - fVar2.f7481f <= 0) {
                    a3 = rVar.f4585c;
                } else {
                    a3 = rVar.f4583a;
                }
                o6.j.e(a3, "globalReportLevel");
                if (a3 == P6.A.f4516e) {
                    a4 = null;
                } else {
                    a4 = a3;
                }
                P6.s sVar = new P6.s(new P6.u(a3, a4), new B6.n(6, fVar2));
                Q6.h hVar = Q6.h.f4925c;
                Q6.h hVar2 = Q6.h.f4923a;
                G5.e eVar2 = new G5.e(kVar2);
                C6.P p8 = C6.P.f728f;
                z6.l lVar3 = new z6.l(c6, aVar);
                C0279b c0279b = new C0279b(sVar);
                S6.b bVar2 = S6.b.f5420a;
                ?? obj2 = new Object();
                x7.k.f16296b.getClass();
                x7.l lVar4 = C1828j.f16295b;
                S6.d dVar6 = new S6.d(new S6.a(kVar2, dVar2, cVar, obj, hVar, dVar3, hVar2, eVar2, dVar4, dVar5, fVar, p8, K6.a.f2729a, c6, lVar3, c0279b, obj2, P6.l.f4567a, bVar2, lVar4, sVar, new Object()));
                C0587f c0587f = C0587f.f9721g;
                o6.j.e(c0587f, "metadataVersion");
                R3.r rVar2 = new R3.r(cVar, 8, (Object) obj);
                F3.a aVar2 = new F3.a(c6, aVar, kVar2, cVar);
                aVar2.j = c0587f;
                List y4 = E2.d.y(C1749k.f16000a);
                z6.h hVar3 = c6.f1450h;
                if (hVar3 instanceof B6.l) {
                    lVar = (B6.l) hVar3;
                } else {
                    lVar = null;
                }
                B6.l lVar5 = lVar;
                Y6.f fVar4 = Y6.f.f7219b;
                if (lVar5 == null || (bVar = lVar5.K()) == null) {
                    bVar = E6.a.f1251b;
                }
                if (lVar5 == null || (dVar = lVar5.K()) == null) {
                    dVar = E6.a.f1253d;
                }
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                z0 z0Var2 = z0Var;
                C1518i c1518i = new C1518i(kVar2, c6, rVar2, aVar2, dVar6, dVar3, fVar4, a6.s.f7766d, aVar, bVar, dVar, e7.g.f10671a, lVar4, new G5.e(kVar2), y4, c1519j);
                obj.f7218a = c1518i;
                dVar5.f6489e = new g0.L(8, dVar6);
                B6.r K = lVar2.K();
                B6.r K8 = lVar2.K();
                G5.e eVar3 = new G5.e(kVar2);
                o6.j.e(K, "additionalClassPartsProvider");
                o6.j.e(K8, "platformDependentDeclarationFilter");
                B6.t tVar = new B6.t(kVar2, cVar2, c6);
                W5.a aVar3 = new W5.a(27, tVar);
                C1591a c1591a = C1591a.f15138m;
                tVar.f516c = new C1518i(kVar2, c6, aVar3, new R3.r(c6, aVar, c1591a), tVar, AbstractC0437l.X(new A6.a(kVar2, c6), new B6.h(kVar2, c6)), aVar, K, K8, c1591a.f14423a, lVar4, eVar3, 262144);
                c6.k = new F6.B(AbstractC0434i.i1(new F6.C[]{c6}));
                c6.f1452l = new C0053m("CompositeProvider@RuntimeModuleData for " + c6, AbstractC0437l.X(dVar6, tVar));
                H6.e eVar4 = new H6.e(c1518i, new A4.c(obj, cVar));
                while (true) {
                    z0 z0Var3 = z0Var2;
                    ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
                    WeakReference weakReference2 = (WeakReference) concurrentHashMap3.putIfAbsent(z0Var3, new WeakReference(eVar4));
                    if (weakReference2 == null) {
                        return eVar4;
                    }
                    H6.e eVar5 = (H6.e) weakReference2.get();
                    if (eVar5 != null) {
                        return eVar5;
                    }
                    concurrentHashMap3.remove(z0Var3, weakReference2);
                    z0Var2 = z0Var3;
                    concurrentHashMap2 = concurrentHashMap3;
                }
            } else {
                kVar = kVar2;
                try {
                    throw new AssertionError("Built-ins module is already set: " + lVar2.f16715a + " (attempting to reset to " + c6 + ")");
                } catch (Throwable th) {
                    th = th;
                    try {
                        kVar.f15562b.getClass();
                        throw th;
                    } catch (Throwable th2) {
                        mVar.unlock();
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            kVar = kVar2;
        }
    }
}
