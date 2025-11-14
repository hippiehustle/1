package L3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class L extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2807g;

    /* renamed from: h, reason: collision with root package name */
    public int f2808h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ M f2809i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(M m6, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f2809i = m6;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f2807g = obj;
        this.f2808h |= Integer.MIN_VALUE;
        return this.f2809i.n(null, this);
    }
}
