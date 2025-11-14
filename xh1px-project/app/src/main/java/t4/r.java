package t4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;
import q4.C1386K;

/* loaded from: classes.dex */
public final class r extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f15097g;

    /* renamed from: h, reason: collision with root package name */
    public int f15098h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1386K f15099i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C1386K c1386k, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f15099i = c1386k;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f15097g = obj;
        this.f15098h |= Integer.MIN_VALUE;
        return this.f15099i.n(null, this);
    }
}
