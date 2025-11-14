package Z3;

import M3.V;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class K extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f7342g;

    /* renamed from: h, reason: collision with root package name */
    public int f7343h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V f7344i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(V v8, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f7344i = v8;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f7342g = obj;
        this.f7343h |= Integer.MIN_VALUE;
        return this.f7344i.n(null, this);
    }
}
