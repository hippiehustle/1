package V4;

import T3.x;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class o extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6406g;

    /* renamed from: h, reason: collision with root package name */
    public int f6407h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f6408i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(x xVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f6408i = xVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f6406g = obj;
        this.f6407h |= Integer.MIN_VALUE;
        return this.f6408i.n(null, this);
    }
}
