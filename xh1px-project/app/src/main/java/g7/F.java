package g7;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class F implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public Iterator f11199d;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11199d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f11199d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
