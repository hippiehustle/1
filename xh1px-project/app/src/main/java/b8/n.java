package b8;

/* loaded from: classes.dex */
public final class n extends kotlinx.serialization.json.internal.a {

    /* renamed from: f, reason: collision with root package name */
    public final a8.d f9273f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9274g;

    /* renamed from: h, reason: collision with root package name */
    public int f9275h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a8.b bVar, a8.d dVar) {
        super(bVar, null);
        o6.j.e(bVar, "json");
        o6.j.e(dVar, "value");
        this.f9273f = dVar;
        this.f9274g = dVar.f8283d.size();
        this.f9275h = -1;
    }

    @Override // kotlinx.serialization.json.internal.a
    public final String Q(X7.f fVar, int i4) {
        o6.j.e(fVar, "descriptor");
        return String.valueOf(i4);
    }

    @Override // kotlinx.serialization.json.internal.a
    public final a8.j S() {
        return this.f9273f;
    }

    @Override // kotlinx.serialization.json.internal.a
    public final a8.j c(String str) {
        o6.j.e(str, "tag");
        return (a8.j) this.f9273f.f8283d.get(Integer.parseInt(str));
    }

    @Override // Y7.a
    public final int n(X7.f fVar) {
        o6.j.e(fVar, "descriptor");
        int i4 = this.f9275h;
        if (i4 < this.f9274g - 1) {
            int i8 = i4 + 1;
            this.f9275h = i8;
            return i8;
        }
        return -1;
    }
}
