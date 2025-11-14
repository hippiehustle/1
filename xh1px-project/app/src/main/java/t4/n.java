package t4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;
import q4.C1386K;

/* loaded from: classes.dex */
public final class n extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f15087g;

    /* renamed from: h, reason: collision with root package name */
    public int f15088h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1386K f15089i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C1386K c1386k, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f15089i = c1386k;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f15087g = obj;
        this.f15088h |= Integer.MIN_VALUE;
        return this.f15089i.n(null, this);
    }
}
