package c2;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class g extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9531g;

    /* renamed from: h, reason: collision with root package name */
    public int f9532h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b2.p f9533i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b2.p pVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f9533i = pVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f9531g = obj;
        this.f9532h |= Integer.MIN_VALUE;
        return this.f9533i.n(null, this);
    }
}
