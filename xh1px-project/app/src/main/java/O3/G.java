package O3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class G extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3870g;

    /* renamed from: h, reason: collision with root package name */
    public int f3871h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L3.E f3872i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(L3.E e9, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f3872i = e9;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f3870g = obj;
        this.f3871h |= Integer.MIN_VALUE;
        return this.f3872i.n(null, this);
    }
}
