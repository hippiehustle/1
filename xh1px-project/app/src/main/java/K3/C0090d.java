package K3;

import a6.AbstractC0436k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q3.C1368b;
import t0.AbstractC1529C;
import t0.U;
import t0.s0;
import u4.C1633b;

/* renamed from: K3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0090d extends AbstractC1529C {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2672d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2673e;

    public C0090d(int i4) {
        this.f2672d = i4;
        this.f14700a = -1;
    }

    @Override // t0.AbstractC1529C
    public final void a(RecyclerView recyclerView, s0 s0Var) {
        switch (this.f2672d) {
            case 0:
                o6.j.e(recyclerView, "recyclerView");
                o6.j.e(s0Var, "viewHolder");
                super.a(recyclerView, s0Var);
                if (this.f2673e) {
                    U adapter = recyclerView.getAdapter();
                    o6.j.c(adapter, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.smart.config.ui.action.brief.ActionAdapter");
                    C0087a c0087a = (C0087a) adapter;
                    A1.e eVar = c0087a.f2669f;
                    List list = c0087a.f14777d.f14837f;
                    o6.j.d(list, "getCurrentList(...)");
                    eVar.m(list);
                    this.f2673e = false;
                    return;
                }
                return;
            case 1:
                o6.j.e(recyclerView, "recyclerView");
                o6.j.e(s0Var, "viewHolder");
                super.a(recyclerView, s0Var);
                if (this.f2673e) {
                    U adapter2 = recyclerView.getAdapter();
                    o6.j.c(adapter2, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.dumb.config.ui.scenario.actionlist.DumbActionListAdapter");
                    C1368b c1368b = (C1368b) adapter2;
                    W4.i iVar = c1368b.f13979f;
                    List list2 = c1368b.f14777d.f14837f;
                    o6.j.d(list2, "getCurrentList(...)");
                    iVar.m(list2);
                    this.f2673e = false;
                    return;
                }
                return;
            default:
                o6.j.e(recyclerView, "recyclerView");
                o6.j.e(s0Var, "viewHolder");
                super.a(recyclerView, s0Var);
                if (this.f2673e) {
                    U adapter3 = recyclerView.getAdapter();
                    o6.j.c(adapter3, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.smart.config.ui.scenario.imageevents.ImageEventListAdapter");
                    C1633b c1633b = (C1633b) adapter3;
                    u4.d dVar = c1633b.f15321f;
                    List list3 = c1633b.f14777d.f14837f;
                    o6.j.d(list3, "getCurrentList(...)");
                    dVar.m(list3);
                    this.f2673e = false;
                    return;
                }
                return;
        }
    }

    @Override // t0.AbstractC1529C
    public final void f(RecyclerView recyclerView, s0 s0Var, s0 s0Var2) {
        switch (this.f2672d) {
            case 0:
                o6.j.e(recyclerView, "recyclerView");
                o6.j.e(s0Var, "viewHolder");
                this.f2673e = true;
                U adapter = recyclerView.getAdapter();
                o6.j.c(adapter, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.smart.config.ui.action.brief.ActionAdapter");
                C0087a c0087a = (C0087a) adapter;
                int c6 = s0Var.c();
                int c9 = s0Var2.c();
                List list = c0087a.f14777d.f14837f;
                o6.j.d(list, "getCurrentList(...)");
                ArrayList S02 = AbstractC0436k.S0(list);
                Collections.swap(S02, c6, c9);
                c0087a.h(S02);
                return;
            case 1:
                o6.j.e(recyclerView, "recyclerView");
                o6.j.e(s0Var, "viewHolder");
                this.f2673e = true;
                U adapter2 = recyclerView.getAdapter();
                o6.j.c(adapter2, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.dumb.config.ui.scenario.actionlist.DumbActionListAdapter");
                C1368b c1368b = (C1368b) adapter2;
                int c10 = s0Var.c();
                int c11 = s0Var2.c();
                List list2 = c1368b.f14777d.f14837f;
                o6.j.d(list2, "getCurrentList(...)");
                ArrayList S03 = AbstractC0436k.S0(list2);
                Collections.swap(S03, c10, c11);
                c1368b.h(S03);
                return;
            default:
                o6.j.e(recyclerView, "recyclerView");
                o6.j.e(s0Var, "viewHolder");
                this.f2673e = true;
                U adapter3 = recyclerView.getAdapter();
                o6.j.c(adapter3, "null cannot be cast to non-null type com.buzbuz.smartautoclicker.feature.smart.config.ui.scenario.imageevents.ImageEventListAdapter");
                C1633b c1633b = (C1633b) adapter3;
                int c12 = s0Var.c();
                int c13 = s0Var2.c();
                List list3 = c1633b.f14777d.f14837f;
                o6.j.d(list3, "getCurrentList(...)");
                ArrayList S04 = AbstractC0436k.S0(list3);
                Collections.swap(S04, c12, c13);
                c1633b.h(S04);
                return;
        }
    }

    @Override // t0.AbstractC1529C
    public final void g(s0 s0Var) {
        switch (this.f2672d) {
            case 0:
            case 1:
            default:
                o6.j.e(s0Var, "viewHolder");
                return;
        }
    }
}
