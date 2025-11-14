package j3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: j3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0935u extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f11895g;

    /* renamed from: h, reason: collision with root package name */
    public int f11896h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b2.p f11897i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0935u(b2.p pVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f11897i = pVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f11895g = obj;
        this.f11896h |= Integer.MIN_VALUE;
        return this.f11897i.n(null, this);
    }
}
