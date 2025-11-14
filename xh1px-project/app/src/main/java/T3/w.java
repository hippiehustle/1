package T3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class w extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5746g;

    /* renamed from: h, reason: collision with root package name */
    public int f5747h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f5748i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f5748i = xVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f5746g = obj;
        this.f5747h |= Integer.MIN_VALUE;
        return this.f5748i.n(null, this);
    }
}
