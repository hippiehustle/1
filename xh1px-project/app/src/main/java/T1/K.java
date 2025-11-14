package T1;

import Z7.Q;
import m1.InterfaceC1052b;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class K implements InterfaceC1052b {
    public static final J Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final long f5528a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5529b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5530c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5531d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5532e;

    public /* synthetic */ K(int i4, long j, String str, int i8, boolean z8, boolean z9) {
        if (7 != (i4 & 7)) {
            Q.f(i4, 7, I.f5527a.d());
            throw null;
        }
        this.f5528a = j;
        this.f5529b = str;
        this.f5530c = i8;
        if ((i4 & 8) == 0) {
            this.f5531d = false;
        } else {
            this.f5531d = z8;
        }
        if ((i4 & 16) == 0) {
            this.f5532e = false;
        } else {
            this.f5532e = z9;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k = (K) obj;
        if (this.f5528a == k.f5528a && o6.j.a(this.f5529b, k.f5529b) && this.f5530c == k.f5530c && this.f5531d == k.f5531d && this.f5532e == k.f5532e) {
            return true;
        }
        return false;
    }

    @Override // m1.InterfaceC1052b
    public final long getId() {
        return this.f5528a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5532e) + AbstractC1149a.c(AbstractC1149a.b(this.f5530c, A.j.c(this.f5529b, Long.hashCode(this.f5528a) * 31, 31), 31), 31, this.f5531d);
    }

    public final String toString() {
        return "ScenarioEntity(id=" + this.f5528a + ", name=" + this.f5529b + ", detectionQuality=" + this.f5530c + ", randomize=" + this.f5531d + ", keepScreenOn=" + this.f5532e + ")";
    }

    public K(long j, String str, int i4, boolean z8, boolean z9) {
        o6.j.e(str, "name");
        this.f5528a = j;
        this.f5529b = str;
        this.f5530c = i4;
        this.f5531d = z8;
        this.f5532e = z9;
    }
}
