package R3;

import O3.J;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class o extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5073g;

    /* renamed from: h, reason: collision with root package name */
    public int f5074h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J f5075i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(J j, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f5075i = j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f5073g = obj;
        this.f5074h |= Integer.MIN_VALUE;
        return this.f5075i.n(null, this);
    }
}
