package c2;

import L3.M;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class j extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9540g;

    /* renamed from: h, reason: collision with root package name */
    public int f9541h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ M f9542i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(M m6, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f9542i = m6;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f9540g = obj;
        this.f9541h |= Integer.MIN_VALUE;
        return this.f9542i.n(null, this);
    }
}
