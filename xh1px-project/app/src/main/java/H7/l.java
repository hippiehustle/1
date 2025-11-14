package H7;

import Z5.y;
import d6.C0623i;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p6.InterfaceC1315a;

/* loaded from: classes.dex */
public final class l implements Iterator, InterfaceC0617c, InterfaceC1315a {

    /* renamed from: d, reason: collision with root package name */
    public int f2069d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2070e;

    /* renamed from: f, reason: collision with root package name */
    public Iterator f2071f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC0617c f2072g;

    public final RuntimeException b() {
        int i4 = this.f2069d;
        if (i4 != 4) {
            if (i4 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f2069d);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    @Override // d6.InterfaceC0617c
    public final InterfaceC0622h h() {
        return C0623i.f10448d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i4 = this.f2069d;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2 || i4 == 3) {
                        return true;
                    }
                    if (i4 == 4) {
                        return false;
                    }
                    throw b();
                }
                Iterator it = this.f2071f;
                o6.j.b(it);
                if (it.hasNext()) {
                    this.f2069d = 2;
                    return true;
                }
                this.f2071f = null;
            }
            this.f2069d = 5;
            InterfaceC0617c interfaceC0617c = this.f2072g;
            o6.j.b(interfaceC0617c);
            this.f2072g = null;
            interfaceC0617c.k(y.f7506a);
        }
    }

    @Override // d6.InterfaceC0617c
    public final void k(Object obj) {
        Z5.a.d(obj);
        this.f2069d = 4;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i4 = this.f2069d;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    this.f2069d = 0;
                    Object obj = this.f2070e;
                    this.f2070e = null;
                    return obj;
                }
                throw b();
            }
            this.f2069d = 1;
            Iterator it = this.f2071f;
            o6.j.b(it);
            return it.next();
        }
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
