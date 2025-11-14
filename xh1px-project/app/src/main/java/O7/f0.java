package O7;

import a6.AbstractC0436k;
import b6.C0535c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class f0 implements a0 {

    /* renamed from: d, reason: collision with root package name */
    public final long f4137d;

    public f0(long j) {
        this.f4137d = j;
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [f6.j, n6.c] */
    @Override // O7.a0
    public final InterfaceC0233f a(P7.D d2) {
        return V.k(new A.i(V.u(d2, new d0(this, null)), (InterfaceC1164c) new AbstractC0720j(2, null)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f0) {
            if (this.f4137d == ((f0) obj).f4137d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(Long.MAX_VALUE) + (Long.hashCode(this.f4137d) * 31);
    }

    public final String toString() {
        C0535c c0535c = new C0535c(2);
        long j = this.f4137d;
        if (j > 0) {
            c0535c.add("stopTimeout=" + j + "ms");
        }
        return A.j.q(new StringBuilder("SharingStarted.WhileSubscribed("), AbstractC0436k.v0(E2.d.f(c0535c), null, null, null, null, 63), ')');
    }
}
