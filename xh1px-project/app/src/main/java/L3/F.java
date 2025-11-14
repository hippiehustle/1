package L3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class F extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2790g;

    /* renamed from: h, reason: collision with root package name */
    public int f2791h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E f2792i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(E e9, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f2792i = e9;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f2790g = obj;
        this.f2791h |= Integer.MIN_VALUE;
        return this.f2792i.n(null, this);
    }
}
