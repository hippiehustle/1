package B6;

import F6.C;
import a6.AbstractC0436k;
import i.AbstractC0862a;
import o6.v;

/* loaded from: classes.dex */
public final class l extends z6.h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ u6.s[] f488h = {v.f13643a.f(new o6.p(l.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};

    /* renamed from: f, reason: collision with root package name */
    public i f489f;

    /* renamed from: g, reason: collision with root package name */
    public final v7.i f490g;

    /* JADX WARN: Type inference failed for: r1v1, types: [v7.i, v7.h] */
    public l(v7.k kVar) {
        super(kVar);
        this.f490g = new v7.h(kVar, new f(this, 1, kVar));
    }

    public final r K() {
        return (r) AbstractC0862a.j(this.f490g, f488h[0]);
    }

    @Override // z6.h
    public final E6.b d() {
        return K();
    }

    @Override // z6.h
    public final Iterable m() {
        Iterable m6 = super.m();
        C l6 = l();
        o6.j.d(l6, "getBuiltInsModule(...)");
        return AbstractC0436k.B0(m6, new h(this.f16718d, l6));
    }

    @Override // z6.h
    public final E6.d q() {
        return K();
    }
}
