package u4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;
import q4.C1386K;

/* loaded from: classes.dex */
public final class l extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f15342g;

    /* renamed from: h, reason: collision with root package name */
    public int f15343h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1386K f15344i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C1386K c1386k, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f15344i = c1386k;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f15342g = obj;
        this.f15343h |= Integer.MIN_VALUE;
        return this.f15344i.n(null, this);
    }
}
