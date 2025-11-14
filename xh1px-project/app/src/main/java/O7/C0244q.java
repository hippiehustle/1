package O7;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: O7.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244q extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4173g;

    /* renamed from: h, reason: collision with root package name */
    public int f4174h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r f4175i;
    public Object j;
    public InterfaceC0234g k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0244q(r rVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f4175i = rVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4173g = obj;
        this.f4174h |= Integer.MIN_VALUE;
        return this.f4175i.x(null, this);
    }
}
