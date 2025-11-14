package Z7;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class J extends U {

    /* renamed from: a, reason: collision with root package name */
    public long[] f7551a;

    /* renamed from: b, reason: collision with root package name */
    public int f7552b;

    @Override // Z7.U
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f7551a, this.f7552b);
        o6.j.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // Z7.U
    public final void b(int i4) {
        long[] jArr = this.f7551a;
        if (jArr.length < i4) {
            int length = jArr.length * 2;
            if (i4 < length) {
                i4 = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i4);
            o6.j.d(copyOf, "copyOf(...)");
            this.f7551a = copyOf;
        }
    }

    @Override // Z7.U
    public final int d() {
        return this.f7552b;
    }
}
