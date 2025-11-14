package S4;

import D4.C0027c;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class j extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5385g;

    /* renamed from: h, reason: collision with root package name */
    public int f5386h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0027c f5387i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C0027c c0027c, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f5387i = c0027c;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f5385g = obj;
        this.f5386h |= Integer.MIN_VALUE;
        return this.f5387i.n(null, this);
    }
}
