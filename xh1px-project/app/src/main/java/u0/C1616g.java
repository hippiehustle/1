package u0;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: u0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1616g extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f15228h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1617h f15229i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1616g(C1617h c1617h, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f15229i = c1617h;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1616g) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1616g(this.f15229i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f15228h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            this.f15228h = 1;
            Object a3 = this.f15229i.a(this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (a3 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
