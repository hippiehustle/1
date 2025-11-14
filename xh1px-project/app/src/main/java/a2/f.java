package a2;

import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class f extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public U7.c f7711g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7712h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f7713i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f7713i = hVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f7712h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f7713i.f(this);
    }
}
