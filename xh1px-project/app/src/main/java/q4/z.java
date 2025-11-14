package q4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class z extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14144g;

    /* renamed from: h, reason: collision with root package name */
    public int f14145h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o4.z f14146i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(o4.z zVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f14146i = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f14144g = obj;
        this.f14145h |= Integer.MIN_VALUE;
        return this.f14146i.n(null, this);
    }
}
