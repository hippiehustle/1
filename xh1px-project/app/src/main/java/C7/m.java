package C7;

/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final m f812d = new m("must be a member function", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final m f813e = new m("must be a member or an extension function", 1);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f814c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(String str, int i4) {
        super(str, 0);
        this.f814c = i4;
    }

    @Override // C7.e
    public final boolean b(R6.f fVar) {
        switch (this.f814c) {
            case 0:
                if (fVar.f1590n != null) {
                    return true;
                }
                return false;
            default:
                if (fVar.f1590n == null && fVar.f1589m == null) {
                    return false;
                }
                return true;
        }
    }
}
