package Y3;

import L3.C0112n;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class h extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f7128h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f7129i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f7129i = mVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((h) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new h(this.f7129i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f7128h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            m mVar = this.f7129i;
            u uVar = mVar.J().f7112g;
            A4.a aVar = mVar.f7140w;
            if (aVar != null) {
                C0112n c0112n = new C0112n((A4.a) aVar.f282g, 3);
                this.f7128h = 1;
                Object x8 = uVar.x(c0112n, this);
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (x8 == enumC0646a) {
                    return enumC0646a;
                }
            } else {
                o6.j.i("viewBinding");
                throw null;
            }
        }
        return Z5.y.f7506a;
    }
}
