package r3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;
import q4.C1386K;

/* renamed from: r3.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1456t extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14357g;

    /* renamed from: h, reason: collision with root package name */
    public int f14358h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1386K f14359i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1456t(C1386K c1386k, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f14359i = c1386k;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f14357g = obj;
        this.f14358h |= Integer.MIN_VALUE;
        return this.f14359i.n(null, this);
    }
}
