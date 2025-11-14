package U3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class p extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6126g;

    /* renamed from: h, reason: collision with root package name */
    public int f6127h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f6128i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f6128i = qVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f6126g = obj;
        this.f6127h |= Integer.MIN_VALUE;
        return this.f6128i.n(null, this);
    }
}
