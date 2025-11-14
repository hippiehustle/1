package C7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p6.InterfaceC1315a;

/* loaded from: classes.dex */
public final class b implements Iterator, InterfaceC1315a {

    /* renamed from: d, reason: collision with root package name */
    public int f785d;

    /* renamed from: e, reason: collision with root package name */
    public Object f786e;

    /* renamed from: f, reason: collision with root package name */
    public int f787f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f788g;

    public b(c cVar) {
        this.f788g = cVar;
    }

    public final boolean b() {
        int i4;
        Object[] objArr;
        this.f785d = 3;
        do {
            i4 = this.f787f + 1;
            this.f787f = i4;
            objArr = this.f788g.f789d;
            if (i4 >= objArr.length) {
                break;
            }
        } while (objArr[i4] == null);
        if (i4 >= objArr.length) {
            this.f785d = 2;
        } else {
            Object obj = objArr[i4];
            o6.j.c(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            this.f786e = obj;
            this.f785d = 1;
        }
        if (this.f785d == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4 = this.f785d;
        if (i4 != 0) {
            if (i4 == 1) {
                return true;
            }
            if (i4 == 2) {
                return false;
            }
            throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
        }
        return b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i4 = this.f785d;
        if (i4 == 1) {
            this.f785d = 0;
            return this.f786e;
        }
        if (i4 != 2 && b()) {
            this.f785d = 0;
            return this.f786e;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
