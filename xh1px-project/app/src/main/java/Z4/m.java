package Z4;

import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7452a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7453b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7454c;

    public /* synthetic */ m(int i4, int i8, boolean z8, boolean z9) {
        this(255, z8, (i4 & 2) != 0 ? true : z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f7452a == mVar.f7452a && this.f7453b == mVar.f7453b && this.f7454c == mVar.f7454c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7454c) + AbstractC1149a.c(Boolean.hashCode(this.f7452a) * 31, 31, this.f7453b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Item(visible=");
        sb.append(this.f7452a);
        sb.append(", enabled=");
        sb.append(this.f7453b);
        sb.append(", iconAlpha=");
        return AbstractC1149a.h(sb, this.f7454c, ")");
    }

    public m(int i4, boolean z8, boolean z9) {
        this.f7452a = z8;
        this.f7453b = z9;
        this.f7454c = i4;
    }
}
