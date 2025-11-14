package a6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import o6.AbstractC1287f;
import p6.InterfaceC1315a;

/* renamed from: a6.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0432g implements Collection, InterfaceC1315a {

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f7758d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7759e;

    public C0432g(Object[] objArr, boolean z8) {
        o6.j.e(objArr, "values");
        this.f7758d = objArr;
        this.f7759e = z8;
    }

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

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return AbstractC0434i.M0(obj, this.f7758d);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        o6.j.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!AbstractC0434i.M0(it.next(), this.f7758d)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f7758d.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return o6.j.g(this.f7758d);
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
        return this.f7758d.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f7758d;
        o6.j.e(objArr, "<this>");
        if (this.f7759e && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        o6.j.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        o6.j.e(objArr, "array");
        return AbstractC1287f.b(this, objArr);
    }
}
