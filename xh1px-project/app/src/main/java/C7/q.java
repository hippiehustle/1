package C7;

import java.util.Iterator;
import w7.C1745g;

/* loaded from: classes.dex */
public final class q extends a {

    /* renamed from: d, reason: collision with root package name */
    public final C1745g f819d;

    /* renamed from: e, reason: collision with root package name */
    public final int f820e;

    public q(int i4, C1745g c1745g) {
        this.f819d = c1745g;
        this.f820e = i4;
    }

    @Override // C7.a
    public final int g() {
        return 1;
    }

    @Override // C7.a
    public final Object get(int i4) {
        if (i4 == this.f820e) {
            return this.f819d;
        }
        return null;
    }

    @Override // C7.a
    public final void h(int i4, C1745g c1745g) {
        throw new IllegalStateException();
    }

    @Override // C7.a, java.lang.Iterable
    public final Iterator iterator() {
        return new F7.h(2, this);
    }
}
