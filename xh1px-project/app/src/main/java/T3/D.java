package T3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class D extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5688g;

    /* renamed from: h, reason: collision with root package name */
    public int f5689h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f5690i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(x xVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f5690i = xVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f5688g = obj;
        this.f5689h |= Integer.MIN_VALUE;
        return this.f5690i.n(null, this);
    }
}
