package b6;

import a6.AbstractC0430e;
import a6.AbstractC0434i;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import o6.j;

/* renamed from: b6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0535c extends AbstractC0430e implements RandomAccess, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final C0535c f9217g;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f9218d;

    /* renamed from: e, reason: collision with root package name */
    public int f9219e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9220f;

    static {
        C0535c c0535c = new C0535c(0);
        c0535c.f9220f = true;
        f9217g = c0535c;
    }

    public C0535c(int i4) {
        if (i4 >= 0) {
            this.f9218d = new Object[i4];
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        l();
        int i4 = this.f9219e;
        ((AbstractList) this).modCount++;
        m(i4, 1);
        this.f9218d[i4] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        j.e(collection, "elements");
        l();
        int size = collection.size();
        j(this.f9219e, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        l();
        o(0, this.f9219e);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.f9218d;
                int i4 = this.f9219e;
                if (i4 == list.size()) {
                    for (int i8 = 0; i8 < i4; i8++) {
                        if (j.a(objArr[i8], list.get(i8))) {
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
        return this.f9219e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        int i8 = this.f9219e;
        if (i4 >= 0 && i4 < i8) {
            return this.f9218d[i4];
        }
        throw new IndexOutOfBoundsException(A.j.i(i4, i8, "index: ", ", size: "));
    }

    @Override // a6.AbstractC0430e
    public final Object h(int i4) {
        l();
        int i8 = this.f9219e;
        if (i4 >= 0 && i4 < i8) {
            return n(i4);
        }
        throw new IndexOutOfBoundsException(A.j.i(i4, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4;
        Object[] objArr = this.f9218d;
        int i8 = this.f9219e;
        int i9 = 1;
        for (int i10 = 0; i10 < i8; i10++) {
            Object obj = objArr[i10];
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
        for (int i4 = 0; i4 < this.f9219e; i4++) {
            if (j.a(this.f9218d[i4], obj)) {
                return i4;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.f9219e == 0) {
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
        m(i4, i8);
        Iterator it = collection.iterator();
        for (int i9 = 0; i9 < i8; i9++) {
            this.f9218d[i4 + i9] = it.next();
        }
    }

    public final void k(int i4, Object obj) {
        ((AbstractList) this).modCount++;
        m(i4, 1);
        this.f9218d[i4] = obj;
    }

    public final void l() {
        if (!this.f9220f) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i4 = this.f9219e - 1; i4 >= 0; i4--) {
            if (j.a(this.f9218d[i4], obj)) {
                return i4;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void m(int i4, int i8) {
        int i9 = this.f9219e + i8;
        if (i9 >= 0) {
            Object[] objArr = this.f9218d;
            if (i9 > objArr.length) {
                int length = objArr.length;
                int i10 = length + (length >> 1);
                if (i10 - i9 < 0) {
                    i10 = i9;
                }
                if (i10 - 2147483639 > 0) {
                    if (i9 > 2147483639) {
                        i10 = Integer.MAX_VALUE;
                    } else {
                        i10 = 2147483639;
                    }
                }
                Object[] copyOf = Arrays.copyOf(objArr, i10);
                j.d(copyOf, "copyOf(...)");
                this.f9218d = copyOf;
            }
            Object[] objArr2 = this.f9218d;
            AbstractC0434i.Q0(objArr2, objArr2, i4 + i8, i4, this.f9219e);
            this.f9219e += i8;
            return;
        }
        throw new OutOfMemoryError();
    }

    public final Object n(int i4) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f9218d;
        Object obj = objArr[i4];
        AbstractC0434i.Q0(objArr, objArr, i4, i4 + 1, this.f9219e);
        Object[] objArr2 = this.f9218d;
        int i8 = this.f9219e - 1;
        j.e(objArr2, "<this>");
        objArr2[i8] = null;
        this.f9219e--;
        return obj;
    }

    public final void o(int i4, int i8) {
        if (i8 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f9218d;
        AbstractC0434i.Q0(objArr, objArr, i4, i4 + i8, this.f9219e);
        Object[] objArr2 = this.f9218d;
        int i9 = this.f9219e;
        D2.f.H(objArr2, i9 - i8, i9);
        this.f9219e -= i8;
    }

    public final int p(int i4, int i8, Collection collection, boolean z8) {
        int i9 = 0;
        int i10 = 0;
        while (i9 < i8) {
            int i11 = i4 + i9;
            if (collection.contains(this.f9218d[i11]) == z8) {
                Object[] objArr = this.f9218d;
                i9++;
                objArr[i10 + i4] = objArr[i11];
                i10++;
            } else {
                i9++;
            }
        }
        int i12 = i8 - i10;
        Object[] objArr2 = this.f9218d;
        AbstractC0434i.Q0(objArr2, objArr2, i4 + i10, i8 + i4, this.f9219e);
        Object[] objArr3 = this.f9218d;
        int i13 = this.f9219e;
        D2.f.H(objArr3, i13 - i12, i13);
        if (i12 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f9219e -= i12;
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        l();
        if (p(0, this.f9219e, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        j.e(collection, "elements");
        l();
        if (p(0, this.f9219e, collection, true) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        l();
        int i8 = this.f9219e;
        if (i4 >= 0 && i4 < i8) {
            Object[] objArr = this.f9218d;
            Object obj2 = objArr[i4];
            objArr[i4] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(A.j.i(i4, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i4, int i8) {
        E2.b.g(i4, i8, this.f9219e);
        return new C0534b(this.f9218d, i4, i8 - i4, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        j.e(objArr, "array");
        int length = objArr.length;
        int i4 = this.f9219e;
        if (length < i4) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f9218d, 0, i4, objArr.getClass());
            j.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        AbstractC0434i.Q0(this.f9218d, objArr, 0, 0, i4);
        int i8 = this.f9219e;
        if (i8 < objArr.length) {
            objArr[i8] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return D2.f.a(this.f9218d, 0, this.f9219e, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        int i8 = this.f9219e;
        if (i4 >= 0 && i4 <= i8) {
            return new C0533a(this, i4);
        }
        throw new IndexOutOfBoundsException(A.j.i(i4, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        j.e(collection, "elements");
        l();
        int i8 = this.f9219e;
        if (i4 >= 0 && i4 <= i8) {
            int size = collection.size();
            j(i4, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(A.j.i(i4, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        l();
        int i8 = this.f9219e;
        if (i4 >= 0 && i4 <= i8) {
            ((AbstractList) this).modCount++;
            m(i4, 1);
            this.f9218d[i4] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(A.j.i(i4, i8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC0434i.T0(this.f9218d, 0, this.f9219e);
    }
}
