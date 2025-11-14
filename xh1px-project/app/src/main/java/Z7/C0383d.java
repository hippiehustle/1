package Z7;

import java.util.Arrays;

/* renamed from: Z7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0383d extends U {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f7589a;

    /* renamed from: b, reason: collision with root package name */
    public int f7590b;

    @Override // Z7.U
    public final Object a() {
        boolean[] copyOf = Arrays.copyOf(this.f7589a, this.f7590b);
        o6.j.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // Z7.U
    public final void b(int i4) {
        boolean[] zArr = this.f7589a;
        if (zArr.length < i4) {
            int length = zArr.length * 2;
            if (i4 < length) {
                i4 = length;
            }
            boolean[] copyOf = Arrays.copyOf(zArr, i4);
            o6.j.d(copyOf, "copyOf(...)");
            this.f7589a = copyOf;
        }
    }

    @Override // Z7.U
    public final int d() {
        return this.f7590b;
    }
}
