package Q4;

import O3.J;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class r extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4891g;

    /* renamed from: h, reason: collision with root package name */
    public int f4892h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J f4893i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(J j, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f4893i = j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4891g = obj;
        this.f4892h |= Integer.MIN_VALUE;
        return this.f4893i.n(null, this);
    }
}
