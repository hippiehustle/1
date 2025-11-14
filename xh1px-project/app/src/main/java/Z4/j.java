package Z4;

import a5.EnumC0424h;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0424h f7447a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7448b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7449c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7450d;

    public j(EnumC0424h enumC0424h, boolean z8, boolean z9, boolean z10) {
        this.f7447a = enumC0424h;
        this.f7448b = z8;
        this.f7449c = z9;
        this.f7450d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f7447a == jVar.f7447a && this.f7448b == jVar.f7448b && this.f7449c == jVar.f7449c && this.f7450d == jVar.f7450d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7450d) + AbstractC1149a.c(AbstractC1149a.c(this.f7447a.hashCode() * 31, 31, this.f7448b), 31, this.f7449c);
    }

    public final String toString() {
        return "SortItem(sortType=" + this.f7447a + ", smartVisible=" + this.f7448b + ", dumbVisible=" + this.f7449c + ", changeOrderChecked=" + this.f7450d + ")";
    }
}
