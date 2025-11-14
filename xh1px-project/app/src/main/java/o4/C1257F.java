package o4;

import d6.InterfaceC0617c;
import f6.AbstractC0713c;

/* renamed from: o4.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1257F extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13514g;

    /* renamed from: h, reason: collision with root package name */
    public int f13515h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f13516i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1257F(z zVar, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f13516i = zVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f13514g = obj;
        this.f13515h |= Integer.MIN_VALUE;
        return this.f13516i.n(null, this);
    }
}
