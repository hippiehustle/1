package l4;

import L7.InterfaceC0163v;
import R3.r;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: l4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1027g extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f12266h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f12267i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1027g(l lVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12267i = lVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1027g) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1027g(this.f12267i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f12266h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return y.f7506a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        l lVar = this.f12267i;
        r rVar = lVar.h0().f12294i;
        C1024d c1024d = new C1024d(lVar, 2);
        this.f12266h = 1;
        rVar.x(c1024d, this);
        return EnumC0646a.f10656d;
    }
}
