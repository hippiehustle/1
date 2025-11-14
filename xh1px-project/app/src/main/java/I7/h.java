package I7;

import t6.C1588c;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f2239a;

    /* renamed from: b, reason: collision with root package name */
    public final C1588c f2240b;

    public h(String str, C1588c c1588c) {
        this.f2239a = str;
        this.f2240b = c1588c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (o6.j.a(this.f2239a, hVar.f2239a) && o6.j.a(this.f2240b, hVar.f2240b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2240b.hashCode() + (this.f2239a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f2239a + ", range=" + this.f2240b + ')';
    }
}
