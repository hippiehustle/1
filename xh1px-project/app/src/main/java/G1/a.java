package G1;

import l1.C0999a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f1693a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1694b;

    public a(C0999a c0999a, Object obj) {
        o6.j.e(c0999a, "id");
        this.f1693a = c0999a;
        this.f1694b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (o6.j.a(this.f1693a, aVar.f1693a) && o6.j.a(this.f1694b, aVar.f1694b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1694b.hashCode() + (this.f1693a.hashCode() * 31);
    }

    public final String toString() {
        return "ItemBrief(id=" + this.f1693a + ", data=" + this.f1694b + ")";
    }
}
