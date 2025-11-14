package b2;

import f6.AbstractC0713c;

/* renamed from: b2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0527c extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9061g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f9062h;

    /* renamed from: i, reason: collision with root package name */
    public int f9063i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0527c(r rVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f9062h = rVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f9061g = obj;
        this.f9063i |= Integer.MIN_VALUE;
        return this.f9062h.e(0L, this);
    }
}
