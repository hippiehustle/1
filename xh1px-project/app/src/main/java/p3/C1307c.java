package p3;

import L7.InterfaceC0163v;
import Z5.y;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.U;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: p3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1307c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f13712h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1309e f13713i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307c(C1309e c1309e, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f13713i = c1309e;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1307c) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1307c(this.f13713i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f13712h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C1309e c1309e = this.f13713i;
            C1306b c1306b = new C1306b(c1309e, null);
            this.f13712h = 1;
            Object h8 = U.h(c1309e, EnumC0504o.f8849g, c1306b, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (h8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
