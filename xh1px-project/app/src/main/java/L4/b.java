package L4;

import L3.M;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class b extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2898g;

    /* renamed from: h, reason: collision with root package name */
    public int f2899h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ M f2900i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(M m6, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f2900i = m6;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f2898g = obj;
        this.f2899h |= Integer.MIN_VALUE;
        return this.f2900i.n(null, this);
    }
}
