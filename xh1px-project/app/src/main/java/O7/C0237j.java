package O7;

import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: O7.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237j extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4151h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0233f f4152i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0237j(InterfaceC0233f interfaceC0233f, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f4152i = interfaceC0233f;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0237j) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0237j(this.f4152i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f4151h;
        Z5.y yVar = Z5.y.f7506a;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            this.f4151h = 1;
            Object x8 = this.f4152i.x(P7.x.f4686d, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 != enumC0646a) {
                x8 = yVar;
            }
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return yVar;
    }
}
