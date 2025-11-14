package P7;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class k extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public l f4655g;

    /* renamed from: h, reason: collision with root package name */
    public Object f4656h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4657i;
    public final /* synthetic */ l j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.j = lVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4657i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.n(null, this);
    }
}
