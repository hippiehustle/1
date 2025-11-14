package j4;

import L7.X;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.textview.MaterialTextView;
import f4.C0708a;
import k4.I;
import k4.K;
import k4.Y;
import kotlin.NoWhenBranchMatchedException;
import t0.L;
import t0.s0;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class b extends L {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11913e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Z5.d f11914f;

    /* renamed from: g, reason: collision with root package name */
    public final Z5.d f11915g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f11916h;

    public b(A1.h hVar, C1.b bVar) {
        super(m.f11935d);
        this.f11914f = hVar;
        this.f11915g = bVar;
        this.f11916h = new C0941a(this);
    }

    @Override // t0.U
    public int c(int i4) {
        switch (this.f11913e) {
            case 0:
                k kVar = (k) g(i4);
                if (kVar instanceof j) {
                    return R.layout.item_list_header;
                }
                if (kVar instanceof g) {
                    return R.layout.item_image_condition_list;
                }
                if (kVar instanceof h) {
                    return R.layout.item_trigger_condition;
                }
                throw new NoWhenBranchMatchedException();
            default:
                return super.c(i4);
        }
    }

    @Override // t0.U
    public final void d(s0 s0Var, int i4) {
        switch (this.f11913e) {
            case 0:
                A1.h hVar = (A1.h) this.f11914f;
                if (s0Var instanceof n) {
                    Object g8 = g(i4);
                    o6.j.c(g8, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.smart.config.ui.condition.copy.ConditionCopyModel.ConditionCopyItem.HeaderItem");
                    ((MaterialTextView) ((n) s0Var).f11936u.f89f).setText(((j) g8).f11931a);
                    return;
                }
                if (s0Var instanceof o) {
                    o oVar = (o) s0Var;
                    Object g9 = g(i4);
                    o6.j.c(g9, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.smart.config.ui.condition.copy.ConditionCopyModel.ConditionCopyItem.ConditionItem.Image");
                    g gVar = (g) g9;
                    o6.j.e(hVar, "conditionClickedListener");
                    X x8 = oVar.f11939w;
                    if (x8 != null) {
                        x8.d(null);
                    }
                    oVar.f11939w = q4.X.i(oVar.f11937u.f1354f, gVar.f11929a, oVar.f11938v, hVar);
                    return;
                }
                if (s0Var instanceof p) {
                    Object g10 = g(i4);
                    o6.j.c(g10, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.smart.config.ui.condition.copy.ConditionCopyModel.ConditionCopyItem.ConditionItem.Trigger");
                    o6.j.e(hVar, "conditionClickedListener");
                    AbstractC1638C.j(((p) s0Var).f11940u, ((h) g10).f11930a, hVar);
                    return;
                }
                return;
            default:
                K k = (K) s0Var;
                F3.i iVar = k.f12029u;
                Object g11 = g(i4);
                o6.j.d(g11, "getItem(...)");
                C0708a c0708a = (C0708a) g11;
                X x9 = k.f12032x;
                if (x9 != null) {
                    x9.d(null);
                }
                k.f12032x = q4.X.i(iVar.f1354f, c0708a, k.f12030v, k.f12031w);
                ((I) this.f11916h).l(Integer.valueOf(i4), (ConstraintLayout) iVar.f1354f.f1304e);
                return;
        }
    }

    @Override // t0.U
    public final s0 e(ViewGroup viewGroup, int i4) {
        switch (this.f11913e) {
            case 0:
                if (i4 == R.layout.item_list_header) {
                    return new n(A.i.e(LayoutInflater.from(viewGroup.getContext()), viewGroup));
                }
                if (i4 == R.layout.item_image_condition_list) {
                    return new o(F3.i.a(LayoutInflater.from(viewGroup.getContext()), viewGroup), (C1.b) this.f11915g);
                }
                if (i4 == R.layout.item_trigger_condition) {
                    return new p(F3.h.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
                }
                throw new IllegalArgumentException("Unsupported view type !");
            default:
                return new K(F3.i.a(LayoutInflater.from(viewGroup.getContext()), viewGroup), (A1.o) this.f11914f, (W4.i) this.f11915g);
        }
    }

    @Override // t0.U
    public final void f(s0 s0Var) {
        switch (this.f11913e) {
            case 0:
                o6.j.e(s0Var, "holder");
                if (s0Var instanceof o) {
                    o oVar = (o) s0Var;
                    X x8 = oVar.f11939w;
                    if (x8 != null) {
                        x8.d(null);
                    }
                    oVar.f11939w = null;
                    return;
                }
                return;
            default:
                K k = (K) s0Var;
                o6.j.e(k, "holder");
                X x9 = k.f12032x;
                if (x9 != null) {
                    x9.d(null);
                }
                k.f12032x = null;
                ((I) this.f11916h).l(Integer.valueOf(k.c()), null);
                return;
        }
    }

    public b(A1.o oVar, W4.i iVar, I i4) {
        super(Y.f12074d);
        this.f11914f = oVar;
        this.f11915g = iVar;
        this.f11916h = i4;
    }
}
