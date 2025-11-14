package L3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class G extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f2793g;

    /* renamed from: h, reason: collision with root package name */
    public int f2794h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E f2795i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(E e9, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f2795i = e9;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f2793g = obj;
        this.f2794h |= Integer.MIN_VALUE;
        return this.f2795i.n(null, this);
    }
}
