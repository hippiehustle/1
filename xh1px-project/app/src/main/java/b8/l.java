package b8;

/* loaded from: classes.dex */
public final class l extends kotlinx.serialization.json.internal.a {

    /* renamed from: f, reason: collision with root package name */
    public final a8.j f9268f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(a8.b bVar, a8.j jVar, String str) {
        super(bVar, str);
        o6.j.e(bVar, "json");
        o6.j.e(jVar, "value");
        this.f9268f = jVar;
        this.f12162a.add("primitive");
    }

    @Override // kotlinx.serialization.json.internal.a
    public final a8.j S() {
        return this.f9268f;
    }

    @Override // kotlinx.serialization.json.internal.a
    public final a8.j c(String str) {
        o6.j.e(str, "tag");
        if (str == "primitive") {
            return this.f9268f;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // Y7.a
    public final int n(X7.f fVar) {
        o6.j.e(fVar, "descriptor");
        return 0;
    }
}
