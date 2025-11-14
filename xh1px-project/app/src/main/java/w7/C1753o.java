package w7;

/* renamed from: w7.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1753o extends O {

    /* renamed from: b, reason: collision with root package name */
    public final O f16004b;

    /* renamed from: c, reason: collision with root package name */
    public final O f16005c;

    public C1753o(O o7, O o8) {
        this.f16004b = o7;
        this.f16005c = o8;
    }

    @Override // w7.O
    public final boolean a() {
        if (!this.f16004b.a() && !this.f16005c.a()) {
            return false;
        }
        return true;
    }

    @Override // w7.O
    public final boolean b() {
        if (!this.f16004b.b() && !this.f16005c.b()) {
            return false;
        }
        return true;
    }

    @Override // w7.O
    public final D6.j c(D6.j jVar) {
        o6.j.e(jVar, "annotations");
        return this.f16005c.c(this.f16004b.c(jVar));
    }

    @Override // w7.O
    public final M d(AbstractC1759v abstractC1759v) {
        M d2 = this.f16004b.d(abstractC1759v);
        if (d2 == null) {
            return this.f16005c.d(abstractC1759v);
        }
        return d2;
    }

    @Override // w7.O
    public final AbstractC1759v f(AbstractC1759v abstractC1759v, X x8) {
        o6.j.e(abstractC1759v, "topLevelType");
        o6.j.e(x8, "position");
        return this.f16005c.f(this.f16004b.f(abstractC1759v, x8), x8);
    }
}
