package m2;

import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class g extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public long f12396g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f12397h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f12398i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f12398i = lVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f12397h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f12398i.e(0L, this);
    }
}
