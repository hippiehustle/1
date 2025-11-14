package a6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class z extends AbstractC0430e {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f7774d;

    public z(ArrayList arrayList) {
        this.f7774d = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        this.f7774d.add(AbstractC0436k.j0(i4, this), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f7774d.clear();
    }

    @Override // a6.AbstractC0430e
    public final int g() {
        return this.f7774d.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        return this.f7774d.get(AbstractC0436k.i0(i4, this));
    }

    @Override // a6.AbstractC0430e
    public final Object h(int i4) {
        return this.f7774d.remove(AbstractC0436k.i0(i4, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new y(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new y(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        return this.f7774d.set(AbstractC0436k.i0(i4, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        return new y(this, i4);
    }
}
