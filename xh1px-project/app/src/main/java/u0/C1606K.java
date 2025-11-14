package u0;

import f6.AbstractC0713c;
import t0.C1536c;

/* renamed from: u0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1606K extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public C1536c f15180g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f15181h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1609N f15182i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1606K(C1609N c1609n, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f15182i = c1609n;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f15181h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f15182i.f(this);
    }
}
