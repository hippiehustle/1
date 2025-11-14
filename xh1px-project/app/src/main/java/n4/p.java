package n4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;
import l3.C1018q;

/* loaded from: classes.dex */
public final class p extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12959g;

    /* renamed from: h, reason: collision with root package name */
    public int f12960h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1018q f12961i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(C1018q c1018q, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f12961i = c1018q;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f12959g = obj;
        this.f12960h |= Integer.MIN_VALUE;
        return this.f12961i.n(null, this);
    }
}
