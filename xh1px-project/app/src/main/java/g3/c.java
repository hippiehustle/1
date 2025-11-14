package g3;

import b2.p;
import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class c extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f11142g;

    /* renamed from: h, reason: collision with root package name */
    public int f11143h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f11144i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f11144i = pVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f11142g = obj;
        this.f11143h |= Integer.MIN_VALUE;
        return this.f11144i.n(null, this);
    }
}
