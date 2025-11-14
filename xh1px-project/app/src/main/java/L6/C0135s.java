package L6;

/* renamed from: L6.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0135s extends K {

    /* renamed from: a, reason: collision with root package name */
    public final String f3161a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3162b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3163c;

    public C0135s(String str, int i4) {
        o6.j.e(str, "className");
        this.f3161a = str;
        this.f3162b = i4;
        if (i4 > 0) {
            StringBuilder sb = new StringBuilder("ArrayKClassValue(");
            for (int i8 = 0; i8 < i4; i8++) {
                sb.append("kotlin/Array<");
            }
            sb.append(this.f3161a);
            int i9 = this.f3162b;
            for (int i10 = 0; i10 < i9; i10++) {
                sb.append(">");
            }
            sb.append(")");
            this.f3163c = sb.toString();
            return;
        }
        throw new IllegalArgumentException("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0135s)) {
            return false;
        }
        C0135s c0135s = (C0135s) obj;
        if (o6.j.a(this.f3161a, c0135s.f3161a) && this.f3162b == c0135s.f3162b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3162b) + (this.f3161a.hashCode() * 31);
    }

    public final String toString() {
        return this.f3163c;
    }
}
