package L4;

import L3.E;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class e extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2907g;

    /* renamed from: h, reason: collision with root package name */
    public int f2908h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E f2909i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(E e9, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f2909i = e9;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f2907g = obj;
        this.f2908h |= Integer.MIN_VALUE;
        return this.f2909i.n(null, this);
    }
}
