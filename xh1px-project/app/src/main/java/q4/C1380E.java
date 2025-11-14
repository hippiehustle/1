package q4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: q4.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1380E extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14022g;

    /* renamed from: h, reason: collision with root package name */
    public int f14023h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o4.z f14024i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1380E(o4.z zVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f14024i = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f14022g = obj;
        this.f14023h |= Integer.MIN_VALUE;
        return this.f14024i.n(null, this);
    }
}
