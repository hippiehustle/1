package z4;

import f6.AbstractC0713c;

/* renamed from: z4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1862f extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public U7.c f16647g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f16648h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1866j f16649i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1862f(C1866j c1866j, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f16649i = c1866j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f16648h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f16649i.d(this);
    }
}
