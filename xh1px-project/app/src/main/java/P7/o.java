package P7;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class o extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4666g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p f4667h;

    /* renamed from: i, reason: collision with root package name */
    public int f4668i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f4667h = pVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4666g = obj;
        this.f4668i |= Integer.MIN_VALUE;
        return this.f4667h.n(null, this);
    }
}
