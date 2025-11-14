package p4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class q extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13773g;

    /* renamed from: h, reason: collision with root package name */
    public int f13774h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ U3.q f13775i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(U3.q qVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f13775i = qVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f13773g = obj;
        this.f13774h |= Integer.MIN_VALUE;
        return this.f13775i.n(null, this);
    }
}
