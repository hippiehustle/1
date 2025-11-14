package a6;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: a6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0428c extends AbstractC0429d implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0429d f7755d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7756e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7757f;

    public C0428c(AbstractC0429d abstractC0429d, int i4, int i8) {
        this.f7755d = abstractC0429d;
        this.f7756e = i4;
        E2.b.g(i4, i8, abstractC0429d.g());
        this.f7757f = i8 - i4;
    }

    @Override // a6.AbstractC0426a
    public final int g() {
        return this.f7757f;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        int i8 = this.f7757f;
        if (i4 >= 0 && i4 < i8) {
            return this.f7755d.get(this.f7756e + i4);
        }
        throw new IndexOutOfBoundsException(A.j.i(i4, i8, "index: ", ", size: "));
    }

    @Override // a6.AbstractC0429d, java.util.List
    public final List subList(int i4, int i8) {
        E2.b.g(i4, i8, this.f7757f);
        int i9 = this.f7756e;
        return new C0428c(this.f7755d, i4 + i9, i9 + i8);
    }
}
