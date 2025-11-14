package u0;

import f6.AbstractC0713c;

/* renamed from: u0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1596A extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public Object f15146g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f15147h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1609N f15148i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1596A(C1609N c1609n, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f15148i = c1609n;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f15147h = obj;
        this.j |= Integer.MIN_VALUE;
        return C1609N.a(this.f15148i, null, this);
    }
}
