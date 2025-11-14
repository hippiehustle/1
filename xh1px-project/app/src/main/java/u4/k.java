package u4;

import J3.s;
import K3.C0090d;
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
import k2.C0952b;
import k4.I;
import o.p1;
import o6.v;
import q4.C1419y;
import t0.C1530D;
import t0.C1553t;

/* loaded from: classes.dex */
public final class k extends B1.h {

    /* renamed from: l, reason: collision with root package name */
    public final A4.d f15338l;

    /* renamed from: m, reason: collision with root package name */
    public final C1530D f15339m;

    /* renamed from: n, reason: collision with root package name */
    public p1 f15340n;

    /* renamed from: o, reason: collision with root package name */
    public C1633b f15341o;

    public k(Context context) {
        super(context);
        this.f15338l = new A4.d(v.f13643a.b(m.class), new j(this, 0), new j(this, 1), new C0933s(21, this));
        this.f15339m = new C1530D(new C0090d(2));
    }

    @Override // B1.h
    public final boolean a() {
        return true;
    }

    @Override // B1.h
    public final void l() {
        c(new C1634c(this, 0));
    }

    @Override // B1.h
    public final void m() {
        c(new C1634c(this, 1));
    }

    @Override // B1.h
    public final ViewGroup n(ViewGroup viewGroup) {
        int i4 = 0;
        int i8 = 1;
        int i9 = 0;
        this.f15341o = new C1633b(new W4.i(i8, this, k.class, "onEventItemClicked", "onEventItemClicked(Lcom/buzbuz/smartautoclicker/core/domain/model/event/ImageEvent;)V", i9, i4, 29), new d(i8, t(), m.class, "updateEventsPriority", "updateEventsPriority(Ljava/util/List;)V", i9, i4, 0), new I(2, this, k.class, "onEventItemBound", "onEventItemBound(ILandroid/view/View;)V", 0, 0, 6));
        p1 a3 = p1.a(LayoutInflater.from(h()).inflate(R.layout.include_loadable_list, viewGroup, false));
        E2.c.p0(a3, R.string.message_empty_screen_event_title, Integer.valueOf(R.string.message_empty_screen_event_desc));
        RecyclerView recyclerView = (RecyclerView) a3.j;
        recyclerView.i(new C1553t(recyclerView.getContext()));
        this.f15339m.g(recyclerView);
        C1633b c1633b = this.f15341o;
        if (c1633b != null) {
            recyclerView.setAdapter(c1633b);
            this.f15340n = a3;
            FrameLayout frameLayout = (FrameLayout) a3.f13349e;
            o6.j.d(frameLayout, "getRoot(...)");
            return frameLayout;
        }
        o6.j.i("eventAdapter");
        throw null;
    }

    @Override // B1.h
    public final void p() {
        t().f15346c.b(J2.a.f2384z);
    }

    @Override // B1.h
    public final void q() {
        AbstractC0166y.q(U.e(this), null, null, new i(this, null), 3);
    }

    public final m t() {
        return (m) this.f15338l.getValue();
    }

    public final void u(C0952b c0952b) {
        m t8 = t();
        o6.j.e(c0952b, "event");
        t8.f15345b.f(c0952b);
        i().o().d(h(), new C1419y(new C0217o(0, t(), m.class, "saveEventEdition", "saveEventEdition()Lkotlin/Unit;", 8, 3), new C0217o(0, t(), m.class, "deleteEditedEvent", "deleteEditedEvent()Lkotlin/Unit;", 8, 4), new s(0, t(), m.class, "dismissEditedEvent", "dismissEditedEvent()V", 0, 0, 28)), true);
    }
}
