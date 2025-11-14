package w4;

import L7.AbstractC0166y;
import O3.C0217o;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.U;
import androidx.recyclerview.widget.RecyclerView;
import com.buzbuz.smartautoclicker.R;
import j3.C0933s;
import k2.C0953c;
import o.p1;
import o6.v;
import q4.C1419y;
import t0.C1553t;
import v4.C1667b;

/* renamed from: w4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1704i extends B1.h {

    /* renamed from: l, reason: collision with root package name */
    public final A4.d f15702l;

    /* renamed from: m, reason: collision with root package name */
    public p1 f15703m;

    /* renamed from: n, reason: collision with root package name */
    public R4.d f15704n;

    public C1704i(Context context) {
        super(context);
        this.f15702l = new A4.d(v.f13643a.b(C1706k.class), new C1703h(this, 0), new C1703h(this, 1), new C0933s(23, this));
    }

    @Override // B1.h
    public final boolean a() {
        return true;
    }

    @Override // B1.h
    public final void l() {
        c(new C1697b(this, 0));
    }

    @Override // B1.h
    public final void m() {
        c(new C1697b(this, 1));
    }

    @Override // B1.h
    public final ViewGroup n(ViewGroup viewGroup) {
        this.f15704n = new R4.d(new u4.d(1, this, C1704i.class, "onTriggerEventItemClicked", "onTriggerEventItemClicked(Lcom/buzbuz/smartautoclicker/core/domain/model/event/TriggerEvent;)V", 0, 0, 2));
        p1 a3 = p1.a(LayoutInflater.from(h()).inflate(R.layout.include_loadable_list, viewGroup, false));
        E2.c.p0(a3, R.string.message_empty_trigger_event_list_title, Integer.valueOf(R.string.message_empty_trigger_event_list_desc));
        RecyclerView recyclerView = (RecyclerView) a3.j;
        recyclerView.i(new C1553t(recyclerView.getContext()));
        R4.d dVar = this.f15704n;
        if (dVar != null) {
            recyclerView.setAdapter(dVar);
            this.f15703m = a3;
            FrameLayout frameLayout = (FrameLayout) a3.f13349e;
            o6.j.d(frameLayout, "getRoot(...)");
            return frameLayout;
        }
        o6.j.i("eventAdapter");
        throw null;
    }

    @Override // B1.h
    public final void q() {
        AbstractC0166y.q(U.e(this), null, null, new C1702g(this, null), 3);
    }

    public final C1706k t() {
        return (C1706k) this.f15702l.getValue();
    }

    public final void u(C0953c c0953c) {
        C1706k t8 = t();
        o6.j.e(c0953c, "event");
        t8.f15708b.f(c0953c);
        i().o().d(h(), new C1419y(new C0217o(0, t(), C1706k.class, "saveEventEdition", "saveEventEdition()Lkotlin/Unit;", 8, 5), new C0217o(0, t(), C1706k.class, "deleteEditedEvent", "deleteEditedEvent()Lkotlin/Unit;", 8, 6), new C1667b(0, t(), C1706k.class, "dismissEditedEvent", "dismissEditedEvent()V", 0, 0, 2)), true);
    }
}
