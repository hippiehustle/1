package o4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: o4.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1261J extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13525g;

    /* renamed from: h, reason: collision with root package name */
    public int f13526h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f13527i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1261J(z zVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f13527i = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f13525g = obj;
        this.f13526h |= Integer.MIN_VALUE;
        return this.f13527i.n(null, this);
    }
}
