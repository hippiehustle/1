package Z7;

/* loaded from: classes.dex */
public final class O implements V7.a {

    /* renamed from: a, reason: collision with root package name */
    public final V7.a f7559a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f7560b;

    public O(V7.a aVar) {
        o6.j.e(aVar, "serializer");
        this.f7559a = aVar;
        this.f7560b = new Z(aVar.d());
    }

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        if (bVar.f()) {
            return bVar.u(this.f7559a);
        }
        return null;
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        if (obj != null) {
            cVar.r(this.f7559a, obj);
        } else {
            cVar.o();
        }
    }

    @Override // V7.a
    public final X7.f d() {
        return this.f7560b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && O.class == obj.getClass() && o6.j.a(this.f7559a, ((O) obj).f7559a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7559a.hashCode();
    }
}
