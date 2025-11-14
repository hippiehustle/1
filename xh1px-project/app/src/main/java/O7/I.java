package O7;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class I extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4075g;

    /* renamed from: h, reason: collision with root package name */
    public int f4076h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ O3.J f4077i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(O3.J j, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f4077i = j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4075g = obj;
        this.f4076h |= Integer.MIN_VALUE;
        return this.f4077i.n(null, this);
    }
}
