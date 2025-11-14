package X;

import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class N extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public O f6679g;

    /* renamed from: h, reason: collision with root package name */
    public Object f6680h;

    /* renamed from: i, reason: collision with root package name */
    public Object f6681i;
    public Q j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O f6682l;

    /* renamed from: m, reason: collision with root package name */
    public int f6683m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(O o7, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f6682l = o7;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.k = obj;
        this.f6683m |= Integer.MIN_VALUE;
        return this.f6682l.b(null, this);
    }
}
