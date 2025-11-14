package z4;

/* renamed from: z4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1868l {

    /* renamed from: a, reason: collision with root package name */
    public final C1869m f16678a;

    /* renamed from: b, reason: collision with root package name */
    public long f16679b;

    /* renamed from: c, reason: collision with root package name */
    public long f16680c;

    /* JADX WARN: Type inference failed for: r0v0, types: [z4.m, java.lang.Object] */
    public C1868l() {
        ?? obj = new Object();
        obj.f16681a = -1L;
        obj.f16683c = Long.MAX_VALUE;
        obj.f16684d = Long.MIN_VALUE;
        this.f16678a = obj;
    }

    public void a() {
        this.f16679b = 0L;
        this.f16680c = 0L;
        C1869m c1869m = this.f16678a;
        c1869m.f16681a = -1L;
        c1869m.f16682b = 0L;
        c1869m.f16683c = Long.MAX_VALUE;
        c1869m.f16684d = Long.MIN_VALUE;
    }

    public void b(boolean z8) {
        C1869m c1869m = this.f16678a;
        c1869m.getClass();
        long currentTimeMillis = System.currentTimeMillis() - c1869m.f16681a;
        c1869m.f16681a = -1L;
        c1869m.f16682b += currentTimeMillis;
        c1869m.f16683c = Math.min(currentTimeMillis, c1869m.f16683c);
        c1869m.f16684d = Math.max(currentTimeMillis, c1869m.f16684d);
        this.f16679b++;
        if (z8) {
            this.f16680c++;
        }
    }

    public C4.g c() {
        long j = this.f16679b;
        long j5 = this.f16680c;
        C1869m c1869m = this.f16678a;
        long j8 = c1869m.f16682b;
        long j9 = 0;
        if (j != 0) {
            j9 = j8 / j;
        }
        return new C4.g(j, j5, j8, j9, c1869m.f16683c, c1869m.f16684d);
    }
}
