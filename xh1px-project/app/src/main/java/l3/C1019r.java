package l3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: l3.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1019r extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12239g;

    /* renamed from: h, reason: collision with root package name */
    public int f12240h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1018q f12241i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1019r(C1018q c1018q, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f12241i = c1018q;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f12239g = obj;
        this.f12240h |= Integer.MIN_VALUE;
        return this.f12241i.n(null, this);
    }
}
