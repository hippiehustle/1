package w6;

/* loaded from: classes.dex */
public class c0 extends m0 implements u6.r {

    /* renamed from: m, reason: collision with root package name */
    public final Object f15847m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(F f8, String str, String str2, Object obj) {
        super(f8, str, str2, obj);
        o6.j.e(f8, "container");
        a0 a0Var = new a0(this, 0);
        Z5.h hVar = Z5.h.f7482d;
        this.f15847m = Z5.a.c(hVar, a0Var);
        Z5.a.c(hVar, new a0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // u6.s
    public final u6.n c() {
        return (b0) this.f15847m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // u6.r
    public final Object get(Object obj) {
        return ((b0) this.f15847m.getValue()).g(obj);
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        return get(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // w6.m0
    public final j0 w() {
        return (b0) this.f15847m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // u6.s
    public final u6.q c() {
        return (b0) this.f15847m.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(F f8, C6.M m6) {
        super(f8, m6);
        o6.j.e(m6, "descriptor");
        a0 a0Var = new a0(this, 0);
        Z5.h hVar = Z5.h.f7482d;
        this.f15847m = Z5.a.c(hVar, a0Var);
        Z5.a.c(hVar, new a0(this, 1));
    }
}
