package w7;

/* loaded from: classes.dex */
public enum X {
    INVARIANT("", true),
    IN_VARIANCE("in", false),
    OUT_VARIANCE("out", true);


    /* renamed from: d, reason: collision with root package name */
    public final String f15985d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15986e;

    X(String str, boolean z8) {
        this.f15985d = str;
        this.f15986e = z8;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f15985d;
    }
}
