package H3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class d extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1916g;

    /* renamed from: h, reason: collision with root package name */
    public int f1917h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1.e f1918i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C1.e eVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f1918i = eVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f1916g = obj;
        this.f1917h |= Integer.MIN_VALUE;
        return this.f1918i.n(null, this);
    }
}
