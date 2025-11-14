package l3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: l3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1017p extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12234g;

    /* renamed from: h, reason: collision with root package name */
    public int f12235h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1018q f12236i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1017p(C1018q c1018q, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f12236i = c1018q;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f12234g = obj;
        this.f12235h |= Integer.MIN_VALUE;
        return this.f12236i.n(null, this);
    }
}
