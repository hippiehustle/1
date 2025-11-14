package Y4;

import K3.z;
import L3.C0106h;
import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;
import o6.j;

/* loaded from: classes.dex */
public final class b extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f7171h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f7172i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f7172i = dVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((b) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new b(this.f7172i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f7171h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return y.f7506a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        d dVar = this.f7172i;
        z zVar = ((i) dVar.f7182x0.getValue()).f7198g;
        U2.a aVar = dVar.f7183y0;
        if (aVar != null) {
            C0106h c0106h = new C0106h(aVar.f6084f, 20);
            this.f7171h = 1;
            zVar.x(c0106h, this);
            return EnumC0646a.f10656d;
        }
        j.i("viewBinding");
        throw null;
    }
}
