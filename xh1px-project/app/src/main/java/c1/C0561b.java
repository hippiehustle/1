package c1;

/* renamed from: c1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0561b implements Y5.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f9436a;

    public C0561b(int i4) {
        this.f9436a = i4;
    }

    @Override // Y5.c
    public final Object get() {
        int i4 = this.f9436a;
        if (i4 != 0) {
            if (i4 == 1) {
                return new J1.e();
            }
            throw new AssertionError(i4);
        }
        return new U5.g();
    }
}
