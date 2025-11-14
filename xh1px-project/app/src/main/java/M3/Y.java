package M3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class Y extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3412g;

    /* renamed from: h, reason: collision with root package name */
    public int f3413h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L3.E f3414i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(L3.E e9, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f3414i = e9;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f3412g = obj;
        this.f3413h |= Integer.MIN_VALUE;
        return this.f3414i.n(null, this);
    }
}
