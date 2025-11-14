package m2;

import f6.AbstractC0713c;

/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1055a extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public p2.e f12378g;

    /* renamed from: h, reason: collision with root package name */
    public l f12379h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f12380i;
    public final /* synthetic */ l j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1055a(l lVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.j = lVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f12380i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
