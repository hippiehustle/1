package M3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class B extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3337g;

    /* renamed from: h, reason: collision with root package name */
    public int f3338h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L3.E f3339i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(L3.E e9, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f3339i = e9;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f3337g = obj;
        this.f3338h |= Integer.MIN_VALUE;
        return this.f3339i.n(null, this);
    }
}
