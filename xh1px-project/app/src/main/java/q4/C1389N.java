package q4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: q4.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1389N extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14048g;

    /* renamed from: h, reason: collision with root package name */
    public int f14049h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1386K f14050i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1389N(C1386K c1386k, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f14050i = c1386k;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f14048g = obj;
        this.f14049h |= Integer.MIN_VALUE;
        return this.f14050i.n(null, this);
    }
}
