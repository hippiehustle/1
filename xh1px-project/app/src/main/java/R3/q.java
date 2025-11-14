package R3;

import O3.J;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class q extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5078g;

    /* renamed from: h, reason: collision with root package name */
    public int f5079h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J f5080i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(J j, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f5080i = j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f5078g = obj;
        this.f5079h |= Integer.MIN_VALUE;
        return this.f5080i.n(null, this);
    }
}
