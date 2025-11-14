package X;

import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class V extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public A4.a f6698g;

    /* renamed from: h, reason: collision with root package name */
    public U7.a f6699h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6700i;
    public final /* synthetic */ A4.a j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(A4.a aVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.j = aVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f6700i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.q(this);
    }
}
