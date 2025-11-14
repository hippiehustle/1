package p4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class r extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13776g;

    /* renamed from: h, reason: collision with root package name */
    public int f13777h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o4.z f13778i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(o4.z zVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f13778i = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f13776g = obj;
        this.f13777h |= Integer.MIN_VALUE;
        return this.f13778i.n(null, this);
    }
}
