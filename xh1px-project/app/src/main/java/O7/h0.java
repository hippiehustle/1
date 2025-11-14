package O7;

import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0713c;

/* loaded from: classes.dex */
public final class h0 extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public i0 f4139g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0234g f4140h;

    /* renamed from: i, reason: collision with root package name */
    public j0 f4141i;
    public L7.X j;
    public Object k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4142l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0 f4143m;

    /* renamed from: n, reason: collision with root package name */
    public int f4144n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, InterfaceC0617c interfaceC0617c) {
        super(interfaceC0617c);
        this.f4143m = i0Var;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f4142l = obj;
        this.f4144n |= Integer.MIN_VALUE;
        this.f4143m.x(null, this);
        return EnumC0646a.f10656d;
    }
}
