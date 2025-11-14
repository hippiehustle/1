package b2;

import X3.t;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class l extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9094g;

    /* renamed from: h, reason: collision with root package name */
    public int f9095h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f9096i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(t tVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f9096i = tVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f9094g = obj;
        this.f9095h |= Integer.MIN_VALUE;
        return this.f9096i.n(null, this);
    }
}
