package K3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class x extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2720g;

    /* renamed from: h, reason: collision with root package name */
    public int f2721h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1.e f2722i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C1.e eVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f2722i = eVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f2720g = obj;
        this.f2721h |= Integer.MIN_VALUE;
        return this.f2722i.n(null, this);
    }
}
