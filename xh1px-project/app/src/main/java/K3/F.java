package K3;

import O7.InterfaceC0234g;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d6.InterfaceC0617c;
import java.util.List;
import o.p1;
import o6.C1282a;
import o6.InterfaceC1288g;
import t0.U;

/* loaded from: classes.dex */
public final /* synthetic */ class F implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L f2653e;

    public /* synthetic */ F(L l6, int i4) {
        this.f2652d = i4;
        this.f2653e = l6;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f2652d) {
            case 0:
                return new C1282a(2, this.f2653e, L.class, "updateCopyButtonVisibility", "updateCopyButtonVisibility(Z)V", 4);
            default:
                return new C1282a(2, this.f2653e, L.class, "updateActionList", "updateActionList(Ljava/util/List;)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f2652d) {
            case 0:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            default:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f2652d) {
            case 0:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4;
        int i8 = this.f2652d;
        Z5.y yVar = Z5.y.f7506a;
        L l6 = this.f2653e;
        switch (i8) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                F3.g gVar = l6.f2666w;
                if (gVar != null) {
                    FloatingActionButton floatingActionButton = gVar.f1345f;
                    if (booleanValue) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                    floatingActionButton.setVisibility(i4);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            default:
                List list = (List) obj;
                F3.g gVar2 = l6.f2666w;
                if (gVar2 != null) {
                    p1 p1Var = gVar2.f1346g;
                    o6.j.b(p1Var);
                    E2.c.G0(p1Var, list);
                    U adapter = ((RecyclerView) p1Var.j).getAdapter();
                    o6.j.c(adapter, "null cannot be cast to non-null type androidx.recyclerview.widget.ListAdapter<com.buzbuz.smartautoclicker.core.common.overlays.menu.implementation.brief.ItemBrief, androidx.recyclerview.widget.RecyclerView.ViewHolder>");
                    ((t0.L) adapter).h(list);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
