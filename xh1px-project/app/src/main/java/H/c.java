package H;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f1847e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f1848a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1849b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1850c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1851d;

    public c(int i4, int i8, int i9, int i10) {
        this.f1848a = i4;
        this.f1849b = i8;
        this.f1850c = i9;
        this.f1851d = i10;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f1848a, cVar2.f1848a), Math.max(cVar.f1849b, cVar2.f1849b), Math.max(cVar.f1850c, cVar2.f1850c), Math.max(cVar.f1851d, cVar2.f1851d));
    }

    public static c b(int i4, int i8, int i9, int i10) {
        if (i4 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            return f1847e;
        }
        return new c(i4, i8, i9, i10);
    }

    public static c c(Insets insets) {
        int i4;
        int i8;
        int i9;
        int i10;
        i4 = insets.left;
        i8 = insets.top;
        i9 = insets.right;
        i10 = insets.bottom;
        return b(i4, i8, i9, i10);
    }

    public final Insets d() {
        return a.c(this.f1848a, this.f1849b, this.f1850c, this.f1851d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1851d == cVar.f1851d && this.f1848a == cVar.f1848a && this.f1850c == cVar.f1850c && this.f1849b == cVar.f1849b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f1848a * 31) + this.f1849b) * 31) + this.f1850c) * 31) + this.f1851d;
    }

    public final String toString() {
        return "Insets{left=" + this.f1848a + ", top=" + this.f1849b + ", right=" + this.f1850c + ", bottom=" + this.f1851d + '}';
    }
}
