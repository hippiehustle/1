package r2;

import f6.AbstractC0713c;

/* renamed from: r2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1432d extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14272g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j f14273h;

    /* renamed from: i, reason: collision with root package name */
    public int f14274i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1432d(j jVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f14273h = jVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f14272g = obj;
        this.f14274i |= Integer.MIN_VALUE;
        return j.a(this.f14273h, this);
    }
}
