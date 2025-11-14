package O7;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: O7.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0248v extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4188g;

    /* renamed from: h, reason: collision with root package name */
    public int f4189h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C4.e f4190i;
    public Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0248v(C4.e eVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f4190i = eVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4188g = obj;
        this.f4189h |= Integer.MIN_VALUE;
        return this.f4190i.x(null, this);
    }
}
