package O7;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: O7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0230c extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4126g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ L3.M f4127h;

    /* renamed from: i, reason: collision with root package name */
    public int f4128i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0230c(L3.M m6, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f4127h = m6;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4126g = obj;
        this.f4128i |= Integer.MIN_VALUE;
        return this.f4127h.n(null, this);
    }
}
