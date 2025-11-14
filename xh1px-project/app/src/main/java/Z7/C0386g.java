package Z7;

import java.util.Arrays;

/* renamed from: Z7.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0386g extends U {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7599a;

    /* renamed from: b, reason: collision with root package name */
    public int f7600b;

    @Override // Z7.U
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f7599a, this.f7600b);
        o6.j.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // Z7.U
    public final void b(int i4) {
        byte[] bArr = this.f7599a;
        if (bArr.length < i4) {
            int length = bArr.length * 2;
            if (i4 < length) {
                i4 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i4);
            o6.j.d(copyOf, "copyOf(...)");
            this.f7599a = copyOf;
        }
    }

    @Override // Z7.U
    public final int d() {
        return this.f7600b;
    }
}
