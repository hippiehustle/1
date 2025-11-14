package M3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class E extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3346g;

    /* renamed from: h, reason: collision with root package name */
    public int f3347h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L3.E f3348i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(L3.E e9, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f3348i = e9;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f3346g = obj;
        this.f3347h |= Integer.MIN_VALUE;
        return this.f3348i.n(null, this);
    }
}
