package n0;

/* renamed from: n0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1148z {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12829a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12830b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12831c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12832d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12833e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12834f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12835g;

    /* renamed from: h, reason: collision with root package name */
    public final int f12836h;

    /* renamed from: i, reason: collision with root package name */
    public final int f12837i;

    public C1148z(boolean z8, boolean z9, int i4, boolean z10, boolean z11, int i8, int i9, int i10, int i11) {
        this.f12829a = z8;
        this.f12830b = z9;
        this.f12831c = i4;
        this.f12832d = z10;
        this.f12833e = z11;
        this.f12834f = i8;
        this.f12835g = i9;
        this.f12836h = i10;
        this.f12837i = i11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C1148z)) {
                C1148z c1148z = (C1148z) obj;
                if (this.f12829a == c1148z.f12829a && this.f12830b == c1148z.f12830b && this.f12831c == c1148z.f12831c && this.f12832d == c1148z.f12832d && this.f12833e == c1148z.f12833e && this.f12834f == c1148z.f12834f && this.f12835g == c1148z.f12835g && this.f12836h == c1148z.f12836h && this.f12837i == c1148z.f12837i) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f12829a ? 1 : 0) * 31) + (this.f12830b ? 1 : 0)) * 31) + this.f12831c) * 923521) + (this.f12832d ? 1 : 0)) * 31) + (this.f12833e ? 1 : 0)) * 31) + this.f12834f) * 31) + this.f12835g) * 31) + this.f12836h) * 31) + this.f12837i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C1148z.class.getSimpleName());
        sb.append("(");
        if (this.f12829a) {
            sb.append("launchSingleTop ");
        }
        if (this.f12830b) {
            sb.append("restoreState ");
        }
        int i4 = this.f12837i;
        int i8 = this.f12836h;
        int i9 = this.f12835g;
        int i10 = this.f12834f;
        if (i10 != -1 || i9 != -1 || i8 != -1 || i4 != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i10));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i9));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(i8));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(i4));
            sb.append(")");
        }
        String sb2 = sb.toString();
        o6.j.d(sb2, "toString(...)");
        return sb2;
    }
}
