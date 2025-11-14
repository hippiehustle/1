package Z3;

import n1.AbstractC1149a;

/* renamed from: Z3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7359a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7360b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7361c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7362d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7363e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f7364f;

    public C0366a(boolean z8, String str, int i4, int i8, int i9, Integer num) {
        this.f7359a = z8;
        this.f7360b = str;
        this.f7361c = i4;
        this.f7362d = i8;
        this.f7363e = i9;
        this.f7364f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0366a)) {
            return false;
        }
        C0366a c0366a = (C0366a) obj;
        if (this.f7359a == c0366a.f7359a && o6.j.a(this.f7360b, c0366a.f7360b) && this.f7361c == c0366a.f7361c && this.f7362d == c0366a.f7362d && this.f7363e == c0366a.f7363e && o6.j.a(this.f7364f, c0366a.f7364f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b4 = AbstractC1149a.b(this.f7363e, AbstractC1149a.b(this.f7362d, AbstractC1149a.b(this.f7361c, A.j.c(this.f7360b, Boolean.hashCode(this.f7359a) * 31, 31), 31), 31), 31);
        Integer num = this.f7364f;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return b4 + hashCode;
    }

    public final String toString() {
        return "EventToggleSelectorState(isEnabled=" + this.f7359a + ", title=" + this.f7360b + ", enableCount=" + this.f7361c + ", toggleCount=" + this.f7362d + ", disableCount=" + this.f7363e + ", emptyText=" + this.f7364f + ")";
    }
}
