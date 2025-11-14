package k4;

import L7.AbstractC0166y;
import android.graphics.Bitmap;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: k4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0975g extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f12093h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f12094i;
    public final /* synthetic */ C0969a j;
    public final /* synthetic */ C0977i k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0975g(InterfaceC0617c interfaceC0617c, C0969a c0969a, C0977i c0977i) {
        super(2, interfaceC0617c);
        this.j = c0969a;
        this.k = c0977i;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0975g) p((InterfaceC0617c) obj2, (Bitmap) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0975g c0975g = new C0975g(interfaceC0617c, this.j, this.k);
        c0975g.f12094i = obj;
        return c0975g;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Bitmap bitmap = (Bitmap) this.f12094i;
        int i4 = this.f12093h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            S7.e eVar = L7.F.f3175a;
            M7.e eVar2 = Q7.n.f4962a;
            C0974f c0974f = new C0974f(this.j, bitmap, this.k, null);
            this.f12094i = null;
            this.f12093h = 1;
            Object A2 = AbstractC0166y.A(eVar2, c0974f, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (A2 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
