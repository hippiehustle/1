package W3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class q extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6539g;

    /* renamed from: h, reason: collision with root package name */
    public int f6540h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T3.x f6541i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(T3.x xVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f6541i = xVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f6539g = obj;
        this.f6540h |= Integer.MIN_VALUE;
        return this.f6541i.n(null, this);
    }
}
