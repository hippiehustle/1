package n2;

import Z7.Q;
import java.util.List;

/* loaded from: classes.dex */
public final class s {
    public static final r Companion = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Z5.g[] f12924d = {null, Z5.a.c(Z5.h.f7482d, new B1.e(29)), null};

    /* renamed from: a, reason: collision with root package name */
    public final m f12925a;

    /* renamed from: b, reason: collision with root package name */
    public final List f12926b;

    /* renamed from: c, reason: collision with root package name */
    public final p f12927c;

    public /* synthetic */ s(int i4, m mVar, List list, p pVar) {
        if (7 != (i4 & 7)) {
            Q.f(i4, 7, q.f12923a.d());
            throw null;
        }
        this.f12925a = mVar;
        this.f12926b = list;
        this.f12927c = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (o6.j.a(this.f12925a, sVar.f12925a) && o6.j.a(this.f12926b, sVar.f12926b) && o6.j.a(this.f12927c, sVar.f12927c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f12926b.hashCode() + (this.f12925a.hashCode() * 31)) * 31;
        p pVar = this.f12927c;
        if (pVar == null) {
            hashCode = 0;
        } else {
            hashCode = pVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "DumbScenarioWithActions(scenario=" + this.f12925a + ", dumbActions=" + this.f12926b + ", stats=" + this.f12927c + ")";
    }

    public s(m mVar, List list, p pVar) {
        this.f12925a = mVar;
        this.f12926b = list;
        this.f12927c = pVar;
    }
}
