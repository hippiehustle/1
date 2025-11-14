package D4;

import L7.InterfaceC0163v;
import O7.i0;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import k2.C0952b;
import l2.C1001a;
import n6.InterfaceC1164c;

/* renamed from: D4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038n extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f973h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s f974i;
    public final /* synthetic */ C1001a j;
    public final /* synthetic */ C0952b k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0038n(s sVar, C1001a c1001a, C0952b c0952b, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f974i = sVar;
        this.j = c1001a;
        this.k = c0952b;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0038n) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0038n(this.f974i, this.j, this.k, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f973h;
        Z5.y yVar = Z5.y.f7506a;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return yVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        i0 i0Var = this.f974i.f984c;
        C0035k c0035k = new C0035k(this.j, this.k);
        this.f973h = 1;
        i0Var.n(c0035k, this);
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (yVar == enumC0646a) {
            return enumC0646a;
        }
        return yVar;
    }
}
