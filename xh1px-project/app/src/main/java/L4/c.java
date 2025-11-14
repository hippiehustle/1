package L4;

import L3.E;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class c extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2901g;

    /* renamed from: h, reason: collision with root package name */
    public int f2902h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E f2903i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(E e9, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f2903i = e9;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f2901g = obj;
        this.f2902h |= Integer.MIN_VALUE;
        return this.f2903i.n(null, this);
    }
}
