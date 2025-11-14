package l4;

import L7.InterfaceC0163v;
import M3.W;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: l4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1025e extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f12262h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f12263i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1025e(l lVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12263i = lVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1025e) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1025e(this.f12263i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f12262h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            l lVar = this.f12263i;
            W w8 = lVar.h0().f12293h;
            C1024d c1024d = new C1024d(lVar, 0);
            this.f12262h = 1;
            Object x8 = w8.x(c1024d, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
