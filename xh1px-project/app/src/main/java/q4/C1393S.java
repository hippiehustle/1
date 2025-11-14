package q4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: q4.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1393S extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14060g;

    /* renamed from: h, reason: collision with root package name */
    public int f14061h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1386K f14062i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1393S(C1386K c1386k, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f14062i = c1386k;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f14060g = obj;
        this.f14061h |= Integer.MIN_VALUE;
        return this.f14062i.n(null, this);
    }
}
