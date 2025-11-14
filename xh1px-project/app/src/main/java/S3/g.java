package S3;

import A1.o;
import D4.z;
import L7.AbstractC0166y;
import O3.C0205c;
import O7.i0;
import Z5.y;
import android.net.Uri;
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

/* loaded from: classes.dex */
public final class g extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final int f5340u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f5341v;

    /* renamed from: w, reason: collision with root package name */
    public final C0205c f5342w;

    /* renamed from: x, reason: collision with root package name */
    public final A4.d f5343x;

    /* renamed from: y, reason: collision with root package name */
    public a f5344y;

    public g(int i4, boolean z8, C0205c c0205c) {
        super(Integer.valueOf(R.style.ScenarioConfigTheme));
        this.f5340u = i4;
        this.f5341v = z8;
        this.f5342w = c0205c;
        this.f5343x = new A4.d(v.f13643a.b(j.class), new f(this, 0), new f(this, 1), new z(17, this));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [S3.b] */
    @Override // z1.b
    public final ViewGroup E() {
        final int i4 = 0;
        this.f5344y = new a(new o(2, (j) this.f5343x.getValue(), j.class, "setFlagState", "setFlagState(IZ)V", 0, 0, 6), (b) new InterfaceC1163b(this) { // from class: S3.b

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ g f5331e;

            {
                this.f5331e = this;
            }

            @Override // n6.InterfaceC1163b
            public final Object m(Object obj) {
                switch (i4) {
                    case 0:
                        Uri uri = (Uri) obj;
                        o6.j.e(uri, "uri");
                        g gVar = this.f5331e;
                        gVar.h(new A1.n(gVar, 12, uri));
                        break;
                    default:
                        o6.j.e((View) obj, "it");
                        g gVar2 = this.f5331e;
                        gVar2.f5342w.m(Integer.valueOf(((Number) ((j) gVar2.f5343x.getValue()).f5351c.f()).intValue()));
                        gVar2.a();
                        break;
                }
                return y.f7506a;
            }
        });
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_config_action_intent_flags, (ViewGroup) null, false);
        int i8 = R.id.flags_list;
        RecyclerView recyclerView = (RecyclerView) E2.b.r(inflate, R.id.flags_list);
        if (recyclerView != null) {
            i8 = R.id.layout_top_bar;
            View r8 = E2.b.r(inflate, R.id.layout_top_bar);
            if (r8 != null) {
                A4.d a3 = A4.d.a(r8);
                LinearLayout linearLayout = (LinearLayout) inflate;
                ((MaterialTextView) a3.f298h).setText(R.string.dialog_title_intent_flags);
                X.Q(a3, C2.a.f583f, 8);
                X.Q(a3, C2.a.f582e, 8);
                final int i9 = 1;
                A((MaterialButton) a3.f297g, new InterfaceC1163b(this) { // from class: S3.b

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ g f5331e;

                    {
                        this.f5331e = this;
                    }

                    @Override // n6.InterfaceC1163b
                    public final Object m(Object obj) {
                        switch (i9) {
                            case 0:
                                Uri uri = (Uri) obj;
                                o6.j.e(uri, "uri");
                                g gVar = this.f5331e;
                                gVar.h(new A1.n(gVar, 12, uri));
                                break;
                            default:
                                o6.j.e((View) obj, "it");
                                g gVar2 = this.f5331e;
                                gVar2.f5342w.m(Integer.valueOf(((Number) ((j) gVar2.f5343x.getValue()).f5351c.f()).intValue()));
                                gVar2.a();
                                break;
                        }
                        return y.f7506a;
                    }
                });
                recyclerView.i(new C1553t(recyclerView.getContext()));
                a aVar = this.f5344y;
                if (aVar != null) {
                    recyclerView.setAdapter(aVar);
                    o6.j.d(linearLayout, "getRoot(...)");
                    return linearLayout;
                }
                o6.j.i("flagsAdapter");
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i8)));
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        j jVar = (j) this.f5343x.getValue();
        i0 i0Var = jVar.f5350b;
        Boolean valueOf = Boolean.valueOf(this.f5341v);
        i0Var.getClass();
        i0Var.h(null, valueOf);
        i0 i0Var2 = jVar.f5351c;
        Integer valueOf2 = Integer.valueOf(this.f5340u);
        i0Var2.getClass();
        i0Var2.h(null, valueOf2);
        AbstractC0166y.q(U.e(this), null, null, new e(this, null), 3);
    }
}
