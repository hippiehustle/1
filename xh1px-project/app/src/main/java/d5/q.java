package d5;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class q extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f10431g;

    /* renamed from: h, reason: collision with root package name */
    public int f10432h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b2.p f10433i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(b2.p pVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f10433i = pVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f10431g = obj;
        this.f10432h |= Integer.MIN_VALUE;
        return this.f10433i.n(null, this);
    }
}
