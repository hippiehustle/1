package b2;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class q extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9108g;

    /* renamed from: h, reason: collision with root package name */
    public int f9109h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f9110i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f9110i = pVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f9108g = obj;
        this.f9109h |= Integer.MIN_VALUE;
        return this.f9110i.n(null, this);
    }
}
