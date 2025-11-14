package H3;

import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class m extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1943g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n f1944h;

    /* renamed from: i, reason: collision with root package name */
    public int f1945i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f1944h = nVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f1943g = obj;
        this.f1945i |= Integer.MIN_VALUE;
        return this.f1944h.h(this);
    }
}
