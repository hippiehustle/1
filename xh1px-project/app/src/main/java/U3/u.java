package U3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class u extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6141g;

    /* renamed from: h, reason: collision with root package name */
    public int f6142h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T3.x f6143i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(T3.x xVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f6143i = xVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f6141g = obj;
        this.f6142h |= Integer.MIN_VALUE;
        return this.f6143i.n(null, this);
    }
}
