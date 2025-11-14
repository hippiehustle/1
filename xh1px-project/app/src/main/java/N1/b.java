package N1;

import L3.M;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class b extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3707g;

    /* renamed from: h, reason: collision with root package name */
    public int f3708h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ M f3709i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(M m6, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f3709i = m6;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f3707g = obj;
        this.f3708h |= Integer.MIN_VALUE;
        return this.f3709i.n(null, this);
    }
}
