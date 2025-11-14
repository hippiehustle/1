package t;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: t.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1524b implements Set {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f14643d;

    public C1524b(e eVar) {
        this.f14643d = eVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f14643d.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f14643d.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f14643d.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        e eVar = this.f14643d;
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (eVar.f14670f == set.size()) {
                        if (eVar.j(set)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int hashCode;
        e eVar = this.f14643d;
        int i4 = 0;
        for (int i8 = eVar.f14670f - 1; i8 >= 0; i8--) {
            Object f8 = eVar.f(i8);
            if (f8 == null) {
                hashCode = 0;
            } else {
                hashCode = f8.hashCode();
            }
            i4 += hashCode;
        }
        return i4;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f14643d.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1523a(this.f14643d, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.f14643d;
        int d2 = eVar.d(obj);
        if (d2 >= 0) {
            eVar.g(d2);
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f14643d.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f14643d;
        int i4 = eVar.f14670f;
        for (int i8 = i4 - 1; i8 >= 0; i8--) {
            if (!collection.contains(eVar.f(i8))) {
                eVar.g(i8);
            }
        }
        if (i4 != eVar.f14670f) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f14643d.f14670f;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        e eVar = this.f14643d;
        int i4 = eVar.f14670f;
        Object[] objArr = new Object[i4];
        for (int i8 = 0; i8 < i4; i8++) {
            objArr[i8] = eVar.f(i8);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.f14643d;
        int i4 = eVar.f14670f;
        if (objArr.length < i4) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4);
        }
        for (int i8 = 0; i8 < i4; i8++) {
            objArr[i8] = eVar.f(i8);
        }
        if (objArr.length > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }
}
