package X3;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class z extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6936g;

    /* renamed from: h, reason: collision with root package name */
    public int f6937h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f6938i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(t tVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f6938i = tVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f6936g = obj;
        this.f6937h |= Integer.MIN_VALUE;
        return this.f6938i.n(null, this);
    }
}
