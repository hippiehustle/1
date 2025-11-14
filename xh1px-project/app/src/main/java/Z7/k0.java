package Z7;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k0 extends U {

    /* renamed from: a, reason: collision with root package name */
    public long[] f7613a;

    /* renamed from: b, reason: collision with root package name */
    public int f7614b;

    @Override // Z7.U
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f7613a, this.f7614b);
        o6.j.d(copyOf, "copyOf(...)");
        return new Z5.u(copyOf);
    }

    @Override // Z7.U
    public final void b(int i4) {
        long[] jArr = this.f7613a;
        if (jArr.length < i4) {
            int length = jArr.length * 2;
            if (i4 < length) {
                i4 = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i4);
            o6.j.d(copyOf, "copyOf(...)");
            this.f7613a = copyOf;
        }
    }

    @Override // Z7.U
    public final int d() {
        return this.f7614b;
    }
}
