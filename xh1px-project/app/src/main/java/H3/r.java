package H3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class r extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1961g;

    /* renamed from: h, reason: collision with root package name */
    public int f1962h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1.e f1963i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C1.e eVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f1963i = eVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f1961g = obj;
        this.f1962h |= Integer.MIN_VALUE;
        return this.f1963i.n(null, this);
    }
}
