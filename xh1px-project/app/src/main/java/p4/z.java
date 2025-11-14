package p4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class z extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13798g;

    /* renamed from: h, reason: collision with root package name */
    public int f13799h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o4.z f13800i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(o4.z zVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f13800i = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f13798g = obj;
        this.f13799h |= Integer.MIN_VALUE;
        return this.f13800i.n(null, this);
    }
}
