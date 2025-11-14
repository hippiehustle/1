package H3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class x extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1977g;

    /* renamed from: h, reason: collision with root package name */
    public int f1978h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1.e f1979i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C1.e eVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f1979i = eVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f1977g = obj;
        this.f1978h |= Integer.MIN_VALUE;
        return this.f1979i.n(null, this);
    }
}
