package q3;

import M3.V;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class k extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14001g;

    /* renamed from: h, reason: collision with root package name */
    public int f14002h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V f14003i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(V v8, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f14003i = v8;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f14001g = obj;
        this.f14002h |= Integer.MIN_VALUE;
        return this.f14003i.n(null, this);
    }
}
