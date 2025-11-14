package k4;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: k4.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0991x extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f12129h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ H f12130i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0991x(H h8, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12130i = h8;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0991x) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0991x(this.f12130i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f12129h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            H h8 = this.f12130i;
            C4.e eVar = h8.J().f12069g;
            C0987t c0987t = new C0987t(h8, 1);
            this.f12129h = 1;
            Object x8 = eVar.x(c0987t, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
