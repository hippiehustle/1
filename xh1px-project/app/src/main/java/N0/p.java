package N0;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f3632b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3633c;

    public /* synthetic */ p(x xVar, String str, int i4) {
        this.f3631a = i4;
        this.f3632b = xVar;
        this.f3633c = str;
    }

    @Override // N0.w
    public final void run() {
        switch (this.f3631a) {
            case 0:
                this.f3632b.q(this.f3633c);
                return;
            case 1:
                this.f3632b.p(this.f3633c);
                return;
            default:
                this.f3632b.s(this.f3633c);
                return;
        }
    }
}
