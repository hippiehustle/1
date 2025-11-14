package w6;

/* loaded from: classes.dex */
public class Z extends m0 implements u6.p {

    /* renamed from: m, reason: collision with root package name */
    public final Object f15832m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(F f8, C6.M m6) {
        super(f8, m6);
        o6.j.e(m6, "descriptor");
        X x8 = new X(this, 0);
        Z5.h hVar = Z5.h.f7482d;
        this.f15832m = Z5.a.c(hVar, x8);
        Z5.a.c(hVar, new X(this, 1));
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        return get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // u6.s
    public final u6.n c() {
        return (Y) this.f15832m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // u6.p
    public final Object get() {
        return ((Y) this.f15832m.getValue()).g(new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // w6.m0
    public final j0 w() {
        return (Y) this.f15832m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // u6.s
    public final u6.o c() {
        return (Y) this.f15832m.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(F f8, String str, String str2, Object obj) {
        super(f8, str, str2, obj);
        o6.j.e(f8, "container");
        X x8 = new X(this, 0);
        Z5.h hVar = Z5.h.f7482d;
        this.f15832m = Z5.a.c(hVar, x8);
        Z5.a.c(hVar, new X(this, 1));
    }
}
