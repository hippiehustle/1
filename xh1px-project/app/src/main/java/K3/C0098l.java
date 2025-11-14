package K3;

import L7.InterfaceC0163v;
import O7.P;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import kotlin.KotlinNothingValueException;
import n6.InterfaceC1164c;

/* renamed from: K3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098l extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f2693h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s f2694i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0098l(s sVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f2694i = sVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        ((C0098l) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
        return EnumC0646a.f10656d;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0098l(this.f2694i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f2693h;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z5.a.d(obj);
            throw new KotlinNothingValueException();
        }
        Z5.a.d(obj);
        s sVar = this.f2694i;
        P p8 = sVar.h0().f2646h;
        C0097k c0097k = new C0097k(sVar, 0);
        this.f2693h = 1;
        p8.f4088d.x(c0097k, this);
        return EnumC0646a.f10656d;
    }
}
