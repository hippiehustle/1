package b2;

import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class i extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9079g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f9080h;

    /* renamed from: i, reason: collision with root package name */
    public int f9081i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r rVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f9080h = rVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f9079g = obj;
        this.f9081i |= Integer.MIN_VALUE;
        return this.f9080h.i(this);
    }
}
