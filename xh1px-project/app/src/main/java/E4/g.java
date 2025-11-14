package E4;

import D4.z;
import L7.AbstractC0166y;
import O3.C0224w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.U;
import androidx.recyclerview.widget.RecyclerView;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import l5.DialogC1035e;
import o.p1;
import o6.v;

/* loaded from: classes.dex */
public final class g extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final A4.d f1215u;

    /* renamed from: v, reason: collision with root package name */
    public p1 f1216v;

    /* renamed from: w, reason: collision with root package name */
    public C0224w f1217w;

    public g() {
        super(Integer.valueOf(R.style.AppTheme));
        this.f1215u = new A4.d(v.f13643a.b(n.class), new f(this, 0), new f(this, 1), new z(2, this));
    }

    @Override // z1.b
    public final ViewGroup E() {
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_debug_report, (ViewGroup) null, false);
        int i4 = R.id.layout_list;
        View r8 = E2.b.r(inflate, R.id.layout_list);
        if (r8 != null) {
            p1 a3 = p1.a(r8);
            View r9 = E2.b.r(inflate, R.id.layout_top_bar);
            if (r9 != null) {
                A4.d a4 = A4.d.a(r9);
                LinearLayout linearLayout = (LinearLayout) inflate;
                new W0.c(linearLayout, a3, a4);
                ((MaterialTextView) a4.f298h).setText(R.string.dialog_overlay_title_debug_report);
                ((MaterialButton) a4.f299i).setVisibility(8);
                ((MaterialButton) a4.f297g).setOnClickListener(new B2.b(6, this));
                this.f1216v = a3;
                o6.j.d(linearLayout, "getRoot(...)");
                return linearLayout;
            }
            i4 = R.id.layout_top_bar;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        C0224w c0224w = new C0224w(new A1.o(2, (n) this.f1215u.getValue(), n.class, "getConditionBitmap", "getConditionBitmap(Lcom/buzbuz/smartautoclicker/core/domain/model/condition/ImageCondition;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", 0, 0, 2), new A1.e(1, this, g.class, "showConditionReportDialog", "showConditionReportDialog(Lcom/buzbuz/smartautoclicker/feature/smart/debugging/ui/report/ConditionReport;)V", 0, 0, 10));
        this.f1217w = c0224w;
        p1 p1Var = this.f1216v;
        if (p1Var != null) {
            ((RecyclerView) p1Var.j).setAdapter(c0224w);
            AbstractC0166y.q(U.e(this), null, null, new e(this, null), 3);
        } else {
            o6.j.i("listBinding");
            throw null;
        }
    }
}
