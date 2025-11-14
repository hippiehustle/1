package T3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class z extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5754g;

    /* renamed from: h, reason: collision with root package name */
    public int f5755h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f5756i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(x xVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f5756i = xVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f5754g = obj;
        this.f5755h |= Integer.MIN_VALUE;
        return this.f5756i.n(null, this);
    }
}
