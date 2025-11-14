package C7;

/* loaded from: classes.dex */
public final class y extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final y f847d = new y("must have no value parameters", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final y f848e = new y("must have a single value parameter", 1);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f849c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(String str, int i4) {
        super(str, 1);
        this.f849c = i4;
    }

    @Override // C7.e
    public final boolean b(R6.f fVar) {
        switch (this.f849c) {
            case 0:
                return fVar.z0().isEmpty();
            default:
                if (fVar.z0().size() == 1) {
                    return true;
                }
                return false;
        }
    }
}
