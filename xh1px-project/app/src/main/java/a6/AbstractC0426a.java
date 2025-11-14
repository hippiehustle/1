package a6;

import java.util.Collection;
import java.util.Iterator;
import o6.AbstractC1287f;
import p6.InterfaceC1315a;

/* renamed from: a6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0426a implements Collection, InterfaceC1315a {
    @Override // java.util.Collection
    public final boolean add(Object obj) {
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

    @Override // java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (o6.j.a(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        o6.j.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract int g();

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (g() == 0) {
            return true;
        }
        return false;
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
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC1287f.a(this);
    }

    public final String toString() {
        return AbstractC0436k.v0(this, ", ", "[", "]", new A1.h(19, this), 24);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        o6.j.e(objArr, "array");
        return AbstractC1287f.b(this, objArr);
    }
}
