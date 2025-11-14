package N7;

import e6.EnumC0646a;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class g extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3807g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f3808h;

    /* renamed from: i, reason: collision with root package name */
    public int f3809i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f3808h = hVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f3807g = obj;
        this.f3809i |= Integer.MIN_VALUE;
        Object C8 = this.f3808h.C(null, 0, 0L, this);
        if (C8 == EnumC0646a.f10656d) {
            return C8;
        }
        return new o(C8);
    }
}
