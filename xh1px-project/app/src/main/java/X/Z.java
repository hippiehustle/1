package X;

import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class Z extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public U7.c f6708g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6709h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6710i;
    public final /* synthetic */ b0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(b0 b0Var, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.j = b0Var;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f6710i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(null, this);
    }
}
