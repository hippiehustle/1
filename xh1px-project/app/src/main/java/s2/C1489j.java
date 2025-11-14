package s2;

import L7.InterfaceC0163v;
import Z5.y;
import android.accessibilityservice.GestureDescription;
import android.util.Log;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import g0.b0;
import n6.InterfaceC1164c;
import r1.C1428b;

/* renamed from: s2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1489j extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f14471h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0 f14472i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1489j(b0 b0Var, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14472i = b0Var;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1489j) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1489j(this.f14472i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f14471h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            Log.i("ActionExecutor", "Injecting unblock gesture");
            C1428b c1428b = (C1428b) this.f14472i.f10987d;
            GestureDescription a3 = h2.a.a(new GestureDescription.Builder());
            this.f14471h = 1;
            Object a4 = c1428b.a(a3, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (a4 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
