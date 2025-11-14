package t0;

import android.view.View;
import java.util.concurrent.ExecutorService;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1534b {

    /* renamed from: b, reason: collision with root package name */
    public static ExecutorService f14801b;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f14800a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final A0.i f14802c = new A0.i(27);

    public static int c(o0 o0Var, c0.g gVar, View view, View view2, AbstractC1537c0 abstractC1537c0, boolean z8) {
        if (abstractC1537c0.v() != 0 && o0Var.b() != 0 && view != null && view2 != null) {
            if (!z8) {
                return Math.abs(AbstractC1537c0.K(view) - AbstractC1537c0.K(view2)) + 1;
            }
            return Math.min(gVar.n(), gVar.d(view2) - gVar.g(view));
        }
        return 0;
    }

    public static int d(o0 o0Var, c0.g gVar, View view, View view2, AbstractC1537c0 abstractC1537c0, boolean z8, boolean z9) {
        int max;
        if (abstractC1537c0.v() == 0 || o0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(AbstractC1537c0.K(view), AbstractC1537c0.K(view2));
        int max2 = Math.max(AbstractC1537c0.K(view), AbstractC1537c0.K(view2));
        if (z9) {
            max = Math.max(0, (o0Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z8) {
            return max;
        }
        return Math.round((max * (Math.abs(gVar.d(view2) - gVar.g(view)) / (Math.abs(AbstractC1537c0.K(view) - AbstractC1537c0.K(view2)) + 1))) + (gVar.m() - gVar.g(view)));
    }

    public static int e(o0 o0Var, c0.g gVar, View view, View view2, AbstractC1537c0 abstractC1537c0, boolean z8) {
        if (abstractC1537c0.v() != 0 && o0Var.b() != 0 && view != null && view2 != null) {
            if (!z8) {
                return o0Var.b();
            }
            return (int) (((gVar.d(view2) - gVar.g(view)) / (Math.abs(AbstractC1537c0.K(view) - AbstractC1537c0.K(view2)) + 1)) * o0Var.b());
        }
        return 0;
    }

    public abstract boolean a(Object obj, Object obj2);

    public abstract boolean b(Object obj, Object obj2);
}
