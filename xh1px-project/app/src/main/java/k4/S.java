package k4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class S extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12049g;

    /* renamed from: h, reason: collision with root package name */
    public int f12050h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ M3.V f12051i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(M3.V v8, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f12051i = v8;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f12049g = obj;
        this.f12050h |= Integer.MIN_VALUE;
        return this.f12051i.n(null, this);
    }
}
