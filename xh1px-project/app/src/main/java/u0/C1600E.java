package u0;

import f6.AbstractC0713c;
import t0.C1536c;

/* renamed from: u0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1600E extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public C1609N f15157g;

    /* renamed from: h, reason: collision with root package name */
    public C1536c f15158h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f15159i;
    public final /* synthetic */ C1609N j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1600E(C1609N c1609n, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.j = c1609n;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f15159i = obj;
        this.k |= Integer.MIN_VALUE;
        return C1609N.b(this.j, this);
    }
}
