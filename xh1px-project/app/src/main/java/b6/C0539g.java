package b6;

import a6.AbstractC0431f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import o6.j;

/* renamed from: b6.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0539g extends AbstractC0431f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9237d;

    /* renamed from: e, reason: collision with root package name */
    public final C0538f f9238e;

    public /* synthetic */ C0539g(C0538f c0538f, int i4) {
        this.f9237d = i4;
        this.f9238e = c0538f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f9237d) {
            case 0:
                j.e((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f9237d) {
            case 0:
                j.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                j.e(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f9237d) {
            case 0:
                this.f9238e.clear();
                return;
            default:
                this.f9238e.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f9237d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                j.e(entry, "element");
                return this.f9238e.h(entry);
            default:
                return this.f9238e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f9237d) {
            case 0:
                j.e(collection, "elements");
                return this.f9238e.g(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // a6.AbstractC0431f
    public final int g() {
        switch (this.f9237d) {
            case 0:
                return this.f9238e.f9232l;
            default:
                return this.f9238e.f9232l;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f9237d) {
            case 0:
                return this.f9238e.isEmpty();
            default:
                return this.f9238e.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f9237d) {
            case 0:
                C0538f c0538f = this.f9238e;
                c0538f.getClass();
                return new C0536d(c0538f, 0);
            default:
                C0538f c0538f2 = this.f9238e;
                c0538f2.getClass();
                return new C0536d(c0538f2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f9237d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                j.e(entry, "element");
                C0538f c0538f = this.f9238e;
                c0538f.getClass();
                c0538f.d();
                int j = c0538f.j(entry.getKey());
                if (j < 0) {
                    return false;
                }
                Object[] objArr = c0538f.f9227e;
                j.b(objArr);
                if (!j.a(objArr[j], entry.getValue())) {
                    return false;
                }
                c0538f.n(j);
                return true;
            default:
                C0538f c0538f2 = this.f9238e;
                c0538f2.d();
                int j5 = c0538f2.j(obj);
                if (j5 < 0) {
                    return false;
                }
                c0538f2.n(j5);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f9237d) {
            case 0:
                j.e(collection, "elements");
                this.f9238e.d();
                return super.removeAll(collection);
            default:
                j.e(collection, "elements");
                this.f9238e.d();
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f9237d) {
            case 0:
                j.e(collection, "elements");
                this.f9238e.d();
                return super.retainAll(collection);
            default:
                j.e(collection, "elements");
                this.f9238e.d();
                return super.retainAll(collection);
        }
    }
}
