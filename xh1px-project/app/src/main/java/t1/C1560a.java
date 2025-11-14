package t1;

import E.j;
import n1.AbstractC1149a;

/* renamed from: t1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1560a {

    /* renamed from: a, reason: collision with root package name */
    public final String f15039a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15040b;

    /* renamed from: c, reason: collision with root package name */
    public final j f15041c;

    public C1560a(String str, int i4, j jVar) {
        o6.j.e(str, "groupName");
        this.f15039a = str;
        this.f15040b = i4;
        this.f15041c = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1560a)) {
            return false;
        }
        C1560a c1560a = (C1560a) obj;
        if (o6.j.a(this.f15039a, c1560a.f15039a) && this.f15040b == c1560a.f15040b && o6.j.a(this.f15041c, c1560a.f15041c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15041c.hashCode() + AbstractC1149a.b(this.f15040b, this.f15039a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ActionNotificationGroup(groupName=" + this.f15039a + ", summaryId=" + this.f15040b + ", summaryBuilder=" + this.f15041c + ")";
    }
}
