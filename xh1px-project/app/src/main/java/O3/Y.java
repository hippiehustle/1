package O3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class Y extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3918g;

    /* renamed from: h, reason: collision with root package name */
    public int f3919h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ N f3920i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(N n3, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f3920i = n3;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f3918g = obj;
        this.f3919h |= Integer.MIN_VALUE;
        return this.f3920i.n(null, this);
    }
}
