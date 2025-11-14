package O7;

import L7.C0150h;

/* loaded from: classes.dex */
public final class S implements L7.H {

    /* renamed from: d, reason: collision with root package name */
    public final U f4089d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4090e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4091f;

    /* renamed from: g, reason: collision with root package name */
    public final C0150h f4092g;

    public S(U u8, long j, Object obj, C0150h c0150h) {
        this.f4089d = u8;
        this.f4090e = j;
        this.f4091f = obj;
        this.f4092g = c0150h;
    }

    @Override // L7.H
    public final void b() {
        U u8 = this.f4089d;
        synchronized (u8) {
            if (this.f4090e < u8.l()) {
                return;
            }
            Object[] objArr = u8.k;
            o6.j.b(objArr);
            long j = this.f4090e;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            V.f(objArr, j, V.f4104a);
            u8.g();
        }
    }
}
