package X;

import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class F extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public o6.s f6647g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6648h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ H f6649i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(H h8, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f6649i = h8;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f6648h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f6649i.k(null, false, this);
    }
}
