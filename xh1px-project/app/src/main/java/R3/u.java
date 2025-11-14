package R3;

import O3.J;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class u extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5090g;

    /* renamed from: h, reason: collision with root package name */
    public int f5091h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J f5092i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(J j, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f5092i = j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f5090g = obj;
        this.f5091h |= Integer.MIN_VALUE;
        return this.f5092i.n(null, this);
    }
}
