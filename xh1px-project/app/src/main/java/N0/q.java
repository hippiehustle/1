package N0;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f3635b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3636c;

    public /* synthetic */ q(x xVar, int i4, int i8) {
        this.f3634a = i8;
        this.f3635b = xVar;
        this.f3636c = i4;
    }

    @Override // N0.w
    public final void run() {
        switch (this.f3634a) {
            case 0:
                this.f3635b.o(this.f3636c);
                return;
            case 1:
                this.f3635b.r(this.f3636c);
                return;
            default:
                this.f3635b.n(this.f3636c);
                return;
        }
    }
}
