package L3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class D extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2785g;

    /* renamed from: h, reason: collision with root package name */
    public int f2786h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E f2787i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(E e9, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f2787i = e9;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f2785g = obj;
        this.f2786h |= Integer.MIN_VALUE;
        return this.f2787i.n(null, this);
    }
}
