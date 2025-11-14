package k4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class M extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12036g;

    /* renamed from: h, reason: collision with root package name */
    public int f12037h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b2.p f12038i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(b2.p pVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f12038i = pVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f12036g = obj;
        this.f12037h |= Integer.MIN_VALUE;
        return this.f12038i.n(null, this);
    }
}
