package K2;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f2619e;

    public /* synthetic */ f(h hVar, int i4) {
        this.f2618d = i4;
        this.f2619e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2618d) {
            case 0:
                this.f2619e.reverse();
                return;
            default:
                h.a(this.f2619e);
                return;
        }
    }
}
