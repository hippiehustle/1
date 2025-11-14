package D4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: D4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026b extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f939g;

    /* renamed from: h, reason: collision with root package name */
    public int f940h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0027c f941i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0026b(C0027c c0027c, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f941i = c0027c;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f939g = obj;
        this.f940h |= Integer.MIN_VALUE;
        return this.f941i.n(null, this);
    }
}
