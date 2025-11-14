package y2;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;
import q4.C1386K;

/* loaded from: classes.dex */
public final class f extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f16468g;

    /* renamed from: h, reason: collision with root package name */
    public int f16469h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1386K f16470i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C1386K c1386k, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f16470i = c1386k;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f16468g = obj;
        this.f16469h |= Integer.MIN_VALUE;
        return this.f16470i.n(null, this);
    }
}
