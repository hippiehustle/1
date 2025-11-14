package J3;

import L7.InterfaceC0163v;
import O7.C0235h;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: J3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0083h extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f2440h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u f2441i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0083h(u uVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f2441i = uVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0083h) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0083h(this.f2441i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f2440h;
        Z5.y yVar = Z5.y.f7506a;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            u uVar = this.f2441i;
            C0235h c0235h = uVar.S().j;
            this.f2440h = 1;
            if (((Boolean) c0235h.f4138d).booleanValue()) {
                uVar.f2467L = true;
                uVar.C();
            } else if (uVar.f2467L) {
                uVar.f2467L = false;
                uVar.z();
            }
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (yVar == enumC0646a) {
                return enumC0646a;
            }
        }
        return yVar;
    }
}
