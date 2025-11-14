package b2;

import f6.AbstractC0713c;

/* renamed from: b2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0525a extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public long f9051g;

    /* renamed from: h, reason: collision with root package name */
    public String f9052h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9053i;
    public final /* synthetic */ r j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0525a(r rVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.j = rVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f9053i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(0L, null, this);
    }
}
