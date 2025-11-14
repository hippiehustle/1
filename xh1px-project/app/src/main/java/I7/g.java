package I7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p6.InterfaceC1315a;

/* loaded from: classes.dex */
public final class g implements Iterator, InterfaceC1315a {

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f2234d;

    /* renamed from: e, reason: collision with root package name */
    public int f2235e;

    /* renamed from: f, reason: collision with root package name */
    public int f2236f;

    /* renamed from: g, reason: collision with root package name */
    public int f2237g;

    /* renamed from: h, reason: collision with root package name */
    public int f2238h;

    public g(CharSequence charSequence) {
        o6.j.e(charSequence, "string");
        this.f2234d = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4;
        int i8 = this.f2235e;
        if (i8 != 0) {
            if (i8 != 1) {
                return false;
            }
            return true;
        }
        int i9 = 2;
        if (this.f2238h < 0) {
            this.f2235e = 2;
            return false;
        }
        CharSequence charSequence = this.f2234d;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i10 = this.f2236f; i10 < length2; i10++) {
            char charAt = charSequence.charAt(i10);
            if (charAt == '\n' || charAt == '\r') {
                if (charAt != '\r' || (i4 = i10 + 1) >= charSequence.length() || charSequence.charAt(i4) != '\n') {
                    i9 = 1;
                }
                length = i10;
                this.f2235e = 1;
                this.f2238h = i9;
                this.f2237g = length;
                return true;
            }
        }
        i9 = -1;
        this.f2235e = 1;
        this.f2238h = i9;
        this.f2237g = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f2235e = 0;
            int i4 = this.f2237g;
            int i8 = this.f2236f;
            this.f2236f = this.f2238h + i4;
            return this.f2234d.subSequence(i8, i4).toString();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
