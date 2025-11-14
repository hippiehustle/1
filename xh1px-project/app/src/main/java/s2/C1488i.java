package s2;

import L7.InterfaceC0163v;
import Z5.y;
import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import g0.b0;
import n6.InterfaceC1164c;
import r1.C1428b;

/* renamed from: s2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1488i extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b0 f14469h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f14470i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1488i(b0 b0Var, int i4, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14469h = b0Var;
        this.f14470i = i4;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1488i c1488i = (C1488i) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c1488i.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1488i(this.f14469h, this.f14470i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        C1428b c1428b = (C1428b) this.f14469h.f10987d;
        int i4 = this.f14470i;
        AccessibilityService b4 = c1428b.b();
        if (b4 != null) {
            try {
                b4.performGlobalAction(i4);
            } catch (Exception e9) {
                Log.w("ServiceActionExecutor", "Can't execute global action.", e9);
            }
        }
        return y.f7506a;
    }
}
