package D6;

import a6.r;
import f7.C0723c;
import java.util.Iterator;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class h implements j {
    @Override // D6.j
    public final boolean a(C0723c c0723c) {
        return AbstractC1638C.B(this, c0723c);
    }

    @Override // D6.j
    public final c e(C0723c c0723c) {
        o6.j.e(c0723c, "fqName");
        return null;
    }

    @Override // D6.j
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return r.f7765d;
    }

    public final String toString() {
        return "EMPTY";
    }
}
