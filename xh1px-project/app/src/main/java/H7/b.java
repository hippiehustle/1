package H7;

import a6.AbstractC0437l;
import a6.v;
import java.util.Iterator;
import p6.InterfaceC1315a;

/* loaded from: classes.dex */
public final class b implements Iterator, InterfaceC1315a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2046d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f2047e;

    /* renamed from: f, reason: collision with root package name */
    public int f2048f;

    public b(Iterator it) {
        o6.j.e(it, "iterator");
        this.f2047e = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f2046d) {
            case 0:
                break;
            default:
                return this.f2047e.hasNext();
        }
        while (true) {
            int i4 = this.f2048f;
            it = this.f2047e;
            if (i4 > 0 && it.hasNext()) {
                it.next();
                this.f2048f--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f2046d) {
            case 0:
                break;
            default:
                int i4 = this.f2048f;
                this.f2048f = i4 + 1;
                if (i4 >= 0) {
                    return new v(i4, this.f2047e.next());
                }
                AbstractC0437l.c0();
                throw null;
        }
        while (true) {
            int i8 = this.f2048f;
            it = this.f2047e;
            if (i8 > 0 && it.hasNext()) {
                it.next();
                this.f2048f--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2046d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(c cVar) {
        this.f2047e = cVar.f2049a.iterator();
        this.f2048f = cVar.f2050b;
    }
}
