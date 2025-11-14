package i;

import C6.h0;
import P.U;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import g0.b0;
import h.AbstractC0805a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.C1045h;
import m.C1046i;
import o.InterfaceC1181c;
import o.InterfaceC1196j0;
import o.g1;
import o.l1;

/* loaded from: classes.dex */
public final class P extends AbstractC0862a implements InterfaceC1181c {

    /* renamed from: b, reason: collision with root package name */
    public Context f11635b;

    /* renamed from: c, reason: collision with root package name */
    public Context f11636c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarOverlayLayout f11637d;

    /* renamed from: e, reason: collision with root package name */
    public ActionBarContainer f11638e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1196j0 f11639f;

    /* renamed from: g, reason: collision with root package name */
    public ActionBarContextView f11640g;

    /* renamed from: h, reason: collision with root package name */
    public final View f11641h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11642i;
    public O j;
    public O k;

    /* renamed from: l, reason: collision with root package name */
    public R3.r f11643l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11644m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f11645n;

    /* renamed from: o, reason: collision with root package name */
    public int f11646o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f11647p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11648q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f11649r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11650s;

    /* renamed from: t, reason: collision with root package name */
    public C1046i f11651t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f11652u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f11653v;

    /* renamed from: w, reason: collision with root package name */
    public final N f11654w;

    /* renamed from: x, reason: collision with root package name */
    public final N f11655x;

    /* renamed from: y, reason: collision with root package name */
    public final W5.a f11656y;

    /* renamed from: z, reason: collision with root package name */
    public static final AccelerateInterpolator f11634z = new AccelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    public static final DecelerateInterpolator f11633A = new DecelerateInterpolator();

    public P(Activity activity, boolean z8) {
        new ArrayList();
        this.f11645n = new ArrayList();
        this.f11646o = 0;
        this.f11647p = true;
        this.f11650s = true;
        this.f11654w = new N(this, 0);
        this.f11655x = new N(this, 1);
        this.f11656y = new W5.a(16, this);
        View decorView = activity.getWindow().getDecorView();
        C(decorView);
        if (z8) {
            return;
        }
        this.f11641h = decorView.findViewById(R.id.content);
    }

    public final void B(boolean z8) {
        U i4;
        U u8;
        long j;
        if (z8) {
            if (!this.f11649r) {
                this.f11649r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f11637d;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                E(false);
            }
        } else if (this.f11649r) {
            this.f11649r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f11637d;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            E(false);
        }
        if (this.f11638e.isLaidOut()) {
            if (z8) {
                l1 l1Var = (l1) this.f11639f;
                i4 = P.O.a(l1Var.f13300a);
                i4.a(0.0f);
                i4.c(100L);
                i4.d(new C1045h(l1Var, 4));
                u8 = this.f11640g.i(0, 200L);
            } else {
                l1 l1Var2 = (l1) this.f11639f;
                U a3 = P.O.a(l1Var2.f13300a);
                a3.a(1.0f);
                a3.c(200L);
                a3.d(new C1045h(l1Var2, 0));
                i4 = this.f11640g.i(8, 100L);
                u8 = a3;
            }
            C1046i c1046i = new C1046i();
            ArrayList arrayList = c1046i.f12370a;
            arrayList.add(i4);
            View view = (View) i4.f4228a.get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = (View) u8.f4228a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            arrayList.add(u8);
            c1046i.b();
            return;
        }
        if (z8) {
            ((l1) this.f11639f).f13300a.setVisibility(4);
            this.f11640g.setVisibility(0);
        } else {
            ((l1) this.f11639f).f13300a.setVisibility(0);
            this.f11640g.setVisibility(8);
        }
    }

    public final void C(View view) {
        String str;
        InterfaceC1196j0 wrapper;
        boolean z8;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.buzbuz.smartautoclicker.R.id.decor_content_parent);
        this.f11637d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.buzbuz.smartautoclicker.R.id.action_bar);
        if (findViewById instanceof InterfaceC1196j0) {
            wrapper = (InterfaceC1196j0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.f11639f = wrapper;
        this.f11640g = (ActionBarContextView) view.findViewById(com.buzbuz.smartautoclicker.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.buzbuz.smartautoclicker.R.id.action_bar_container);
        this.f11638e = actionBarContainer;
        InterfaceC1196j0 interfaceC1196j0 = this.f11639f;
        if (interfaceC1196j0 != null && this.f11640g != null && actionBarContainer != null) {
            Context context = ((l1) interfaceC1196j0).f13300a.getContext();
            this.f11635b = context;
            if ((((l1) this.f11639f).f13301b & 4) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                this.f11642i = true;
            }
            int i4 = context.getApplicationInfo().targetSdkVersion;
            this.f11639f.getClass();
            D(context.getResources().getBoolean(com.buzbuz.smartautoclicker.R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.f11635b.obtainStyledAttributes(null, AbstractC0805a.f11275a, com.buzbuz.smartautoclicker.R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f11637d;
                if (actionBarOverlayLayout2.j) {
                    this.f11653v = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.f11638e;
                WeakHashMap weakHashMap = P.O.f4214a;
                P.F.k(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(P.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void D(boolean z8) {
        if (!z8) {
            ((l1) this.f11639f).getClass();
            this.f11638e.setTabContainer(null);
        } else {
            this.f11638e.setTabContainer(null);
            ((l1) this.f11639f).getClass();
        }
        this.f11639f.getClass();
        ((l1) this.f11639f).f13300a.setCollapsible(false);
        this.f11637d.setHasNonEmbeddedTabs(false);
    }

    public final void E(boolean z8) {
        boolean z9 = this.f11648q;
        boolean z10 = this.f11649r;
        I1.a aVar = null;
        W5.a aVar2 = this.f11656y;
        View view = this.f11641h;
        if (!z10 && z9) {
            if (this.f11650s) {
                this.f11650s = false;
                C1046i c1046i = this.f11651t;
                if (c1046i != null) {
                    c1046i.a();
                }
                int i4 = this.f11646o;
                N n3 = this.f11654w;
                if (i4 == 0 && (this.f11652u || z8)) {
                    this.f11638e.setAlpha(1.0f);
                    this.f11638e.setTransitioning(true);
                    C1046i c1046i2 = new C1046i();
                    float f8 = -this.f11638e.getHeight();
                    if (z8) {
                        this.f11638e.getLocationInWindow(new int[]{0, 0});
                        f8 -= r12[1];
                    }
                    U a3 = P.O.a(this.f11638e);
                    a3.e(f8);
                    View view2 = (View) a3.f4228a.get();
                    if (view2 != null) {
                        if (aVar2 != null) {
                            aVar = new I1.a(aVar2, view2);
                        }
                        view2.animate().setUpdateListener(aVar);
                    }
                    boolean z11 = c1046i2.f12374e;
                    ArrayList arrayList = c1046i2.f12370a;
                    if (!z11) {
                        arrayList.add(a3);
                    }
                    if (this.f11647p && view != null) {
                        U a4 = P.O.a(view);
                        a4.e(f8);
                        if (!c1046i2.f12374e) {
                            arrayList.add(a4);
                        }
                    }
                    boolean z12 = c1046i2.f12374e;
                    if (!z12) {
                        c1046i2.f12372c = f11634z;
                    }
                    if (!z12) {
                        c1046i2.f12371b = 250L;
                    }
                    if (!z12) {
                        c1046i2.f12373d = n3;
                    }
                    this.f11651t = c1046i2;
                    c1046i2.b();
                    return;
                }
                n3.c();
                return;
            }
            return;
        }
        if (!this.f11650s) {
            this.f11650s = true;
            C1046i c1046i3 = this.f11651t;
            if (c1046i3 != null) {
                c1046i3.a();
            }
            this.f11638e.setVisibility(0);
            int i8 = this.f11646o;
            N n8 = this.f11655x;
            if (i8 == 0 && (this.f11652u || z8)) {
                this.f11638e.setTranslationY(0.0f);
                float f9 = -this.f11638e.getHeight();
                if (z8) {
                    this.f11638e.getLocationInWindow(new int[]{0, 0});
                    f9 -= r12[1];
                }
                this.f11638e.setTranslationY(f9);
                C1046i c1046i4 = new C1046i();
                U a9 = P.O.a(this.f11638e);
                a9.e(0.0f);
                View view3 = (View) a9.f4228a.get();
                if (view3 != null) {
                    if (aVar2 != null) {
                        aVar = new I1.a(aVar2, view3);
                    }
                    view3.animate().setUpdateListener(aVar);
                }
                boolean z13 = c1046i4.f12374e;
                ArrayList arrayList2 = c1046i4.f12370a;
                if (!z13) {
                    arrayList2.add(a9);
                }
                if (this.f11647p && view != null) {
                    view.setTranslationY(f9);
                    U a10 = P.O.a(view);
                    a10.e(0.0f);
                    if (!c1046i4.f12374e) {
                        arrayList2.add(a10);
                    }
                }
                boolean z14 = c1046i4.f12374e;
                if (!z14) {
                    c1046i4.f12372c = f11633A;
                }
                if (!z14) {
                    c1046i4.f12371b = 250L;
                }
                if (!z14) {
                    c1046i4.f12373d = n8;
                }
                this.f11651t = c1046i4;
                c1046i4.b();
            } else {
                this.f11638e.setAlpha(1.0f);
                this.f11638e.setTranslationY(0.0f);
                if (this.f11647p && view != null) {
                    view.setTranslationY(0.0f);
                }
                n8.c();
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f11637d;
            if (actionBarOverlayLayout != null) {
                WeakHashMap weakHashMap = P.O.f4214a;
                P.D.c(actionBarOverlayLayout);
            }
        }
    }

    @Override // i.AbstractC0862a
    public final boolean b() {
        g1 g1Var;
        n.o oVar;
        InterfaceC1196j0 interfaceC1196j0 = this.f11639f;
        if (interfaceC1196j0 != null && (g1Var = ((l1) interfaceC1196j0).f13300a.f8472P) != null && g1Var.f13259e != null) {
            g1 g1Var2 = ((l1) interfaceC1196j0).f13300a.f8472P;
            if (g1Var2 == null) {
                oVar = null;
            } else {
                oVar = g1Var2.f13259e;
            }
            if (oVar != null) {
                oVar.collapseActionView();
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // i.AbstractC0862a
    public final void e(boolean z8) {
        if (z8 != this.f11644m) {
            this.f11644m = z8;
            ArrayList arrayList = this.f11645n;
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    @Override // i.AbstractC0862a
    public final int g() {
        return ((l1) this.f11639f).f13301b;
    }

    @Override // i.AbstractC0862a
    public final Context i() {
        if (this.f11636c == null) {
            TypedValue typedValue = new TypedValue();
            this.f11635b.getTheme().resolveAttribute(com.buzbuz.smartautoclicker.R.attr.actionBarWidgetTheme, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                this.f11636c = new ContextThemeWrapper(this.f11635b, i4);
            } else {
                this.f11636c = this.f11635b;
            }
        }
        return this.f11636c;
    }

    @Override // i.AbstractC0862a
    public final void m() {
        D(this.f11635b.getResources().getBoolean(com.buzbuz.smartautoclicker.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // i.AbstractC0862a
    public final boolean o(int i4, KeyEvent keyEvent) {
        n.m mVar;
        O o7 = this.j;
        if (o7 == null || (mVar = o7.f11631h) == null) {
            return false;
        }
        boolean z8 = true;
        if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() == 1) {
            z8 = false;
        }
        mVar.setQwertyMode(z8);
        return mVar.performShortcut(i4, keyEvent, 0);
    }

    @Override // i.AbstractC0862a
    public final void s(boolean z8) {
        if (!this.f11642i) {
            t(z8);
        }
    }

    @Override // i.AbstractC0862a
    public final void t(boolean z8) {
        int i4;
        if (z8) {
            i4 = 4;
        } else {
            i4 = 0;
        }
        l1 l1Var = (l1) this.f11639f;
        int i8 = l1Var.f13301b;
        this.f11642i = true;
        l1Var.a((i4 & 4) | (i8 & (-5)));
    }

    @Override // i.AbstractC0862a
    public final void u() {
        l1 l1Var = (l1) this.f11639f;
        l1Var.a((l1Var.f13301b & (-3)) | 2);
    }

    @Override // i.AbstractC0862a
    public final void v(boolean z8) {
        C1046i c1046i;
        this.f11652u = z8;
        if (!z8 && (c1046i = this.f11651t) != null) {
            c1046i.a();
        }
    }

    @Override // i.AbstractC0862a
    public final void x(CharSequence charSequence) {
        l1 l1Var = (l1) this.f11639f;
        if (!l1Var.f13306g) {
            Toolbar toolbar = l1Var.f13300a;
            l1Var.f13307h = charSequence;
            if ((l1Var.f13301b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (l1Var.f13306g) {
                    P.O.n(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // i.AbstractC0862a
    public final h0 y(R3.r rVar) {
        O o7 = this.j;
        if (o7 != null) {
            o7.b();
        }
        this.f11637d.setHideOnContentScrollEnabled(false);
        this.f11640g.e();
        O o8 = new O(this, this.f11640g.getContext(), rVar);
        n.m mVar = o8.f11631h;
        mVar.w();
        try {
            if (((b0) o8.f11632i.f5082e).q(o8, mVar)) {
                this.j = o8;
                o8.i();
                this.f11640g.c(o8);
                B(true);
                return o8;
            }
            return null;
        } finally {
            mVar.v();
        }
    }

    public P(Dialog dialog) {
        new ArrayList();
        this.f11645n = new ArrayList();
        this.f11646o = 0;
        this.f11647p = true;
        this.f11650s = true;
        this.f11654w = new N(this, 0);
        this.f11655x = new N(this, 1);
        this.f11656y = new W5.a(16, this);
        C(dialog.getWindow().getDecorView());
    }
}
