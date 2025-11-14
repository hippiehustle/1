package L3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class J extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2801g;

    /* renamed from: h, reason: collision with root package name */
    public int f2802h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E f2803i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(E e9, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f2803i = e9;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f2801g = obj;
        this.f2802h |= Integer.MIN_VALUE;
        return this.f2803i.n(null, this);
    }
}
