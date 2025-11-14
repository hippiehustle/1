package P7;

import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class g extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4650h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4651i;
    public final /* synthetic */ h j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = hVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((g) p((InterfaceC0617c) obj2, (InterfaceC0234g) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        g gVar = new g(this.j, interfaceC0617c);
        gVar.f4651i = obj;
        return gVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f4650h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            InterfaceC0234g interfaceC0234g = (InterfaceC0234g) this.f4651i;
            this.f4650h = 1;
            Object d2 = this.j.d(interfaceC0234g, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (d2 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
