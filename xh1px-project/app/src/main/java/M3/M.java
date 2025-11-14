package M3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class M extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3381g;

    /* renamed from: h, reason: collision with root package name */
    public int f3382h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L3.E f3383i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(L3.E e9, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f3383i = e9;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f3381g = obj;
        this.f3382h |= Integer.MIN_VALUE;
        return this.f3383i.n(null, this);
    }
}
