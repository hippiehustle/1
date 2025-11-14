package a8;

import a6.AbstractC0436k;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import o6.AbstractC1287f;
import p6.InterfaceC1315a;

/* loaded from: classes.dex */
public final class d extends j implements List<j>, InterfaceC1315a {
    public static final c Companion = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final List f8283d;

    public d(List list) {
        o6.j.e(list, "content");
        this.f8283d = list;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i4, j jVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection<? extends j> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        o6.j.e(jVar, "element");
        return this.f8283d.contains(jVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        o6.j.e(collection, "elements");
        return this.f8283d.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return o6.j.a(this.f8283d, obj);
    }

    @Override // java.util.List
    public final j get(int i4) {
        return (j) this.f8283d.get(i4);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f8283d.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof j)) {
            return -1;
        }
        j jVar = (j) obj;
        o6.j.e(jVar, "element");
        return this.f8283d.indexOf(jVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f8283d.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f8283d.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof j)) {
            return -1;
        }
        j jVar = (j) obj;
        o6.j.e(jVar, "element");
        return this.f8283d.lastIndexOf(jVar);
    }

    @Override // java.util.List
    public final ListIterator<j> listIterator() {
        return this.f8283d.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ j remove(int i4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<j> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ j set(int i4, j jVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f8283d.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super j> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<j> subList(int i4, int i8) {
        return this.f8283d.subList(i4, i8);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1287f.a(this);
    }

    public final String toString() {
        return AbstractC0436k.v0(this.f8283d, ",", "[", "]", null, 56);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<j> listIterator(int i4) {
        return this.f8283d.listIterator(i4);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        o6.j.e(objArr, "array");
        return AbstractC1287f.b(this, objArr);
    }
}
