package g0;

import android.view.View;
import java.util.ArrayList;

/* renamed from: g0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0735d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0744m f11003e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0 f11004f;

    public /* synthetic */ RunnableC0735d(C0744m c0744m, g0 g0Var, int i4) {
        this.f11002d = i4;
        this.f11003e = c0744m;
        this.f11004f = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11002d) {
            case 0:
                C0744m c0744m = this.f11003e;
                o6.j.e(c0744m, "this$0");
                g0 g0Var = this.f11004f;
                o6.j.e(g0Var, "$operation");
                c0744m.a(g0Var);
                return;
            case 1:
                C0744m c0744m2 = this.f11003e;
                ArrayList arrayList = c0744m2.f11043b;
                g0 g0Var2 = this.f11004f;
                if (arrayList.contains(g0Var2)) {
                    int i4 = g0Var2.f11022a;
                    View view = g0Var2.f11024c.K;
                    o6.j.d(view, "operation.fragment.mView");
                    A.j.a(i4, view, c0744m2.f11042a);
                    return;
                }
                return;
            default:
                C0744m c0744m3 = this.f11003e;
                ArrayList arrayList2 = c0744m3.f11043b;
                g0 g0Var3 = this.f11004f;
                arrayList2.remove(g0Var3);
                c0744m3.f11044c.remove(g0Var3);
                return;
        }
    }
}
