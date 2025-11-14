package K3;

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
import l5.DialogC1035e;
import o.p1;
import q4.X;
import t0.C1530D;
import t0.C1553t;

/* loaded from: classes.dex */
public final class L extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final A4.d f2664u;

    /* renamed from: v, reason: collision with root package name */
    public final C1530D f2665v;

    /* renamed from: w, reason: collision with root package name */
    public F3.g f2666w;

    /* renamed from: x, reason: collision with root package name */
    public C0087a f2667x;

    public L() {
        super(Integer.valueOf(R.style.ScenarioConfigTheme));
        this.f2664u = new A4.d(o6.v.f13643a.b(D.class), new K(this, 0), new K(this, 1), new D4.z(6, this));
        this.f2665v = new C1530D(new C0090d(0));
    }

    @Override // z1.b
    public final ViewGroup E() {
        this.f2667x = new C0087a(new A1.e(1, this, L.class, "onActionClicked", "onActionClicked(Lcom/buzbuz/smartautoclicker/core/common/overlays/menu/implementation/brief/ItemBrief;)V", 0, 0, 11), new A1.e(1, G(), D.class, "updateActionOrder", "updateActionOrder(Ljava/util/List;)V", 0, 0, 12));
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_smart_actions_legacy, (ViewGroup) null, false);
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
                        F3.g gVar = new F3.g(coordinatorLayout, floatingActionButton, floatingActionButton2, a3, a4, 0);
                        X.Q(a4, C2.a.f583f, 8);
                        X.Q(a4, C2.a.f582e, 8);
                        ((MaterialTextView) a4.f298h).setText(R.string.menu_item_title_actions);
                        A((MaterialButton) a4.f297g, new E(this, 0));
                        A(floatingActionButton2, new E(this, 1));
                        A(floatingActionButton, new E(this, 2));
                        E2.c.p0(a3, R.string.message_empty_action_list_title, Integer.valueOf(R.string.message_empty_action_list_desc));
                        RecyclerView recyclerView = (RecyclerView) a3.j;
                        this.f2665v.g(recyclerView);
                        recyclerView.i(new C1553t(recyclerView.getContext()));
                        C0087a c0087a = this.f2667x;
                        if (c0087a != null) {
                            recyclerView.setAdapter(c0087a);
                            recyclerView.getContext();
                            recyclerView.setLayoutManager(new LinearLayoutManager(1));
                            this.f2666w = gVar;
                            o6.j.d(coordinatorLayout, "getRoot(...)");
                            return coordinatorLayout;
                        }
                        o6.j.i("actionAdapter");
                        throw null;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        AbstractC0166y.q(U.e(this), null, null, new J(this, null), 3);
    }

    public final D G() {
        return (D) this.f2664u.getValue();
    }
}
