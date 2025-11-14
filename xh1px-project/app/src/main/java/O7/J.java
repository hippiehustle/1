package O7;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class J extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4078g;

    /* renamed from: h, reason: collision with root package name */
    public int f4079h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L3.M f4080i;
    public Object j;
    public InterfaceC0234g k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(L3.M m6, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f4080i = m6;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4078g = obj;
        this.f4079h |= Integer.MIN_VALUE;
        return this.f4080i.n(null, this);
    }
}
