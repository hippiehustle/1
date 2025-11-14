package Z7;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class D extends U {

    /* renamed from: a, reason: collision with root package name */
    public int[] f7542a;

    /* renamed from: b, reason: collision with root package name */
    public int f7543b;

    @Override // Z7.U
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f7542a, this.f7543b);
        o6.j.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // Z7.U
    public final void b(int i4) {
        int[] iArr = this.f7542a;
        if (iArr.length < i4) {
            int length = iArr.length * 2;
            if (i4 < length) {
                i4 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i4);
            o6.j.d(copyOf, "copyOf(...)");
            this.f7542a = copyOf;
        }
    }

    @Override // Z7.U
    public final int d() {
        return this.f7543b;
    }
}
