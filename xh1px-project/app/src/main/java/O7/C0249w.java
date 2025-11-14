package O7;

import D4.C0027c;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: O7.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0249w extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4191g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0027c f4192h;

    /* renamed from: i, reason: collision with root package name */
    public int f4193i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0249w(C0027c c0027c, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f4192h = c0027c;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4191g = obj;
        this.f4193i |= Integer.MIN_VALUE;
        return this.f4192h.n(null, this);
    }
}
