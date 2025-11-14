package Z3;

import L7.AbstractC0166y;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.U;
import androidx.recyclerview.widget.RecyclerView;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import i2.C0880a;
import java.util.ArrayList;
import java.util.Map;
import l1.C0999a;
import l1.C1000b;
import l5.DialogC1035e;
import n6.InterfaceC1163b;
import o.p1;
import q4.X;

/* renamed from: Z3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0372g extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final W4.i f7375u;

    /* renamed from: v, reason: collision with root package name */
    public final A4.d f7376v;

    /* renamed from: w, reason: collision with root package name */
    public F3.e f7377w;

    /* renamed from: x, reason: collision with root package name */
    public R4.d f7378x;

    public C0372g(W4.i iVar) {
        super(Integer.valueOf(R.style.ScenarioConfigTheme));
        this.f7375u = iVar;
        this.f7376v = new A4.d(o6.v.f13643a.b(C0376k.class), new C0371f(this, 0), new C0371f(this, 1), new D4.z(25, this));
    }

    @Override // z1.b
    public final ViewGroup E() {
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_config_events_toggle, (ViewGroup) null, false);
        int i4 = R.id.layout_loadable_list;
        View r8 = E2.b.r(inflate, R.id.layout_loadable_list);
        if (r8 != null) {
            p1 a3 = p1.a(r8);
            View r9 = E2.b.r(inflate, R.id.layout_top_bar);
            if (r9 != null) {
                A4.d a4 = A4.d.a(r9);
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                F3.e eVar = new F3.e(coordinatorLayout, a3, a4, 0);
                ((MaterialTextView) a4.f298h).setText(R.string.dialog_title_events_toggle);
                X.Q(a4, C2.a.f583f, 0);
                X.Q(a4, C2.a.f582e, 8);
                final int i8 = 0;
                A((MaterialButton) a4.f299i, new InterfaceC1163b(this) { // from class: Z3.b

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ C0372g f7366e;

                    {
                        this.f7366e = this;
                    }

                    @Override // n6.InterfaceC1163b
                    public final Object m(Object obj) {
                        C0880a c0880a;
                        C0880a c0880a2;
                        View view = (View) obj;
                        switch (i8) {
                            case 0:
                                o6.j.e(view, "it");
                                C0372g c0372g = this.f7366e;
                                W4.i iVar = c0372g.f7375u;
                                C0376k c0376k = (C0376k) c0372g.f7376v.getValue();
                                H3.n nVar = c0376k.f7385b;
                                Map map = (Map) c0376k.f7386c.f();
                                ArrayList arrayList = new ArrayList();
                                for (Map.Entry entry : map.entrySet()) {
                                    C0999a c0999a = (C0999a) entry.getKey();
                                    Z5.j jVar = (Z5.j) entry.getValue();
                                    C0999a c0999a2 = (C0999a) jVar.f7485d;
                                    f2.n nVar2 = (f2.n) jVar.f7486e;
                                    if (nVar2 == null) {
                                        c0880a2 = null;
                                    } else {
                                        if (c0999a2 != null) {
                                            H3.b bVar = nVar.f1949d;
                                            bVar.getClass();
                                            c0880a = new C0880a(c0999a2, bVar.g(), c0999a, nVar2);
                                        } else {
                                            H3.b bVar2 = nVar.f1949d;
                                            c0880a = new C0880a(((C1000b) bVar2.f1908m).a(), bVar2.g(), c0999a, nVar2);
                                        }
                                        c0880a2 = c0880a;
                                    }
                                    if (c0880a2 != null) {
                                        arrayList.add(c0880a2);
                                    }
                                }
                                iVar.m(arrayList);
                                c0372g.a();
                                break;
                            default:
                                o6.j.e(view, "it");
                                this.f7366e.a();
                                break;
                        }
                        return Z5.y.f7506a;
                    }
                });
                final int i9 = 1;
                A((MaterialButton) a4.f297g, new InterfaceC1163b(this) { // from class: Z3.b

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ C0372g f7366e;

                    {
                        this.f7366e = this;
                    }

                    @Override // n6.InterfaceC1163b
                    public final Object m(Object obj) {
                        C0880a c0880a;
                        C0880a c0880a2;
                        View view = (View) obj;
                        switch (i9) {
                            case 0:
                                o6.j.e(view, "it");
                                C0372g c0372g = this.f7366e;
                                W4.i iVar = c0372g.f7375u;
                                C0376k c0376k = (C0376k) c0372g.f7376v.getValue();
                                H3.n nVar = c0376k.f7385b;
                                Map map = (Map) c0376k.f7386c.f();
                                ArrayList arrayList = new ArrayList();
                                for (Map.Entry entry : map.entrySet()) {
                                    C0999a c0999a = (C0999a) entry.getKey();
                                    Z5.j jVar = (Z5.j) entry.getValue();
                                    C0999a c0999a2 = (C0999a) jVar.f7485d;
                                    f2.n nVar2 = (f2.n) jVar.f7486e;
                                    if (nVar2 == null) {
                                        c0880a2 = null;
                                    } else {
                                        if (c0999a2 != null) {
                                            H3.b bVar = nVar.f1949d;
                                            bVar.getClass();
                                            c0880a = new C0880a(c0999a2, bVar.g(), c0999a, nVar2);
                                        } else {
                                            H3.b bVar2 = nVar.f1949d;
                                            c0880a = new C0880a(((C1000b) bVar2.f1908m).a(), bVar2.g(), c0999a, nVar2);
                                        }
                                        c0880a2 = c0880a;
                                    }
                                    if (c0880a2 != null) {
                                        arrayList.add(c0880a2);
                                    }
                                }
                                iVar.m(arrayList);
                                c0372g.a();
                                break;
                            default:
                                o6.j.e(view, "it");
                                this.f7366e.a();
                                break;
                        }
                        return Z5.y.f7506a;
                    }
                });
                this.f7378x = new R4.d(new A1.o(2, (C0376k) this.f7376v.getValue(), C0376k.class, "changeEventToggleState", "changeEventToggleState(Lcom/buzbuz/smartautoclicker/core/base/identifier/Identifier;Lcom/buzbuz/smartautoclicker/core/domain/model/action/ToggleEvent$ToggleType;)V", 0, 0, 8));
                E2.c.p0(a3, R.string.message_empty_screen_event_title, null);
                RecyclerView recyclerView = (RecyclerView) a3.j;
                Context context = recyclerView.getContext();
                o6.j.d(context, "getContext(...)");
                recyclerView.i(E2.b.C(context));
                R4.d dVar = this.f7378x;
                if (dVar != null) {
                    recyclerView.setAdapter(dVar);
                    this.f7377w = eVar;
                    o6.j.d(coordinatorLayout, "getRoot(...)");
                    return coordinatorLayout;
                }
                o6.j.i("eventToggleAdapter");
                throw null;
            }
            i4 = R.id.layout_top_bar;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // z1.b
    public final void F(DialogC1035e dialogC1035e) {
        AbstractC0166y.q(U.e(this), null, null, new C0370e(this, null), 3);
    }
}
