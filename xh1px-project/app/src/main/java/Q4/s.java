package Q4;

import O3.J;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class s extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4894g;

    /* renamed from: h, reason: collision with root package name */
    public int f4895h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J f4896i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(J j, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f4896i = j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4894g = obj;
        this.f4895h |= Integer.MIN_VALUE;
        return this.f4896i.n(null, this);
    }
}
