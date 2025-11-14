package t6;

import java.util.Iterator;
import p6.InterfaceC1315a;

/* renamed from: t6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1590e implements Iterable, InterfaceC1315a {

    /* renamed from: d, reason: collision with root package name */
    public final long f15135d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15136e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15137f;

    public C1590e(long j, long j5) {
        this.f15135d = j;
        if (j < j5) {
            long j8 = j5 % 1;
            long j9 = j % 1;
            long j10 = ((j8 < 0 ? j8 + 1 : j8) - (j9 < 0 ? j9 + 1 : j9)) % 1;
            j5 -= j10 < 0 ? j10 + 1 : j10;
        }
        this.f15136e = j5;
        this.f15137f = 1L;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1590e) {
            if (!isEmpty() || !((C1590e) obj).isEmpty()) {
                C1590e c1590e = (C1590e) obj;
                if (this.f15135d == c1590e.f15135d && this.f15136e == c1590e.f15136e) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.f15135d;
        long j5 = 31 * (j ^ (j >>> 32));
        long j8 = this.f15136e;
        return (int) (j5 + (j8 ^ (j8 >>> 32)));
    }

    public final boolean isEmpty() {
        if (this.f15135d > this.f15136e) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1589d(this.f15135d, this.f15136e, this.f15137f);
    }

    public final String toString() {
        return this.f15135d + ".." + this.f15136e;
    }
}
