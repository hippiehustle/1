package D4;

import L7.InterfaceC0163v;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.U;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class w extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f994h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ A f995i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(A a3, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f995i = a3;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((w) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new w(this.f995i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f994h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            A a3 = this.f995i;
            v vVar = new v(a3, null);
            this.f994h = 1;
            Object h8 = U.h(a3, EnumC0504o.f8849g, vVar, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (h8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
