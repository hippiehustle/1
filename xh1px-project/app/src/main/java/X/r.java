package X;

import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class r extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public H f6766g;

    /* renamed from: h, reason: collision with root package name */
    public U7.c f6767h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6768i;
    public final /* synthetic */ H j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(H h8, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.j = h8;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f6768i = obj;
        this.k |= Integer.MIN_VALUE;
        return H.a(this.j, this);
    }
}
