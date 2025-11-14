package m2;

import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class e extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12390g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ l f12391h;

    /* renamed from: i, reason: collision with root package name */
    public int f12392i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f12391h = lVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f12390g = obj;
        this.f12392i |= Integer.MIN_VALUE;
        return this.f12391h.d(0L, this);
    }
}
