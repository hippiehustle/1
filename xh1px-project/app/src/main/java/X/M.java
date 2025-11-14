package X;

import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class M extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public O f6675g;

    /* renamed from: h, reason: collision with root package name */
    public J f6676h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6677i;
    public /* synthetic */ Object j;
    public final /* synthetic */ O k;

    /* renamed from: l, reason: collision with root package name */
    public int f6678l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(O o7, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.k = o7;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.j = obj;
        this.f6678l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
