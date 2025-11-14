package N4;

import L3.E;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class b extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3764g;

    /* renamed from: h, reason: collision with root package name */
    public int f3765h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E f3766i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(E e9, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f3766i = e9;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f3764g = obj;
        this.f3765h |= Integer.MIN_VALUE;
        return this.f3766i.n(null, this);
    }
}
