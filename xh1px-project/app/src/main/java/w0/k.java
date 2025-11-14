package w0;

import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class k extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f15599g;

    /* renamed from: h, reason: collision with root package name */
    public int f15600h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0234g f15601i;
    public final /* synthetic */ l j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.j = lVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f15599g = obj;
        this.f15600h |= Integer.MIN_VALUE;
        return this.j.n(null, this);
    }
}
