package m4;

import L7.AbstractC0166y;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.U;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textview.MaterialTextView;
import j2.C0903c;
import j2.C0905e;
import j3.C0933s;
import kotlin.NoWhenBranchMatchedException;
import l4.C1030j;
import l5.DialogC1035e;
import o.p1;
import o4.t;
import o6.v;
import q4.X;

/* loaded from: classes.dex */
public final class i extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final A4.d f12513u;

    /* renamed from: v, reason: collision with root package name */
    public F3.g f12514v;

    public i() {
        super(Integer.valueOf(R.style.ScenarioConfigTheme));
        this.f12513u = new A4.d(v.f13643a.b(k.class), new h(this, 0), new h(this, 1), new C0933s(9, this));
    }

    @Override // z1.b
    public final ViewGroup E() {
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_trigger_conditions, (ViewGroup) null, false);
        int i4 = R.id.button_copy;
        FloatingActionButton floatingActionButton = (FloatingActionButton) E2.b.r(inflate, R.id.button_copy);
        if (floatingActionButton != null) {
            i4 = R.id.button_new;
            FloatingActionButton floatingActionButton2 = (FloatingActionButton) E2.b.r(inflate, R.id.button_new);
            if (floatingActionButton2 != null) {
                i4 = R.id.layout_loadable_list;
                View r8 = E2.b.r(inflate, R.id.layout_loadable_list);
                if (r8 != null) {
                    p1 a3 = p1.a(r8);
                    i4 = R.id.layout_top_bar;
                    View r9 = E2.b.r(inflate, R.id.layout_top_bar);
                    if (r9 != null) {
                        A4.d a4 = A4.d.a(r9);
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                        F3.g gVar = new F3.g(coordinatorLayout, floatingActionButton, floatingActionButton2, a3, a4, 1);
                        X.Q(a4, C2.a.f583f, 8);
                        X.Q(a4, C2.a.f582e, 8);
                        ((MaterialTextView) a4.f298h).setText(R.string.dialog_title_trigger_event);
                        A((MaterialButton) a4.f297g, new C1088b(this, 0));
                        A(floatingActionButton2, new C1088b(this, 1));
                        A(floatingActionButton, new C1088b(this, 2));
                        E2.c.p0(a3, R.string.message_empty_trigger_condition_list_title, Integer.valueOf(R.string.message_empty_trigger_condition_list_desc));
                        RecyclerView recyclerView = (RecyclerView) a3.j;
                        recyclerView.setAdapter(new R4.d(new W4.i(1, this, i.class, "showTriggerConditionDialog", "showTriggerConditionDialog(Lcom/buzbuz/smartautoclicker/core/domain/model/condition/TriggerCondition;)V", 0, 0, 13)));
                        recyclerView.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager(1));
                        this.f12514v = gVar;
                        o6.j.d(coordinatorLayout, "getRoot(...)");
                        return coordinatorLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        AbstractC0166y.q(U.e(this), null, null, new C1093g(this, null), 3);
    }

    public final k G() {
        return (k) this.f12513u.getValue();
    }

    public final void H(j2.g gVar) {
        w1.e pVar;
        k G8 = G();
        o6.j.e(gVar, "condition");
        G8.f12518b.d(gVar);
        Z5.n nVar = new Z5.n(new B0.e(22, this));
        if (gVar instanceof C0903c) {
            pVar = new n4.o((C1030j) nVar.getValue());
        } else if (gVar instanceof C0905e) {
            pVar = new t((C1030j) nVar.getValue());
        } else if (gVar instanceof j2.f) {
            pVar = new p4.p((C1030j) nVar.getValue());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        o().d(k(), pVar, true);
    }
}
