package K3;

import D4.C0027c;
import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class A extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2631g;

    /* renamed from: h, reason: collision with root package name */
    public int f2632h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0027c f2633i;
    public InterfaceC0234g j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C0027c c0027c, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f2633i = c0027c;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f2631g = obj;
        this.f2632h |= Integer.MIN_VALUE;
        return this.f2633i.n(null, this);
    }
}
