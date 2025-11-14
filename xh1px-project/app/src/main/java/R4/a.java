package R4;

import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5120a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5121b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5122c;

    public a(int i4, int i8, int i9) {
        this.f5120a = i4;
        this.f5121b = i8;
        this.f5122c = i9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f5120a != aVar.f5120a || this.f5121b != aVar.f5121b || this.f5122c != aVar.f5122c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5122c) + AbstractC1149a.b(this.f5121b, Integer.hashCode(this.f5120a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TutorialItem(nameResId=");
        sb.append(this.f5120a);
        sb.append(", descResId=");
        sb.append(this.f5121b);
        sb.append(", index=");
        return AbstractC1149a.h(sb, this.f5122c, ")");
    }
}
