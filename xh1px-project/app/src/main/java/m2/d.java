package m2;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;
import l3.C1018q;

/* loaded from: classes.dex */
public final class d extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f12387g;

    /* renamed from: h, reason: collision with root package name */
    public int f12388h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1018q f12389i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C1018q c1018q, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f12389i = c1018q;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f12387g = obj;
        this.f12388h |= Integer.MIN_VALUE;
        return this.f12389i.n(null, this);
    }
}
