package r3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;
import q4.C1386K;

/* renamed from: r3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1457u extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14360g;

    /* renamed from: h, reason: collision with root package name */
    public int f14361h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1386K f14362i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1457u(C1386K c1386k, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f14362i = c1386k;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f14360g = obj;
        this.f14361h |= Integer.MIN_VALUE;
        return this.f14362i.n(null, this);
    }
}
