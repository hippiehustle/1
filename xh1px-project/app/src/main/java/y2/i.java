package y2;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class i extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f16477g;

    /* renamed from: h, reason: collision with root package name */
    public int f16478h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f16479i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f16479i = jVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f16477g = obj;
        this.f16478h |= Integer.MIN_VALUE;
        return this.f16479i.n(null, this);
    }
}
