package Z7;

import java.util.Arrays;

/* renamed from: Z7.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0390k extends U {

    /* renamed from: a, reason: collision with root package name */
    public char[] f7611a;

    /* renamed from: b, reason: collision with root package name */
    public int f7612b;

    @Override // Z7.U
    public final Object a() {
        char[] copyOf = Arrays.copyOf(this.f7611a, this.f7612b);
        o6.j.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // Z7.U
    public final void b(int i4) {
        char[] cArr = this.f7611a;
        if (cArr.length < i4) {
            int length = cArr.length * 2;
            if (i4 < length) {
                i4 = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i4);
            o6.j.d(copyOf, "copyOf(...)");
            this.f7611a = copyOf;
        }
    }

    @Override // Z7.U
    public final int d() {
        return this.f7612b;
    }
}
