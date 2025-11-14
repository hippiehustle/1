package T4;

import J3.C0076a;
import J3.u;
import L7.InterfaceC0163v;
import Z5.y;
import android.content.Intent;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import l2.C1001a;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class h extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f5768h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5769i;
    public final /* synthetic */ Intent j;
    public final /* synthetic */ C1001a k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, int i4, Intent intent, C1001a c1001a, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f5768h = kVar;
        this.f5769i = i4;
        this.j = intent;
        this.k = c1001a;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        h hVar = (h) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        hVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new h(this.f5768h, this.f5769i, this.j, this.k, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        k kVar = this.f5768h;
        u uVar = new u(new a(kVar, 3));
        v2.h hVar = kVar.f5778e;
        hVar.b(this.k.f12190a, true);
        hVar.f15506f = new C0076a(uVar, 4);
        kVar.f5775b.d(kVar.f5774a, uVar, false);
        hVar.d(this.f5769i, this.j);
        return y.f7506a;
    }
}
