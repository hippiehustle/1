package A1;

import Z5.y;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;
import l5.DialogC1035e;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import t0.C1536c;

/* loaded from: classes.dex */
public class p extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final int f269u;

    /* renamed from: v, reason: collision with root package name */
    public final List f270v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC1163b f271w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC1162a f272x;

    /* renamed from: y, reason: collision with root package name */
    public C1536c f273y;

    /* renamed from: z, reason: collision with root package name */
    public a f274z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i4, int i8, List list, InterfaceC1163b interfaceC1163b, InterfaceC1162a interfaceC1162a) {
        super(Integer.valueOf(i4));
        o6.j.e(list, "choices");
        this.f269u = i8;
        this.f270v = list;
        this.f271w = interfaceC1163b;
        this.f272x = interfaceC1162a;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [A1.m] */
    @Override // z1.b
    public final ViewGroup E() {
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_base_multi_choice, (ViewGroup) null, false);
        int i4 = R.id.layout_top_bar;
        View r8 = E2.b.r(inflate, R.id.layout_top_bar);
        if (r8 != null) {
            A4.d a3 = A4.d.a(r8);
            RecyclerView recyclerView = (RecyclerView) E2.b.r(inflate, R.id.list);
            if (recyclerView != null) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                C1536c c1536c = new C1536c(coordinatorLayout, a3, recyclerView);
                ((MaterialTextView) a3.f298h).setText(this.f269u);
                final int i8 = 0;
                A((MaterialButton) a3.f297g, new InterfaceC1163b(this) { // from class: A1.m

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ p f264e;

                    {
                        this.f264e = this;
                    }

                    @Override // n6.InterfaceC1163b
                    public final Object m(Object obj) {
                        switch (i8) {
                            case 0:
                                o6.j.e((View) obj, "it");
                                p pVar = this.f264e;
                                InterfaceC1162a interfaceC1162a = pVar.f272x;
                                if (interfaceC1162a != null) {
                                    interfaceC1162a.a();
                                }
                                pVar.a();
                                break;
                            default:
                                g gVar = (g) obj;
                                o6.j.e(gVar, "choice");
                                p pVar2 = this.f264e;
                                pVar2.h(new n(pVar2, 0, gVar));
                                break;
                        }
                        return y.f7506a;
                    }
                });
                final int i9 = 1;
                this.f274z = new a(this.f270v, new InterfaceC1163b(this) { // from class: A1.m

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ p f264e;

                    {
                        this.f264e = this;
                    }

                    @Override // n6.InterfaceC1163b
                    public final Object m(Object obj) {
                        switch (i9) {
                            case 0:
                                o6.j.e((View) obj, "it");
                                p pVar = this.f264e;
                                InterfaceC1162a interfaceC1162a = pVar.f272x;
                                if (interfaceC1162a != null) {
                                    interfaceC1162a.a();
                                }
                                pVar.a();
                                break;
                            default:
                                g gVar = (g) obj;
                                o6.j.e(gVar, "choice");
                                p pVar2 = this.f264e;
                                pVar2.h(new n(pVar2, 0, gVar));
                                break;
                        }
                        return y.f7506a;
                    }
                }, new o(2, this, p.class, "onChoiceViewBound", "onChoiceViewBound(Lcom/buzbuz/smartautoclicker/core/common/overlays/dialog/implementation/DialogChoice;Landroid/view/View;)V", 0, 0, 0));
                this.f273y = c1536c;
                o6.j.d(coordinatorLayout, "getRoot(...)");
                return coordinatorLayout;
            }
            i4 = R.id.list;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        C1536c c1536c = this.f273y;
        if (c1536c != null) {
            RecyclerView recyclerView = (RecyclerView) c1536c.f14809f;
            a aVar = this.f274z;
            if (aVar != null) {
                recyclerView.setAdapter(aVar);
                return;
            } else {
                o6.j.i("adapter");
                throw null;
            }
        }
        o6.j.i("viewBinding");
        throw null;
    }

    public void G(g gVar, View view) {
        o6.j.e(gVar, "choice");
    }
}
