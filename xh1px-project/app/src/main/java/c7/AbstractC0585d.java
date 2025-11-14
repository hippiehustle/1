package c7;

/* renamed from: c7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0585d {

    /* renamed from: a, reason: collision with root package name */
    public final int f9680a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9681b;

    public AbstractC0585d(int i4, int i8) {
        this.f9680a = i4;
        this.f9681b = i8;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [c7.b, c7.d] */
    public static C0583b a(AbstractC0585d abstractC0585d) {
        return new AbstractC0585d(abstractC0585d.f9680a + abstractC0585d.f9681b, 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c7.b, c7.d] */
    public static C0583b b() {
        return new AbstractC0585d(0, 1);
    }

    public abstract Object c(int i4);
}
