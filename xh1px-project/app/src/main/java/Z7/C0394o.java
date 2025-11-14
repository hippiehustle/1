package Z7;

import java.util.Arrays;

/* renamed from: Z7.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0394o extends U {

    /* renamed from: a, reason: collision with root package name */
    public double[] f7624a;

    /* renamed from: b, reason: collision with root package name */
    public int f7625b;

    @Override // Z7.U
    public final Object a() {
        double[] copyOf = Arrays.copyOf(this.f7624a, this.f7625b);
        o6.j.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // Z7.U
    public final void b(int i4) {
        double[] dArr = this.f7624a;
        if (dArr.length < i4) {
            int length = dArr.length * 2;
            if (i4 < length) {
                i4 = length;
            }
            double[] copyOf = Arrays.copyOf(dArr, i4);
            o6.j.d(copyOf, "copyOf(...)");
            this.f7624a = copyOf;
        }
    }

    @Override // Z7.U
    public final int d() {
        return this.f7625b;
    }
}
