package w0;

import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class m extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public p f15606g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f15607h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f15608i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f15608i = pVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f15607h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f15608i.a(this);
    }
}
