package b2;

import X3.t;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class m extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9097g;

    /* renamed from: h, reason: collision with root package name */
    public int f9098h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f9099i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f9099i = tVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f9097g = obj;
        this.f9098h |= Integer.MIN_VALUE;
        return this.f9099i.n(null, this);
    }
}
