package B1;

import A5.i;
import A5.q;
import Z5.y;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.EnumC0504o;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigationrail.NavigationRailView;
import g0.b0;
import h5.C0833a;
import h5.C0835c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import l5.DialogC1035e;
import n6.InterfaceC1163b;
import o6.j;

/* loaded from: classes.dex */
public abstract class c extends z1.b {

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashMap f424u;

    /* renamed from: v, reason: collision with root package name */
    public b0 f425v;

    /* renamed from: w, reason: collision with root package name */
    public q f426w;

    /* renamed from: x, reason: collision with root package name */
    public A4.c f427x;

    /* renamed from: y, reason: collision with root package name */
    public A4.d f428y;

    public c(int i4) {
        super(Integer.valueOf(i4));
        this.f424u = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [g0.b0, java.lang.Object] */
    @Override // z1.b
    public ViewGroup E() {
        A4.c cVar;
        View inflate = LayoutInflater.from(k()).inflate(R.layout.dialog_base_nav_bar, (ViewGroup) null, false);
        View r8 = E2.b.r(inflate, R.id.create_copy_buttons);
        if (r8 != null) {
            cVar = A4.c.b(r8);
        } else {
            cVar = null;
        }
        int i4 = R.id.dialog_content;
        FrameLayout frameLayout = (FrameLayout) E2.b.r(inflate, R.id.dialog_content);
        if (frameLayout != null) {
            i4 = R.id.layout_top_bar;
            View r9 = E2.b.r(inflate, R.id.layout_top_bar);
            if (r9 != null) {
                A4.d a3 = A4.d.a(r9);
                NavigationRailView navigationRailView = (NavigationRailView) E2.b.r(inflate, R.id.nav_bar);
                ?? obj = new Object();
                obj.f10987d = (LinearLayout) inflate;
                obj.f10988e = cVar;
                obj.f10989f = frameLayout;
                obj.f10990g = navigationRailView;
                final int i8 = 0;
                A((MaterialButton) a3.f299i, new InterfaceC1163b(this) { // from class: B1.a

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ c f421e;

                    {
                        this.f421e = this;
                    }

                    @Override // n6.InterfaceC1163b
                    public final Object m(Object obj2) {
                        View view = (View) obj2;
                        switch (i8) {
                            case 0:
                                j.e(view, "it");
                                this.f421e.J(C2.a.f583f);
                                break;
                            case 1:
                                j.e(view, "it");
                                this.f421e.J(C2.a.f581d);
                                break;
                            default:
                                j.e(view, "it");
                                this.f421e.J(C2.a.f582e);
                                break;
                        }
                        return y.f7506a;
                    }
                });
                final int i9 = 1;
                A((MaterialButton) a3.f297g, new InterfaceC1163b(this) { // from class: B1.a

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ c f421e;

                    {
                        this.f421e = this;
                    }

                    @Override // n6.InterfaceC1163b
                    public final Object m(Object obj2) {
                        View view = (View) obj2;
                        switch (i9) {
                            case 0:
                                j.e(view, "it");
                                this.f421e.J(C2.a.f583f);
                                break;
                            case 1:
                                j.e(view, "it");
                                this.f421e.J(C2.a.f581d);
                                break;
                            default:
                                j.e(view, "it");
                                this.f421e.J(C2.a.f582e);
                                break;
                        }
                        return y.f7506a;
                    }
                });
                final int i10 = 2;
                A((MaterialButton) a3.f296f, new InterfaceC1163b(this) { // from class: B1.a

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ c f421e;

                    {
                        this.f421e = this;
                    }

                    @Override // n6.InterfaceC1163b
                    public final Object m(Object obj2) {
                        View view = (View) obj2;
                        switch (i10) {
                            case 0:
                                j.e(view, "it");
                                this.f421e.J(C2.a.f583f);
                                break;
                            case 1:
                                j.e(view, "it");
                                this.f421e.J(C2.a.f581d);
                                break;
                            default:
                                j.e(view, "it");
                                this.f421e.J(C2.a.f582e);
                                break;
                        }
                        return y.f7506a;
                    }
                });
                this.f425v = obj;
                this.f428y = a3;
                if (l().f7104e.f7095b == 1) {
                    View inflate2 = LayoutInflater.from(k()).inflate(R.layout.view_bottom_nav_bar, (ViewGroup) null, false);
                    if (inflate2 != null) {
                        this.f426w = (BottomNavigationView) inflate2;
                        this.f427x = A4.c.b(LayoutInflater.from(k()).inflate(R.layout.include_create_copy_buttons, (ViewGroup) null, false));
                    } else {
                        throw new NullPointerException("rootView");
                    }
                } else {
                    b0 b0Var = this.f425v;
                    if (b0Var != null) {
                        NavigationRailView navigationRailView2 = (NavigationRailView) b0Var.f10990g;
                        if (navigationRailView2 != null) {
                            this.f426w = navigationRailView2;
                            if (b0Var != null) {
                                A4.c cVar2 = (A4.c) b0Var.f10988e;
                                if (cVar2 != null) {
                                    this.f427x = cVar2;
                                } else {
                                    throw new IllegalStateException("Landscape layout must contains a create copy buttons");
                                }
                            } else {
                                j.i("baseViewBinding");
                                throw null;
                            }
                        } else {
                            throw new IllegalStateException("Landscape layout must contains a NavigationRailView");
                        }
                    } else {
                        j.i("baseViewBinding");
                        throw null;
                    }
                }
                q H2 = H();
                K(H2);
                H2.setOnItemSelectedListener(new b(0, this));
                b0 b0Var2 = this.f425v;
                if (b0Var2 != null) {
                    LinearLayout linearLayout = (LinearLayout) b0Var2.f10987d;
                    j.d(linearLayout, "getRoot(...)");
                    return linearLayout;
                }
                j.i("baseViewBinding");
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // z1.b
    public void F(DialogC1035e dialogC1035e) {
        CoordinatorLayout coordinatorLayout;
        if (l().f7104e.f7095b == 1 && (coordinatorLayout = this.f16620t) != null) {
            q H2 = H();
            C.f fVar = new C.f(-1);
            fVar.f534c = 80;
            coordinatorLayout.addView(H2, fVar);
            LinearLayout linearLayout = (LinearLayout) G().f291e;
            C.f fVar2 = new C.f(-2);
            fVar2.f534c = 8388693;
            coordinatorLayout.addView(linearLayout, fVar2);
        }
        P(H().getSelectedItemId(), true);
    }

    public final A4.c G() {
        A4.c cVar = this.f427x;
        if (cVar != null) {
            return cVar;
        }
        j.i("createCopyButtons");
        throw null;
    }

    public final q H() {
        q qVar = this.f426w;
        if (qVar != null) {
            return qVar;
        }
        j.i("navBarView");
        throw null;
    }

    public final A4.d I() {
        A4.d dVar = this.f428y;
        if (dVar != null) {
            return dVar;
        }
        j.i("topBarBinding");
        throw null;
    }

    public final void J(C2.a aVar) {
        Iterator it = this.f424u.values().iterator();
        while (it.hasNext()) {
            ((h) it.next()).o(aVar);
        }
        N(aVar);
    }

    public abstract void K(q qVar);

    public abstract h M(int i4);

    public abstract void N(C2.a aVar);

    public final void O(int i4, boolean z8) {
        i iVar = H().f383e;
        iVar.getClass();
        if (i4 != -1) {
            SparseArray sparseArray = iVar.f369v;
            C0833a c0833a = (C0833a) sparseArray.get(i4);
            A5.f fVar = null;
            if (c0833a == null) {
                C0833a c0833a2 = new C0833a(iVar.getContext(), null);
                sparseArray.put(i4, c0833a2);
                c0833a = c0833a2;
            }
            C0835c c0835c = c0833a.f11376h;
            if (i4 != -1) {
                A5.f[] fVarArr = iVar.f358i;
                if (fVarArr != null) {
                    int length = fVarArr.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            break;
                        }
                        A5.f fVar2 = fVarArr[i8];
                        if (fVar2.getId() == i4) {
                            fVar = fVar2;
                            break;
                        }
                        i8++;
                    }
                }
                if (fVar != null) {
                    fVar.setBadge(c0833a);
                }
                c0835c.f11411a.f11407w = Boolean.valueOf(z8);
                c0835c.f11412b.f11407w = Boolean.valueOf(z8);
                c0833a.setVisible(c0835c.f11412b.f11407w.booleanValue(), false);
                return;
            }
            throw new IllegalArgumentException(i4 + " is not a valid view id");
        }
        throw new IllegalArgumentException(i4 + " is not a valid view id");
    }

    public final void P(int i4, boolean z8) {
        int i8;
        if (z8 || H().getSelectedItemId() != i4) {
            Integer valueOf = Integer.valueOf(H().getSelectedItemId());
            LinkedHashMap linkedHashMap = this.f424u;
            h hVar = (h) linkedHashMap.get(valueOf);
            if (hVar != null) {
                hVar.r();
                hVar.s();
            }
            final h hVar2 = (h) linkedHashMap.get(Integer.valueOf(i4));
            EnumC0504o enumC0504o = EnumC0504o.f8848f;
            if (hVar2 == null) {
                hVar2 = M(i4);
                b0 b0Var = this.f425v;
                if (b0Var != null) {
                    FrameLayout frameLayout = (FrameLayout) b0Var.f10989f;
                    if (hVar2.k().f8862d == EnumC0504o.f8847e) {
                        hVar2.k = this;
                        hVar2.f441i = frameLayout;
                        hVar2.j = hVar2.n(frameLayout);
                        hVar2.k().g(enumC0504o);
                        hVar2.q();
                    }
                    linkedHashMap.put(Integer.valueOf(i4), hVar2);
                } else {
                    j.i("baseViewBinding");
                    throw null;
                }
            }
            EnumC0504o enumC0504o2 = hVar2.k().f8862d;
            EnumC0504o enumC0504o3 = EnumC0504o.f8849g;
            if (enumC0504o2 == enumC0504o) {
                ViewGroup viewGroup = hVar2.f441i;
                if (viewGroup != null) {
                    ViewGroup viewGroup2 = hVar2.j;
                    if (viewGroup2 != null) {
                        viewGroup.addView(viewGroup2);
                        if (hVar2.a()) {
                            A4.c G8 = hVar2.i().G();
                            final int i9 = 0;
                            ((FloatingActionButton) G8.f293g).setOnClickListener(new View.OnClickListener() { // from class: B1.g
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i9) {
                                        case 0:
                                            hVar2.m();
                                            return;
                                        default:
                                            hVar2.l();
                                            return;
                                    }
                                }
                            });
                            final int i10 = 1;
                            ((FloatingActionButton) G8.f292f).setOnClickListener(new View.OnClickListener() { // from class: B1.g
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i10) {
                                        case 0:
                                            hVar2.m();
                                            return;
                                        default:
                                            hVar2.l();
                                            return;
                                    }
                                }
                            });
                        }
                        hVar2.k().g(enumC0504o3);
                    } else {
                        j.i("root");
                        throw null;
                    }
                } else {
                    j.i("rootContainer");
                    throw null;
                }
            }
            L(i4);
            LinearLayout linearLayout = (LinearLayout) G().f291e;
            if (hVar2.a()) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            linearLayout.setVisibility(i8);
            EnumC0504o enumC0504o4 = this.j.f8862d;
            EnumC0504o enumC0504o5 = EnumC0504o.f8850h;
            if (enumC0504o4.compareTo(enumC0504o5) < 0 || hVar2.k().f8862d != enumC0504o3) {
                return;
            }
            hVar2.k().g(enumC0504o5);
        }
    }

    @Override // z1.b, w1.e
    public final void q() {
        LinkedHashMap linkedHashMap = this.f424u;
        for (h hVar : linkedHashMap.values()) {
            if (hVar.k().f8862d.compareTo(EnumC0504o.f8848f) >= 0) {
                hVar.r();
                hVar.s();
                hVar.k().g(EnumC0504o.f8846d);
                hVar.f().a();
            }
        }
        linkedHashMap.clear();
        super.q();
    }

    @Override // z1.b, w1.e
    public final void v() {
        super.v();
        h hVar = (h) this.f424u.get(Integer.valueOf(H().getSelectedItemId()));
        if (hVar != null && hVar.k().f8862d == EnumC0504o.f8849g) {
            hVar.k().g(EnumC0504o.f8850h);
        }
    }

    @Override // z1.b, w1.e
    public final void w() {
        super.w();
        h hVar = (h) this.f424u.get(Integer.valueOf(H().getSelectedItemId()));
        if (hVar != null) {
            hVar.r();
        }
    }

    public void L(int i4) {
    }
}
