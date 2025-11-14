package c2;

import S1.F;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class e extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public long f9524g;

    /* renamed from: h, reason: collision with root package name */
    public F f9525h;

    /* renamed from: i, reason: collision with root package name */
    public int f9526i;
    public /* synthetic */ Object j;
    public final /* synthetic */ z k;

    /* renamed from: l, reason: collision with root package name */
    public int f9527l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(z zVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.k = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.j = obj;
        this.f9527l |= Integer.MIN_VALUE;
        return this.k.f(0L, this);
    }
}
