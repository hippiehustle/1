package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class r implements H {

    /* renamed from: b, reason: collision with root package name */
    public static final r f8738b = new r(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8739a;

    public /* synthetic */ r(int i4) {
        this.f8739a = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public final Q a(Class cls) {
        switch (this.f8739a) {
            case 0:
                if (AbstractC0484u.class.isAssignableFrom(cls)) {
                    try {
                        return (Q) AbstractC0484u.d(cls.asSubclass(AbstractC0484u.class)).c(3);
                    } catch (Exception e9) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e9);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public final boolean b(Class cls) {
        switch (this.f8739a) {
            case 0:
                return AbstractC0484u.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
