package S4;

import O3.J;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class i extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5382g;

    /* renamed from: h, reason: collision with root package name */
    public int f5383h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J f5384i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(J j, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f5384i = j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f5382g = obj;
        this.f5383h |= Integer.MIN_VALUE;
        return this.f5384i.n(null, this);
    }
}
