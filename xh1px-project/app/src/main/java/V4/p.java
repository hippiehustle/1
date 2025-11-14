package V4;

import T3.x;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class p extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6409g;

    /* renamed from: h, reason: collision with root package name */
    public int f6410h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f6411i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(x xVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f6411i = xVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f6409g = obj;
        this.f6410h |= Integer.MIN_VALUE;
        return this.f6411i.n(null, this);
    }
}
