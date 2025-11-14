package X;

import f6.AbstractC0713c;

/* renamed from: X.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340h extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public A4.a f6734g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6735h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A4.a f6736i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0340h(A4.a aVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f6736i = aVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f6735h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f6736i.h(this);
    }
}
