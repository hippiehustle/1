package E4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class m extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1237g;

    /* renamed from: h, reason: collision with root package name */
    public int f1238h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1.e f1239i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C1.e eVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f1239i = eVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f1237g = obj;
        this.f1238h |= Integer.MIN_VALUE;
        return this.f1239i.n(null, this);
    }
}
