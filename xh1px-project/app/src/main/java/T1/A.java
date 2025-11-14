package T1;

import Z7.Q;
import m1.InterfaceC1052b;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class A implements InterfaceC1052b {
    public static final z Companion = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final Z5.g[] f5498e = {null, null, Z5.a.c(Z5.h.f7482d, new B1.e(19)), null};

    /* renamed from: a, reason: collision with root package name */
    public final long f5499a;

    /* renamed from: b, reason: collision with root package name */
    public long f5500b;

    /* renamed from: c, reason: collision with root package name */
    public final B f5501c;

    /* renamed from: d, reason: collision with root package name */
    public long f5502d;

    public /* synthetic */ A(int i4, long j, long j5, B b4, long j8) {
        if (15 != (i4 & 15)) {
            Q.f(i4, 15, y.f5660a.d());
            throw null;
        }
        this.f5499a = j;
        this.f5500b = j5;
        this.f5501c = b4;
        this.f5502d = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a3 = (A) obj;
        if (this.f5499a == a3.f5499a && this.f5500b == a3.f5500b && this.f5501c == a3.f5501c && this.f5502d == a3.f5502d) {
            return true;
        }
        return false;
    }

    @Override // m1.InterfaceC1052b
    public final long getId() {
        return this.f5499a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5502d) + ((this.f5501c.hashCode() + AbstractC1149a.d(this.f5500b, Long.hashCode(this.f5499a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "EventToggleEntity(id=" + this.f5499a + ", actionId=" + this.f5500b + ", type=" + this.f5501c + ", toggleEventId=" + this.f5502d + ")";
    }

    public A(long j, long j5, B b4, long j8) {
        o6.j.e(b4, "type");
        this.f5499a = j;
        this.f5500b = j5;
        this.f5501c = b4;
        this.f5502d = j8;
    }
}
