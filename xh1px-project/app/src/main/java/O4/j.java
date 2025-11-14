package O4;

import O3.J;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class j extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4025g;

    /* renamed from: h, reason: collision with root package name */
    public int f4026h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J f4027i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(J j, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f4027i = j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4025g = obj;
        this.f4026h |= Integer.MIN_VALUE;
        return this.f4027i.n(null, this);
    }
}
