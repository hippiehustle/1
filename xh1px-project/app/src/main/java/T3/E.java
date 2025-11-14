package T3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class E extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5691g;

    /* renamed from: h, reason: collision with root package name */
    public int f5692h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f5693i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(x xVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f5693i = xVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f5691g = obj;
        this.f5692h |= Integer.MIN_VALUE;
        return this.f5693i.n(null, this);
    }
}
