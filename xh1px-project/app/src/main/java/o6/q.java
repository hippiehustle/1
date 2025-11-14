package o6;

import L7.C0165x;
import u6.InterfaceC1641b;

/* loaded from: classes.dex */
public abstract class q extends AbstractC1284c implements u6.s {
    public final boolean j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, r8);
        boolean z8;
        if ((i4 & 1) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.j = (i4 & 2) == 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (g().equals(qVar.g()) && this.f13631g.equals(qVar.f13631g) && this.f13632h.equals(qVar.f13632h) && j.a(this.f13629e, qVar.f13629e)) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof u6.s)) {
            return false;
        }
        return obj.equals(h());
    }

    public final InterfaceC1641b h() {
        if (this.j) {
            return this;
        }
        InterfaceC1641b interfaceC1641b = this.f13628d;
        if (interfaceC1641b == null) {
            InterfaceC1641b f8 = f();
            this.f13628d = f8;
            return f8;
        }
        return interfaceC1641b;
    }

    public final int hashCode() {
        return this.f13632h.hashCode() + A.j.c(this.f13631g, g().hashCode() * 31, 31);
    }

    public final u6.s k() {
        if (!this.j) {
            InterfaceC1641b h8 = h();
            if (h8 != this) {
                return (u6.s) h8;
            }
            throw new C0165x();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }

    public final String toString() {
        InterfaceC1641b h8 = h();
        if (h8 != this) {
            return h8.toString();
        }
        return A.j.r(new StringBuilder("property "), this.f13631g, " (Kotlin reflection is not available)");
    }
}
