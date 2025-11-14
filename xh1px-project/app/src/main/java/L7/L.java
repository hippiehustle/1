package L7;

/* loaded from: classes.dex */
public final class L extends M {

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f3182f;

    public L(Runnable runnable, long j) {
        super(j);
        this.f3182f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3182f.run();
    }

    @Override // L7.M
    public final String toString() {
        return super.toString() + this.f3182f;
    }
}
