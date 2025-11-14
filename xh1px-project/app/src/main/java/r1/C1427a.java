package r1;

import f6.AbstractC0713c;

/* renamed from: r1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1427a extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14259g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1428b f14260h;

    /* renamed from: i, reason: collision with root package name */
    public int f14261i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1427a(C1428b c1428b, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f14260h = c1428b;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f14259g = obj;
        this.f14261i |= Integer.MIN_VALUE;
        return this.f14260h.a(null, this);
    }
}
