package U3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class s extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6135g;

    /* renamed from: h, reason: collision with root package name */
    public int f6136h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T3.x f6137i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(T3.x xVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f6137i = xVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f6135g = obj;
        this.f6136h |= Integer.MIN_VALUE;
        return this.f6137i.n(null, this);
    }
}
