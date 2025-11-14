package h3;

import L7.InterfaceC0163v;
import Z5.y;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.U;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: h3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0818f extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f11342h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0820h f11343i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0818f(C0820h c0820h, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f11343i = c0820h;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0818f) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0818f(this.f11343i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f11342h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C0820h c0820h = this.f11343i;
            C0817e c0817e = new C0817e(c0820h, null);
            this.f11342h = 1;
            Object h8 = U.h(c0820h, EnumC0504o.f8849g, c0817e, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (h8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
