package m4;

import M3.V;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class j extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12515g;

    /* renamed from: h, reason: collision with root package name */
    public int f12516h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V f12517i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(V v8, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f12517i = v8;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f12515g = obj;
        this.f12516h |= Integer.MIN_VALUE;
        return this.f12517i.n(null, this);
    }
}
