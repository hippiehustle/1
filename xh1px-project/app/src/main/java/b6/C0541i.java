package b6;

import a6.AbstractC0431f;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import o6.j;

/* renamed from: b6.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0541i extends AbstractC0431f implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final C0541i f9240e;

    /* renamed from: d, reason: collision with root package name */
    public final C0538f f9241d;

    static {
        C0538f c0538f = C0538f.f9225q;
        f9240e = new C0541i(C0538f.f9225q);
    }

    public C0541i(C0538f c0538f) {
        j.e(c0538f, "backing");
        this.f9241d = c0538f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f9241d.b(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        j.e(collection, "elements");
        this.f9241d.d();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f9241d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f9241d.containsKey(obj);
    }

    @Override // a6.AbstractC0431f
    public final int g() {
        return this.f9241d.f9232l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f9241d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C0538f c0538f = this.f9241d;
        c0538f.getClass();
        return new C0536d(c0538f, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C0538f c0538f = this.f9241d;
        c0538f.d();
        int j = c0538f.j(obj);
        if (j < 0) {
            return false;
        }
        c0538f.n(j);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        j.e(collection, "elements");
        this.f9241d.d();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        j.e(collection, "elements");
        this.f9241d.d();
        return super.retainAll(collection);
    }

    public C0541i() {
        this(new C0538f());
    }
}
