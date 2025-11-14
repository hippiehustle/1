package Z3;

import l1.C0999a;
import n1.AbstractC1149a;

/* renamed from: Z3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0374i extends AbstractC0375j {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f7380a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7381b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7382c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7383d;

    /* renamed from: e, reason: collision with root package name */
    public final f2.n f7384e;

    public C0374i(C0999a c0999a, String str, int i4, int i8, f2.n nVar) {
        o6.j.e(c0999a, "eventId");
        o6.j.e(str, "eventName");
        this.f7380a = c0999a;
        this.f7381b = str;
        this.f7382c = i4;
        this.f7383d = i8;
        this.f7384e = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0374i)) {
            return false;
        }
        C0374i c0374i = (C0374i) obj;
        if (o6.j.a(this.f7380a, c0374i.f7380a) && o6.j.a(this.f7381b, c0374i.f7381b) && this.f7382c == c0374i.f7382c && this.f7383d == c0374i.f7383d && this.f7384e == c0374i.f7384e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b4 = AbstractC1149a.b(this.f7383d, AbstractC1149a.b(this.f7382c, A.j.c(this.f7381b, this.f7380a.hashCode() * 31, 31), 31), 31);
        f2.n nVar = this.f7384e;
        if (nVar == null) {
            hashCode = 0;
        } else {
            hashCode = nVar.hashCode();
        }
        return b4 + hashCode;
    }

    public final String toString() {
        return "Item(eventId=" + this.f7380a + ", eventName=" + this.f7381b + ", actionsCount=" + this.f7382c + ", conditionsCount=" + this.f7383d + ", toggleState=" + this.f7384e + ")";
    }
}
