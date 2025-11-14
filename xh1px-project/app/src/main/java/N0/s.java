package N0;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f3642b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f3643c;

    public /* synthetic */ s(x xVar, float f8, int i4) {
        this.f3641a = i4;
        this.f3642b = xVar;
        this.f3643c = f8;
    }

    @Override // N0.w
    public final void run() {
        switch (this.f3641a) {
            case 0:
                x xVar = this.f3642b;
                C0202j c0202j = xVar.f3674d;
                float f8 = this.f3643c;
                if (c0202j == null) {
                    xVar.f3679i.add(new s(xVar, f8, 0));
                    return;
                }
                Z0.e eVar = xVar.f3675e;
                eVar.i(eVar.f7267m, Z0.g.f(c0202j.f3610l, c0202j.f3611m, f8));
                return;
            case 1:
                x xVar2 = this.f3642b;
                C0202j c0202j2 = xVar2.f3674d;
                float f9 = this.f3643c;
                if (c0202j2 == null) {
                    xVar2.f3679i.add(new s(xVar2, f9, 1));
                    return;
                } else {
                    xVar2.r((int) Z0.g.f(c0202j2.f3610l, c0202j2.f3611m, f9));
                    return;
                }
            default:
                this.f3642b.t(this.f3643c);
                return;
        }
    }
}
