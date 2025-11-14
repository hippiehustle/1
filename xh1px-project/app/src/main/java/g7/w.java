package g7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* loaded from: classes.dex */
public final class w implements Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final Stack f11257d = new Stack();

    /* renamed from: e, reason: collision with root package name */
    public t f11258e;

    public w(AbstractC0796e abstractC0796e) {
        while (abstractC0796e instanceof y) {
            y yVar = (y) abstractC0796e;
            this.f11257d.push(yVar);
            abstractC0796e = yVar.f11263f;
        }
        this.f11258e = (t) abstractC0796e;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t next() {
        t tVar;
        t tVar2 = this.f11258e;
        if (tVar2 == null) {
            throw new NoSuchElementException();
        }
        while (true) {
            Stack stack = this.f11257d;
            if (stack.isEmpty()) {
                tVar = null;
                break;
            }
            Object obj = ((y) stack.pop()).f11264g;
            while (obj instanceof y) {
                y yVar = (y) obj;
                stack.push(yVar);
                obj = yVar.f11263f;
            }
            tVar = (t) obj;
            if (tVar.f11255e.length != 0) {
                break;
            }
        }
        this.f11258e = tVar;
        return tVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f11258e != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
