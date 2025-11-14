package k4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class U extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12055g;

    /* renamed from: h, reason: collision with root package name */
    public int f12056h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b2.p f12057i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(b2.p pVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f12057i = pVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f12055g = obj;
        this.f12056h |= Integer.MIN_VALUE;
        return this.f12057i.n(null, this);
    }
}
