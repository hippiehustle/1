package y2;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;
import q4.C1386K;

/* loaded from: classes.dex */
public final class e extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f16465g;

    /* renamed from: h, reason: collision with root package name */
    public int f16466h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1386K f16467i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C1386K c1386k, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f16467i = c1386k;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f16465g = obj;
        this.f16466h |= Integer.MIN_VALUE;
        return this.f16467i.n(null, this);
    }
}
