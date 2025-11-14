package F7;

import P.S;
import java.util.Iterator;
import p6.InterfaceC1315a;

/* loaded from: classes.dex */
public final class g implements Iterator, InterfaceC1315a {

    /* renamed from: d, reason: collision with root package name */
    public final S f1626d;

    public g(Object[] objArr) {
        o6.j.e(objArr, "array");
        this.f1626d = o6.j.g(objArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1626d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f1626d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
