package a6;

import java.util.List;
import java.util.ListIterator;
import p6.InterfaceC1315a;

/* loaded from: classes.dex */
public final class y implements ListIterator, InterfaceC1315a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7771d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final ListIterator f7772e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f7773f;

    public y(I7.i iVar, int i4) {
        this.f7773f = iVar;
        this.f7772e = ((List) iVar.f2242e).listIterator(AbstractC0436k.j0(i4, iVar));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f7771d) {
            case 0:
                ListIterator listIterator = this.f7772e;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7771d) {
            case 0:
                return this.f7772e.hasPrevious();
            default:
                return this.f7772e.hasPrevious();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f7771d) {
            case 0:
                return this.f7772e.hasNext();
            default:
                return this.f7772e.hasNext();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f7771d) {
            case 0:
                return this.f7772e.previous();
            default:
                return this.f7772e.previous();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int previousIndex;
        int W7;
        switch (this.f7771d) {
            case 0:
                z zVar = (z) this.f7773f;
                previousIndex = this.f7772e.previousIndex();
                W7 = AbstractC0437l.W(zVar);
                break;
            default:
                I7.i iVar = (I7.i) this.f7773f;
                previousIndex = this.f7772e.previousIndex();
                W7 = AbstractC0437l.W(iVar);
                break;
        }
        return W7 - previousIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f7771d) {
            case 0:
                return this.f7772e.next();
            default:
                return this.f7772e.next();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int nextIndex;
        int W7;
        switch (this.f7771d) {
            case 0:
                z zVar = (z) this.f7773f;
                nextIndex = this.f7772e.nextIndex();
                W7 = AbstractC0437l.W(zVar);
                break;
            default:
                I7.i iVar = (I7.i) this.f7773f;
                nextIndex = this.f7772e.nextIndex();
                W7 = AbstractC0437l.W(iVar);
                break;
        }
        return W7 - nextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f7771d) {
            case 0:
                this.f7772e.remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f7771d) {
            case 0:
                this.f7772e.set(obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public y(z zVar, int i4) {
        this.f7773f = zVar;
        this.f7772e = zVar.f7774d.listIterator(AbstractC0436k.j0(i4, zVar));
    }
}
