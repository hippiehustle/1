package b6;

import a6.AbstractC0430e;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p6.InterfaceC1315a;

/* renamed from: b6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0533a implements ListIterator, InterfaceC1315a {

    /* renamed from: e, reason: collision with root package name */
    public int f9208e;

    /* renamed from: g, reason: collision with root package name */
    public int f9210g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC0430e f9211h;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9207d = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f9209f = -1;

    public C0533a(C0535c c0535c, int i4) {
        int i8;
        this.f9211h = c0535c;
        this.f9208e = i4;
        i8 = ((AbstractList) c0535c).modCount;
        this.f9210g = i8;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i4;
        int i8;
        switch (this.f9207d) {
            case 0:
                b();
                C0534b c0534b = (C0534b) this.f9211h;
                int i9 = this.f9208e;
                this.f9208e = i9 + 1;
                c0534b.add(i9, obj);
                this.f9209f = -1;
                i4 = ((AbstractList) c0534b).modCount;
                this.f9210g = i4;
                return;
            default:
                c();
                C0535c c0535c = (C0535c) this.f9211h;
                int i10 = this.f9208e;
                this.f9208e = i10 + 1;
                c0535c.add(i10, obj);
                this.f9209f = -1;
                i8 = ((AbstractList) c0535c).modCount;
                this.f9210g = i8;
                return;
        }
    }

    public void b() {
        int i4;
        i4 = ((AbstractList) ((C0534b) this.f9211h).f9216h).modCount;
        if (i4 == this.f9210g) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        int i4;
        i4 = ((AbstractList) ((C0535c) this.f9211h)).modCount;
        if (i4 == this.f9210g) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9207d) {
            case 0:
                if (this.f9208e < ((C0534b) this.f9211h).f9214f) {
                    return true;
                }
                return false;
            default:
                if (this.f9208e < ((C0535c) this.f9211h).f9219e) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f9207d) {
            case 0:
                if (this.f9208e > 0) {
                    return true;
                }
                return false;
            default:
                if (this.f9208e > 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f9207d) {
            case 0:
                b();
                int i4 = this.f9208e;
                C0534b c0534b = (C0534b) this.f9211h;
                if (i4 < c0534b.f9214f) {
                    this.f9208e = i4 + 1;
                    this.f9209f = i4;
                    return c0534b.f9212d[c0534b.f9213e + i4];
                }
                throw new NoSuchElementException();
            default:
                c();
                int i8 = this.f9208e;
                C0535c c0535c = (C0535c) this.f9211h;
                if (i8 < c0535c.f9219e) {
                    this.f9208e = i8 + 1;
                    this.f9209f = i8;
                    return c0535c.f9218d[i8];
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f9207d) {
            case 0:
                return this.f9208e;
            default:
                return this.f9208e;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f9207d) {
            case 0:
                b();
                int i4 = this.f9208e;
                if (i4 > 0) {
                    int i8 = i4 - 1;
                    this.f9208e = i8;
                    this.f9209f = i8;
                    C0534b c0534b = (C0534b) this.f9211h;
                    return c0534b.f9212d[c0534b.f9213e + i8];
                }
                throw new NoSuchElementException();
            default:
                c();
                int i9 = this.f9208e;
                if (i9 > 0) {
                    int i10 = i9 - 1;
                    this.f9208e = i10;
                    this.f9209f = i10;
                    return ((C0535c) this.f9211h).f9218d[i10];
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i4;
        switch (this.f9207d) {
            case 0:
                i4 = this.f9208e;
                break;
            default:
                i4 = this.f9208e;
                break;
        }
        return i4 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i4;
        int i8;
        switch (this.f9207d) {
            case 0:
                C0534b c0534b = (C0534b) this.f9211h;
                b();
                int i9 = this.f9209f;
                if (i9 != -1) {
                    c0534b.h(i9);
                    this.f9208e = this.f9209f;
                    this.f9209f = -1;
                    i4 = ((AbstractList) c0534b).modCount;
                    this.f9210g = i4;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            default:
                C0535c c0535c = (C0535c) this.f9211h;
                c();
                int i10 = this.f9209f;
                if (i10 != -1) {
                    c0535c.h(i10);
                    this.f9208e = this.f9209f;
                    this.f9209f = -1;
                    i8 = ((AbstractList) c0535c).modCount;
                    this.f9210g = i8;
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f9207d) {
            case 0:
                b();
                int i4 = this.f9209f;
                if (i4 != -1) {
                    ((C0534b) this.f9211h).set(i4, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            default:
                c();
                int i8 = this.f9209f;
                if (i8 != -1) {
                    ((C0535c) this.f9211h).set(i8, obj);
                    return;
                }
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
    }

    public C0533a(C0534b c0534b, int i4) {
        int i8;
        this.f9211h = c0534b;
        this.f9208e = i4;
        i8 = ((AbstractList) c0534b).modCount;
        this.f9210g = i8;
    }
}
