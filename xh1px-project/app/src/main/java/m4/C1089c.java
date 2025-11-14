package m4;

import O7.InterfaceC0234g;
import Z5.y;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d6.InterfaceC0617c;
import java.util.List;
import o.p1;
import o6.C1282a;
import o6.InterfaceC1288g;
import t0.L;
import t0.U;

/* renamed from: m4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1089c implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f12502e;

    public /* synthetic */ C1089c(i iVar, int i4) {
        this.f12501d = i4;
        this.f12502e = iVar;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f12501d) {
            case 0:
                return new C1282a(2, this.f12502e, i.class, "updateCopyButton", "updateCopyButton(Z)V", 4);
            default:
                return new C1282a(2, this.f12502e, i.class, "updateConditionList", "updateConditionList(Ljava/util/List;)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f12501d) {
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
        switch (this.f12501d) {
            case 0:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4;
        int i8 = this.f12501d;
        y yVar = y.f7506a;
        i iVar = this.f12502e;
        switch (i8) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                F3.g gVar = iVar.f12514v;
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
                F3.g gVar2 = iVar.f12514v;
                if (gVar2 != null) {
                    p1 p1Var = gVar2.f1346g;
                    o6.j.b(p1Var);
                    E2.c.G0(p1Var, list);
                    U adapter = ((RecyclerView) p1Var.j).getAdapter();
                    o6.j.c(adapter, "null cannot be cast to non-null type androidx.recyclerview.widget.ListAdapter<com.buzbuz.smartautoclicker.feature.smart.config.ui.common.model.condition.UiTriggerCondition, androidx.recyclerview.widget.RecyclerView.ViewHolder>");
                    ((L) adapter).h(list);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
