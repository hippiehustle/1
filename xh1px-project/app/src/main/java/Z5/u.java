package Z5;

import P.S;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import o6.AbstractC1287f;
import p6.InterfaceC1315a;

/* loaded from: classes.dex */
public final class u implements Collection, InterfaceC1315a {

    /* renamed from: d, reason: collision with root package name */
    public final long[] f7502d;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        long j = ((t) obj).f7501d;
        long[] jArr = this.f7502d;
        int length = jArr.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                if (j == jArr[i4]) {
                    break;
                }
                i4++;
            } else {
                i4 = -1;
                break;
            }
        }
        if (i4 < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        boolean z8;
        o6.j.e(collection, "elements");
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj instanceof t) {
                    long j = ((t) obj).f7501d;
                    long[] jArr = this.f7502d;
                    int length = jArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            if (j == jArr[i4]) {
                                break;
                            }
                            i4++;
                        } else {
                            i4 = -1;
                            break;
                        }
                    }
                    if (i4 >= 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            if (!o6.j.a(this.f7502d, ((u) obj).f7502d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f7502d);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f7502d.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new S(4, this.f7502d);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f7502d.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC1287f.a(this);
    }

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.f7502d) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        o6.j.e(objArr, "array");
        return AbstractC1287f.b(this, objArr);
    }
}
