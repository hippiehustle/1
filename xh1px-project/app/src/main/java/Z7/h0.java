package Z7;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h0 extends U {

    /* renamed from: a, reason: collision with root package name */
    public int[] f7604a;

    /* renamed from: b, reason: collision with root package name */
    public int f7605b;

    @Override // Z7.U
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f7604a, this.f7605b);
        o6.j.d(copyOf, "copyOf(...)");
        return new Z5.s(copyOf);
    }

    @Override // Z7.U
    public final void b(int i4) {
        int[] iArr = this.f7604a;
        if (iArr.length < i4) {
            int length = iArr.length * 2;
            if (i4 < length) {
                i4 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            o6.j.d(copyOf, "copyOf(...)");
            this.f7604a = copyOf;
        }
    }

    @Override // Z7.U
    public final int d() {
        return this.f7605b;
    }
}
