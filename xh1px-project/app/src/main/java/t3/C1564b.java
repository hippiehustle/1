package t3;

import i.AbstractC0862a;

/* renamed from: t3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1564b extends AbstractC0862a {

    /* renamed from: b, reason: collision with root package name */
    public final String f15050b;

    public C1564b(String str) {
        this.f15050b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1564b) && o6.j.a(this.f15050b, ((C1564b) obj).f15050b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15050b.hashCode();
    }

    public final String toString() {
        return A.j.p("Broadcast(action=", this.f15050b, ")");
    }
}
