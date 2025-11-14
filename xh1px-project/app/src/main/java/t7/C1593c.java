package t7;

import C6.A;
import C6.F;
import F6.E;
import R3.r;
import a6.AbstractC0438m;
import a6.x;
import a7.C0450k;
import a7.G;
import a7.M;
import a7.N;
import b7.C0542a;
import f7.C0723c;
import g0.b0;
import h7.AbstractC0842e;
import java.util.LinkedHashMap;
import java.util.List;
import m7.AbstractC1098d;
import o6.j;
import p7.InterfaceC1333o;
import s7.C1507A;
import s7.C1518i;
import u7.p;
import v7.k;

/* renamed from: t7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1593c extends E implements F {
    public final C0542a k;

    /* renamed from: l, reason: collision with root package name */
    public final r f15139l;

    /* renamed from: m, reason: collision with root package name */
    public final b0 f15140m;

    /* renamed from: n, reason: collision with root package name */
    public G f15141n;

    /* renamed from: o, reason: collision with root package name */
    public p f15142o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v4, types: [g0.b0, java.lang.Object] */
    public C1593c(C0723c c0723c, k kVar, A a3, G g8, C0542a c0542a) {
        super(a3, c0723c);
        j.e(c0723c, "fqName");
        j.e(a3, "module");
        this.k = c0542a;
        N n3 = g8.f7822g;
        j.d(n3, "getStrings(...)");
        M m6 = g8.f7823h;
        j.d(m6, "getQualifiedNames(...)");
        r rVar = new r(n3, m6);
        this.f15139l = rVar;
        C1507A c1507a = new C1507A(this);
        ?? obj = new Object();
        obj.f10987d = rVar;
        obj.f10988e = c0542a;
        obj.f10989f = c1507a;
        List list = g8.j;
        j.d(list, "getClass_List(...)");
        int N02 = x.N0(AbstractC0438m.d0(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(N02 < 16 ? 16 : N02);
        for (Object obj2 : list) {
            linkedHashMap.put(AbstractC0842e.m((r) obj.f10987d, ((C0450k) obj2).f8160h), obj2);
        }
        obj.f10990g = linkedHashMap;
        this.f15140m = obj;
        this.f15141n = g8;
    }

    public final void N0(C1518i c1518i) {
        j.e(c1518i, "components");
        G g8 = this.f15141n;
        if (g8 != null) {
            this.f15141n = null;
            a7.E e9 = g8.f7824i;
            j.d(e9, "getPackage(...)");
            this.f15142o = new p(this, e9, this.f15139l, this.k, null, c1518i, "scope of " + this, new B6.j(16, this));
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
    }

    @Override // F6.E, F6.AbstractC0054n, D6.b
    public final String toString() {
        return "builtins package fragment for " + this.f1461i + " from " + AbstractC1098d.j(this);
    }

    @Override // C6.F
    public final InterfaceC1333o w0() {
        p pVar = this.f15142o;
        if (pVar != null) {
            return pVar;
        }
        j.i("_memberScope");
        throw null;
    }
}
