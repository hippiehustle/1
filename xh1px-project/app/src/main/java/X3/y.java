package X3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class y extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6933g;

    /* renamed from: h, reason: collision with root package name */
    public int f6934h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f6935i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(t tVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f6935i = tVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f6933g = obj;
        this.f6934h |= Integer.MIN_VALUE;
        return this.f6935i.n(null, this);
    }
}
