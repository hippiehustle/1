package T6;

import C6.O;
import c7.C0587f;
import n1.AbstractC1149a;
import p7.InterfaceC1333o;
import q4.X;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class q extends F6.E {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ u6.s[] f5879q;
    public final I6.y k;

    /* renamed from: l, reason: collision with root package name */
    public final A4.a f5880l;

    /* renamed from: m, reason: collision with root package name */
    public final v7.i f5881m;

    /* renamed from: n, reason: collision with root package name */
    public final C0329d f5882n;

    /* renamed from: o, reason: collision with root package name */
    public final v7.c f5883o;

    /* renamed from: p, reason: collision with root package name */
    public final D6.j f5884p;

    static {
        o6.p pVar = new o6.p(q.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0);
        o6.w wVar = o6.v.f13643a;
        f5879q = new u6.s[]{wVar.f(pVar), AbstractC1149a.k(q.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0, wVar)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r4v0, types: [v7.i, v7.h] */
    /* JADX WARN: Type inference failed for: r4v1, types: [v7.c, v7.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(A4.a aVar, I6.y yVar) {
        super(r0.f5410o, yVar.f2217a);
        D6.j H2;
        o6.j.e(aVar, "outerContext");
        S6.a aVar2 = (S6.a) aVar.f280e;
        this.k = yVar;
        A4.a l6 = X.l(aVar, this, null, 6);
        this.f5880l = l6;
        aVar2.f5401d.c().f14575c.getClass();
        C0587f c0587f = C0587f.f9721g;
        S6.a aVar3 = (S6.a) l6.f280e;
        v7.n nVar = aVar3.f5398a;
        p pVar = new p(this, 0);
        v7.k kVar = (v7.k) nVar;
        kVar.getClass();
        this.f5881m = new v7.h(kVar, pVar);
        this.f5882n = new C0329d(l6, yVar, this);
        p pVar2 = new p(this, 1);
        v7.k kVar2 = (v7.k) nVar;
        kVar2.getClass();
        this.f5883o = new v7.h(kVar2, pVar2);
        if (aVar3.f5417v.f4587b) {
            H2 = D6.i.f1043a;
        } else {
            H2 = AbstractC1492c.H(l6, yVar);
        }
        this.f5884p = H2;
        ((v7.k) nVar).a(new p(this, 2));
    }

    @Override // D6.b, D6.a
    public final D6.j getAnnotations() {
        return this.f5884p;
    }

    @Override // F6.E, F6.AbstractC0055o, C6.InterfaceC0011l
    public final O h() {
        return new W0.c(21, this);
    }

    @Override // F6.E, F6.AbstractC0054n, D6.b
    public final String toString() {
        return "Lazy Java package fragment: " + this.f1461i + " of module " + ((S6.a) this.f5880l.f280e).f5410o;
    }

    @Override // C6.F
    public final InterfaceC1333o w0() {
        return this.f5882n;
    }
}
