package D4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class M extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f924g;

    /* renamed from: h, reason: collision with root package name */
    public int f925h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1.e f926i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(C1.e eVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f926i = eVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f924g = obj;
        this.f925h |= Integer.MIN_VALUE;
        return this.f926i.n(null, this);
    }
}
