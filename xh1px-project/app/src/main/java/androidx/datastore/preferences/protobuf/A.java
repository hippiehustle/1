package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class A implements H {

    /* renamed from: a, reason: collision with root package name */
    public H[] f8595a;

    @Override // androidx.datastore.preferences.protobuf.H
    public final Q a(Class cls) {
        for (H h8 : this.f8595a) {
            if (h8.b(cls)) {
                return h8.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public final boolean b(Class cls) {
        for (H h8 : this.f8595a) {
            if (h8.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
