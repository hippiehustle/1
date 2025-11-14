package l3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: l3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1015n extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12228g;

    /* renamed from: h, reason: collision with root package name */
    public int f12229h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b2.p f12230i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1015n(b2.p pVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f12230i = pVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f12228g = obj;
        this.f12229h |= Integer.MIN_VALUE;
        return this.f12230i.n(null, this);
    }
}
