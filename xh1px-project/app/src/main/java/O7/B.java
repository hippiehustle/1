package O7;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class B extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public L3.M f4056g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4057h;

    /* renamed from: i, reason: collision with root package name */
    public int f4058i;
    public final /* synthetic */ L3.M j;
    public Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(L3.M m6, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.j = m6;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4057h = obj;
        this.f4058i |= Integer.MIN_VALUE;
        return this.j.n(null, this);
    }
}
