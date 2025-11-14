package M6;

import c7.AbstractC0585d;
import c7.C0583b;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f3494a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3495b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3496c;

    public h(int i4, int i8, int i9) {
        this.f3494a = i4;
        this.f3495b = i8;
        this.f3496c = i9;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(AbstractC0585d abstractC0585d, int i4) {
        this(abstractC0585d.f9680a, abstractC0585d.f9681b, i4);
        o6.j.e(abstractC0585d, "field");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(C0583b c0583b) {
        this(c0583b, 1);
        o6.j.e(c0583b, "field");
    }
}
