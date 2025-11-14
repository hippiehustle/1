package q4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: q4.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1384I extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14034g;

    /* renamed from: h, reason: collision with root package name */
    public int f14035h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o4.z f14036i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1384I(o4.z zVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f14036i = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f14034g = obj;
        this.f14035h |= Integer.MIN_VALUE;
        return this.f14036i.n(null, this);
    }
}
