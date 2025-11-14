package C7;

/* loaded from: classes.dex */
public abstract class n implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f815a;

    /* renamed from: b, reason: collision with root package name */
    public final String f816b;

    public /* synthetic */ n(String str, int i4) {
        this.f815a = i4;
        this.f816b = str;
    }

    @Override // C7.e
    public final String a() {
        switch (this.f815a) {
            case 0:
                return this.f816b;
            default:
                return this.f816b;
        }
    }

    @Override // C7.e
    public final String c(R6.f fVar) {
        switch (this.f815a) {
            case 0:
                return D2.f.v(this, fVar);
            default:
                return D2.f.v(this, fVar);
        }
    }
}
