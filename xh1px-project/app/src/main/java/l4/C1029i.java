package l4;

import L7.InterfaceC0163v;
import Z5.y;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.U;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: l4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1029i extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f12270h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f12271i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1029i(l lVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12271i = lVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1029i) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1029i(this.f12271i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f12270h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            l lVar = this.f12271i;
            C1028h c1028h = new C1028h(lVar, null);
            this.f12270h = 1;
            Object h8 = U.h(lVar, EnumC0504o.f8849g, c1028h, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (h8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
