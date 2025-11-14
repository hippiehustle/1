package X;

import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class Y extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public Object f6705g;

    /* renamed from: h, reason: collision with root package name */
    public U7.c f6706h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6707i;
    public final /* synthetic */ b0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(b0 b0Var, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.j = b0Var;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f6707i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.b(null, this);
    }
}
