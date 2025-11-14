package H7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import n6.InterfaceC1163b;
import p6.InterfaceC1315a;

/* loaded from: classes.dex */
public final class f implements Iterator, InterfaceC1315a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2052d;

    /* renamed from: e, reason: collision with root package name */
    public final Iterator f2053e;

    /* renamed from: f, reason: collision with root package name */
    public int f2054f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2055g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f2056h;

    public f(g gVar) {
        this.f2052d = 0;
        this.f2056h = gVar;
        this.f2053e = gVar.f2057a.iterator();
        this.f2054f = -1;
    }

    public void b() {
        Object next;
        g gVar = (g) this.f2056h;
        do {
            Iterator it = this.f2053e;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.f2054f = 0;
                return;
            }
        } while (((Boolean) gVar.f2059c.m(next)).booleanValue() != gVar.f2058b);
        this.f2055g = next;
        this.f2054f = 1;
    }

    public void c() {
        Iterator it = this.f2053e;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((InterfaceC1163b) ((j) this.f2056h).f2067b).m(next)).booleanValue()) {
                this.f2054f = 1;
                this.f2055g = next;
                return;
            }
        }
        this.f2054f = 0;
    }

    public boolean d() {
        Iterator it;
        Iterator it2 = (Iterator) this.f2055g;
        if (it2 != null && it2.hasNext()) {
            this.f2054f = 1;
            return true;
        }
        do {
            Iterator it3 = this.f2053e;
            if (it3.hasNext()) {
                Object next = it3.next();
                h hVar = (h) this.f2056h;
                it = (Iterator) hVar.f2062c.m(hVar.f2061b.m(next));
            } else {
                this.f2054f = 2;
                this.f2055g = null;
                return false;
            }
        } while (!it.hasNext());
        this.f2055g = it;
        this.f2054f = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2052d) {
            case 0:
                if (this.f2054f == -1) {
                    b();
                }
                if (this.f2054f == 1) {
                    return true;
                }
                return false;
            case 1:
                int i4 = this.f2054f;
                if (i4 == 1) {
                    return true;
                }
                if (i4 == 2) {
                    return false;
                }
                return d();
            default:
                if (this.f2054f == -1) {
                    c();
                }
                if (this.f2054f == 1) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2052d) {
            case 0:
                if (this.f2054f == -1) {
                    b();
                }
                if (this.f2054f != 0) {
                    Object obj = this.f2055g;
                    this.f2055g = null;
                    this.f2054f = -1;
                    return obj;
                }
                throw new NoSuchElementException();
            case 1:
                int i4 = this.f2054f;
                if (i4 != 2) {
                    if (i4 == 0 && !d()) {
                        throw new NoSuchElementException();
                    }
                    this.f2054f = 0;
                    Iterator it = (Iterator) this.f2055g;
                    o6.j.b(it);
                    return it.next();
                }
                throw new NoSuchElementException();
            default:
                if (this.f2054f == -1) {
                    c();
                }
                if (this.f2054f != 0) {
                    Object obj2 = this.f2055g;
                    this.f2055g = null;
                    this.f2054f = -1;
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2052d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(h hVar) {
        this.f2052d = 1;
        this.f2056h = hVar;
        this.f2053e = hVar.f2060a.iterator();
    }

    public f(j jVar) {
        this.f2052d = 2;
        this.f2056h = jVar;
        this.f2053e = ((k) jVar.f2068c).iterator();
        this.f2054f = -1;
    }
}
