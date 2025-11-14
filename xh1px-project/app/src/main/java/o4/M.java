package o4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class M extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13534g;

    /* renamed from: h, reason: collision with root package name */
    public int f13535h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f13536i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(z zVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f13536i = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f13534g = obj;
        this.f13535h |= Integer.MIN_VALUE;
        return this.f13536i.n(null, this);
    }
}
