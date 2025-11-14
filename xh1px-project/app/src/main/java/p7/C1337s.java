package p7;

import C6.InterfaceC0007h;
import C6.M;
import F6.N;
import a6.AbstractC0436k;
import f7.C0725e;
import i.AbstractC0862a;
import java.util.Collection;
import java.util.List;
import n1.AbstractC1149a;
import n6.InterfaceC1163b;
import o6.v;
import o6.w;
import u7.C1655h;

/* renamed from: p7.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1337s extends AbstractC1334p {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ u6.s[] f13846f;

    /* renamed from: b, reason: collision with root package name */
    public final C1655h f13847b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13848c;

    /* renamed from: d, reason: collision with root package name */
    public final v7.i f13849d;

    /* renamed from: e, reason: collision with root package name */
    public final v7.i f13850e;

    static {
        o6.p pVar = new o6.p(C1337s.class, "functions", "getFunctions()Ljava/util/List;", 0);
        w wVar = v.f13643a;
        f13846f = new u6.s[]{wVar.f(pVar), AbstractC1149a.k(C1337s.class, "properties", "getProperties()Ljava/util/List;", 0, wVar)};
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [v7.i, v7.h] */
    /* JADX WARN: Type inference failed for: r4v4, types: [v7.i, v7.h] */
    public C1337s(v7.k kVar, C1655h c1655h, boolean z8) {
        o6.j.e(kVar, "storageManager");
        this.f13847b = c1655h;
        this.f13848c = z8;
        this.f13849d = new v7.h(kVar, new C1336r(this, 0));
        this.f13850e = new v7.h(kVar, new C1336r(this, 1));
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1335q
    public final Collection a(C1324f c1324f, InterfaceC1163b interfaceC1163b) {
        o6.j.e(c1324f, "kindFilter");
        u6.s[] sVarArr = f13846f;
        return AbstractC0436k.C0((List) AbstractC0862a.j(this.f13849d, sVarArr[0]), (List) AbstractC0862a.j(this.f13850e, sVarArr[1]));
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1335q
    public final InterfaceC0007h d(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        o6.j.e(bVar, "location");
        return null;
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public final Collection f(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        List list = (List) AbstractC0862a.j(this.f13850e, f13846f[1]);
        F7.f fVar = new F7.f();
        for (Object obj : list) {
            if (o6.j.a(((M) obj).getName(), c0725e)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public final Collection g(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        List list = (List) AbstractC0862a.j(this.f13849d, f13846f[0]);
        F7.f fVar = new F7.f();
        for (Object obj : list) {
            if (o6.j.a(((N) obj).getName(), c0725e)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }
}
