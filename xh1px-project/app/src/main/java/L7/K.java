package L7;

/* loaded from: classes.dex */
public final class K extends M {

    /* renamed from: f, reason: collision with root package name */
    public final C0150h f3180f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O f3181g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(O o7, long j, C0150h c0150h) {
        super(j);
        this.f3181g = o7;
        this.f3180f = c0150h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3180f.D(this.f3181g);
    }

    @Override // L7.M
    public final String toString() {
        return super.toString() + this.f3180f;
    }
}
