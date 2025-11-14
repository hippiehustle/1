package S4;

import L7.InterfaceC0163v;
import Z5.y;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.U;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class f extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f5371h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f5372i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f5372i = hVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((f) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new f(this.f5372i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f5371h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            h hVar = this.f5372i;
            e eVar = new e(hVar, null);
            this.f5371h = 1;
            Object h8 = U.h(hVar, EnumC0504o.f8849g, eVar, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (h8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
