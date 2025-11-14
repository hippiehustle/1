package a6;

import P.S;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: a6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0429d extends AbstractC0426a implements List {
    @Override // java.util.List
    public final void add(int i4, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        o6.j.e(collection, "other");
        if (size() == collection.size()) {
            Iterator it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!o6.j.a(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int i4;
        int i8 = 1;
        for (Object obj : this) {
            int i9 = i8 * 31;
            if (obj != null) {
                i4 = obj.hashCode();
            } else {
                i4 = 0;
            }
            i8 = i9 + i4;
        }
        return i8;
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (o6.j.a(it.next(), obj)) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new S(6, this);
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (o6.j.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new C0427b(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i4, int i8) {
        return new C0428c(this, i4, i8);
    }

    public ListIterator listIterator(int i4) {
        return new C0427b(this, i4);
    }
}
