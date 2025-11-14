package M3;

import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class D extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3343g;

    /* renamed from: h, reason: collision with root package name */
    public int f3344h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L3.M f3345i;
    public InterfaceC0234g j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(L3.M m6, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f3345i = m6;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f3343g = obj;
        this.f3344h |= Integer.MIN_VALUE;
        return this.f3345i.n(null, this);
    }
}
