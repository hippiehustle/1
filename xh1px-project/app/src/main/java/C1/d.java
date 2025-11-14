package C1;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class d extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f565g;

    /* renamed from: h, reason: collision with root package name */
    public int f566h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f567i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f567i = eVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f565g = obj;
        this.f566h |= Integer.MIN_VALUE;
        return this.f567i.n(null, this);
    }
}
