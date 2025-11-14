package L3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class K extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2804g;

    /* renamed from: h, reason: collision with root package name */
    public int f2805h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E f2806i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(E e9, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f2806i = e9;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f2804g = obj;
        this.f2805h |= Integer.MIN_VALUE;
        return this.f2806i.n(null, this);
    }
}
