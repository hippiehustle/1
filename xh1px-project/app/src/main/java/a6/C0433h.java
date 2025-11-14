package a6;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o6.AbstractC1287f;

/* renamed from: a6.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0433h extends AbstractC0430e {

    /* renamed from: g, reason: collision with root package name */
    public static final Object[] f7760g = new Object[0];

    /* renamed from: d, reason: collision with root package name */
    public int f7761d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f7762e;

    /* renamed from: f, reason: collision with root package name */
    public int f7763f;

    public C0433h() {
        this.f7762e = f7760g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i8;
        int i9 = this.f7763f;
        if (i4 < 0 || i4 > i9) {
            throw new IndexOutOfBoundsException(A.j.i(i4, i9, "index: ", ", size: "));
        }
        if (i4 == i9) {
            addLast(obj);
            return;
        }
        if (i4 == 0) {
            addFirst(obj);
            return;
        }
        p();
        j(this.f7763f + 1);
        int o7 = o(this.f7761d + i4);
        int i10 = this.f7763f;
        if (i4 < ((i10 + 1) >> 1)) {
            if (o7 == 0) {
                Object[] objArr = this.f7762e;
                o6.j.e(objArr, "<this>");
                o7 = objArr.length;
            }
            int i11 = o7 - 1;
            int i12 = this.f7761d;
            if (i12 == 0) {
                Object[] objArr2 = this.f7762e;
                o6.j.e(objArr2, "<this>");
                i8 = objArr2.length - 1;
            } else {
                i8 = i12 - 1;
            }
            int i13 = this.f7761d;
            if (i11 >= i13) {
                Object[] objArr3 = this.f7762e;
                objArr3[i8] = objArr3[i13];
                AbstractC0434i.Q0(objArr3, objArr3, i13, i13 + 1, i11 + 1);
            } else {
                Object[] objArr4 = this.f7762e;
                AbstractC0434i.Q0(objArr4, objArr4, i13 - 1, i13, objArr4.length);
                Object[] objArr5 = this.f7762e;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC0434i.Q0(objArr5, objArr5, 0, 1, i11 + 1);
            }
            this.f7762e[i11] = obj;
            this.f7761d = i8;
        } else {
            int o8 = o(i10 + this.f7761d);
            if (o7 < o8) {
                Object[] objArr6 = this.f7762e;
                AbstractC0434i.Q0(objArr6, objArr6, o7 + 1, o7, o8);
            } else {
                Object[] objArr7 = this.f7762e;
                AbstractC0434i.Q0(objArr7, objArr7, 1, 0, o8);
                Object[] objArr8 = this.f7762e;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC0434i.Q0(objArr8, objArr8, o7 + 1, o7, objArr8.length - 1);
            }
            this.f7762e[o7] = obj;
        }
        this.f7763f++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i4, Collection collection) {
        o6.j.e(collection, "elements");
        int i8 = this.f7763f;
        if (i4 >= 0 && i4 <= i8) {
            if (collection.isEmpty()) {
                return false;
            }
            if (i4 == this.f7763f) {
                return addAll(collection);
            }
            p();
            j(collection.size() + this.f7763f);
            int o7 = o(this.f7763f + this.f7761d);
            int o8 = o(this.f7761d + i4);
            int size = collection.size();
            if (i4 < ((this.f7763f + 1) >> 1)) {
                int i9 = this.f7761d;
                int i10 = i9 - size;
                if (o8 < i9) {
                    Object[] objArr = this.f7762e;
                    AbstractC0434i.Q0(objArr, objArr, i10, i9, objArr.length);
                    if (size >= o8) {
                        Object[] objArr2 = this.f7762e;
                        AbstractC0434i.Q0(objArr2, objArr2, objArr2.length - size, 0, o8);
                    } else {
                        Object[] objArr3 = this.f7762e;
                        AbstractC0434i.Q0(objArr3, objArr3, objArr3.length - size, 0, size);
                        Object[] objArr4 = this.f7762e;
                        AbstractC0434i.Q0(objArr4, objArr4, 0, size, o8);
                    }
                } else if (i10 >= 0) {
                    Object[] objArr5 = this.f7762e;
                    AbstractC0434i.Q0(objArr5, objArr5, i10, i9, o8);
                } else {
                    Object[] objArr6 = this.f7762e;
                    i10 += objArr6.length;
                    int i11 = o8 - i9;
                    int length = objArr6.length - i10;
                    if (length >= i11) {
                        AbstractC0434i.Q0(objArr6, objArr6, i10, i9, o8);
                    } else {
                        AbstractC0434i.Q0(objArr6, objArr6, i10, i9, i9 + length);
                        Object[] objArr7 = this.f7762e;
                        AbstractC0434i.Q0(objArr7, objArr7, 0, this.f7761d + length, o8);
                    }
                }
                this.f7761d = i10;
                i(m(o8 - size), collection);
                return true;
            }
            int i12 = o8 + size;
            if (o8 < o7) {
                int i13 = size + o7;
                Object[] objArr8 = this.f7762e;
                if (i13 <= objArr8.length) {
                    AbstractC0434i.Q0(objArr8, objArr8, i12, o8, o7);
                } else if (i12 >= objArr8.length) {
                    AbstractC0434i.Q0(objArr8, objArr8, i12 - objArr8.length, o8, o7);
                } else {
                    int length2 = o7 - (i13 - objArr8.length);
                    AbstractC0434i.Q0(objArr8, objArr8, 0, length2, o7);
                    Object[] objArr9 = this.f7762e;
                    AbstractC0434i.Q0(objArr9, objArr9, i12, o8, length2);
                }
            } else {
                Object[] objArr10 = this.f7762e;
                AbstractC0434i.Q0(objArr10, objArr10, size, 0, o7);
                Object[] objArr11 = this.f7762e;
                if (i12 >= objArr11.length) {
                    AbstractC0434i.Q0(objArr11, objArr11, i12 - objArr11.length, o8, objArr11.length);
                } else {
                    AbstractC0434i.Q0(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f7762e;
                    AbstractC0434i.Q0(objArr12, objArr12, i12, o8, objArr12.length - size);
                }
            }
            i(o8, collection);
            return true;
        }
        throw new IndexOutOfBoundsException(A.j.i(i4, i8, "index: ", ", size: "));
    }

    public final void addFirst(Object obj) {
        p();
        j(this.f7763f + 1);
        int i4 = this.f7761d;
        if (i4 == 0) {
            Object[] objArr = this.f7762e;
            o6.j.e(objArr, "<this>");
            i4 = objArr.length;
        }
        int i8 = i4 - 1;
        this.f7761d = i8;
        this.f7762e[i8] = obj;
        this.f7763f++;
    }

    public final void addLast(Object obj) {
        p();
        j(g() + 1);
        this.f7762e[o(g() + this.f7761d)] = obj;
        this.f7763f = g() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            p();
            n(this.f7761d, o(g() + this.f7761d));
        }
        this.f7761d = 0;
        this.f7763f = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f7762e[this.f7761d];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // a6.AbstractC0430e
    public final int g() {
        return this.f7763f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        int g8 = g();
        if (i4 >= 0 && i4 < g8) {
            return this.f7762e[o(this.f7761d + i4)];
        }
        throw new IndexOutOfBoundsException(A.j.i(i4, g8, "index: ", ", size: "));
    }

    @Override // a6.AbstractC0430e
    public final Object h(int i4) {
        int i8 = this.f7763f;
        if (i4 >= 0 && i4 < i8) {
            if (i4 == AbstractC0437l.W(this)) {
                return removeLast();
            }
            if (i4 == 0) {
                return removeFirst();
            }
            p();
            int o7 = o(this.f7761d + i4);
            Object[] objArr = this.f7762e;
            Object obj = objArr[o7];
            if (i4 < (this.f7763f >> 1)) {
                int i9 = this.f7761d;
                if (o7 >= i9) {
                    AbstractC0434i.Q0(objArr, objArr, i9 + 1, i9, o7);
                } else {
                    AbstractC0434i.Q0(objArr, objArr, 1, 0, o7);
                    Object[] objArr2 = this.f7762e;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i10 = this.f7761d;
                    AbstractC0434i.Q0(objArr2, objArr2, i10 + 1, i10, objArr2.length - 1);
                }
                Object[] objArr3 = this.f7762e;
                int i11 = this.f7761d;
                objArr3[i11] = null;
                this.f7761d = k(i11);
            } else {
                int o8 = o(AbstractC0437l.W(this) + this.f7761d);
                if (o7 <= o8) {
                    Object[] objArr4 = this.f7762e;
                    AbstractC0434i.Q0(objArr4, objArr4, o7, o7 + 1, o8 + 1);
                } else {
                    Object[] objArr5 = this.f7762e;
                    AbstractC0434i.Q0(objArr5, objArr5, o7, o7 + 1, objArr5.length);
                    Object[] objArr6 = this.f7762e;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    AbstractC0434i.Q0(objArr6, objArr6, 0, 1, o8 + 1);
                }
                this.f7762e[o8] = null;
            }
            this.f7763f--;
            return obj;
        }
        throw new IndexOutOfBoundsException(A.j.i(i4, i8, "index: ", ", size: "));
    }

    public final void i(int i4, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f7762e.length;
        while (i4 < length && it.hasNext()) {
            this.f7762e[i4] = it.next();
            i4++;
        }
        int i8 = this.f7761d;
        for (int i9 = 0; i9 < i8 && it.hasNext(); i9++) {
            this.f7762e[i9] = it.next();
        }
        this.f7763f = collection.size() + this.f7763f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i4;
        int o7 = o(g() + this.f7761d);
        int i8 = this.f7761d;
        if (i8 < o7) {
            while (i8 < o7) {
                if (o6.j.a(obj, this.f7762e[i8])) {
                    i4 = this.f7761d;
                } else {
                    i8++;
                }
            }
            return -1;
        }
        if (i8 >= o7) {
            int length = this.f7762e.length;
            while (true) {
                if (i8 < length) {
                    if (o6.j.a(obj, this.f7762e[i8])) {
                        i4 = this.f7761d;
                        break;
                    }
                    i8++;
                } else {
                    for (int i9 = 0; i9 < o7; i9++) {
                        if (o6.j.a(obj, this.f7762e[i9])) {
                            i8 = i9 + this.f7762e.length;
                            i4 = this.f7761d;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i8 - i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (g() == 0) {
            return true;
        }
        return false;
    }

    public final void j(int i4) {
        if (i4 >= 0) {
            Object[] objArr = this.f7762e;
            if (i4 <= objArr.length) {
                return;
            }
            if (objArr == f7760g) {
                if (i4 < 10) {
                    i4 = 10;
                }
                this.f7762e = new Object[i4];
                return;
            }
            int length = objArr.length;
            int i8 = length + (length >> 1);
            if (i8 - i4 < 0) {
                i8 = i4;
            }
            if (i8 - 2147483639 > 0) {
                if (i4 > 2147483639) {
                    i8 = Integer.MAX_VALUE;
                } else {
                    i8 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i8];
            AbstractC0434i.Q0(objArr, objArr2, 0, this.f7761d, objArr.length);
            Object[] objArr3 = this.f7762e;
            int length2 = objArr3.length;
            int i9 = this.f7761d;
            AbstractC0434i.Q0(objArr3, objArr2, length2 - i9, 0, i9);
            this.f7761d = 0;
            this.f7762e = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int k(int i4) {
        o6.j.e(this.f7762e, "<this>");
        if (i4 == r0.length - 1) {
            return 0;
        }
        return i4 + 1;
    }

    public final Object l() {
        if (isEmpty()) {
            return null;
        }
        return this.f7762e[o(AbstractC0437l.W(this) + this.f7761d)];
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.f7762e[o(AbstractC0437l.W(this) + this.f7761d)];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i4;
        int o7 = o(this.f7763f + this.f7761d);
        int i8 = this.f7761d;
        if (i8 < o7) {
            length = o7 - 1;
            if (i8 <= length) {
                while (!o6.j.a(obj, this.f7762e[length])) {
                    if (length != i8) {
                        length--;
                    }
                }
                i4 = this.f7761d;
                return length - i4;
            }
            return -1;
        }
        if (i8 > o7) {
            int i9 = o7 - 1;
            while (true) {
                if (-1 < i9) {
                    if (o6.j.a(obj, this.f7762e[i9])) {
                        length = i9 + this.f7762e.length;
                        i4 = this.f7761d;
                        break;
                    }
                    i9--;
                } else {
                    Object[] objArr = this.f7762e;
                    o6.j.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i10 = this.f7761d;
                    if (i10 <= length) {
                        while (!o6.j.a(obj, this.f7762e[length])) {
                            if (length != i10) {
                                length--;
                            }
                        }
                        i4 = this.f7761d;
                    }
                }
            }
        }
        return -1;
    }

    public final int m(int i4) {
        if (i4 < 0) {
            return i4 + this.f7762e.length;
        }
        return i4;
    }

    public final void n(int i4, int i8) {
        if (i4 < i8) {
            AbstractC0434i.U0(this.f7762e, null, i4, i8);
            return;
        }
        Object[] objArr = this.f7762e;
        Arrays.fill(objArr, i4, objArr.length, (Object) null);
        AbstractC0434i.U0(this.f7762e, null, 0, i8);
    }

    public final int o(int i4) {
        Object[] objArr = this.f7762e;
        if (i4 >= objArr.length) {
            return i4 - objArr.length;
        }
        return i4;
    }

    public final void p() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        h(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int o7;
        o6.j.e(collection, "elements");
        boolean z8 = false;
        z8 = false;
        z8 = false;
        if (!isEmpty() && this.f7762e.length != 0) {
            int o8 = o(this.f7763f + this.f7761d);
            int i4 = this.f7761d;
            if (i4 < o8) {
                o7 = i4;
                while (i4 < o8) {
                    Object obj = this.f7762e[i4];
                    if (!collection.contains(obj)) {
                        this.f7762e[o7] = obj;
                        o7++;
                    } else {
                        z8 = true;
                    }
                    i4++;
                }
                AbstractC0434i.U0(this.f7762e, null, o7, o8);
            } else {
                int length = this.f7762e.length;
                boolean z9 = false;
                int i8 = i4;
                while (i4 < length) {
                    Object[] objArr = this.f7762e;
                    Object obj2 = objArr[i4];
                    objArr[i4] = null;
                    if (!collection.contains(obj2)) {
                        this.f7762e[i8] = obj2;
                        i8++;
                    } else {
                        z9 = true;
                    }
                    i4++;
                }
                o7 = o(i8);
                for (int i9 = 0; i9 < o8; i9++) {
                    Object[] objArr2 = this.f7762e;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (!collection.contains(obj3)) {
                        this.f7762e[o7] = obj3;
                        o7 = k(o7);
                    } else {
                        z9 = true;
                    }
                }
                z8 = z9;
            }
            if (z8) {
                p();
                this.f7763f = m(o7 - this.f7761d);
            }
        }
        return z8;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            p();
            Object[] objArr = this.f7762e;
            int i4 = this.f7761d;
            Object obj = objArr[i4];
            objArr[i4] = null;
            this.f7761d = k(i4);
            this.f7763f = g() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            p();
            int o7 = o(AbstractC0437l.W(this) + this.f7761d);
            Object[] objArr = this.f7762e;
            Object obj = objArr[o7];
            objArr[o7] = null;
            this.f7763f = g() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i8) {
        E2.b.g(i4, i8, this.f7763f);
        int i9 = i8 - i4;
        if (i9 == 0) {
            return;
        }
        if (i9 == this.f7763f) {
            clear();
            return;
        }
        if (i9 == 1) {
            h(i4);
            return;
        }
        p();
        if (i4 < this.f7763f - i8) {
            int o7 = o(this.f7761d + (i4 - 1));
            int o8 = o(this.f7761d + (i8 - 1));
            while (i4 > 0) {
                int i10 = o7 + 1;
                int min = Math.min(i4, Math.min(i10, o8 + 1));
                Object[] objArr = this.f7762e;
                int i11 = o8 - min;
                int i12 = o7 - min;
                AbstractC0434i.Q0(objArr, objArr, i11 + 1, i12 + 1, i10);
                o7 = m(i12);
                o8 = m(i11);
                i4 -= min;
            }
            int o9 = o(this.f7761d + i9);
            n(this.f7761d, o9);
            this.f7761d = o9;
        } else {
            int o10 = o(this.f7761d + i8);
            int o11 = o(this.f7761d + i4);
            int i13 = this.f7763f;
            while (true) {
                i13 -= i8;
                if (i13 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f7762e;
                i8 = Math.min(i13, Math.min(objArr2.length - o10, objArr2.length - o11));
                Object[] objArr3 = this.f7762e;
                int i14 = o10 + i8;
                AbstractC0434i.Q0(objArr3, objArr3, o11, o10, i14);
                o10 = o(i14);
                o11 = o(o11 + i8);
            }
            int o12 = o(this.f7763f + this.f7761d);
            n(m(o12 - i9), o12);
        }
        this.f7763f -= i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int o7;
        o6.j.e(collection, "elements");
        boolean z8 = false;
        z8 = false;
        z8 = false;
        if (!isEmpty() && this.f7762e.length != 0) {
            int o8 = o(this.f7763f + this.f7761d);
            int i4 = this.f7761d;
            if (i4 < o8) {
                o7 = i4;
                while (i4 < o8) {
                    Object obj = this.f7762e[i4];
                    if (collection.contains(obj)) {
                        this.f7762e[o7] = obj;
                        o7++;
                    } else {
                        z8 = true;
                    }
                    i4++;
                }
                AbstractC0434i.U0(this.f7762e, null, o7, o8);
            } else {
                int length = this.f7762e.length;
                boolean z9 = false;
                int i8 = i4;
                while (i4 < length) {
                    Object[] objArr = this.f7762e;
                    Object obj2 = objArr[i4];
                    objArr[i4] = null;
                    if (collection.contains(obj2)) {
                        this.f7762e[i8] = obj2;
                        i8++;
                    } else {
                        z9 = true;
                    }
                    i4++;
                }
                o7 = o(i8);
                for (int i9 = 0; i9 < o8; i9++) {
                    Object[] objArr2 = this.f7762e;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (collection.contains(obj3)) {
                        this.f7762e[o7] = obj3;
                        o7 = k(o7);
                    } else {
                        z9 = true;
                    }
                }
                z8 = z9;
            }
            if (z8) {
                p();
                this.f7763f = m(o7 - this.f7761d);
            }
        }
        return z8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        int g8 = g();
        if (i4 >= 0 && i4 < g8) {
            int o7 = o(this.f7761d + i4);
            Object[] objArr = this.f7762e;
            Object obj2 = objArr[o7];
            objArr[o7] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(A.j.i(i4, g8, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[g()]);
    }

    public C0433h(int i4) {
        Object[] objArr;
        if (i4 == 0) {
            objArr = f7760g;
        } else if (i4 > 0) {
            objArr = new Object[i4];
        } else {
            throw new IllegalArgumentException(A.j.l("Illegal Capacity: ", i4));
        }
        this.f7762e = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        o6.j.e(objArr, "array");
        int length = objArr.length;
        int i4 = this.f7763f;
        if (length < i4) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i4);
            o6.j.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int o7 = o(this.f7763f + this.f7761d);
        int i8 = this.f7761d;
        if (i8 < o7) {
            AbstractC0434i.S0(this.f7762e, objArr, i8, o7, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f7762e;
            AbstractC0434i.Q0(objArr2, objArr, 0, this.f7761d, objArr2.length);
            Object[] objArr3 = this.f7762e;
            AbstractC0434i.Q0(objArr3, objArr, objArr3.length - this.f7761d, 0, o7);
        }
        int i9 = this.f7763f;
        if (i9 < objArr.length) {
            objArr[i9] = null;
        }
        return objArr;
    }

    public C0433h(Object obj) {
        Object[] b4 = AbstractC1287f.b(s.f7766d, new Object[0]);
        this.f7762e = b4;
        this.f7763f = b4.length;
        if (b4.length == 0) {
            this.f7762e = f7760g;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        o6.j.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        p();
        j(collection.size() + g());
        i(o(g() + this.f7761d), collection);
        return true;
    }
}
