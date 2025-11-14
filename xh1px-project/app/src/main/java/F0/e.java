package F0;

/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: d, reason: collision with root package name */
    public final f f1265d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f1266e;

    public e(f fVar, Throwable th) {
        super(th);
        this.f1265d = fVar;
        this.f1266e = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f1266e;
    }
}
