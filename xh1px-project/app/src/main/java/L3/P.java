package L3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class P extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2819g;

    /* renamed from: h, reason: collision with root package name */
    public int f2820h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E f2821i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(E e9, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f2821i = e9;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f2819g = obj;
        this.f2820h |= Integer.MIN_VALUE;
        return this.f2821i.n(null, this);
    }
}
