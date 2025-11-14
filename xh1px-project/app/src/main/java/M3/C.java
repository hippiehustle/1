package M3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class C extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3340g;

    /* renamed from: h, reason: collision with root package name */
    public int f3341h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L3.E f3342i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(L3.E e9, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f3342i = e9;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f3340g = obj;
        this.f3341h |= Integer.MIN_VALUE;
        return this.f3342i.n(null, this);
    }
}
