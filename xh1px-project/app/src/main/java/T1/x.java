package T1;

import Z7.Q;
import m1.InterfaceC1052b;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class x implements InterfaceC1052b {
    public static final w Companion = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static final Z5.g[] f5651i = {null, null, null, null, null, null, Z5.a.c(Z5.h.f7482d, new B1.e(18)), null};

    /* renamed from: a, reason: collision with root package name */
    public final long f5652a;

    /* renamed from: b, reason: collision with root package name */
    public long f5653b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5654c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5655d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5656e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5657f;

    /* renamed from: g, reason: collision with root package name */
    public final C f5658g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f5659h;

    public /* synthetic */ x(int i4, long j, long j5, String str, int i8, int i9, boolean z8, C c6, Boolean bool) {
        if (95 != (i4 & 95)) {
            Q.f(i4, 95, v.f5650a.d());
            throw null;
        }
        this.f5652a = j;
        this.f5653b = j5;
        this.f5654c = str;
        this.f5655d = i8;
        this.f5656e = i9;
        if ((i4 & 32) == 0) {
            this.f5657f = true;
        } else {
            this.f5657f = z8;
        }
        this.f5658g = c6;
        if ((i4 & 128) == 0) {
            this.f5659h = null;
        } else {
            this.f5659h = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f5652a == xVar.f5652a && this.f5653b == xVar.f5653b && o6.j.a(this.f5654c, xVar.f5654c) && this.f5655d == xVar.f5655d && this.f5656e == xVar.f5656e && this.f5657f == xVar.f5657f && this.f5658g == xVar.f5658g && o6.j.a(this.f5659h, xVar.f5659h)) {
            return true;
        }
        return false;
    }

    @Override // m1.InterfaceC1052b
    public final long getId() {
        return this.f5652a;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f5658g.hashCode() + AbstractC1149a.c(AbstractC1149a.b(this.f5656e, AbstractC1149a.b(this.f5655d, A.j.c(this.f5654c, AbstractC1149a.d(this.f5653b, Long.hashCode(this.f5652a) * 31, 31), 31), 31), 31), 31, this.f5657f)) * 31;
        Boolean bool = this.f5659h;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "EventEntity(id=" + this.f5652a + ", scenarioId=" + this.f5653b + ", name=" + this.f5654c + ", conditionOperator=" + this.f5655d + ", priority=" + this.f5656e + ", enabledOnStart=" + this.f5657f + ", type=" + this.f5658g + ", keepDetecting=" + this.f5659h + ")";
    }

    public x(long j, long j5, String str, int i4, int i8, boolean z8, C c6, Boolean bool) {
        o6.j.e(str, "name");
        this.f5652a = j;
        this.f5653b = j5;
        this.f5654c = str;
        this.f5655d = i4;
        this.f5656e = i8;
        this.f5657f = z8;
        this.f5658g = c6;
        this.f5659h = bool;
    }
}
