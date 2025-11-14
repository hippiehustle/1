package Y3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class y extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f7164g;

    /* renamed from: h, reason: collision with root package name */
    public int f7165h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ X3.t f7166i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(X3.t tVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f7166i = tVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f7164g = obj;
        this.f7165h |= Integer.MIN_VALUE;
        return this.f7166i.n(null, this);
    }
}
