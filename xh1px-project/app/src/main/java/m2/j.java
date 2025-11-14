package m2;

import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class j extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public long f12405g;

    /* renamed from: h, reason: collision with root package name */
    public R.g f12406h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f12407i;
    public final /* synthetic */ l j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.j = lVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f12407i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.g(0L, null, this);
    }
}
