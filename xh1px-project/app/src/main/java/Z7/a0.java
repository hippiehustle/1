package Z7;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class a0 extends U {

    /* renamed from: a, reason: collision with root package name */
    public short[] f7583a;

    /* renamed from: b, reason: collision with root package name */
    public int f7584b;

    @Override // Z7.U
    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.f7583a, this.f7584b);
        o6.j.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // Z7.U
    public final void b(int i4) {
        short[] sArr = this.f7583a;
        if (sArr.length < i4) {
            int length = sArr.length * 2;
            if (i4 < length) {
                i4 = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i4);
            o6.j.d(copyOf, "copyOf(...)");
            this.f7583a = copyOf;
        }
    }

    @Override // Z7.U
    public final int d() {
        return this.f7584b;
    }
}
