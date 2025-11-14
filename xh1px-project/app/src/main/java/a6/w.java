package a6;

import java.util.Iterator;
import p6.InterfaceC1315a;

/* loaded from: classes.dex */
public abstract class w implements Iterator, InterfaceC1315a {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
