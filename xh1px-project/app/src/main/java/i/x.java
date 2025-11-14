package i;

import C6.h0;
import P.U;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.buzbuz.smartautoclicker.R;
import g0.b0;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import m.AbstractC1047j;
import m.AbstractC1048k;
import m.AbstractC1049l;
import m.C1039b;

/* loaded from: classes.dex */
public final class x implements Window.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final Window.Callback f11735d;

    /* renamed from: e, reason: collision with root package name */
    public J f11736e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11737f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11738g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11739h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0860C f11740i;

    public x(LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C, Window.Callback callback) {
        this.f11740i = layoutInflaterFactory2C0860C;
        if (callback != null) {
            this.f11735d = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void a(Window.Callback callback) {
        try {
            this.f11737f = true;
            callback.onContentChanged();
        } finally {
            this.f11737f = false;
        }
    }

    public final boolean b(int i4, Menu menu) {
        return this.f11735d.onMenuOpened(i4, menu);
    }

    public final void c(int i4, Menu menu) {
        this.f11735d.onPanelClosed(i4, menu);
    }

    public final void d(List list, Menu menu, int i4) {
        AbstractC1048k.a(this.f11735d, list, menu, i4);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f11735d.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z8 = this.f11738g;
        Window.Callback callback = this.f11735d;
        if (z8) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (!this.f11740i.s(keyEvent) && !callback.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f11735d.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = this.f11740i;
            layoutInflaterFactory2C0860C.y();
            AbstractC0862a abstractC0862a = layoutInflaterFactory2C0860C.f11588r;
            if (abstractC0862a == null || !abstractC0862a.o(keyCode, keyEvent)) {
                C0859B c0859b = layoutInflaterFactory2C0860C.f11564P;
                if (c0859b != null && layoutInflaterFactory2C0860C.F(c0859b, keyEvent.getKeyCode(), keyEvent)) {
                    C0859B c0859b2 = layoutInflaterFactory2C0860C.f11564P;
                    if (c0859b2 != null) {
                        c0859b2.f11542l = true;
                        return true;
                    }
                } else {
                    if (layoutInflaterFactory2C0860C.f11564P == null) {
                        C0859B x8 = layoutInflaterFactory2C0860C.x(0);
                        layoutInflaterFactory2C0860C.G(x8, keyEvent);
                        boolean F2 = layoutInflaterFactory2C0860C.F(x8, keyEvent.getKeyCode(), keyEvent);
                        x8.k = false;
                        if (F2) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f11735d.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f11735d.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f11735d.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f11735d.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f11735d.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f11735d.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f11737f) {
            this.f11735d.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i4, Menu menu) {
        if (i4 == 0 && !(menu instanceof n.m)) {
            return false;
        }
        return this.f11735d.onCreatePanelMenu(i4, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i4) {
        View view;
        J j = this.f11736e;
        if (j != null) {
            if (i4 == 0) {
                view = new View(j.f11613d.f11614b.f13300a.getContext());
            } else {
                view = null;
            }
            if (view != null) {
                return view;
            }
        }
        return this.f11735d.onCreatePanelView(i4);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f11735d.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        return this.f11735d.onMenuItemSelected(i4, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i4, Menu menu) {
        b(i4, menu);
        LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = this.f11740i;
        if (i4 == 108) {
            layoutInflaterFactory2C0860C.y();
            AbstractC0862a abstractC0862a = layoutInflaterFactory2C0860C.f11588r;
            if (abstractC0862a != null) {
                abstractC0862a.e(true);
            }
        } else {
            layoutInflaterFactory2C0860C.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i4, Menu menu) {
        if (this.f11739h) {
            this.f11735d.onPanelClosed(i4, menu);
            return;
        }
        c(i4, menu);
        LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = this.f11740i;
        if (i4 == 108) {
            layoutInflaterFactory2C0860C.y();
            AbstractC0862a abstractC0862a = layoutInflaterFactory2C0860C.f11588r;
            if (abstractC0862a != null) {
                abstractC0862a.e(false);
                return;
            }
            return;
        }
        if (i4 == 0) {
            C0859B x8 = layoutInflaterFactory2C0860C.x(i4);
            if (x8.f11543m) {
                layoutInflaterFactory2C0860C.q(x8, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z8) {
        AbstractC1049l.a(this.f11735d, z8);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i4, View view, Menu menu) {
        n.m mVar;
        if (menu instanceof n.m) {
            mVar = (n.m) menu;
        } else {
            mVar = null;
        }
        if (i4 == 0 && mVar == null) {
            return false;
        }
        if (mVar != null) {
            mVar.f12662x = true;
        }
        J j = this.f11736e;
        if (j != null && i4 == 0) {
            K k = j.f11613d;
            if (!k.f11617e) {
                k.f11614b.f13309l = true;
                k.f11617e = true;
            }
        }
        boolean onPreparePanel = this.f11735d.onPreparePanel(i4, view, menu);
        if (mVar != null) {
            mVar.f12662x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i4) {
        n.m mVar = this.f11740i.x(0).f11540h;
        if (mVar != null) {
            d(list, mVar, i4);
        } else {
            d(list, menu, i4);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC1047j.a(this.f11735d, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f11735d.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z8) {
        this.f11735d.onWindowFocusChanged(z8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [g0.b0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [m.c, C6.h0, n.k] */
    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i4) {
        ViewGroup viewGroup;
        if (i4 != 0) {
            return AbstractC1047j.b(this.f11735d, callback, i4);
        }
        LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = this.f11740i;
        Context context = layoutInflaterFactory2C0860C.f11584n;
        ?? obj = new Object();
        obj.f10989f = context;
        obj.f10988e = callback;
        obj.f10987d = new ArrayList();
        obj.f10990g = new t.j(0);
        h0 h0Var = layoutInflaterFactory2C0860C.f11594x;
        if (h0Var != null) {
            h0Var.b();
        }
        R3.r rVar = new R3.r(layoutInflaterFactory2C0860C, (b0) obj);
        layoutInflaterFactory2C0860C.y();
        AbstractC0862a abstractC0862a = layoutInflaterFactory2C0860C.f11588r;
        if (abstractC0862a != null) {
            layoutInflaterFactory2C0860C.f11594x = abstractC0862a.y(rVar);
        }
        if (layoutInflaterFactory2C0860C.f11594x == null) {
            U u8 = layoutInflaterFactory2C0860C.f11551B;
            if (u8 != null) {
                u8.b();
            }
            h0 h0Var2 = layoutInflaterFactory2C0860C.f11594x;
            if (h0Var2 != null) {
                h0Var2.b();
            }
            int i8 = 1;
            if (layoutInflaterFactory2C0860C.f11595y == null) {
                if (layoutInflaterFactory2C0860C.f11560L) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C1039b c1039b = new C1039b(context, 0);
                        c1039b.getTheme().setTo(newTheme);
                        context = c1039b;
                    }
                    layoutInflaterFactory2C0860C.f11595y = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C0860C.f11596z = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    layoutInflaterFactory2C0860C.f11596z.setContentView(layoutInflaterFactory2C0860C.f11595y);
                    layoutInflaterFactory2C0860C.f11596z.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C0860C.f11595y.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C0860C.f11596z.setHeight(-2);
                    layoutInflaterFactory2C0860C.f11550A = new q(layoutInflaterFactory2C0860C, i8);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C0860C.f11553D.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C0860C.y();
                        AbstractC0862a abstractC0862a2 = layoutInflaterFactory2C0860C.f11588r;
                        Context i9 = abstractC0862a2 != null ? abstractC0862a2.i() : null;
                        if (i9 != null) {
                            context = i9;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        layoutInflaterFactory2C0860C.f11595y = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (layoutInflaterFactory2C0860C.f11595y != null) {
                U u9 = layoutInflaterFactory2C0860C.f11551B;
                if (u9 != null) {
                    u9.b();
                }
                layoutInflaterFactory2C0860C.f11595y.e();
                Context context2 = layoutInflaterFactory2C0860C.f11595y.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C0860C.f11595y;
                ?? h0Var3 = new h0();
                h0Var3.f12322g = context2;
                h0Var3.f12323h = actionBarContextView;
                h0Var3.f12324i = rVar;
                n.m mVar = new n.m(actionBarContextView.getContext());
                mVar.f12650l = 1;
                h0Var3.f12325l = mVar;
                mVar.f12645e = h0Var3;
                if (((b0) rVar.f5082e).q(h0Var3, mVar)) {
                    h0Var3.i();
                    layoutInflaterFactory2C0860C.f11595y.c(h0Var3);
                    layoutInflaterFactory2C0860C.f11594x = h0Var3;
                    if (layoutInflaterFactory2C0860C.f11552C && (viewGroup = layoutInflaterFactory2C0860C.f11553D) != null && viewGroup.isLaidOut()) {
                        layoutInflaterFactory2C0860C.f11595y.setAlpha(0.0f);
                        U a3 = P.O.a(layoutInflaterFactory2C0860C.f11595y);
                        a3.a(1.0f);
                        layoutInflaterFactory2C0860C.f11551B = a3;
                        a3.d(new t(i8, layoutInflaterFactory2C0860C));
                    } else {
                        layoutInflaterFactory2C0860C.f11595y.setAlpha(1.0f);
                        layoutInflaterFactory2C0860C.f11595y.setVisibility(0);
                        if (layoutInflaterFactory2C0860C.f11595y.getParent() instanceof View) {
                            View view = (View) layoutInflaterFactory2C0860C.f11595y.getParent();
                            WeakHashMap weakHashMap = P.O.f4214a;
                            P.D.c(view);
                        }
                    }
                    if (layoutInflaterFactory2C0860C.f11596z != null) {
                        layoutInflaterFactory2C0860C.f11585o.getDecorView().post(layoutInflaterFactory2C0860C.f11550A);
                    }
                } else {
                    layoutInflaterFactory2C0860C.f11594x = null;
                }
            }
            layoutInflaterFactory2C0860C.I();
            layoutInflaterFactory2C0860C.f11594x = layoutInflaterFactory2C0860C.f11594x;
        }
        layoutInflaterFactory2C0860C.I();
        h0 h0Var4 = layoutInflaterFactory2C0860C.f11594x;
        if (h0Var4 != null) {
            return obj.g(h0Var4);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f11735d.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
