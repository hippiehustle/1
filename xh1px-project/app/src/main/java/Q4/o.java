package Q4;

import O3.J;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class o extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4883g;

    /* renamed from: h, reason: collision with root package name */
    public int f4884h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J f4885i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(J j, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f4885i = j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4883g = obj;
        this.f4884h |= Integer.MIN_VALUE;
        return this.f4885i.n(null, this);
    }
}
