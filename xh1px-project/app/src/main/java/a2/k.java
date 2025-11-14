package a2;

import O7.Y;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class k extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public Y f7727g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f7728h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Y f7729i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Y y4, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f7729i = y4;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f7728h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f7729i.g(null, 0, null, null, this);
    }
}
