package L3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class B extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2780g;

    /* renamed from: h, reason: collision with root package name */
    public int f2781h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y2.j f2782i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(y2.j jVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f2782i = jVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f2780g = obj;
        this.f2781h |= Integer.MIN_VALUE;
        return this.f2782i.n(null, this);
    }
}
