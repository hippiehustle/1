package l3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: l3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1016o extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12231g;

    /* renamed from: h, reason: collision with root package name */
    public int f12232h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b2.p f12233i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1016o(b2.p pVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f12233i = pVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f12231g = obj;
        this.f12232h |= Integer.MIN_VALUE;
        return this.f12233i.n(null, this);
    }
}
