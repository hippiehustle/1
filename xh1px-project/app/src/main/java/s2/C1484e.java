package s2;

import L7.InterfaceC0163v;
import Z5.y;
import android.accessibilityservice.AccessibilityService;
import android.content.Intent;
import android.util.Log;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import g0.b0;
import n6.InterfaceC1164c;
import r1.C1428b;

/* renamed from: s2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1484e extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b0 f14461h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Intent f14462i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1484e(b0 b0Var, Intent intent, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14461h = b0Var;
        this.f14462i = intent;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1484e c1484e = (C1484e) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c1484e.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1484e(this.f14461h, this.f14462i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        C1428b c1428b = (C1428b) this.f14461h.f10987d;
        c1428b.getClass();
        Intent intent = this.f14462i;
        o6.j.e(intent, "intent");
        AccessibilityService b4 = c1428b.b();
        if (b4 != null) {
            try {
                b4.sendBroadcast(intent);
            } catch (IllegalArgumentException e9) {
                Log.w("ServiceActionExecutor", "Can't send broadcast, Intent is invalid: " + intent, e9);
            }
        }
        return y.f7506a;
    }
}
