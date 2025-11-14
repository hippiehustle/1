package R3;

import O3.J;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class t extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5087g;

    /* renamed from: h, reason: collision with root package name */
    public int f5088h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J f5089i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(J j, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f5089i = j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f5087g = obj;
        this.f5088h |= Integer.MIN_VALUE;
        return this.f5089i.n(null, this);
    }
}
