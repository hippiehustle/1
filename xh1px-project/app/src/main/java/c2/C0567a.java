package c2;

import f6.AbstractC0713c;

/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0567a extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9508g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z f9509h;

    /* renamed from: i, reason: collision with root package name */
    public int f9510i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0567a(z zVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f9509h = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f9508g = obj;
        this.f9510i |= Integer.MIN_VALUE;
        return this.f9509h.d(null, null, null, this);
    }
}
