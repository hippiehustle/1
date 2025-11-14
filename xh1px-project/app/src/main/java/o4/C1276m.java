package o4;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: o4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1276m extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f13581h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t f13582i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1276m(t tVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f13582i = tVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1276m) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1276m(this.f13582i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f13581h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            t tVar = this.f13582i;
            C1256E c1256e = tVar.J().f13550n;
            C1267d c1267d = new C1267d(tVar, 1);
            this.f13581h = 1;
            Object x8 = c1256e.x(c1267d, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
