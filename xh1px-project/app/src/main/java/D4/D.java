package D4;

import L7.InterfaceC0163v;
import android.widget.TextView;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class D extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f903h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ H f904i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(H h8, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f904i = h8;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((D) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new D(this.f904i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f903h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return Z5.y.f7506a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        H h8 = this.f904i;
        C1.f fVar = h8.S().f936h;
        A4.c cVar = h8.f914M;
        if (cVar != null) {
            t tVar = new t(2, (TextView) cVar.f293g);
            this.f903h = 1;
            fVar.x(tVar, this);
            return EnumC0646a.f10656d;
        }
        o6.j.i("viewBinding");
        throw null;
    }
}
