package N0;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f3644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3646c;

    public /* synthetic */ t(x xVar, int i4, int i8) {
        this.f3644a = xVar;
        this.f3645b = i4;
        this.f3646c = i8;
    }

    @Override // N0.w
    public final void run() {
        x xVar = this.f3644a;
        C0202j c0202j = xVar.f3674d;
        int i4 = this.f3645b;
        int i8 = this.f3646c;
        if (c0202j == null) {
            xVar.f3679i.add(new t(xVar, i4, i8));
        } else {
            xVar.f3675e.i(i4, i8 + 0.99f);
        }
    }
}
