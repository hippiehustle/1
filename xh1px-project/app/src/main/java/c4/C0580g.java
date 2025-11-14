package c4;

import A1.n;
import D4.z;
import L7.AbstractC0166y;
import Z5.y;
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

/* renamed from: c4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0580g extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC1163b f9660u;

    /* renamed from: v, reason: collision with root package name */
    public final A4.d f9661v;

    /* renamed from: w, reason: collision with root package name */
    public A4.c f9662w;

    /* renamed from: x, reason: collision with root package name */
    public R4.d f9663x;

    public C0580g(InterfaceC1163b interfaceC1163b) {
        super(Integer.valueOf(R.style.ScenarioConfigTheme));
        this.f9660u = interfaceC1163b;
        this.f9661v = new A4.d(v.f13643a.b(h.class), new C0579f(this, 0), new C0579f(this, 1), new z(27, this));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [c4.b] */
    @Override // z1.b
    public final ViewGroup E() {
        A4.c i4 = A4.c.i(LayoutInflater.from(k()));
        A4.d dVar = (A4.d) i4.f293g;
        ((MaterialTextView) dVar.f298h).setText(R.string.generic_counters);
        final int i8 = 0;
        A((MaterialButton) dVar.f297g, new InterfaceC1163b(this) { // from class: c4.b

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C0580g f9651e;

            {
                this.f9651e = this;
            }

            @Override // n6.InterfaceC1163b
            public final Object m(Object obj) {
                switch (i8) {
                    case 0:
                        j.e((View) obj, "it");
                        this.f9651e.a();
                        break;
                    default:
                        String str = (String) obj;
                        j.e(str, "selectedCounterName");
                        C0580g c0580g = this.f9651e;
                        c0580g.h(new n(c0580g, 16, str));
                        break;
                }
                return y.f7506a;
            }
        });
        final int i9 = 1;
        this.f9663x = new R4.d((C0575b) new InterfaceC1163b(this) { // from class: c4.b

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C0580g f9651e;

            {
                this.f9651e = this;
            }

            @Override // n6.InterfaceC1163b
            public final Object m(Object obj) {
                switch (i9) {
                    case 0:
                        j.e((View) obj, "it");
                        this.f9651e.a();
                        break;
                    default:
                        String str = (String) obj;
                        j.e(str, "selectedCounterName");
                        C0580g c0580g = this.f9651e;
                        c0580g.h(new n(c0580g, 16, str));
                        break;
                }
                return y.f7506a;
            }
        });
        p1 p1Var = (p1) i4.f292f;
        E2.c.p0(p1Var, R.string.message_empty_counter_name_list_title, Integer.valueOf(R.string.message_empty_counter_name_list_desc));
        RecyclerView recyclerView = (RecyclerView) p1Var.j;
        R4.d dVar2 = this.f9663x;
        if (dVar2 != null) {
            recyclerView.setAdapter(dVar2);
            recyclerView.i(new C1553t(k()));
            this.f9662w = i4;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) i4.f291e;
            j.d(coordinatorLayout, "getRoot(...)");
            return coordinatorLayout;
        }
        j.i("counterNameAdapter");
        throw null;
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        AbstractC0166y.q(U.e(this), null, null, new C0578e(this, null), 3);
    }
}
