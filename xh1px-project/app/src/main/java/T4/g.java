package T4;

import L7.AbstractC0166y;
import L7.k0;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1165d;
import z3.EnumC1855a;

/* loaded from: classes.dex */
public final class g extends AbstractC0720j implements InterfaceC1165d {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ boolean f5766h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ EnumC1855a f5767i;
    public final /* synthetic */ k j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, InterfaceC0617c interfaceC0617c) {
        super(3, interfaceC0617c);
        this.j = kVar;
    }

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        g gVar = new g(this.j, (InterfaceC0617c) obj3);
        gVar.f5766h = booleanValue;
        gVar.f5767i = (EnumC1855a) obj2;
        y yVar = y.f7506a;
        gVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        boolean z8 = this.f5766h;
        EnumC1855a enumC1855a = this.f5767i;
        Z5.a.d(obj);
        y yVar = y.f7506a;
        if (z8) {
            return yVar;
        }
        EnumC1855a enumC1855a2 = EnumC1855a.f16626d;
        k kVar = this.j;
        if (enumC1855a != enumC1855a2) {
            AbstractC0166y.q(kVar.k, null, null, new i(kVar, null), 3);
        }
        k0 k0Var = kVar.f5784m;
        if (k0Var != null) {
            k0Var.d(null);
        }
        kVar.f5784m = null;
        return yVar;
    }
}
