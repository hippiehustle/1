package X;

import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class E extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f6645h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6646i;
    public final /* synthetic */ H j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(H h8, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = h8;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((E) p((InterfaceC0617c) obj2, (T) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        E e9 = new E(this.j, interfaceC0617c);
        e9.f6646i = obj;
        return e9;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f6645h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            T t8 = (T) this.f6646i;
            this.f6645h = 1;
            Object b4 = H.b(this.j, t8, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (b4 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
