package O7;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class b0 extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4123g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ L3.M f4124h;

    /* renamed from: i, reason: collision with root package name */
    public int f4125i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(L3.M m6, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f4124h = m6;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4123g = obj;
        this.f4125i |= Integer.MIN_VALUE;
        return this.f4124h.a(0, this);
    }
}
