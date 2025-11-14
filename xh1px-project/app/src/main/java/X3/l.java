package X3;

import D4.C0040p;
import L7.InterfaceC0163v;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class l extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f6901h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f6902i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f6902i = pVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((l) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new l(this.f6902i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f6901h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            p pVar = this.f6902i;
            C0040p c0040p = pVar.J().k;
            C0364c c0364c = new C0364c(pVar, 4);
            this.f6901h = 1;
            Object x8 = c0040p.x(c0364c, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
