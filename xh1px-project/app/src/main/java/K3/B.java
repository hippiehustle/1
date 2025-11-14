package K3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class B extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2634g;

    /* renamed from: h, reason: collision with root package name */
    public int f2635h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1.e f2636i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C1.e eVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f2636i = eVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f2634g = obj;
        this.f2635h |= Integer.MIN_VALUE;
        return this.f2636i.n(null, this);
    }
}
