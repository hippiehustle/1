package i;

import C6.h0;
import P.InterfaceC0262j;
import P.U;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.InterfaceC0510v;
import h.AbstractC0805a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import m.C1039b;
import m.C1044g;
import o.C1187f;
import o.C1197k;
import o.C1216u;
import o.InterfaceC1194i0;
import o.l1;
import o.t1;

/* renamed from: i.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0860C extends AbstractC0877p implements n.k, LayoutInflater.Factory2 {

    /* renamed from: k0, reason: collision with root package name */
    public static final t.j f11547k0 = new t.j(0);

    /* renamed from: l0, reason: collision with root package name */
    public static final int[] f11548l0 = {R.attr.windowBackground};

    /* renamed from: m0, reason: collision with root package name */
    public static final boolean f11549m0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public q f11550A;

    /* renamed from: C, reason: collision with root package name */
    public boolean f11552C;

    /* renamed from: D, reason: collision with root package name */
    public ViewGroup f11553D;

    /* renamed from: E, reason: collision with root package name */
    public TextView f11554E;

    /* renamed from: F, reason: collision with root package name */
    public View f11555F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f11556G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f11557H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f11558I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f11559J;
    public boolean K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f11560L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f11561M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f11562N;

    /* renamed from: O, reason: collision with root package name */
    public C0859B[] f11563O;

    /* renamed from: P, reason: collision with root package name */
    public C0859B f11564P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f11565Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f11566R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f11567S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f11568T;

    /* renamed from: U, reason: collision with root package name */
    public Configuration f11569U;

    /* renamed from: V, reason: collision with root package name */
    public final int f11570V;

    /* renamed from: W, reason: collision with root package name */
    public int f11571W;

    /* renamed from: X, reason: collision with root package name */
    public int f11572X;
    public boolean Y;

    /* renamed from: Z, reason: collision with root package name */
    public y f11573Z;

    /* renamed from: a0, reason: collision with root package name */
    public y f11574a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f11575b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f11576c0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f11578e0;

    /* renamed from: f0, reason: collision with root package name */
    public Rect f11579f0;

    /* renamed from: g0, reason: collision with root package name */
    public Rect f11580g0;

    /* renamed from: h0, reason: collision with root package name */
    public G f11581h0;

    /* renamed from: i0, reason: collision with root package name */
    public OnBackInvokedDispatcher f11582i0;
    public OnBackInvokedCallback j0;

    /* renamed from: m, reason: collision with root package name */
    public final Object f11583m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f11584n;

    /* renamed from: o, reason: collision with root package name */
    public Window f11585o;

    /* renamed from: p, reason: collision with root package name */
    public x f11586p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f11587q;

    /* renamed from: r, reason: collision with root package name */
    public AbstractC0862a f11588r;

    /* renamed from: s, reason: collision with root package name */
    public C1044g f11589s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f11590t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC1194i0 f11591u;

    /* renamed from: v, reason: collision with root package name */
    public r f11592v;

    /* renamed from: w, reason: collision with root package name */
    public s f11593w;

    /* renamed from: x, reason: collision with root package name */
    public h0 f11594x;

    /* renamed from: y, reason: collision with root package name */
    public ActionBarContextView f11595y;

    /* renamed from: z, reason: collision with root package name */
    public PopupWindow f11596z;

    /* renamed from: B, reason: collision with root package name */
    public U f11551B = null;

    /* renamed from: d0, reason: collision with root package name */
    public final q f11577d0 = new q(this, 0);

    public LayoutInflaterFactory2C0860C(Context context, Window window, InterfaceC0871j interfaceC0871j, Object obj) {
        AbstractActivityC0870i abstractActivityC0870i = null;
        this.f11570V = -100;
        this.f11584n = context;
        this.f11587q = interfaceC0871j;
        this.f11583m = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof AbstractActivityC0870i) {
                        abstractActivityC0870i = (AbstractActivityC0870i) context;
                        break;
                    } else if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    break;
                }
            }
            if (abstractActivityC0870i != null) {
                this.f11570V = ((LayoutInflaterFactory2C0860C) abstractActivityC0870i.n()).f11570V;
            }
        }
        if (this.f11570V == -100) {
            String name = this.f11583m.getClass().getName();
            t.j jVar = f11547k0;
            Integer num = (Integer) jVar.get(name);
            if (num != null) {
                this.f11570V = num.intValue();
                jVar.remove(this.f11583m.getClass().getName());
            }
        }
        if (window != null) {
            m(window);
        }
        C1216u.d();
    }

    public static L.d n(Context context) {
        L.d dVar;
        L.d dVar2;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 33 || (dVar = AbstractC0877p.f11724f) == null) {
            return null;
        }
        L.e eVar = dVar.f2743a;
        L.d b4 = v.b(context.getApplicationContext().getResources().getConfiguration());
        if (eVar.f2744a.isEmpty()) {
            dVar2 = L.d.f2742b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i4 = 0; i4 < b4.f2743a.f2744a.size() + eVar.f2744a.size(); i4++) {
                if (i4 < eVar.f2744a.size()) {
                    locale = eVar.f2744a.get(i4);
                } else {
                    locale = b4.f2743a.f2744a.get(i4 - eVar.f2744a.size());
                }
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
            }
            dVar2 = new L.d(new L.e(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        if (dVar2.f2743a.f2744a.isEmpty()) {
            return b4;
        }
        return dVar2;
    }

    public static Configuration r(Context context, int i4, L.d dVar, Configuration configuration, boolean z8) {
        int i8;
        if (i4 != 1) {
            if (i4 != 2) {
                if (z8) {
                    i8 = 0;
                } else {
                    i8 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i8 = 32;
            }
        } else {
            i8 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i8 | (configuration2.uiMode & (-49));
        if (dVar != null) {
            v.d(configuration2, dVar);
        }
        return configuration2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.e() != false) goto L20;
     */
    @Override // n.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(n.m mVar) {
        ActionMenuView actionMenuView;
        C1197k c1197k;
        InterfaceC1194i0 interfaceC1194i0 = this.f11591u;
        if (interfaceC1194i0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1194i0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((l1) actionBarOverlayLayout.f8373h).f13300a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f8480d) != null && actionMenuView.f8397v) {
                if (ViewConfiguration.get(this.f11584n).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f11591u;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((l1) actionBarOverlayLayout2.f8373h).f13300a.f8480d;
                    if (actionMenuView2 != null) {
                        C1197k c1197k2 = actionMenuView2.f8398w;
                        if (c1197k2 != null) {
                            if (c1197k2.f13290y == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f11585o.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f11591u;
                actionBarOverlayLayout3.k();
                if (((l1) actionBarOverlayLayout3.f8373h).f13300a.p()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f11591u;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView3 = ((l1) actionBarOverlayLayout4.f8373h).f13300a.f8480d;
                    if (actionMenuView3 != null && (c1197k = actionMenuView3.f8398w) != null) {
                        c1197k.c();
                    }
                    if (!this.f11568T) {
                        callback.onPanelClosed(108, x(0).f11540h);
                        return;
                    }
                    return;
                }
                if (callback != null && !this.f11568T) {
                    if (this.f11575b0 && (1 & this.f11576c0) != 0) {
                        View decorView = this.f11585o.getDecorView();
                        q qVar = this.f11577d0;
                        decorView.removeCallbacks(qVar);
                        qVar.run();
                    }
                    C0859B x8 = x(0);
                    n.m mVar2 = x8.f11540h;
                    if (mVar2 != null && !x8.f11545o && callback.onPreparePanel(0, x8.f11539g, mVar2)) {
                        callback.onMenuOpened(108, x8.f11540h);
                        ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f11591u;
                        actionBarOverlayLayout5.k();
                        ((l1) actionBarOverlayLayout5.f8373h).f13300a.v();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        C0859B x9 = x(0);
        x9.f11544n = true;
        q(x9, false);
        E(x9, null);
    }

    public final void B(int i4) {
        this.f11576c0 = (1 << i4) | this.f11576c0;
        if (!this.f11575b0) {
            View decorView = this.f11585o.getDecorView();
            WeakHashMap weakHashMap = P.O.f4214a;
            decorView.postOnAnimation(this.f11577d0);
            this.f11575b0 = true;
        }
    }

    public final int C(Context context, int i4) {
        if (i4 != -100) {
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != 1 && i4 != 2) {
                        if (i4 == 3) {
                            if (this.f11574a0 == null) {
                                this.f11574a0 = new y(this, context);
                            }
                            return this.f11574a0.f();
                        }
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return w(context).f();
                }
            }
            return i4;
        }
        return -1;
    }

    public final boolean D() {
        boolean z8 = this.f11565Q;
        this.f11565Q = false;
        C0859B x8 = x(0);
        if (x8.f11543m) {
            if (!z8) {
                q(x8, true);
                return true;
            }
        } else {
            h0 h0Var = this.f11594x;
            if (h0Var != null) {
                h0Var.b();
                return true;
            }
            y();
            AbstractC0862a abstractC0862a = this.f11588r;
            if (abstractC0862a == null || !abstractC0862a.b()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0175, code lost:
    
        if (r2.f12633i.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0155, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(C0859B c0859b, KeyEvent keyEvent) {
        Context context;
        int i4;
        ViewGroup.LayoutParams layoutParams;
        boolean z8 = c0859b.f11543m;
        int i8 = c0859b.f11533a;
        if (!z8 && !this.f11568T) {
            Context context2 = this.f11584n;
            if (i8 != 0 || (context2.getResources().getConfiguration().screenLayout & 15) != 4) {
                Window.Callback callback = this.f11585o.getCallback();
                if (callback != null && !callback.onMenuOpened(i8, c0859b.f11540h)) {
                    q(c0859b, true);
                    return;
                }
                WindowManager windowManager = (WindowManager) context2.getSystemService("window");
                if (windowManager != null && G(c0859b, keyEvent)) {
                    C0858A c0858a = c0859b.f11537e;
                    if (c0858a != null && !c0859b.f11544n) {
                        View view = c0859b.f11539g;
                        if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                            i4 = -1;
                            c0859b.f11542l = false;
                            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i4, -2, 0, 0, 1002, 8519680, -3);
                            layoutParams2.gravity = c0859b.f11535c;
                            layoutParams2.windowAnimations = c0859b.f11536d;
                            windowManager.addView(c0859b.f11537e, layoutParams2);
                            c0859b.f11543m = true;
                            if (i8 != 0) {
                                I();
                                return;
                            }
                            return;
                        }
                    } else {
                        if (c0858a == null) {
                            y();
                            AbstractC0862a abstractC0862a = this.f11588r;
                            if (abstractC0862a != null) {
                                context = abstractC0862a.i();
                            } else {
                                context = null;
                            }
                            if (context != null) {
                                context2 = context;
                            }
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme newTheme = context2.getResources().newTheme();
                            newTheme.setTo(context2.getTheme());
                            newTheme.resolveAttribute(com.buzbuz.smartautoclicker.R.attr.actionBarPopupTheme, typedValue, true);
                            int i9 = typedValue.resourceId;
                            if (i9 != 0) {
                                newTheme.applyStyle(i9, true);
                            }
                            newTheme.resolveAttribute(com.buzbuz.smartautoclicker.R.attr.panelMenuListTheme, typedValue, true);
                            int i10 = typedValue.resourceId;
                            if (i10 != 0) {
                                newTheme.applyStyle(i10, true);
                            } else {
                                newTheme.applyStyle(com.buzbuz.smartautoclicker.R.style.Theme_AppCompat_CompactMenu, true);
                            }
                            C1039b c1039b = new C1039b(context2, 0);
                            c1039b.getTheme().setTo(newTheme);
                            c0859b.j = c1039b;
                            TypedArray obtainStyledAttributes = c1039b.obtainStyledAttributes(AbstractC0805a.j);
                            c0859b.f11534b = obtainStyledAttributes.getResourceId(86, 0);
                            c0859b.f11536d = obtainStyledAttributes.getResourceId(1, 0);
                            obtainStyledAttributes.recycle();
                            c0859b.f11537e = new C0858A(this, c0859b.j);
                            c0859b.f11535c = 81;
                        } else if (c0859b.f11544n && c0858a.getChildCount() > 0) {
                            c0859b.f11537e.removeAllViews();
                        }
                        View view2 = c0859b.f11539g;
                        if (view2 != null) {
                            c0859b.f11538f = view2;
                        } else {
                            if (c0859b.f11540h != null) {
                                if (this.f11593w == null) {
                                    this.f11593w = new s(this);
                                }
                                s sVar = this.f11593w;
                                if (c0859b.f11541i == null) {
                                    n.i iVar = new n.i(c0859b.j);
                                    c0859b.f11541i = iVar;
                                    iVar.f12632h = sVar;
                                    n.m mVar = c0859b.f11540h;
                                    mVar.b(iVar, mVar.f12641a);
                                }
                                n.i iVar2 = c0859b.f11541i;
                                C0858A c0858a2 = c0859b.f11537e;
                                if (iVar2.f12631g == null) {
                                    iVar2.f12631g = (ExpandedMenuView) iVar2.f12629e.inflate(com.buzbuz.smartautoclicker.R.layout.abc_expanded_menu_layout, (ViewGroup) c0858a2, false);
                                    if (iVar2.f12633i == null) {
                                        iVar2.f12633i = new n.h(iVar2);
                                    }
                                    iVar2.f12631g.setAdapter((ListAdapter) iVar2.f12633i);
                                    iVar2.f12631g.setOnItemClickListener(iVar2);
                                }
                                ExpandedMenuView expandedMenuView = iVar2.f12631g;
                                c0859b.f11538f = expandedMenuView;
                            }
                            c0859b.f11544n = true;
                            return;
                        }
                        if (c0859b.f11538f != null) {
                            if (c0859b.f11539g == null) {
                                n.i iVar3 = c0859b.f11541i;
                                if (iVar3.f12633i == null) {
                                    iVar3.f12633i = new n.h(iVar3);
                                }
                            }
                            ViewGroup.LayoutParams layoutParams3 = c0859b.f11538f.getLayoutParams();
                            if (layoutParams3 == null) {
                                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            c0859b.f11537e.setBackgroundResource(c0859b.f11534b);
                            ViewParent parent = c0859b.f11538f.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(c0859b.f11538f);
                            }
                            c0859b.f11537e.addView(c0859b.f11538f, layoutParams3);
                            if (!c0859b.f11538f.hasFocus()) {
                                c0859b.f11538f.requestFocus();
                            }
                        }
                        c0859b.f11544n = true;
                        return;
                    }
                    i4 = -2;
                    c0859b.f11542l = false;
                    WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i4, -2, 0, 0, 1002, 8519680, -3);
                    layoutParams22.gravity = c0859b.f11535c;
                    layoutParams22.windowAnimations = c0859b.f11536d;
                    windowManager.addView(c0859b.f11537e, layoutParams22);
                    c0859b.f11543m = true;
                    if (i8 != 0) {
                    }
                }
            }
        }
    }

    public final boolean F(C0859B c0859b, int i4, KeyEvent keyEvent) {
        n.m mVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!c0859b.k && !G(c0859b, keyEvent)) || (mVar = c0859b.f11540h) == null) {
            return false;
        }
        return mVar.performShortcut(i4, keyEvent, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d5, code lost:
    
        if (r13.f11540h == null) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G(C0859B c0859b, KeyEvent keyEvent) {
        boolean z8;
        InterfaceC1194i0 interfaceC1194i0;
        InterfaceC1194i0 interfaceC1194i02;
        Resources.Theme theme;
        int i4;
        boolean z9;
        InterfaceC1194i0 interfaceC1194i03;
        InterfaceC1194i0 interfaceC1194i04;
        if (!this.f11568T) {
            boolean z10 = c0859b.k;
            int i8 = c0859b.f11533a;
            if (z10) {
                return true;
            }
            C0859B c0859b2 = this.f11564P;
            if (c0859b2 != null && c0859b2 != c0859b) {
                q(c0859b2, false);
            }
            Window.Callback callback = this.f11585o.getCallback();
            if (callback != null) {
                c0859b.f11539g = callback.onCreatePanelView(i8);
            }
            if (i8 != 0 && i8 != 108) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (z8 && (interfaceC1194i04 = this.f11591u) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1194i04;
                actionBarOverlayLayout.k();
                ((l1) actionBarOverlayLayout.f8373h).f13309l = true;
            }
            if (c0859b.f11539g == null && (!z8 || !(this.f11588r instanceof K))) {
                n.m mVar = c0859b.f11540h;
                if (mVar == null || c0859b.f11545o) {
                    if (mVar == null) {
                        Context context = this.f11584n;
                        if ((i8 == 0 || i8 == 108) && this.f11591u != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(com.buzbuz.smartautoclicker.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(com.buzbuz.smartautoclicker.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(com.buzbuz.smartautoclicker.R.attr.actionBarWidgetTheme, typedValue, true);
                                theme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (theme == null) {
                                    theme = context.getResources().newTheme();
                                    theme.setTo(theme2);
                                }
                                theme.applyStyle(typedValue.resourceId, true);
                            }
                            if (theme != null) {
                                C1039b c1039b = new C1039b(context, 0);
                                c1039b.getTheme().setTo(theme);
                                context = c1039b;
                            }
                        }
                        n.m mVar2 = new n.m(context);
                        mVar2.f12645e = this;
                        n.m mVar3 = c0859b.f11540h;
                        if (mVar2 != mVar3) {
                            if (mVar3 != null) {
                                mVar3.r(c0859b.f11541i);
                            }
                            c0859b.f11540h = mVar2;
                            n.i iVar = c0859b.f11541i;
                            if (iVar != null) {
                                mVar2.b(iVar, mVar2.f12641a);
                            }
                        }
                    }
                    if (z8 && (interfaceC1194i02 = this.f11591u) != null) {
                        if (this.f11592v == null) {
                            this.f11592v = new r(this);
                        }
                        ((ActionBarOverlayLayout) interfaceC1194i02).l(c0859b.f11540h, this.f11592v);
                    }
                    c0859b.f11540h.w();
                    if (!callback.onCreatePanelMenu(i8, c0859b.f11540h)) {
                        n.m mVar4 = c0859b.f11540h;
                        if (mVar4 != null) {
                            if (mVar4 != null) {
                                mVar4.r(c0859b.f11541i);
                            }
                            c0859b.f11540h = null;
                        }
                        if (z8 && (interfaceC1194i0 = this.f11591u) != null) {
                            ((ActionBarOverlayLayout) interfaceC1194i0).l(null, this.f11592v);
                        }
                    } else {
                        c0859b.f11545o = false;
                    }
                }
                c0859b.f11540h.w();
                Bundle bundle = c0859b.f11546p;
                if (bundle != null) {
                    c0859b.f11540h.s(bundle);
                    c0859b.f11546p = null;
                }
                if (!callback.onPreparePanel(0, c0859b.f11539g, c0859b.f11540h)) {
                    if (z8 && (interfaceC1194i03 = this.f11591u) != null) {
                        ((ActionBarOverlayLayout) interfaceC1194i03).l(null, this.f11592v);
                    }
                    c0859b.f11540h.v();
                    return false;
                }
                if (keyEvent != null) {
                    i4 = keyEvent.getDeviceId();
                } else {
                    i4 = -1;
                }
                if (KeyCharacterMap.load(i4).getKeyboardType() != 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                c0859b.f11540h.setQwertyMode(z9);
                c0859b.f11540h.v();
            }
            c0859b.k = true;
            c0859b.f11542l = false;
            this.f11564P = c0859b;
            return true;
        }
        return false;
    }

    public final void H() {
        if (!this.f11552C) {
        } else {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void I() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z8 = false;
            if (this.f11582i0 != null && (x(0).f11543m || this.f11594x != null)) {
                z8 = true;
            }
            if (z8 && this.j0 == null) {
                this.j0 = w.b(this.f11582i0, this);
            } else if (!z8 && (onBackInvokedCallback = this.j0) != null) {
                w.c(this.f11582i0, onBackInvokedCallback);
                this.j0 = null;
            }
        }
    }

    @Override // i.AbstractC0877p
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f11584n);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof LayoutInflaterFactory2C0860C)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // i.AbstractC0877p
    public final void b() {
        if (this.f11588r != null) {
            y();
            if (!this.f11588r.k()) {
                B(0);
            }
        }
    }

    @Override // i.AbstractC0877p
    public final void d() {
        String str;
        this.f11566R = true;
        l(false, true);
        v();
        Object obj = this.f11583m;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = E.e.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e9) {
                    throw new IllegalArgumentException(e9);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                AbstractC0862a abstractC0862a = this.f11588r;
                if (abstractC0862a == null) {
                    this.f11578e0 = true;
                } else {
                    abstractC0862a.s(true);
                }
            }
            synchronized (AbstractC0877p.k) {
                AbstractC0877p.f(this);
                AbstractC0877p.j.add(new WeakReference(this));
            }
        }
        this.f11569U = new Configuration(this.f11584n.getResources().getConfiguration());
        this.f11567S = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // i.AbstractC0877p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        AbstractC0862a abstractC0862a;
        y yVar;
        y yVar2;
        if (this.f11583m instanceof Activity) {
            synchronized (AbstractC0877p.k) {
                AbstractC0877p.f(this);
            }
        }
        if (this.f11575b0) {
            this.f11585o.getDecorView().removeCallbacks(this.f11577d0);
        }
        this.f11568T = true;
        if (this.f11570V != -100) {
            Object obj = this.f11583m;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f11547k0.put(this.f11583m.getClass().getName(), Integer.valueOf(this.f11570V));
                abstractC0862a = this.f11588r;
                if (abstractC0862a != null) {
                    abstractC0862a.n();
                }
                yVar = this.f11573Z;
                if (yVar != null) {
                    yVar.c();
                }
                yVar2 = this.f11574a0;
                if (yVar2 == null) {
                    yVar2.c();
                    return;
                }
                return;
            }
        }
        f11547k0.remove(this.f11583m.getClass().getName());
        abstractC0862a = this.f11588r;
        if (abstractC0862a != null) {
        }
        yVar = this.f11573Z;
        if (yVar != null) {
        }
        yVar2 = this.f11574a0;
        if (yVar2 == null) {
        }
    }

    @Override // i.AbstractC0877p
    public final boolean g(int i4) {
        if (i4 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i4 = 108;
        } else if (i4 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i4 = 109;
        }
        if (this.f11561M && i4 == 108) {
            return false;
        }
        if (this.f11558I && i4 == 1) {
            this.f11558I = false;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 5) {
                    if (i4 != 10) {
                        if (i4 != 108) {
                            if (i4 != 109) {
                                return this.f11585o.requestFeature(i4);
                            }
                            H();
                            this.f11559J = true;
                            return true;
                        }
                        H();
                        this.f11558I = true;
                        return true;
                    }
                    H();
                    this.K = true;
                    return true;
                }
                H();
                this.f11557H = true;
                return true;
            }
            H();
            this.f11556G = true;
            return true;
        }
        H();
        this.f11561M = true;
        return true;
    }

    @Override // i.AbstractC0877p
    public final void h(int i4) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.f11553D.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f11584n).inflate(i4, viewGroup);
        this.f11586p.a(this.f11585o.getCallback());
    }

    @Override // i.AbstractC0877p
    public final void i(View view) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.f11553D.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f11586p.a(this.f11585o.getCallback());
    }

    @Override // i.AbstractC0877p
    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.f11553D.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f11586p.a(this.f11585o.getCallback());
    }

    @Override // i.AbstractC0877p
    public final void k(CharSequence charSequence) {
        this.f11590t = charSequence;
        InterfaceC1194i0 interfaceC1194i0 = this.f11591u;
        if (interfaceC1194i0 != null) {
            interfaceC1194i0.setWindowTitle(charSequence);
            return;
        }
        AbstractC0862a abstractC0862a = this.f11588r;
        if (abstractC0862a != null) {
            abstractC0862a.x(charSequence);
            return;
        }
        TextView textView = this.f11554E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(boolean z8, boolean z9) {
        L.d dVar;
        int i4;
        Configuration configuration;
        int i8;
        int i9;
        L.d b4;
        int i10;
        boolean z10;
        Object obj;
        Object obj2;
        Activity activity;
        int i11;
        int i12 = 0;
        if (this.f11568T) {
            return false;
        }
        int i13 = this.f11570V;
        if (i13 == -100) {
            i13 = AbstractC0877p.f11723e;
        }
        Context context = this.f11584n;
        int C8 = C(context, i13);
        int i14 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        if (i14 < 33) {
            dVar = n(context);
        } else {
            dVar = null;
        }
        if (!z9 && dVar != null) {
            dVar = v.b(context.getResources().getConfiguration());
        }
        Configuration r8 = r(context, C8, dVar, null, false);
        boolean z11 = this.Y;
        boolean z12 = true;
        Object obj3 = this.f11583m;
        if (!z11 && (obj3 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i4 = 0;
                configuration = this.f11569U;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                i8 = configuration.uiMode & 48;
                i9 = r8.uiMode & 48;
                L.d b9 = v.b(configuration);
                if (dVar != null) {
                    b4 = null;
                } else {
                    b4 = v.b(r8);
                }
                if (i8 == i9) {
                    i10 = 512;
                } else {
                    i10 = 0;
                }
                if (b4 != null && !b9.equals(b4)) {
                    i10 |= 8196;
                }
                if (((~i4) & i10) != 0 && z8 && this.f11566R && ((f11549m0 || this.f11567S) && (obj3 instanceof Activity))) {
                    activity = (Activity) obj3;
                    if (!activity.isChild()) {
                        int i15 = Build.VERSION.SDK_INT;
                        if (i15 >= 31 && (i10 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(r8.getLayoutDirection());
                        }
                        if (i15 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new E.a(i12, activity));
                        }
                        z10 = true;
                        if (z10 && i10 != 0) {
                            if ((i10 & i4) == i10) {
                                i12 = 1;
                            }
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i9;
                            if (b4 != null) {
                                v.d(configuration2, b4);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i16 = Build.VERSION.SDK_INT;
                            if (i16 < 26 && i16 < 28) {
                                if (!h2.a.f11331h) {
                                    try {
                                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                        h2.a.f11330g = declaredField;
                                        declaredField.setAccessible(true);
                                    } catch (NoSuchFieldException e9) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e9);
                                    }
                                    h2.a.f11331h = true;
                                }
                                Field field = h2.a.f11330g;
                                if (field != null) {
                                    try {
                                        obj = field.get(resources);
                                    } catch (IllegalAccessException e10) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e10);
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        if (!h2.a.f11325b) {
                                            try {
                                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                                h2.a.f11324a = declaredField2;
                                                declaredField2.setAccessible(true);
                                            } catch (NoSuchFieldException e11) {
                                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e11);
                                            }
                                            h2.a.f11325b = true;
                                        }
                                        Field field2 = h2.a.f11324a;
                                        if (field2 != null) {
                                            try {
                                                obj2 = field2.get(obj);
                                            } catch (IllegalAccessException e12) {
                                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e12);
                                            }
                                            if (obj2 != null) {
                                                if (!h2.a.f11327d) {
                                                    try {
                                                        h2.a.f11326c = Class.forName("android.content.res.ThemedResourceCache");
                                                    } catch (ClassNotFoundException e13) {
                                                        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e13);
                                                    }
                                                    h2.a.f11327d = true;
                                                }
                                                Class cls = h2.a.f11326c;
                                                if (cls != null) {
                                                    if (!h2.a.f11329f) {
                                                        try {
                                                            Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                                            h2.a.f11328e = declaredField3;
                                                            declaredField3.setAccessible(true);
                                                        } catch (NoSuchFieldException e14) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e14);
                                                        }
                                                        h2.a.f11329f = true;
                                                    }
                                                    Field field3 = h2.a.f11328e;
                                                    if (field3 != null) {
                                                        try {
                                                            longSparseArray = (LongSparseArray) field3.get(obj2);
                                                        } catch (IllegalAccessException e15) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e15);
                                                        }
                                                        if (longSparseArray != null) {
                                                            longSparseArray.clear();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = null;
                                        if (obj2 != null) {
                                        }
                                    }
                                }
                            }
                            int i17 = this.f11571W;
                            if (i17 != 0) {
                                context.setTheme(i17);
                                context.getTheme().applyStyle(this.f11571W, true);
                            }
                            if (i12 != 0 && (obj3 instanceof Activity)) {
                                Activity activity2 = (Activity) obj3;
                                if (activity2 instanceof InterfaceC0510v) {
                                    if (((InterfaceC0510v) activity2).g().f8862d.compareTo(EnumC0504o.f8848f) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f11567S && !this.f11568T) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        } else {
                            z12 = z10;
                        }
                        if (z12 && (obj3 instanceof AbstractActivityC0870i)) {
                            if ((i10 & 512) != 0) {
                            }
                            if ((i10 & 4) != 0) {
                            }
                        }
                        if (b4 != null) {
                            v.c(v.b(context.getResources().getConfiguration()));
                        }
                        if (i13 == 0) {
                            w(context).q();
                        } else {
                            y yVar = this.f11573Z;
                            if (yVar != null) {
                                yVar.c();
                            }
                        }
                        if (i13 == 3) {
                            if (this.f11574a0 == null) {
                                this.f11574a0 = new y(this, context);
                            }
                            this.f11574a0.q();
                        } else {
                            y yVar2 = this.f11574a0;
                            if (yVar2 != null) {
                                yVar2.c();
                            }
                        }
                        return z12;
                    }
                }
                z10 = false;
                if (z10) {
                }
                z12 = z10;
                if (z12) {
                    if ((i10 & 512) != 0) {
                    }
                    if ((i10 & 4) != 0) {
                    }
                }
                if (b4 != null) {
                }
                if (i13 == 0) {
                }
                if (i13 == 3) {
                }
                return z12;
            }
            if (i14 >= 29) {
                i11 = 269221888;
            } else {
                i11 = 786432;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i11);
                if (activityInfo != null) {
                    this.f11572X = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.f11572X = 0;
            }
        }
        this.Y = true;
        i4 = this.f11572X;
        configuration = this.f11569U;
        if (configuration == null) {
        }
        i8 = configuration.uiMode & 48;
        i9 = r8.uiMode & 48;
        L.d b92 = v.b(configuration);
        if (dVar != null) {
        }
        if (i8 == i9) {
        }
        if (b4 != null) {
            i10 |= 8196;
        }
        if (((~i4) & i10) != 0) {
            activity = (Activity) obj3;
            if (!activity.isChild()) {
            }
        }
        z10 = false;
        if (z10) {
        }
        z12 = z10;
        if (z12) {
        }
        if (b4 != null) {
        }
        if (i13 == 0) {
        }
        if (i13 == 3) {
        }
        return z12;
    }

    public final void m(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f11585o == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof x)) {
                x xVar = new x(this, callback);
                this.f11586p = xVar;
                window.setCallback(xVar);
                Context context = this.f11584n;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f11548l0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    C1216u a3 = C1216u.a();
                    synchronized (a3) {
                        drawable = a3.f13390a.d(context, resourceId, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f11585o = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f11582i0) == null) {
                    Object obj = this.f11583m;
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.j0) != null) {
                        w.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.j0 = null;
                    }
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.f11582i0 = w.a(activity);
                            I();
                            return;
                        }
                    }
                    this.f11582i0 = null;
                    I();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void o(int i4, C0859B c0859b, n.m mVar) {
        if (mVar == null) {
            if (c0859b == null && i4 >= 0) {
                C0859B[] c0859bArr = this.f11563O;
                if (i4 < c0859bArr.length) {
                    c0859b = c0859bArr[i4];
                }
            }
            if (c0859b != null) {
                mVar = c0859b.f11540h;
            }
        }
        if ((c0859b == null || c0859b.f11543m) && !this.f11568T) {
            x xVar = this.f11586p;
            Window.Callback callback = this.f11585o.getCallback();
            xVar.getClass();
            try {
                xVar.f11739h = true;
                callback.onPanelClosed(i4, mVar);
            } finally {
                xVar.f11739h = false;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:68:0x01e3
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i.LayoutInflaterFactory2C0860C.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void p(n.m mVar) {
        C1197k c1197k;
        if (this.f11562N) {
            return;
        }
        this.f11562N = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f11591u;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((l1) actionBarOverlayLayout.f8373h).f13300a.f8480d;
        if (actionMenuView != null && (c1197k = actionMenuView.f8398w) != null) {
            c1197k.c();
            C1187f c1187f = c1197k.f13289x;
            if (c1187f != null && c1187f.b()) {
                c1187f.f12712i.dismiss();
            }
        }
        Window.Callback callback = this.f11585o.getCallback();
        if (callback != null && !this.f11568T) {
            callback.onPanelClosed(108, mVar);
        }
        this.f11562N = false;
    }

    public final void q(C0859B c0859b, boolean z8) {
        C0858A c0858a;
        InterfaceC1194i0 interfaceC1194i0;
        if (z8 && c0859b.f11533a == 0 && (interfaceC1194i0 = this.f11591u) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1194i0;
            actionBarOverlayLayout.k();
            if (((l1) actionBarOverlayLayout.f8373h).f13300a.p()) {
                p(c0859b.f11540h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f11584n.getSystemService("window");
        if (windowManager != null && c0859b.f11543m && (c0858a = c0859b.f11537e) != null) {
            windowManager.removeView(c0858a);
            if (z8) {
                o(c0859b.f11533a, c0859b, null);
            }
        }
        c0859b.k = false;
        c0859b.f11542l = false;
        c0859b.f11543m = false;
        c0859b.f11538f = null;
        c0859b.f11544n = true;
        if (this.f11564P == c0859b) {
            this.f11564P = null;
        }
        if (c0859b.f11533a == 0) {
            I();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f0, code lost:
    
        if (r7.c() != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(KeyEvent keyEvent) {
        View decorView;
        boolean z8;
        boolean z9;
        ActionMenuView actionMenuView;
        Object obj = this.f11583m;
        boolean z10 = true;
        if ((!(obj instanceof InterfaceC0262j) && !(obj instanceof E)) || (decorView = this.f11585o.getDecorView()) == null || !D2.f.j(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                x xVar = this.f11586p;
                Window.Callback callback = this.f11585o.getCallback();
                xVar.getClass();
                try {
                    xVar.f11738g = true;
                } finally {
                    xVar.f11738g = false;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            C0859B x8 = x(0);
                            if (!x8.f11543m) {
                                G(x8, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if ((keyEvent.getFlags() & 128) == 0) {
                    z10 = false;
                }
                this.f11565Q = z10;
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.f11594x == null) {
                        C0859B x9 = x(0);
                        InterfaceC1194i0 interfaceC1194i0 = this.f11591u;
                        Context context = this.f11584n;
                        if (interfaceC1194i0 != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1194i0;
                            actionBarOverlayLayout.k();
                            Toolbar toolbar = ((l1) actionBarOverlayLayout.f8373h).f13300a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f8480d) != null && actionMenuView.f8397v && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f11591u;
                                actionBarOverlayLayout2.k();
                                if (!((l1) actionBarOverlayLayout2.f8373h).f13300a.p()) {
                                    if (!this.f11568T && G(x9, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f11591u;
                                        actionBarOverlayLayout3.k();
                                        z8 = ((l1) actionBarOverlayLayout3.f8373h).f13300a.v();
                                        if (z8) {
                                            AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                            if (audioManager != null) {
                                                audioManager.playSoundEffect(0);
                                                return true;
                                            }
                                            Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                            return true;
                                        }
                                    }
                                } else {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f11591u;
                                    actionBarOverlayLayout4.k();
                                    ActionMenuView actionMenuView2 = ((l1) actionBarOverlayLayout4.f8373h).f13300a.f8480d;
                                    if (actionMenuView2 != null) {
                                        C1197k c1197k = actionMenuView2.f8398w;
                                        if (c1197k != null) {
                                        }
                                    }
                                }
                                z8 = false;
                                if (z8) {
                                }
                            }
                        }
                        boolean z11 = x9.f11543m;
                        if (!z11 && !x9.f11542l) {
                            if (x9.k) {
                                if (x9.f11545o) {
                                    x9.k = false;
                                    z9 = G(x9, keyEvent);
                                } else {
                                    z9 = true;
                                }
                                if (z9) {
                                    E(x9, keyEvent);
                                    z8 = true;
                                    if (z8) {
                                    }
                                }
                            }
                            z8 = false;
                            if (z8) {
                            }
                        } else {
                            q(x9, true);
                            z8 = z11;
                            if (z8) {
                            }
                        }
                    }
                }
                return false;
            }
            if (!D()) {
                return false;
            }
        }
        return true;
    }

    public final void t(int i4) {
        C0859B x8 = x(i4);
        if (x8.f11540h != null) {
            Bundle bundle = new Bundle();
            x8.f11540h.t(bundle);
            if (bundle.size() > 0) {
                x8.f11546p = bundle;
            }
            x8.f11540h.w();
            x8.f11540h.clear();
        }
        x8.f11545o = true;
        x8.f11544n = true;
        if ((i4 == 108 || i4 == 0) && this.f11591u != null) {
            C0859B x9 = x(0);
            x9.k = false;
            G(x9, null);
        }
    }

    public final void u() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.f11552C) {
            Context context2 = this.f11584n;
            int[] iArr = AbstractC0805a.j;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    g(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    g(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    g(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    g(10);
                }
                this.f11560L = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                v();
                this.f11585o.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.f11561M) {
                    if (this.f11560L) {
                        viewGroup = (ViewGroup) from.inflate(com.buzbuz.smartautoclicker.R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.f11559J = false;
                        this.f11558I = false;
                    } else if (this.f11558I) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(com.buzbuz.smartautoclicker.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new C1039b(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(com.buzbuz.smartautoclicker.R.layout.abc_screen_toolbar, (ViewGroup) null);
                        InterfaceC1194i0 interfaceC1194i0 = (InterfaceC1194i0) viewGroup.findViewById(com.buzbuz.smartautoclicker.R.id.decor_content_parent);
                        this.f11591u = interfaceC1194i0;
                        interfaceC1194i0.setWindowCallback(this.f11585o.getCallback());
                        if (this.f11559J) {
                            ((ActionBarOverlayLayout) this.f11591u).j(109);
                        }
                        if (this.f11556G) {
                            ((ActionBarOverlayLayout) this.f11591u).j(2);
                        }
                        if (this.f11557H) {
                            ((ActionBarOverlayLayout) this.f11591u).j(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.K ? (ViewGroup) from.inflate(com.buzbuz.smartautoclicker.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.buzbuz.smartautoclicker.R.layout.abc_screen_simple, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    r rVar = new r(this);
                    WeakHashMap weakHashMap = P.O.f4214a;
                    P.F.l(viewGroup, rVar);
                    if (this.f11591u == null) {
                        this.f11554E = (TextView) viewGroup.findViewById(com.buzbuz.smartautoclicker.R.id.title);
                    }
                    boolean z8 = t1.f13385a;
                    try {
                        Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(viewGroup, null);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.buzbuz.smartautoclicker.R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f11585o.findViewById(R.id.content);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(R.id.content);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.f11585o.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new s(this));
                    this.f11553D = viewGroup;
                    Object obj = this.f11583m;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f11590t;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        InterfaceC1194i0 interfaceC1194i02 = this.f11591u;
                        if (interfaceC1194i02 != null) {
                            interfaceC1194i02.setWindowTitle(charSequence);
                        } else {
                            AbstractC0862a abstractC0862a = this.f11588r;
                            if (abstractC0862a != null) {
                                abstractC0862a.x(charSequence);
                            } else {
                                TextView textView = this.f11554E;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f11553D.findViewById(R.id.content);
                    View decorView = this.f11585o.getDecorView();
                    contentFrameLayout2.j.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.f11552C = true;
                    C0859B x8 = x(0);
                    if (!this.f11568T && x8.f11540h == null) {
                        B(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f11558I + ", windowActionBarOverlay: " + this.f11559J + ", android:windowIsFloating: " + this.f11560L + ", windowActionModeOverlay: " + this.K + ", windowNoTitle: " + this.f11561M + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void v() {
        if (this.f11585o == null) {
            Object obj = this.f11583m;
            if (obj instanceof Activity) {
                m(((Activity) obj).getWindow());
            }
        }
        if (this.f11585o != null) {
        } else {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final C5.p w(Context context) {
        if (this.f11573Z == null) {
            if (R.g.f4985h == null) {
                Context applicationContext = context.getApplicationContext();
                R.g.f4985h = new R.g(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f11573Z = new y(this, R.g.f4985h);
        }
        return this.f11573Z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r2 <= r5) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, i.B] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0859B x(int i4) {
        Object[] objArr;
        C0859B[] c0859bArr = this.f11563O;
        if (c0859bArr != null) {
            int length = c0859bArr.length;
            objArr = c0859bArr;
        }
        C0859B[] c0859bArr2 = new C0859B[i4 + 1];
        if (c0859bArr != null) {
            System.arraycopy(c0859bArr, 0, c0859bArr2, 0, c0859bArr.length);
        }
        this.f11563O = c0859bArr2;
        objArr = c0859bArr2;
        C0859B c0859b = objArr[i4];
        if (c0859b == 0) {
            ?? obj = new Object();
            obj.f11533a = i4;
            obj.f11544n = false;
            objArr[i4] = obj;
            return obj;
        }
        return c0859b;
    }

    public final void y() {
        u();
        if (this.f11558I && this.f11588r == null) {
            Object obj = this.f11583m;
            if (obj instanceof Activity) {
                this.f11588r = new P((Activity) obj, this.f11559J);
            } else if (obj instanceof Dialog) {
                this.f11588r = new P((Dialog) obj);
            }
            AbstractC0862a abstractC0862a = this.f11588r;
            if (abstractC0862a != null) {
                abstractC0862a.s(this.f11578e0);
            }
        }
    }

    @Override // n.k
    public final boolean z(n.m mVar, MenuItem menuItem) {
        int i4;
        C0859B c0859b;
        Window.Callback callback = this.f11585o.getCallback();
        if (callback != null && !this.f11568T) {
            n.m k = mVar.k();
            C0859B[] c0859bArr = this.f11563O;
            if (c0859bArr != null) {
                i4 = c0859bArr.length;
            } else {
                i4 = 0;
            }
            int i8 = 0;
            while (true) {
                if (i8 < i4) {
                    c0859b = c0859bArr[i8];
                    if (c0859b != null && c0859b.f11540h == k) {
                        break;
                    }
                    i8++;
                } else {
                    c0859b = null;
                    break;
                }
            }
            if (c0859b != null) {
                return callback.onMenuItemSelected(c0859b.f11533a, menuItem);
            }
        }
        return false;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
