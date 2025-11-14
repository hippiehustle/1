package Z7;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e0 extends U {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7594a;

    /* renamed from: b, reason: collision with root package name */
    public int f7595b;

    @Override // Z7.U
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f7594a, this.f7595b);
        o6.j.d(copyOf, "copyOf(...)");
        return new Z5.q(copyOf);
    }

    @Override // Z7.U
    public final void b(int i4) {
        byte[] bArr = this.f7594a;
        if (bArr.length < i4) {
            int length = bArr.length * 2;
            if (i4 < length) {
                i4 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i4);
            o6.j.d(copyOf, "copyOf(...)");
            this.f7594a = copyOf;
        }
    }

    @Override // Z7.U
    public final int d() {
        return this.f7595b;
    }
}
