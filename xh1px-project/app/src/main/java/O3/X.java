package O3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class X extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3915g;

    /* renamed from: h, reason: collision with root package name */
    public int f3916h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J f3917i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(J j, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f3917i = j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f3915g = obj;
        this.f3916h |= Integer.MIN_VALUE;
        return this.f3917i.n(null, this);
    }
}
