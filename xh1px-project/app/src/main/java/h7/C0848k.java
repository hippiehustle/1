package h7;

/* renamed from: h7.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0848k {

    /* renamed from: a, reason: collision with root package name */
    public Object f11467a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0849l f11468b;

    public C0848k(Object obj, C0849l c0849l) {
        this.f11468b = c0849l;
        this.f11467a = obj;
    }

    public final Object a(Object obj, u6.s sVar) {
        o6.j.e(sVar, "property");
        return this.f11467a;
    }

    public final void b(Object obj, u6.s sVar) {
        o6.j.e(sVar, "property");
        if (!this.f11468b.f11492a) {
            this.f11467a = obj;
            return;
        }
        throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.f11467a + ')';
    }
}
