package X;

import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: X.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345m extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f6756h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ H f6757i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0345m(H h8, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f6757i = h8;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0345m) p((InterfaceC0617c) obj2, (InterfaceC0234g) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0345m(this.f6757i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f6756h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            this.f6756h = 1;
            Object d2 = H.d(this.f6757i, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (d2 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
