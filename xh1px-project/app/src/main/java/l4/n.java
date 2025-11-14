package l4;

import L3.M;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class n extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12281g;

    /* renamed from: h, reason: collision with root package name */
    public int f12282h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ M f12283i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(M m6, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f12283i = m6;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f12281g = obj;
        this.f12282h |= Integer.MIN_VALUE;
        return this.f12283i.n(null, this);
    }
}
