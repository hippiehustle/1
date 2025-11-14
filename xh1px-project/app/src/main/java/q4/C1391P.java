package q4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: q4.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1391P extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14054g;

    /* renamed from: h, reason: collision with root package name */
    public int f14055h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1386K f14056i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1391P(C1386K c1386k, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f14056i = c1386k;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f14054g = obj;
        this.f14055h |= Integer.MIN_VALUE;
        return this.f14056i.n(null, this);
    }
}
