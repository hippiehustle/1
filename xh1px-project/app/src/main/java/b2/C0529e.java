package b2;

import f6.AbstractC0713c;

/* renamed from: b2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0529e extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9067g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f9068h;

    /* renamed from: i, reason: collision with root package name */
    public int f9069i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0529e(r rVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f9068h = rVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f9067g = obj;
        this.f9069i |= Integer.MIN_VALUE;
        return this.f9068h.f(0L, this);
    }
}
