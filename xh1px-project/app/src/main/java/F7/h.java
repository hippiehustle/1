package F7;

import C7.q;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p6.InterfaceC1315a;

/* loaded from: classes.dex */
public final class h implements Iterator, InterfaceC1315a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1627d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1628e = true;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1629f;

    public /* synthetic */ h(int i4, Object obj) {
        this.f1627d = i4;
        this.f1629f = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1627d) {
            case 0:
                return this.f1628e;
            case 1:
                return this.f1628e;
            default:
                return this.f1628e;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1627d) {
            case 0:
                if (this.f1628e) {
                    this.f1628e = false;
                    return this.f1629f;
                }
                throw new NoSuchElementException();
            case 1:
                if (this.f1628e) {
                    this.f1628e = false;
                    return this.f1629f;
                }
                throw new NoSuchElementException();
            default:
                if (this.f1628e) {
                    this.f1628e = false;
                    return ((q) this.f1629f).f819d;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1627d) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
