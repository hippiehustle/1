package k4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class W extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12061g;

    /* renamed from: h, reason: collision with root package name */
    public int f12062h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b2.p f12063i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(b2.p pVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f12063i = pVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f12061g = obj;
        this.f12062h |= Integer.MIN_VALUE;
        return this.f12063i.n(null, this);
    }
}
