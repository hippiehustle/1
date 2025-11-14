package t6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p6.InterfaceC1315a;

/* renamed from: t6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1589d implements Iterator, InterfaceC1315a {

    /* renamed from: d, reason: collision with root package name */
    public final long f15131d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15132e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15133f;

    /* renamed from: g, reason: collision with root package name */
    public long f15134g;

    public C1589d(long j, long j5, long j8) {
        this.f15131d = j8;
        this.f15132e = j5;
        boolean z8 = false;
        if (j8 <= 0 ? j >= j5 : j <= j5) {
            z8 = true;
        }
        this.f15133f = z8;
        this.f15134g = z8 ? j : j5;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15133f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.f15134g;
        if (j == this.f15132e) {
            if (this.f15133f) {
                this.f15133f = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f15134g = this.f15131d + j;
        }
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
