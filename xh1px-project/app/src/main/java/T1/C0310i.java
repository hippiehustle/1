package T1;

import Z7.Q;
import java.util.List;

/* renamed from: T1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310i {
    public static final C0309h Companion = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Z5.g[] f5598d;

    /* renamed from: a, reason: collision with root package name */
    public final C0304c f5599a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5600b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5601c;

    /* JADX WARN: Type inference failed for: r0v0, types: [T1.h, java.lang.Object] */
    static {
        B1.e eVar = new B1.e(10);
        Z5.h hVar = Z5.h.f7482d;
        f5598d = new Z5.g[]{null, Z5.a.c(hVar, eVar), Z5.a.c(hVar, new B1.e(11))};
    }

    public /* synthetic */ C0310i(int i4, C0304c c0304c, List list, List list2) {
        if (7 != (i4 & 7)) {
            Q.f(i4, 7, C0308g.f5597a.d());
            throw null;
        }
        this.f5599a = c0304c;
        this.f5600b = list;
        this.f5601c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0310i)) {
            return false;
        }
        C0310i c0310i = (C0310i) obj;
        if (o6.j.a(this.f5599a, c0310i.f5599a) && o6.j.a(this.f5600b, c0310i.f5600b) && o6.j.a(this.f5601c, c0310i.f5601c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5601c.hashCode() + ((this.f5600b.hashCode() + (this.f5599a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CompleteActionEntity(action=" + this.f5599a + ", intentExtras=" + this.f5600b + ", eventsToggle=" + this.f5601c + ")";
    }

    public C0310i(C0304c c0304c, List list, List list2) {
        o6.j.e(c0304c, "action");
        this.f5599a = c0304c;
        this.f5600b = list;
        this.f5601c = list2;
    }
}
