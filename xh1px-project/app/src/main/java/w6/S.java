package w6;

import i.AbstractC0862a;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class S extends AbstractC1711C {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ u6.s[] f15812g;

    /* renamed from: c, reason: collision with root package name */
    public final s0 f15813c;

    /* renamed from: d, reason: collision with root package name */
    public final s0 f15814d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f15815e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f15816f;

    static {
        o6.p pVar = new o6.p(S.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0);
        o6.w wVar = o6.v.f13643a;
        f15812g = new u6.s[]{wVar.f(pVar), AbstractC1149a.k(S.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0, wVar), AbstractC1149a.k(S.class, "members", "getMembers()Ljava/util/Collection;", 0, wVar)};
    }

    public S(T t8) {
        super(t8);
        this.f15813c = AbstractC0862a.l(null, new O(t8, 1));
        this.f15814d = AbstractC0862a.l(null, new P(this, 0));
        Q q6 = new Q(this, t8);
        Z5.h hVar = Z5.h.f7482d;
        this.f15815e = Z5.a.c(hVar, q6);
        this.f15816f = Z5.a.c(hVar, new P(this, 1));
        AbstractC0862a.l(null, new Q(t8, this));
    }
}
