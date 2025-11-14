package P1;

import O3.J;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class r extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4479g;

    /* renamed from: h, reason: collision with root package name */
    public int f4480h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J f4481i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(J j, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f4481i = j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4479g = obj;
        this.f4480h |= Integer.MIN_VALUE;
        return this.f4481i.n(null, this);
    }
}
