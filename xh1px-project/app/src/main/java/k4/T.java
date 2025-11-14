package k4;

import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class T extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12052g;

    /* renamed from: h, reason: collision with root package name */
    public int f12053h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L3.M f12054i;
    public InterfaceC0234g j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(L3.M m6, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f12054i = m6;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f12052g = obj;
        this.f12053h |= Integer.MIN_VALUE;
        return this.f12054i.n(null, this);
    }
}
