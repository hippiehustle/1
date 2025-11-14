package r3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;
import q4.C1386K;

/* renamed from: r3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1455s extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14354g;

    /* renamed from: h, reason: collision with root package name */
    public int f14355h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1386K f14356i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1455s(C1386K c1386k, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f14356i = c1386k;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f14354g = obj;
        this.f14355h |= Integer.MIN_VALUE;
        return this.f14356i.n(null, this);
    }
}
