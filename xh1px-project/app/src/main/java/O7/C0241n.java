package O7;

import J3.C0079d;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: O7.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0241n extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4163h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4164i;
    public final /* synthetic */ InterfaceC0233f j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0241n(InterfaceC0233f interfaceC0233f, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = interfaceC0233f;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0241n) p((InterfaceC0617c) obj2, (N7.s) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0241n c0241n = new C0241n(this.j, interfaceC0617c);
        c0241n.f4164i = obj;
        return c0241n;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f4163h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            C0079d c0079d = new C0079d(1, (N7.s) this.f4164i);
            this.f4163h = 1;
            Object x8 = this.j.x(c0079d, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
