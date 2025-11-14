package l4;

import M3.V;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class o extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12284g;

    /* renamed from: h, reason: collision with root package name */
    public int f12285h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V f12286i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(V v8, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f12286i = v8;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f12284g = obj;
        this.f12285h |= Integer.MIN_VALUE;
        return this.f12286i.n(null, this);
    }
}
