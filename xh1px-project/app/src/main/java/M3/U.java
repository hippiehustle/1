package M3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class U extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3400g;

    /* renamed from: h, reason: collision with root package name */
    public int f3401h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V f3402i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(V v8, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f3402i = v8;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f3400g = obj;
        this.f3401h |= Integer.MIN_VALUE;
        return this.f3402i.n(null, this);
    }
}
