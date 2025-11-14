package G2;

import java.util.List;
import o6.j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f1734a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f1735b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f1736c;

    public a(List list, Integer num, Integer num2) {
        this.f1734a = list;
        this.f1735b = num;
        this.f1736c = num2;
    }

    public static a a(a aVar, List list, Integer num, Integer num2, int i4) {
        if ((i4 & 1) != 0) {
            list = aVar.f1734a;
        }
        if ((i4 & 2) != 0) {
            num = aVar.f1735b;
        }
        if ((i4 & 4) != 0) {
            num2 = aVar.f1736c;
        }
        return new a(list, num, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.f1734a, aVar.f1734a) && j.a(this.f1735b, aVar.f1735b) && j.a(this.f1736c, aVar.f1736c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f1734a.hashCode() * 31;
        int i4 = 0;
        Integer num = this.f1735b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i8 = (hashCode2 + hashCode) * 31;
        Integer num2 = this.f1736c;
        if (num2 != null) {
            i4 = num2.hashCode();
        }
        return i8 + i4;
    }

    public final String toString() {
        return "DescriptionsState(descriptions=" + this.f1734a + ", displayedIndex=" + this.f1735b + ", maxLinesCount=" + this.f1736c + ")";
    }
}
