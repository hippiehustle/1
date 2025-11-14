package a6;

import P.S;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: a6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0427b extends S implements ListIterator {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0429d f7754g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0427b(AbstractC0429d abstractC0429d, int i4) {
        super(6, abstractC0429d);
        this.f7754g = abstractC0429d;
        int g8 = abstractC0429d.g();
        if (i4 >= 0 && i4 <= g8) {
            this.f4223e = i4;
            return;
        }
        throw new IndexOutOfBoundsException(A.j.i(i4, g8, "index: ", ", size: "));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f4223e > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4223e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i4 = this.f4223e - 1;
            this.f4223e = i4;
            return this.f7754g.get(i4);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4223e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
