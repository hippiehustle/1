package b2;

import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class g extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9073g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f9074h;

    /* renamed from: i, reason: collision with root package name */
    public int f9075i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r rVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f9074h = rVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f9073g = obj;
        this.f9075i |= Integer.MIN_VALUE;
        return this.f9074h.g(0L, this);
    }
}
