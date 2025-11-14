package R3;

import O3.J;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class s extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5084g;

    /* renamed from: h, reason: collision with root package name */
    public int f5085h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J f5086i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(J j, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f5086i = j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f5084g = obj;
        this.f5085h |= Integer.MIN_VALUE;
        return this.f5086i.n(null, this);
    }
}
