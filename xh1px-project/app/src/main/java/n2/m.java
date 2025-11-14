package n2;

import Z7.Q;
import m1.InterfaceC1052b;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class m implements InterfaceC1052b {
    public static final l Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final long f12911a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12912b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12913c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12914d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12915e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f12916f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12917g;

    public /* synthetic */ m(int i4, long j, String str, int i8, boolean z8, int i9, boolean z9, boolean z10) {
        if (127 != (i4 & 127)) {
            Q.f(i4, 127, k.f12910a.d());
            throw null;
        }
        this.f12911a = j;
        this.f12912b = str;
        this.f12913c = i8;
        this.f12914d = z8;
        this.f12915e = i9;
        this.f12916f = z9;
        this.f12917g = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f12911a == mVar.f12911a && o6.j.a(this.f12912b, mVar.f12912b) && this.f12913c == mVar.f12913c && this.f12914d == mVar.f12914d && this.f12915e == mVar.f12915e && this.f12916f == mVar.f12916f && this.f12917g == mVar.f12917g) {
            return true;
        }
        return false;
    }

    @Override // m1.InterfaceC1052b
    public final long getId() {
        return this.f12911a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12917g) + AbstractC1149a.c(AbstractC1149a.b(this.f12915e, AbstractC1149a.c(AbstractC1149a.b(this.f12913c, A.j.c(this.f12912b, Long.hashCode(this.f12911a) * 31, 31), 31), 31, this.f12914d), 31), 31, this.f12916f);
    }

    public final String toString() {
        return "DumbScenarioEntity(id=" + this.f12911a + ", name=" + this.f12912b + ", repeatCount=" + this.f12913c + ", isRepeatInfinite=" + this.f12914d + ", maxDurationMin=" + this.f12915e + ", isDurationInfinite=" + this.f12916f + ", randomize=" + this.f12917g + ")";
    }

    public m(long j, String str, int i4, boolean z8, int i8, boolean z9, boolean z10) {
        o6.j.e(str, "name");
        this.f12911a = j;
        this.f12912b = str;
        this.f12913c = i4;
        this.f12914d = z8;
        this.f12915e = i8;
        this.f12916f = z9;
        this.f12917g = z10;
    }
}
