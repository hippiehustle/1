package H7;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements k, d {

    /* renamed from: a, reason: collision with root package name */
    public final k f2049a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2050b;

    public c(k kVar, int i4) {
        o6.j.e(kVar, "sequence");
        this.f2049a = kVar;
        this.f2050b = i4;
        if (i4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i4 + '.').toString());
    }

    @Override // H7.d
    public final k a() {
        int i4 = this.f2050b + 1;
        if (i4 < 0) {
            return new c(this, 1);
        }
        return new c(this.f2049a, i4);
    }

    @Override // H7.k
    public final Iterator iterator() {
        return new b(this);
    }
}
