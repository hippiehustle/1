package J3;

import L7.AbstractC0166y;
import L7.k0;
import android.content.Context;
import androidx.lifecycle.U;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1165d;
import z3.EnumC1855a;

/* loaded from: classes.dex */
public final class E extends AbstractC0720j implements InterfaceC1165d {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ boolean f2408h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ EnumC1855a f2409i;
    public final /* synthetic */ H j;
    public final /* synthetic */ Context k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(H h8, Context context, InterfaceC0617c interfaceC0617c) {
        super(3, interfaceC0617c);
        this.j = h8;
        this.k = context;
    }

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        E e9 = new E(this.j, this.k, (InterfaceC0617c) obj3);
        e9.f2408h = booleanValue;
        e9.f2409i = (EnumC1855a) obj2;
        Z5.y yVar = Z5.y.f7506a;
        e9.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        boolean z8 = this.f2408h;
        EnumC1855a enumC1855a = this.f2409i;
        Z5.a.d(obj);
        Z5.y yVar = Z5.y.f7506a;
        if (z8) {
            return yVar;
        }
        H h8 = this.j;
        h8.getClass();
        if (enumC1855a != EnumC1855a.f16626d) {
            AbstractC0166y.q(U.g(h8), null, null, new D(h8, this.k, null), 3);
        }
        k0 k0Var = h8.f2420i;
        if (k0Var != null) {
            k0Var.d(null);
        }
        h8.f2420i = null;
        return yVar;
    }
}
