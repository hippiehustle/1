package b6;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import o6.j;
import p6.InterfaceC1316b;

/* renamed from: b6.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0540h extends AbstractCollection implements Collection, InterfaceC1316b {

    /* renamed from: d, reason: collision with root package name */
    public final C0538f f9239d;

    public C0540h(C0538f c0538f) {
        this.f9239d = c0538f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        j.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f9239d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f9239d.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f9239d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C0538f c0538f = this.f9239d;
        c0538f.getClass();
        return new C0536d(c0538f, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        C0538f c0538f = this.f9239d;
        c0538f.d();
        int k = c0538f.k(obj);
        if (k < 0) {
            return false;
        }
        c0538f.n(k);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        j.e(collection, "elements");
        this.f9239d.d();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        j.e(collection, "elements");
        this.f9239d.d();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f9239d.f9232l;
    }
}
