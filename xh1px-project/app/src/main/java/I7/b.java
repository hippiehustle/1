package I7;

import h4.AbstractC0832f;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p6.InterfaceC1315a;
import t6.C1586a;
import t6.C1588c;

/* loaded from: classes.dex */
public final class b implements Iterator, InterfaceC1315a {

    /* renamed from: d, reason: collision with root package name */
    public int f2220d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f2221e;

    /* renamed from: f, reason: collision with root package name */
    public int f2222f;

    /* renamed from: g, reason: collision with root package name */
    public C1588c f2223g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ H7.j f2224h;

    public b(H7.j jVar) {
        this.f2224h = jVar;
        int f8 = AbstractC0832f.f(0, 0, ((String) jVar.f2068c).length());
        this.f2221e = f8;
        this.f2222f = f8;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [t6.a, t6.c] */
    /* JADX WARN: Type inference failed for: r0v9, types: [t6.a, t6.c] */
    public final void b() {
        H7.j jVar = this.f2224h;
        String str = (String) jVar.f2068c;
        int i4 = this.f2222f;
        int i8 = 0;
        if (i4 < 0) {
            this.f2220d = 0;
            this.f2223g = null;
            return;
        }
        if (i4 > str.length()) {
            this.f2223g = new C1586a(this.f2221e, m.e0(str), 1);
            this.f2222f = -1;
        } else {
            Z5.j jVar2 = (Z5.j) ((C1.b) jVar.f2067b).l(str, Integer.valueOf(this.f2222f));
            if (jVar2 == null) {
                this.f2223g = new C1586a(this.f2221e, m.e0(str), 1);
                this.f2222f = -1;
            } else {
                int intValue = ((Number) jVar2.f7485d).intValue();
                int intValue2 = ((Number) jVar2.f7486e).intValue();
                this.f2223g = AbstractC0832f.G(this.f2221e, intValue);
                int i9 = intValue + intValue2;
                this.f2221e = i9;
                if (intValue2 == 0) {
                    i8 = 1;
                }
                this.f2222f = i9 + i8;
            }
        }
        this.f2220d = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2220d == -1) {
            b();
        }
        if (this.f2220d == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2220d == -1) {
            b();
        }
        if (this.f2220d != 0) {
            C1588c c1588c = this.f2223g;
            o6.j.c(c1588c, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f2223g = null;
            this.f2220d = -1;
            return c1588c;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
