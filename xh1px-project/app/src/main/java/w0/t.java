package w0;

import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class t extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public x f15630g;

    /* renamed from: h, reason: collision with root package name */
    public u0.y f15631h;

    /* renamed from: i, reason: collision with root package name */
    public j f15632i;
    public /* synthetic */ Object j;
    public final /* synthetic */ x k;

    /* renamed from: l, reason: collision with root package name */
    public int f15633l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(x xVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.k = xVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.j = obj;
        this.f15633l |= Integer.MIN_VALUE;
        return this.k.e(null, this);
    }
}
