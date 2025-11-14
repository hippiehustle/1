package T4;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;
import q2.C1365k;

/* loaded from: classes.dex */
public final class d extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f5762h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f5762h = kVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        d dVar = (d) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        dVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new d(this.f5762h, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        k kVar = this.f5762h;
        v2.h hVar = kVar.f5778e;
        C1365k c1365k = kVar.f5779f;
        if (((Boolean) c1365k.k.f()).booleanValue()) {
            c1365k.c();
        } else if (hVar.a()) {
            hVar.e();
        }
        return y.f7506a;
    }
}
