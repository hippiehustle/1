package N7;

import e6.EnumC0646a;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class f extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3804g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f3805h;

    /* renamed from: i, reason: collision with root package name */
    public int f3806i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.f3805h = hVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f3804g = obj;
        this.f3806i |= Integer.MIN_VALUE;
        Object B8 = h.B(this.f3805h, this);
        if (B8 == EnumC0646a.f10656d) {
            return B8;
        }
        return new o(B8);
    }
}
