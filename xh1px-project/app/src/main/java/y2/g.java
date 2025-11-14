package y2;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;
import q4.C1386K;

/* loaded from: classes.dex */
public final class g extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f16471g;

    /* renamed from: h, reason: collision with root package name */
    public int f16472h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1386K f16473i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C1386K c1386k, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f16473i = c1386k;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f16471g = obj;
        this.f16472h |= Integer.MIN_VALUE;
        return this.f16473i.n(null, this);
    }
}
