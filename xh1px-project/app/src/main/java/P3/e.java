package P3;

import A1.n;
import D4.z;
import L7.AbstractC0166y;
import O3.b0;
import Z5.y;
import android.content.ComponentName;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.U;
import androidx.recyclerview.widget.RecyclerView;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import l5.DialogC1035e;
import n6.InterfaceC1163b;
import o.p1;
import o6.j;
import o6.v;
import t0.C1553t;

/* loaded from: classes.dex */
public final class e extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final b0 f4505u;

    /* renamed from: v, reason: collision with root package name */
    public final A4.d f4506v;

    /* renamed from: w, reason: collision with root package name */
    public A4.c f4507w;

    /* renamed from: x, reason: collision with root package name */
    public R4.d f4508x;

    public e(b0 b0Var) {
        super(Integer.valueOf(R.style.ScenarioConfigTheme));
        this.f4505u = b0Var;
        this.f4506v = new A4.d(v.f13643a.b(g.class), new d(this, 0), new d(this, 1), new z(14, this));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [P3.a] */
    @Override // z1.b
    public final ViewGroup E() {
        A4.c i4 = A4.c.i(LayoutInflater.from(k()));
        A4.d dVar = (A4.d) i4.f293g;
        ((MaterialTextView) dVar.f298h).setText(R.string.dialog_title_application_selection);
        final int i8 = 0;
        A((MaterialButton) dVar.f297g, new InterfaceC1163b(this) { // from class: P3.a

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ e f4498e;

            {
                this.f4498e = this;
            }

            @Override // n6.InterfaceC1163b
            public final Object m(Object obj) {
                switch (i8) {
                    case 0:
                        j.e((View) obj, "it");
                        this.f4498e.a();
                        break;
                    default:
                        ComponentName componentName = (ComponentName) obj;
                        j.e(componentName, "selectedComponentName");
                        e eVar = this.f4498e;
                        eVar.h(new n(eVar, 10, componentName));
                        break;
                }
                return y.f7506a;
            }
        });
        final int i9 = 1;
        R4.d dVar2 = new R4.d((a) new InterfaceC1163b(this) { // from class: P3.a

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ e f4498e;

            {
                this.f4498e = this;
            }

            @Override // n6.InterfaceC1163b
            public final Object m(Object obj) {
                switch (i9) {
                    case 0:
                        j.e((View) obj, "it");
                        this.f4498e.a();
                        break;
                    default:
                        ComponentName componentName = (ComponentName) obj;
                        j.e(componentName, "selectedComponentName");
                        e eVar = this.f4498e;
                        eVar.h(new n(eVar, 10, componentName));
                        break;
                }
                return y.f7506a;
            }
        });
        this.f4508x = dVar2;
        RecyclerView recyclerView = (RecyclerView) ((p1) i4.f292f).j;
        recyclerView.setAdapter(dVar2);
        recyclerView.i(new C1553t(recyclerView.getContext()));
        this.f4507w = i4;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) i4.f291e;
        j.d(coordinatorLayout, "getRoot(...)");
        return coordinatorLayout;
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        AbstractC0166y.q(U.e(this), null, null, new c(this, null), 3);
    }
}
