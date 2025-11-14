package Q6;

import C6.O;
import I6.C0066e;
import a6.AbstractC0436k;
import a6.t;
import f7.C0723c;
import i.AbstractC0862a;
import java.util.Map;
import o6.p;
import o6.v;
import u6.s;
import v7.k;
import v7.n;
import w7.AbstractC1759v;
import w7.z;

/* loaded from: classes.dex */
public class b implements R6.h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ s[] f4908e = {v.f13643a.f(new p(b.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final C0723c f4909a;

    /* renamed from: b, reason: collision with root package name */
    public final O f4910b;

    /* renamed from: c, reason: collision with root package name */
    public final v7.i f4911c;

    /* renamed from: d, reason: collision with root package name */
    public final W6.a f4912d;

    /* JADX WARN: Type inference failed for: r3v1, types: [v7.i, v7.h] */
    public b(A4.a aVar, C0066e c0066e, C0723c c0723c) {
        O o7;
        W6.a aVar2;
        o6.j.e(aVar, "c");
        S6.a aVar3 = (S6.a) aVar.f280e;
        o6.j.e(c0723c, "fqName");
        this.f4909a = c0723c;
        if (c0066e != null) {
            o7 = aVar3.j.b(c0066e);
        } else {
            o7 = O.f726a;
        }
        this.f4910b = o7;
        n nVar = aVar3.f5398a;
        B6.f fVar = new B6.f(aVar, 7, this);
        k kVar = (k) nVar;
        kVar.getClass();
        this.f4911c = new v7.h(kVar, fVar);
        if (c0066e != null) {
            aVar2 = (W6.a) AbstractC0436k.q0(c0066e.b());
        } else {
            aVar2 = null;
        }
        this.f4912d = aVar2;
    }

    @Override // D6.c
    public final C0723c a() {
        return this.f4909a;
    }

    @Override // D6.c
    public final AbstractC1759v b() {
        return (z) AbstractC0862a.j(this.f4911c, f4908e[0]);
    }

    @Override // D6.c
    public Map c() {
        return t.f7767d;
    }

    @Override // D6.c
    public final O h() {
        return this.f4910b;
    }
}
