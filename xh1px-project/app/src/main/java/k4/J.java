package k4;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;
import l5.DialogC1035e;
import o.p1;

/* loaded from: classes.dex */
public final class J extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final List f12024u;

    /* renamed from: v, reason: collision with root package name */
    public final A1.e f12025v;

    /* renamed from: w, reason: collision with root package name */
    public final Z5.n f12026w;

    /* renamed from: x, reason: collision with root package name */
    public A4.c f12027x;

    /* renamed from: y, reason: collision with root package name */
    public final j4.b f12028y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(List list, A1.o oVar, A1.e eVar) {
        super(Integer.valueOf(R.style.ScenarioConfigTheme));
        o6.j.e(list, "conditionList");
        this.f12024u = list;
        this.f12025v = eVar;
        this.f12026w = new Z5.n(new B0.e(20, this));
        this.f12028y = new j4.b(oVar, new W4.i(1, this, J.class, "onConditionClicked", "onConditionClicked(Lcom/buzbuz/smartautoclicker/core/domain/model/condition/ImageCondition;)V", 0, 0, 11), new I(2, this, J.class, "onConditionItemBound", "onConditionItemBound(ILandroid/view/View;)V", 0, 0, 0));
    }

    @Override // z1.b
    public final ViewGroup E() {
        A4.c i4 = A4.c.i(LayoutInflater.from(k()));
        A4.d dVar = (A4.d) i4.f293g;
        ((MaterialTextView) dVar.f298h).setText(R.string.dialog_title_condition_selection);
        ((MaterialButton) dVar.f299i).setVisibility(8);
        A((MaterialButton) dVar.f297g, new A1.h(25, this));
        this.f12027x = i4;
        p1 p1Var = (p1) i4.f292f;
        E2.c.p0(p1Var, R.string.message_empty_screen_condition_list_title, null);
        RecyclerView recyclerView = (RecyclerView) p1Var.j;
        recyclerView.setAdapter(this.f12028y);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager());
        A4.c cVar = this.f12027x;
        if (cVar != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) cVar.f291e;
            o6.j.d(coordinatorLayout, "getRoot(...)");
            return coordinatorLayout;
        }
        o6.j.i("viewBinding");
        throw null;
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        A4.c cVar = this.f12027x;
        if (cVar != null) {
            p1 p1Var = (p1) cVar.f292f;
            List list = this.f12024u;
            E2.c.G0(p1Var, list);
            this.f12028y.h(list);
            return;
        }
        o6.j.i("viewBinding");
        throw null;
    }
}
