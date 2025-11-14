package T1;

import Z7.Q;
import java.util.List;

/* renamed from: T1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313l {
    public static final C0312k Companion = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Z5.g[] f5603d;

    /* renamed from: a, reason: collision with root package name */
    public final x f5604a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5605b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5606c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, T1.k] */
    static {
        B1.e eVar = new B1.e(12);
        Z5.h hVar = Z5.h.f7482d;
        f5603d = new Z5.g[]{null, Z5.a.c(hVar, eVar), Z5.a.c(hVar, new B1.e(13))};
    }

    public /* synthetic */ C0313l(int i4, x xVar, List list, List list2) {
        if (7 != (i4 & 7)) {
            Q.f(i4, 7, C0311j.f5602a.d());
            throw null;
        }
        this.f5604a = xVar;
        this.f5605b = list;
        this.f5606c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0313l)) {
            return false;
        }
        C0313l c0313l = (C0313l) obj;
        if (o6.j.a(this.f5604a, c0313l.f5604a) && o6.j.a(this.f5605b, c0313l.f5605b) && o6.j.a(this.f5606c, c0313l.f5606c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5606c.hashCode() + ((this.f5605b.hashCode() + (this.f5604a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CompleteEventEntity(event=" + this.f5604a + ", actions=" + this.f5605b + ", conditions=" + this.f5606c + ")";
    }

    public C0313l(x xVar, List list, List list2) {
        o6.j.e(xVar, "event");
        o6.j.e(list, "actions");
        o6.j.e(list2, "conditions");
        this.f5604a = xVar;
        this.f5605b = list;
        this.f5606c = list2;
    }
}
