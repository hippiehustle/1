package O3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class U extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3906g;

    /* renamed from: h, reason: collision with root package name */
    public int f3907h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J f3908i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(J j, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f3908i = j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f3906g = obj;
        this.f3907h |= Integer.MIN_VALUE;
        return this.f3908i.n(null, this);
    }
}
