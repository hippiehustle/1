package g7;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class G extends AbstractList implements RandomAccess, s {

    /* renamed from: d, reason: collision with root package name */
    public final r f11200d;

    public G(r rVar) {
        this.f11200d = rVar;
    }

    @Override // g7.s
    public final void b(t tVar) {
        throw new UnsupportedOperationException();
    }

    @Override // g7.s
    public final AbstractC0796e c(int i4) {
        return this.f11200d.c(i4);
    }

    @Override // g7.s
    public final List f() {
        return Collections.unmodifiableList(this.f11200d.f11254d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        return (String) this.f11200d.get(i4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, g7.F, java.lang.Object] */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        ?? obj = new Object();
        obj.f11199d = this.f11200d.iterator();
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ListIterator, g7.E, java.lang.Object] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i4) {
        ?? obj = new Object();
        obj.f11198d = this.f11200d.listIterator(i4);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11200d.size();
    }

    @Override // g7.s
    public final G d() {
        return this;
    }
}
