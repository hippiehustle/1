package L3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class O extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2816g;

    /* renamed from: h, reason: collision with root package name */
    public int f2817h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E f2818i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(E e9, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f2818i = e9;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f2816g = obj;
        this.f2817h |= Integer.MIN_VALUE;
        return this.f2818i.n(null, this);
    }
}
