package t0;

import P.C0267o;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class Z {

    /* renamed from: a, reason: collision with root package name */
    public S f14791a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f14792b;

    /* renamed from: c, reason: collision with root package name */
    public long f14793c;

    /* renamed from: d, reason: collision with root package name */
    public long f14794d;

    /* renamed from: e, reason: collision with root package name */
    public long f14795e;

    /* renamed from: f, reason: collision with root package name */
    public long f14796f;

    public static void b(s0 s0Var) {
        int i4 = s0Var.j;
        if (!s0Var.h() && (i4 & 4) == 0) {
            s0Var.b();
        }
    }

    public abstract boolean a(s0 s0Var, s0 s0Var2, C0267o c0267o, C0267o c0267o2);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(s0 s0Var) {
        S s8 = this.f14791a;
        if (s8 != null) {
            RecyclerView recyclerView = s8.f14786a;
            boolean z8 = true;
            s0Var.p(true);
            View view = s0Var.f14950a;
            if (s0Var.f14957h != null && s0Var.f14958i == null) {
                s0Var.f14957h = null;
            }
            s0Var.f14958i = null;
            if ((s0Var.j & 16) == 0) {
                j0 j0Var = recyclerView.f8943f;
                recyclerView.n0();
                S6.e eVar = recyclerView.f8949i;
                C1541g c1541g = (C1541g) eVar.f5431d;
                S s9 = (S) eVar.f5430c;
                int i4 = eVar.f5429b;
                if (i4 == 1) {
                    if (((View) eVar.f5433f) != view) {
                        throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
                    }
                } else {
                    if (i4 != 2) {
                        try {
                            eVar.f5429b = 2;
                            int indexOfChild = s9.f14786a.indexOfChild(view);
                            if (indexOfChild == -1) {
                                eVar.F(view);
                            } else if (c1541g.d(indexOfChild)) {
                                c1541g.f(indexOfChild);
                                eVar.F(view);
                                s9.c(indexOfChild);
                            }
                            if (z8) {
                                s0 N8 = RecyclerView.N(view);
                                j0Var.l(N8);
                                j0Var.i(N8);
                                if (RecyclerView.f8901G0) {
                                    Objects.toString(view);
                                    recyclerView.toString();
                                }
                            }
                            recyclerView.p0(!z8);
                            if (z8 && s0Var.l()) {
                                recyclerView.removeDetachedView(view, false);
                                return;
                            }
                        } finally {
                            eVar.f5429b = 0;
                        }
                    }
                    throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
                }
                z8 = false;
                if (z8) {
                }
                recyclerView.p0(!z8);
                if (z8) {
                }
            }
        }
    }

    public abstract void d(s0 s0Var);

    public abstract void e();

    public abstract boolean f();
}
