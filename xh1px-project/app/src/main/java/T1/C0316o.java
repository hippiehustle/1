package T1;

import Z7.Q;
import java.util.List;

/* renamed from: T1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316o {
    public static final C0315n Companion = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final Z5.g[] f5608c = {null, Z5.a.c(Z5.h.f7482d, new B1.e(14))};

    /* renamed from: a, reason: collision with root package name */
    public final K f5609a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5610b;

    public /* synthetic */ C0316o(int i4, K k, List list) {
        if (3 != (i4 & 3)) {
            Q.f(i4, 3, C0314m.f5607a.d());
            throw null;
        }
        this.f5609a = k;
        this.f5610b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0316o)) {
            return false;
        }
        C0316o c0316o = (C0316o) obj;
        if (o6.j.a(this.f5609a, c0316o.f5609a) && o6.j.a(this.f5610b, c0316o.f5610b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5610b.hashCode() + (this.f5609a.hashCode() * 31);
    }

    public final String toString() {
        return "CompleteScenario(scenario=" + this.f5609a + ", events=" + this.f5610b + ")";
    }

    public C0316o(K k, List list) {
        o6.j.e(k, "scenario");
        o6.j.e(list, "events");
        this.f5609a = k;
        this.f5610b = list;
    }
}
