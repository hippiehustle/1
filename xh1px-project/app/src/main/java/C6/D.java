package C6;

import f7.C0722b;
import java.util.List;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final C0722b f715a;

    /* renamed from: b, reason: collision with root package name */
    public final List f716b;

    public D(C0722b c0722b, List list) {
        o6.j.e(c0722b, "classId");
        this.f715a = c0722b;
        this.f716b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d2 = (D) obj;
        if (o6.j.a(this.f715a, d2.f715a) && o6.j.a(this.f716b, d2.f716b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f716b.hashCode() + (this.f715a.hashCode() * 31);
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.f715a + ", typeParametersCount=" + this.f716b + ')';
    }
}
