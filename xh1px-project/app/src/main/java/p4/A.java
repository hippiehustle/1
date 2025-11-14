package p4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class A extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13727g;

    /* renamed from: h, reason: collision with root package name */
    public int f13728h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o4.z f13729i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(o4.z zVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f13729i = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f13727g = obj;
        this.f13728h |= Integer.MIN_VALUE;
        return this.f13729i.n(null, this);
    }
}
