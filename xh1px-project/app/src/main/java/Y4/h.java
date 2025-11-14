package Y4;

import X3.t;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class h extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f7190g;

    /* renamed from: h, reason: collision with root package name */
    public int f7191h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f7192i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(t tVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f7192i = tVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f7190g = obj;
        this.f7191h |= Integer.MIN_VALUE;
        return this.f7192i.n(null, this);
    }
}
