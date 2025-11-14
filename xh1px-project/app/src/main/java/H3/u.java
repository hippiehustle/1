package H3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class u extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1969g;

    /* renamed from: h, reason: collision with root package name */
    public int f1970h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1.e f1971i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(C1.e eVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f1971i = eVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f1969g = obj;
        this.f1970h |= Integer.MIN_VALUE;
        return this.f1971i.n(null, this);
    }
}
