package H3;

import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class c extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1913g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n f1914h;

    /* renamed from: i, reason: collision with root package name */
    public int f1915i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n nVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f1914h = nVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f1913g = obj;
        this.f1915i |= Integer.MIN_VALUE;
        return this.f1914h.b(this);
    }
}
