package d4;

import A1.o;
import D4.z;
import L7.AbstractC0166y;
import O7.i0;
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
import n6.InterfaceC1163b;
import o6.v;
import q4.X;
import t0.C1553t;

/* renamed from: d4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0600f extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final String f10378u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC1163b f10379v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f10380w;

    /* renamed from: x, reason: collision with root package name */
    public final A4.d f10381x;

    /* renamed from: y, reason: collision with root package name */
    public C0595a f10382y;

    public C0600f(String str, InterfaceC1163b interfaceC1163b, boolean z8) {
        super(Integer.valueOf(R.style.ScenarioConfigTheme));
        this.f10378u = str;
        this.f10379v = interfaceC1163b;
        this.f10380w = z8;
        this.f10381x = new A4.d(v.f13643a.b(C0604j.class), new C0599e(this, 0), new C0599e(this, 1), new z(28, this));
    }

    @Override // z1.b
    public final ViewGroup E() {
        A4.d dVar = this.f10381x;
        C0604j c0604j = (C0604j) dVar.getValue();
        AbstractC0166y.q(U.g(c0604j), null, null, new C0602h(c0604j, this.f10380w, null), 3);
        this.f10382y = new C0595a(new o(2, (C0604j) dVar.getValue(), C0604j.class, "setActionSelectionState", "setActionSelectionState(Ljava/lang/String;Z)V", 0, 0, 29), new A1.h(21, this));
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_config_action_intent_actions, (ViewGroup) null, false);
        int i4 = R.id.actions_list;
        RecyclerView recyclerView = (RecyclerView) E2.b.r(inflate, R.id.actions_list);
        if (recyclerView != null) {
            i4 = R.id.layout_top_bar;
            View r8 = E2.b.r(inflate, R.id.layout_top_bar);
            if (r8 != null) {
                A4.d a3 = A4.d.a(r8);
                LinearLayout linearLayout = (LinearLayout) inflate;
                ((MaterialTextView) a3.f298h).setText(R.string.dialog_title_intent_actions);
                X.Q(a3, C2.a.f583f, 8);
                X.Q(a3, C2.a.f582e, 8);
                ((MaterialButton) a3.f297g).setOnClickListener(new B2.b(13, this));
                recyclerView.i(new C1553t(recyclerView.getContext()));
                C0595a c0595a = this.f10382y;
                if (c0595a != null) {
                    recyclerView.setAdapter(c0595a);
                    o6.j.d(linearLayout, "getRoot(...)");
                    return linearLayout;
                }
                o6.j.i("actionsAdapter");
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        String str;
        i0 i0Var = ((C0604j) this.f10381x.getValue()).f10389b;
        String str2 = this.f10378u;
        if (str2 != null) {
            str = I7.m.w0(str2).toString();
        } else {
            str = null;
        }
        i0Var.g(str);
        AbstractC0166y.q(U.e(this), null, null, new C0598d(this, null), 3);
    }
}
