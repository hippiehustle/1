package F4;

import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class m extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1407g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s f1408h;

    /* renamed from: i, reason: collision with root package name */
    public int f1409i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s sVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f1408h = sVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f1407g = obj;
        this.f1409i |= Integer.MIN_VALUE;
        return s.a(this.f1408h, 0, this);
    }
}
