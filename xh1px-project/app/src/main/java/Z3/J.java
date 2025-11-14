package Z3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class J extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f7339g;

    /* renamed from: h, reason: collision with root package name */
    public int f7340h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ X3.t f7341i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(X3.t tVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f7341i = tVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f7339g = obj;
        this.f7340h |= Integer.MIN_VALUE;
        return this.f7341i.n(null, this);
    }
}
