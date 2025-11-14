package P7;

import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class E extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4633h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4634i;
    public final /* synthetic */ InterfaceC0234g j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = interfaceC0234g;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((E) p((InterfaceC0617c) obj2, obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        E e9 = new E(this.j, interfaceC0617c);
        e9.f4634i = obj;
        return e9;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f4633h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            Object obj2 = this.f4634i;
            this.f4633h = 1;
            Object n3 = this.j.n(obj2, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (n3 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
