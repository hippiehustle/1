package B6;

import f7.C0722b;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final C0722b f454a;

    /* renamed from: b, reason: collision with root package name */
    public final C0722b f455b;

    /* renamed from: c, reason: collision with root package name */
    public final C0722b f456c;

    public c(C0722b c0722b, C0722b c0722b2, C0722b c0722b3) {
        this.f454a = c0722b;
        this.f455b = c0722b2;
        this.f456c = c0722b3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (o6.j.a(this.f454a, cVar.f454a) && o6.j.a(this.f455b, cVar.f455b) && o6.j.a(this.f456c, cVar.f456c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f456c.hashCode() + ((this.f455b.hashCode() + (this.f454a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.f454a + ", kotlinReadOnly=" + this.f455b + ", kotlinMutable=" + this.f456c + ')';
    }
}
