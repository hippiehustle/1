package t4;

import D4.C0027c;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class t extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f15103g;

    /* renamed from: h, reason: collision with root package name */
    public int f15104h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0027c f15105i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(C0027c c0027c, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f15105i = c0027c;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f15103g = obj;
        this.f15104h |= Integer.MIN_VALUE;
        return this.f15105i.n(null, this);
    }
}
