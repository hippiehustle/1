package x0;

import f6.AbstractC0713c;

/* renamed from: x0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1774c extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public C1775d f16081g;

    /* renamed from: h, reason: collision with root package name */
    public E0.a f16082h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f16083i;
    public final /* synthetic */ C1775d j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1774c(C1775d c1775d, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.j = c1775d;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f16083i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(null, null, this);
    }
}
