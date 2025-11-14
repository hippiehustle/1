package F7;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class e implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public boolean f1621d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1622e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f1623f;

    public e(f fVar) {
        int i4;
        this.f1623f = fVar;
        i4 = ((AbstractList) fVar).modCount;
        this.f1622e = i4;
    }

    public final void a() {
        int i4;
        int i8;
        f fVar = this.f1623f;
        i4 = ((AbstractList) fVar).modCount;
        int i9 = this.f1622e;
        if (i4 == i9) {
            return;
        }
        StringBuilder sb = new StringBuilder("ModCount: ");
        i8 = ((AbstractList) fVar).modCount;
        sb.append(i8);
        sb.append("; expected: ");
        sb.append(i9);
        throw new ConcurrentModificationException(sb.toString());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f1621d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f1621d) {
            this.f1621d = true;
            a();
            return this.f1623f.f1625e;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        this.f1623f.clear();
    }
}
