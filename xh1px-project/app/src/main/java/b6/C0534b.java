package b6;

import a6.AbstractC0430e;
import a6.AbstractC0434i;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import o6.j;

/* renamed from: b6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0534b extends AbstractC0430e implements RandomAccess, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f9212d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9213e;

    /* renamed from: f, reason: collision with root package name */
    public int f9214f;

    /* renamed from: g, reason: collision with root package name */
    public final C0534b f9215g;

    /* renamed from: h, reason: collision with root package name */
    public final C0535c f9216h;

    public C0534b(Object[] objArr, int i4, int i8, C0534b c0534b, C0535c c0535c) {
        int i9;
        j.e(objArr, "backing");
        j.e(c0535c, "root");
        this.f9212d = objArr;
        this.f9213e = i4;
        this.f9214f = i8;
        this.f9215g = c0534b;
        this.f9216h = c0535c;
        i9 = ((AbstractList) c0535c).modCount;
        ((AbstractList) this).modCount = i9;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m();
        l();
        k(this.f9213e + this.f9214f, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        j.e(collection, "elements");
        m();
        l();
        int size = collection.size();
        j(this.f9213e + this.f9214f, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m();
        l();
        o(this.f9213e, this.f9214f);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        l();
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.f9212d;
                int i4 = this.f9214f;
                if (i4 == list.size()) {
                    for (int i8 = 0; i8 < i4; i8++) {
                        if (j.a(objArr[this.f9213e + i8], list.get(i8))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // a6.AbstractC0430e
    public final int g() {
        l();
        return this.f9214f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        l();
        int i8 = this.f9214f;
        if (i4 >= 0 && i4 < i8) {
            return this.f9212d[this.f9213e + i4];
        }
        throw new IndexOutOfBoundsException(A.j.i(i4, i8, "index: ", ", size: "));
    }

    @Override // a6.AbstractC0430e
    public final Object h(int i4) {
        m();
        l();
        int i8 = this.f9214f;
        if (i4 >= 0 && i4 < i8) {
            return n(this.f9213e + i4);
        }
        throw new IndexOutOfBoundsException(A.j.i(i4, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4;
        l();
        Object[] objArr = this.f9212d;
        int i8 = this.f9214f;
        int i9 = 1;
        for (int i10 = 0; i10 < i8; i10++) {
            Object obj = objArr[this.f9213e + i10];
            int i11 = i9 * 31;
            if (obj != null) {
                i4 = obj.hashCode();
            } else {
                i4 = 0;
            }
            i9 = i11 + i4;
        }
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        l();
        for (int i4 = 0; i4 < this.f9214f; i4++) {
            if (j.a(this.f9212d[this.f9213e + i4], obj)) {
                return i4;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        l();
        if (this.f9214f == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i4, Collection collection, int i8) {
        ((AbstractList) this).modCount++;
        C0535c c0535c = this.f9216h;
        C0534b c0534b = this.f9215g;
        if (c0534b != null) {
            c0534b.j(i4, collection, i8);
        } else {
            C0535c c0535c2 = C0535c.f9217g;
            c0535c.j(i4, collection, i8);
        }
        this.f9212d = c0535c.f9218d;
        this.f9214f += i8;
    }

    public final void k(int i4, Object obj) {
        ((AbstractList) this).modCount++;
        C0535c c0535c = this.f9216h;
        C0534b c0534b = this.f9215g;
        if (c0534b != null) {
            c0534b.k(i4, obj);
        } else {
            C0535c c0535c2 = C0535c.f9217g;
            c0535c.k(i4, obj);
        }
        this.f9212d = c0535c.f9218d;
        this.f9214f++;
    }

    public final void l() {
        int i4;
        i4 = ((AbstractList) this.f9216h).modCount;
        if (i4 == ((AbstractList) this).modCount) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        l();
        for (int i4 = this.f9214f - 1; i4 >= 0; i4--) {
            if (j.a(this.f9212d[this.f9213e + i4], obj)) {
                return i4;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void m() {
        if (!this.f9216h.f9220f) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final Object n(int i4) {
        Object n3;
        ((AbstractList) this).modCount++;
        C0534b c0534b = this.f9215g;
        if (c0534b != null) {
            n3 = c0534b.n(i4);
        } else {
            C0535c c0535c = C0535c.f9217g;
            n3 = this.f9216h.n(i4);
        }
        this.f9214f--;
        return n3;
    }

    public final void o(int i4, int i8) {
        if (i8 > 0) {
            ((AbstractList) this).modCount++;
        }
        C0534b c0534b = this.f9215g;
        if (c0534b != null) {
            c0534b.o(i4, i8);
        } else {
            C0535c c0535c = C0535c.f9217g;
            this.f9216h.o(i4, i8);
        }
        this.f9214f -= i8;
    }

    public final int p(int i4, int i8, Collection collection, boolean z8) {
        int p8;
        C0534b c0534b = this.f9215g;
        if (c0534b != null) {
            p8 = c0534b.p(i4, i8, collection, z8);
        } else {
            C0535c c0535c = C0535c.f9217g;
            p8 = this.f9216h.p(i4, i8, collection, z8);
        }
        if (p8 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f9214f -= p8;
        return p8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m();
        l();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            h(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        j.e(collection, "elements");
        m();
        l();
        if (p(this.f9213e, this.f9214f, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        j.e(collection, "elements");
        m();
        l();
        if (p(this.f9213e, this.f9214f, collection, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        m();
        l();
        int i8 = this.f9214f;
        if (i4 >= 0 && i4 < i8) {
            Object[] objArr = this.f9212d;
            int i9 = this.f9213e;
            Object obj2 = objArr[i9 + i4];
            objArr[i9 + i4] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(A.j.i(i4, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i4, int i8) {
        E2.b.g(i4, i8, this.f9214f);
        return new C0534b(this.f9212d, this.f9213e + i4, i8 - i4, this, this.f9216h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        j.e(objArr, "array");
        l();
        int length = objArr.length;
        int i4 = this.f9214f;
        int i8 = this.f9213e;
        if (length < i4) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f9212d, i8, i4 + i8, objArr.getClass());
            j.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        AbstractC0434i.Q0(this.f9212d, objArr, 0, i8, i4 + i8);
        int i9 = this.f9214f;
        if (i9 < objArr.length) {
            objArr[i9] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        l();
        return D2.f.a(this.f9212d, this.f9213e, this.f9214f, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        l();
        int i8 = this.f9214f;
        if (i4 >= 0 && i4 <= i8) {
            return new C0533a(this, i4);
        }
        throw new IndexOutOfBoundsException(A.j.i(i4, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        m();
        l();
        int i8 = this.f9214f;
        if (i4 >= 0 && i4 <= i8) {
            k(this.f9213e + i4, obj);
            return;
        }
        throw new IndexOutOfBoundsException(A.j.i(i4, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        j.e(collection, "elements");
        m();
        l();
        int i8 = this.f9214f;
        if (i4 >= 0 && i4 <= i8) {
            int size = collection.size();
            j(this.f9213e + i4, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(A.j.i(i4, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        l();
        Object[] objArr = this.f9212d;
        int i4 = this.f9214f;
        int i8 = this.f9213e;
        return AbstractC0434i.T0(objArr, i8, i4 + i8);
    }
}
