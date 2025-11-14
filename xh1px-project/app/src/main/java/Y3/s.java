package Y3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class s extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f7147g;

    /* renamed from: h, reason: collision with root package name */
    public int f7148h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ X3.t f7149i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(X3.t tVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f7149i = tVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f7147g = obj;
        this.f7148h |= Integer.MIN_VALUE;
        return this.f7149i.n(null, this);
    }
}
