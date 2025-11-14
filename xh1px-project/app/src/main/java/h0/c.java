package h0;

import androidx.fragment.app.strictmode.Violation;
import g0.AbstractComponentCallbacksC0755y;
import g0.T;
import o6.j;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0807b f11305a = C0807b.f11304a;

    public static C0807b a(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        while (abstractComponentCallbacksC0755y != null) {
            if (abstractComponentCallbacksC0755y.f11129y != null && abstractComponentCallbacksC0755y.f11118n) {
                abstractComponentCallbacksC0755y.m();
            }
            abstractComponentCallbacksC0755y = abstractComponentCallbacksC0755y.f11085A;
        }
        return f11305a;
    }

    public static void b(Violation violation) {
        if (T.K(3)) {
            violation.f8760d.getClass();
        }
    }

    public static final void c(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y, String str) {
        j.e(str, "previousFragmentId");
        b(new Violation(abstractComponentCallbacksC0755y, "Attempting to reuse fragment " + abstractComponentCallbacksC0755y + " with previous ID " + str));
        a(abstractComponentCallbacksC0755y).getClass();
    }
}
