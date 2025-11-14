package q3;

import K3.C0090d;
import L7.AbstractC0166y;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.U;
import androidx.recyclerview.widget.RecyclerView;
import com.buzbuz.smartautoclicker.R;
import g0.b0;
import j3.C0933s;
import o.p1;
import o3.C1234e;
import o3.C1235f;
import o6.v;
import t0.C1530D;
import t0.C1553t;

/* loaded from: classes.dex */
public final class j extends B1.h {

    /* renamed from: l, reason: collision with root package name */
    public final A4.d f13994l;

    /* renamed from: m, reason: collision with root package name */
    public p1 f13995m;

    /* renamed from: n, reason: collision with root package name */
    public C1368b f13996n;

    /* renamed from: o, reason: collision with root package name */
    public R.g f13997o;

    /* renamed from: p, reason: collision with root package name */
    public R.g f13998p;

    /* renamed from: q, reason: collision with root package name */
    public b0 f13999q;

    /* renamed from: r, reason: collision with root package name */
    public final C1530D f14000r;

    public j(Context context) {
        super(context);
        this.f13994l = new A4.d(v.f13643a.b(m.class), new C1375i(this, 0), new C1375i(this, 1), new C0933s(15, this));
        this.f14000r = new C1530D(new C0090d(1));
    }

    @Override // B1.h
    public final void l() {
        c(new C1235f(0));
    }

    @Override // B1.h
    public final void m() {
        c(new C1369c(this, 1));
    }

    @Override // B1.h
    public final ViewGroup n(ViewGroup viewGroup) {
        this.f13996n = new C1368b(new W4.i(1, this, j.class, "onDumbActionClicked", "onDumbActionClicked(Lcom/buzbuz/smartautoclicker/feature/dumb/config/ui/actions/copy/DumbActionDetails;)V", 0, 0, 20), new W4.i(1, t(), m.class, "updateDumbActionOrder", "updateDumbActionOrder(Ljava/util/List;)V", 0, 0, 21));
        p1 a3 = p1.a(LayoutInflater.from(h()).inflate(R.layout.include_loadable_list, viewGroup, false));
        E2.c.p0(a3, R.string.message_empty_dumb_action_list, Integer.valueOf(R.string.message_empty_secondary_dumb_action_list));
        RecyclerView recyclerView = (RecyclerView) a3.j;
        recyclerView.i(new C1553t(recyclerView.getContext()));
        this.f14000r.g(recyclerView);
        C1368b c1368b = this.f13996n;
        if (c1368b != null) {
            recyclerView.setAdapter(c1368b);
            this.f13995m = a3;
            FrameLayout frameLayout = (FrameLayout) a3.f13349e;
            o6.j.d(frameLayout, "getRoot(...)");
            return frameLayout;
        }
        o6.j.i("dumbActionsAdapter");
        throw null;
    }

    @Override // B1.h
    public final void q() {
        this.f13999q = new b0(new A1.h(28, this), new C1.b(9, this), new C1369c(this, 0), new W4.i(1, t(), m.class, "createDumbActionCopy", "createDumbActionCopy(Lcom/buzbuz/smartautoclicker/core/dumb/domain/model/DumbAction;)Lcom/buzbuz/smartautoclicker/core/dumb/domain/model/DumbAction;", 0, 0, 22));
        int i4 = 0;
        int i8 = 0;
        this.f13997o = new R.g(new W4.i(1, t(), m.class, "addNewDumbAction", "addNewDumbAction(Lcom/buzbuz/smartautoclicker/core/dumb/domain/model/DumbAction;)V", i8, i4, 23), new C1234e(7), new C1235f(0), 12);
        this.f13998p = new R.g(new W4.i(1, t(), m.class, "updateDumbAction", "updateDumbAction(Lcom/buzbuz/smartautoclicker/core/dumb/domain/model/DumbAction;)V", i8, i4, 24), new W4.i(1, t(), m.class, "deleteDumbAction", "deleteDumbAction(Lcom/buzbuz/smartautoclicker/core/dumb/domain/model/DumbAction;)V", i4, 0, 25), new C1235f(0), 12);
        AbstractC0166y.q(U.e(this), null, null, new C1374h(this, null), 3);
    }

    public final m t() {
        return (m) this.f13994l.getValue();
    }
}
