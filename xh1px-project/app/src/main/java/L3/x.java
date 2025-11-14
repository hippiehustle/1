package L3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class x extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2887g;

    /* renamed from: h, reason: collision with root package name */
    public int f2888h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1.e f2889i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C1.e eVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f2889i = eVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f2887g = obj;
        this.f2888h |= Integer.MIN_VALUE;
        return this.f2889i.n(null, this);
    }
}
