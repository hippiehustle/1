package B2;

import java.util.List;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f449a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f450b;

    public e(List list, boolean z8) {
        this.f449a = list;
        this.f450b = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f449a.equals(eVar.f449a) && this.f450b == eVar.f450b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC1149a.c(this.f449a.hashCode() * 31, 31, this.f450b);
    }

    public final String toString() {
        return "MultiStateButtonConfig(icons=" + this.f449a + ", selectionRequired=" + this.f450b + ", singleSelection=true)";
    }
}
