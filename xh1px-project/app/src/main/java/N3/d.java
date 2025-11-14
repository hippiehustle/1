package N3;

import D4.z;
import L7.AbstractC0166y;
import android.content.Context;
import androidx.lifecycle.U;
import androidx.recyclerview.widget.RecyclerView;
import com.buzbuz.smartautoclicker.R;
import l5.DialogC1035e;
import o6.v;

/* loaded from: classes.dex */
public final class d extends A1.f {

    /* renamed from: A, reason: collision with root package name */
    public final int f3742A;

    /* renamed from: v, reason: collision with root package name */
    public final M7.c f3743v;

    /* renamed from: w, reason: collision with root package name */
    public final A4.d f3744w;

    /* renamed from: x, reason: collision with root package name */
    public R4.d f3745x;

    /* renamed from: y, reason: collision with root package name */
    public final int f3746y;

    /* renamed from: z, reason: collision with root package name */
    public final int f3747z;

    public d(M7.c cVar) {
        super(R.style.ScenarioConfigTheme);
        this.f3743v = cVar;
        this.f3744w = new A4.d(v.f13643a.b(j.class), new c(this, 0), new c(this, 1), new z(10, this));
        this.f3746y = R.string.dialog_overlay_title_copy_from;
        this.f3747z = R.string.search_view_hint_action_copy;
        this.f3742A = R.string.message_empty_copy;
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        this.f3745x = new R4.d(new A1.h(9, this));
        RecyclerView recyclerView = (RecyclerView) J().f1331f.j;
        Context context = recyclerView.getContext();
        o6.j.d(context, "getContext(...)");
        recyclerView.i(E2.b.C(context));
        R4.d dVar = this.f3745x;
        if (dVar != null) {
            recyclerView.setAdapter(dVar);
            AbstractC0166y.q(U.e(this), null, null, new b(this, null), 3);
        } else {
            o6.j.i("actionCopyAdapter");
            throw null;
        }
    }

    @Override // A1.f
    public final int G() {
        return this.f3742A;
    }

    @Override // A1.f
    public final int H() {
        return this.f3747z;
    }

    @Override // A1.f
    public final int I() {
        return this.f3746y;
    }

    @Override // A1.f
    public final void K(String str) {
        ((j) this.f3744w.getValue()).f3755b.g(str);
    }
}
