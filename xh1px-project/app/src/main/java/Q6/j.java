package Q6;

import I6.C0066e;
import i.AbstractC0862a;
import java.util.Map;
import o6.p;
import o6.v;
import u6.s;
import v7.k;
import v7.n;
import z6.m;

/* loaded from: classes.dex */
public final class j extends b {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ s[] f4928g = {v.f13643a.f(new p(j.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* renamed from: f, reason: collision with root package name */
    public final v7.i f4929f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [v7.i, v7.h] */
    public j(C0066e c0066e, A4.a aVar) {
        super(aVar, c0066e, m.f16786t);
        o6.j.e(c0066e, "annotation");
        o6.j.e(aVar, "c");
        n nVar = ((S6.a) aVar.f280e).f5398a;
        B6.j jVar = new B6.j(10, this);
        k kVar = (k) nVar;
        kVar.getClass();
        this.f4929f = new v7.h(kVar, jVar);
    }

    @Override // Q6.b, D6.c
    public final Map c() {
        return (Map) AbstractC0862a.j(this.f4929f, f4928g[0]);
    }
}
