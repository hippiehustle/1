package Q4;

import O3.J;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class q extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4888g;

    /* renamed from: h, reason: collision with root package name */
    public int f4889h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J f4890i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(J j, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f4890i = j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4888g = obj;
        this.f4889h |= Integer.MIN_VALUE;
        return this.f4890i.n(null, this);
    }
}
