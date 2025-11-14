package s7;

import a6.AbstractC0436k;
import a7.b0;
import g7.AbstractC0793b;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class r implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final s f14614d;

    /* renamed from: e, reason: collision with root package name */
    public final v f14615e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0793b f14616f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14617g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14618h;

    /* renamed from: i, reason: collision with root package name */
    public final b0 f14619i;

    public r(s sVar, v vVar, AbstractC0793b abstractC0793b, int i4, int i8, b0 b0Var) {
        this.f14614d = sVar;
        this.f14615e = vVar;
        this.f14616f = abstractC0793b;
        this.f14617g = i4;
        this.f14618h = i8;
        this.f14619i = b0Var;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        return AbstractC0436k.Q0(((C1518i) this.f14614d.f14620a.f1371d).f14577e.p(this.f14615e, this.f14616f, this.f14617g, this.f14618h, this.f14619i));
    }
}
