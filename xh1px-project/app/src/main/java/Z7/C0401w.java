package Z7;

import java.util.Arrays;

/* renamed from: Z7.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0401w extends U {

    /* renamed from: a, reason: collision with root package name */
    public float[] f7650a;

    /* renamed from: b, reason: collision with root package name */
    public int f7651b;

    @Override // Z7.U
    public final Object a() {
        float[] copyOf = Arrays.copyOf(this.f7650a, this.f7651b);
        o6.j.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // Z7.U
    public final void b(int i4) {
        float[] fArr = this.f7650a;
        if (fArr.length < i4) {
            int length = fArr.length * 2;
            if (i4 < length) {
                i4 = length;
            }
            float[] copyOf = Arrays.copyOf(fArr, i4);
            o6.j.d(copyOf, "copyOf(...)");
            this.f7650a = copyOf;
        }
    }

    @Override // Z7.U
    public final int d() {
        return this.f7651b;
    }
}
