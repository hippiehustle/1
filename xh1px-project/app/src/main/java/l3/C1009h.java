package l3;

import L3.C0112n;
import L7.InterfaceC0163v;
import O7.i0;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: l3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1009h extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f12211h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1013l f12212i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1009h(C1013l c1013l, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12212i = c1013l;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1009h) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1009h(this.f12212i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f12211h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return y.f7506a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        C1013l c1013l = this.f12212i;
        i0 i0Var = c1013l.G().f12248h;
        F3.c cVar = c1013l.f12224z;
        if (cVar != null) {
            C0112n c0112n = new C0112n(cVar.f1321i, 4);
            this.f12211h = 1;
            i0Var.x(c0112n, this);
            return EnumC0646a.f10656d;
        }
        o6.j.i("viewBinding");
        throw null;
    }
}
