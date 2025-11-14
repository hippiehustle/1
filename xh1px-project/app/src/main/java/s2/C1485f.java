package s2;

import L7.InterfaceC0163v;
import Z5.y;
import android.accessibilityservice.AccessibilityService;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.util.AndroidRuntimeException;
import android.util.Log;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import g0.b0;
import n6.InterfaceC1164c;
import r1.C1428b;

/* renamed from: s2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1485f extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b0 f14463h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Intent f14464i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1485f(b0 b0Var, Intent intent, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14463h = b0Var;
        this.f14464i = intent;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1485f c1485f = (C1485f) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c1485f.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1485f(this.f14463h, this.f14464i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        C1428b c1428b = (C1428b) this.f14463h.f10987d;
        c1428b.getClass();
        Intent intent = this.f14464i;
        o6.j.e(intent, "intent");
        AccessibilityService b4 = c1428b.b();
        if (b4 != null) {
            try {
                b4.startActivity(intent);
            } catch (ActivityNotFoundException e9) {
                Log.w("ServiceActionExecutor", "Can't start activity, it is not found.", e9);
            } catch (AndroidRuntimeException e10) {
                Log.w("ServiceActionExecutor", "Can't start activity, Intent is invalid: " + intent, e10);
            } catch (IllegalArgumentException e11) {
                Log.w("ServiceActionExecutor", "Can't start activity, Intent contains invalid arguments: " + intent, e11);
            } catch (NullPointerException e12) {
                Log.w("ServiceActionExecutor", "Can't start activity with intent " + intent + ", intent is invalid", e12);
            } catch (SecurityException e13) {
                Log.w("ServiceActionExecutor", "Can't start activity with intent " + intent + ", permission is denied by the system", e13);
            }
        }
        return y.f7506a;
    }
}
