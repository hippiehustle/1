package Q3;

import D4.t;
import L7.InterfaceC0163v;
import O7.InterfaceC0233f;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4842h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f f4843i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f4843i = fVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((c) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new c(this.f4843i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f4842h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            f fVar = this.f4843i;
            InterfaceC0233f interfaceC0233f = ((h) fVar.f4849v.getValue()).f4854b;
            t tVar = new t(9, fVar);
            this.f4842h = 1;
            Object x8 = interfaceC0233f.x(tVar, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
