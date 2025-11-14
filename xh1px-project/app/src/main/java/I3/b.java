package I3;

import java.util.List;
import n1.AbstractC1149a;
import o6.j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f2089a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2090b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2091c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2092d;

    public b(List list, List list2, boolean z8, boolean z9) {
        this.f2089a = list;
        this.f2090b = list2;
        this.f2091c = z8;
        this.f2092d = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.f2089a, bVar.f2089a) && j.a(this.f2090b, bVar.f2090b) && this.f2091c == bVar.f2091c && this.f2092d == bVar.f2092d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        List list = this.f2089a;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return Boolean.hashCode(this.f2092d) + AbstractC1149a.c((this.f2090b.hashCode() + (hashCode * 31)) * 31, 31, this.f2091c);
    }

    public final String toString() {
        return "EditedListState(value=" + this.f2089a + ", itemValidity=" + this.f2090b + ", hasChanged=" + this.f2091c + ", canBeSaved=" + this.f2092d + ")";
    }
}
