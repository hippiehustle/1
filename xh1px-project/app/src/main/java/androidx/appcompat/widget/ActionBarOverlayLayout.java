package androidx.appcompat.widget;

import H5.e;
import P.C0267o;
import P.D;
import P.F;
import P.InterfaceC0265m;
import P.InterfaceC0266n;
import P.O;
import P.e0;
import P.f0;
import P.g0;
import P.h0;
import P.i0;
import P.p0;
import P.t0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.buzbuz.smartautoclicker.R;
import h4.g;
import i.P;
import java.util.WeakHashMap;
import m.C1046i;
import n.m;
import n.x;
import o.C1183d;
import o.C1185e;
import o.C1197k;
import o.InterfaceC1181c;
import o.InterfaceC1194i0;
import o.InterfaceC1196j0;
import o.RunnableC1179b;
import o.g1;
import o.l1;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC1194i0, InterfaceC0265m, InterfaceC0266n {

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f8361F = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: G, reason: collision with root package name */
    public static final t0 f8362G;

    /* renamed from: H, reason: collision with root package name */
    public static final Rect f8363H;

    /* renamed from: A, reason: collision with root package name */
    public final e f8364A;

    /* renamed from: B, reason: collision with root package name */
    public final RunnableC1179b f8365B;

    /* renamed from: C, reason: collision with root package name */
    public final RunnableC1179b f8366C;

    /* renamed from: D, reason: collision with root package name */
    public final C0267o f8367D;

    /* renamed from: E, reason: collision with root package name */
    public final C1185e f8368E;

    /* renamed from: d, reason: collision with root package name */
    public int f8369d;

    /* renamed from: e, reason: collision with root package name */
    public int f8370e;

    /* renamed from: f, reason: collision with root package name */
    public ContentFrameLayout f8371f;

    /* renamed from: g, reason: collision with root package name */
    public ActionBarContainer f8372g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1196j0 f8373h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f8374i;
    public boolean j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8375l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8376m;

    /* renamed from: n, reason: collision with root package name */
    public int f8377n;

    /* renamed from: o, reason: collision with root package name */
    public int f8378o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f8379p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f8380q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f8381r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f8382s;

    /* renamed from: t, reason: collision with root package name */
    public t0 f8383t;

    /* renamed from: u, reason: collision with root package name */
    public t0 f8384u;

    /* renamed from: v, reason: collision with root package name */
    public t0 f8385v;

    /* renamed from: w, reason: collision with root package name */
    public t0 f8386w;

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC1181c f8387x;

    /* renamed from: y, reason: collision with root package name */
    public OverScroller f8388y;

    /* renamed from: z, reason: collision with root package name */
    public ViewPropertyAnimator f8389z;

    static {
        i0 e0Var;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            e0Var = new h0();
        } else if (i4 >= 30) {
            e0Var = new g0();
        } else if (i4 >= 29) {
            e0Var = new f0();
        } else {
            e0Var = new e0();
        }
        e0Var.g(H.c.b(0, 1, 0, 1));
        f8362G = e0Var.b();
        f8363H = new Rect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [P.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [o.e, android.view.View] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8370e = 0;
        this.f8379p = new Rect();
        this.f8380q = new Rect();
        this.f8381r = new Rect();
        this.f8382s = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        t0 t0Var = t0.f4307b;
        this.f8383t = t0Var;
        this.f8384u = t0Var;
        this.f8385v = t0Var;
        this.f8386w = t0Var;
        this.f8364A = new e(9, this);
        this.f8365B = new RunnableC1179b(this, 0);
        this.f8366C = new RunnableC1179b(this, 1);
        i(context);
        this.f8367D = new Object();
        ?? view = new View(context);
        view.setWillNotDraw(true);
        this.f8368E = view;
        addView(view);
    }

    public static boolean g(View view, Rect rect, boolean z8) {
        boolean z9;
        C1183d c1183d = (C1183d) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) c1183d).leftMargin;
        int i8 = rect.left;
        if (i4 != i8) {
            ((ViewGroup.MarginLayoutParams) c1183d).leftMargin = i8;
            z9 = true;
        } else {
            z9 = false;
        }
        int i9 = ((ViewGroup.MarginLayoutParams) c1183d).topMargin;
        int i10 = rect.top;
        if (i9 != i10) {
            ((ViewGroup.MarginLayoutParams) c1183d).topMargin = i10;
            z9 = true;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) c1183d).rightMargin;
        int i12 = rect.right;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) c1183d).rightMargin = i12;
            z9 = true;
        }
        if (z8) {
            int i13 = ((ViewGroup.MarginLayoutParams) c1183d).bottomMargin;
            int i14 = rect.bottom;
            if (i13 != i14) {
                ((ViewGroup.MarginLayoutParams) c1183d).bottomMargin = i14;
                return true;
            }
        }
        return z9;
    }

    @Override // P.InterfaceC0265m
    public final void a(View view, View view2, int i4, int i8) {
        if (i8 == 0) {
            onNestedScrollAccepted(view, view2, i4);
        }
    }

    @Override // P.InterfaceC0265m
    public final void b(View view, int i4) {
        if (i4 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // P.InterfaceC0265m
    public final void c(View view, int i4, int i8, int[] iArr, int i9) {
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1183d;
    }

    @Override // P.InterfaceC0266n
    public final void d(View view, int i4, int i8, int i9, int i10, int i11, int[] iArr) {
        e(view, i4, i8, i9, i10, i11);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i4;
        super.draw(canvas);
        if (this.f8374i != null) {
            if (this.f8372g.getVisibility() == 0) {
                i4 = (int) (this.f8372g.getTranslationY() + this.f8372g.getBottom() + 0.5f);
            } else {
                i4 = 0;
            }
            this.f8374i.setBounds(0, i4, getWidth(), this.f8374i.getIntrinsicHeight() + i4);
            this.f8374i.draw(canvas);
        }
    }

    @Override // P.InterfaceC0265m
    public final void e(View view, int i4, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            onNestedScroll(view, i4, i8, i9, i10);
        }
    }

    @Override // P.InterfaceC0265m
    public final boolean f(View view, View view2, int i4, int i8) {
        if (i8 == 0 && onStartNestedScroll(view, view2, i4)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f8372g;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0267o c0267o = this.f8367D;
        return c0267o.f4299b | c0267o.f4298a;
    }

    public CharSequence getTitle() {
        k();
        return ((l1) this.f8373h).f13300a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f8365B);
        removeCallbacks(this.f8366C);
        ViewPropertyAnimator viewPropertyAnimator = this.f8389z;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f8361F);
        boolean z8 = false;
        this.f8369d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f8374i = drawable;
        if (drawable == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        obtainStyledAttributes.recycle();
        this.f8388y = new OverScroller(context);
    }

    public final void j(int i4) {
        k();
        if (i4 != 2) {
            if (i4 != 5) {
                if (i4 != 109) {
                    return;
                }
                setOverlayMode(true);
                return;
            } else {
                ((l1) this.f8373h).getClass();
                Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
                return;
            }
        }
        ((l1) this.f8373h).getClass();
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void k() {
        InterfaceC1196j0 wrapper;
        if (this.f8371f == null) {
            this.f8371f = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f8372g = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC1196j0) {
                wrapper = (InterfaceC1196j0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f8373h = wrapper;
        }
    }

    public final void l(Menu menu, x xVar) {
        k();
        l1 l1Var = (l1) this.f8373h;
        Toolbar toolbar = l1Var.f13300a;
        if (l1Var.f13310m == null) {
            C1197k c1197k = new C1197k(toolbar.getContext());
            l1Var.f13310m = c1197k;
            c1197k.f13277l = R.id.action_menu_presenter;
        }
        C1197k c1197k2 = l1Var.f13310m;
        c1197k2.f13275h = xVar;
        m mVar = (m) menu;
        if (mVar != null || toolbar.f8480d != null) {
            toolbar.f();
            m mVar2 = toolbar.f8480d.f8394s;
            if (mVar2 == mVar) {
                return;
            }
            if (mVar2 != null) {
                mVar2.r(toolbar.f8471O);
                mVar2.r(toolbar.f8472P);
            }
            if (toolbar.f8472P == null) {
                toolbar.f8472P = new g1(toolbar);
            }
            c1197k2.f13286u = true;
            if (mVar != null) {
                mVar.b(c1197k2, toolbar.f8487m);
                mVar.b(toolbar.f8472P, toolbar.f8487m);
            } else {
                c1197k2.h(toolbar.f8487m, null);
                toolbar.f8472P.h(toolbar.f8487m, null);
                c1197k2.g(true);
                toolbar.f8472P.g(true);
            }
            toolbar.f8480d.setPopupTheme(toolbar.f8488n);
            toolbar.f8480d.setPresenter(c1197k2);
            toolbar.f8471O = c1197k2;
            toolbar.w();
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        t0 g8 = t0.g(this, windowInsets);
        boolean g9 = g(this.f8372g, new Rect(g8.b(), g8.d(), g8.c(), g8.a()), false);
        WeakHashMap weakHashMap = O.f4214a;
        Rect rect = this.f8379p;
        F.b(this, g8, rect);
        int i4 = rect.left;
        int i8 = rect.top;
        int i9 = rect.right;
        int i10 = rect.bottom;
        p0 p0Var = g8.f4308a;
        t0 l6 = p0Var.l(i4, i8, i9, i10);
        this.f8383t = l6;
        boolean z8 = true;
        if (!this.f8384u.equals(l6)) {
            this.f8384u = this.f8383t;
            g9 = true;
        }
        Rect rect2 = this.f8380q;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z8 = g9;
        }
        if (z8) {
            requestLayout();
        }
        return p0Var.a().f4308a.c().f4308a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = O.f4214a;
        D.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C1183d c1183d = (C1183d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = ((ViewGroup.MarginLayoutParams) c1183d).leftMargin + paddingLeft;
                int i13 = ((ViewGroup.MarginLayoutParams) c1183d).topMargin + paddingTop;
                childAt.layout(i12, i13, measuredWidth + i12, measuredHeight + i13);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0106  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i4, int i8) {
        boolean z8;
        int measuredHeight;
        i0 e0Var;
        k();
        measureChildWithMargins(this.f8372g, i4, 0, i8, 0);
        C1183d c1183d = (C1183d) this.f8372g.getLayoutParams();
        int max = Math.max(0, this.f8372g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1183d).leftMargin + ((ViewGroup.MarginLayoutParams) c1183d).rightMargin);
        int max2 = Math.max(0, this.f8372g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1183d).topMargin + ((ViewGroup.MarginLayoutParams) c1183d).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f8372g.getMeasuredState());
        WeakHashMap weakHashMap = O.f4214a;
        if ((getWindowSystemUiVisibility() & 256) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            measuredHeight = this.f8369d;
            if (this.k && this.f8372g.getTabContainer() != null) {
                measuredHeight += this.f8369d;
            }
        } else {
            measuredHeight = this.f8372g.getVisibility() != 8 ? this.f8372g.getMeasuredHeight() : 0;
        }
        Rect rect = this.f8379p;
        Rect rect2 = this.f8381r;
        rect2.set(rect);
        this.f8385v = this.f8383t;
        if (!this.j && !z8) {
            C1185e c1185e = this.f8368E;
            t0 t0Var = f8362G;
            Rect rect3 = this.f8382s;
            F.b(c1185e, t0Var, rect3);
            if (!rect3.equals(f8363H)) {
                rect2.top += measuredHeight;
                rect2.bottom = rect2.bottom;
                this.f8385v = this.f8385v.f4308a.l(0, measuredHeight, 0, 0);
                g(this.f8371f, rect2, true);
                if (!this.f8386w.equals(this.f8385v)) {
                    t0 t0Var2 = this.f8385v;
                    this.f8386w = t0Var2;
                    O.b(this.f8371f, t0Var2);
                }
                measureChildWithMargins(this.f8371f, i4, 0, i8, 0);
                C1183d c1183d2 = (C1183d) this.f8371f.getLayoutParams();
                int max3 = Math.max(max, this.f8371f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1183d2).leftMargin + ((ViewGroup.MarginLayoutParams) c1183d2).rightMargin);
                int max4 = Math.max(max2, this.f8371f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1183d2).topMargin + ((ViewGroup.MarginLayoutParams) c1183d2).bottomMargin);
                int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f8371f.getMeasuredState());
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i4, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i8, combineMeasuredStates2 << 16));
            }
        }
        H.c b4 = H.c.b(this.f8385v.b(), this.f8385v.d() + measuredHeight, this.f8385v.c(), this.f8385v.a());
        t0 t0Var3 = this.f8385v;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 34) {
            e0Var = new h0(t0Var3);
        } else if (i9 >= 30) {
            e0Var = new g0(t0Var3);
        } else if (i9 >= 29) {
            e0Var = new f0(t0Var3);
        } else {
            e0Var = new e0(t0Var3);
        }
        e0Var.g(b4);
        this.f8385v = e0Var.b();
        g(this.f8371f, rect2, true);
        if (!this.f8386w.equals(this.f8385v)) {
        }
        measureChildWithMargins(this.f8371f, i4, 0, i8, 0);
        C1183d c1183d22 = (C1183d) this.f8371f.getLayoutParams();
        int max32 = Math.max(max, this.f8371f.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c1183d22).leftMargin + ((ViewGroup.MarginLayoutParams) c1183d22).rightMargin);
        int max42 = Math.max(max2, this.f8371f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1183d22).topMargin + ((ViewGroup.MarginLayoutParams) c1183d22).bottomMargin);
        int combineMeasuredStates22 = View.combineMeasuredStates(combineMeasuredStates, this.f8371f.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max32, getSuggestedMinimumWidth()), i4, combineMeasuredStates22), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max42, getSuggestedMinimumHeight()), i8, combineMeasuredStates22 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f8, float f9, boolean z8) {
        if (this.f8375l && z8) {
            this.f8388y.fling(0, 0, 0, (int) f9, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.f8388y.getFinalY() > this.f8372g.getHeight()) {
                h();
                this.f8366C.run();
            } else {
                h();
                this.f8365B.run();
            }
            this.f8376m = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f8, float f9) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i8, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i8, int i9, int i10) {
        int i11 = this.f8377n + i8;
        this.f8377n = i11;
        setActionBarHideOffset(i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        P p8;
        C1046i c1046i;
        this.f8367D.f4298a = i4;
        this.f8377n = getActionBarHideOffset();
        h();
        InterfaceC1181c interfaceC1181c = this.f8387x;
        if (interfaceC1181c != null && (c1046i = (p8 = (P) interfaceC1181c).f11651t) != null) {
            c1046i.a();
            p8.f11651t = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        if ((i4 & 2) != 0 && this.f8372g.getVisibility() == 0) {
            return this.f8375l;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.f8375l && !this.f8376m) {
            if (this.f8377n <= this.f8372g.getHeight()) {
                h();
                postDelayed(this.f8365B, 600L);
            } else {
                h();
                postDelayed(this.f8366C, 600L);
            }
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i4) {
        boolean z8;
        boolean z9;
        super.onWindowSystemUiVisibilityChanged(i4);
        k();
        int i8 = this.f8378o ^ i4;
        this.f8378o = i4;
        if ((i4 & 4) == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((i4 & 256) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        InterfaceC1181c interfaceC1181c = this.f8387x;
        if (interfaceC1181c != null) {
            P p8 = (P) interfaceC1181c;
            p8.f11647p = !z9;
            if (!z8 && z9) {
                if (!p8.f11648q) {
                    p8.f11648q = true;
                    p8.E(true);
                }
            } else if (p8.f11648q) {
                p8.f11648q = false;
                p8.E(true);
            }
        }
        if ((i8 & 256) != 0 && this.f8387x != null) {
            WeakHashMap weakHashMap = O.f4214a;
            D.c(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        this.f8370e = i4;
        InterfaceC1181c interfaceC1181c = this.f8387x;
        if (interfaceC1181c != null) {
            ((P) interfaceC1181c).f11646o = i4;
        }
    }

    public void setActionBarHideOffset(int i4) {
        h();
        this.f8372g.setTranslationY(-Math.max(0, Math.min(i4, this.f8372g.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC1181c interfaceC1181c) {
        this.f8387x = interfaceC1181c;
        if (getWindowToken() != null) {
            ((P) this.f8387x).f11646o = this.f8370e;
            int i4 = this.f8378o;
            if (i4 != 0) {
                onWindowSystemUiVisibilityChanged(i4);
                WeakHashMap weakHashMap = O.f4214a;
                D.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z8) {
        this.k = z8;
    }

    public void setHideOnContentScrollEnabled(boolean z8) {
        if (z8 != this.f8375l) {
            this.f8375l = z8;
            if (!z8) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i4) {
        k();
        l1 l1Var = (l1) this.f8373h;
        l1Var.f13303d = i4 != 0 ? g.k(l1Var.f13300a.getContext(), i4) : null;
        l1Var.c();
    }

    public void setLogo(int i4) {
        Drawable drawable;
        k();
        l1 l1Var = (l1) this.f8373h;
        if (i4 != 0) {
            drawable = g.k(l1Var.f13300a.getContext(), i4);
        } else {
            drawable = null;
        }
        l1Var.f13304e = drawable;
        l1Var.c();
    }

    public void setOverlayMode(boolean z8) {
        this.j = z8;
    }

    public void setShowingForActionMode(boolean z8) {
    }

    public void setUiOptions(int i4) {
    }

    @Override // o.InterfaceC1194i0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((l1) this.f8373h).k = callback;
    }

    @Override // o.InterfaceC1194i0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        l1 l1Var = (l1) this.f8373h;
        if (!l1Var.f13306g) {
            Toolbar toolbar = l1Var.f13300a;
            l1Var.f13307h = charSequence;
            if ((l1Var.f13301b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (l1Var.f13306g) {
                    O.n(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        l1 l1Var = (l1) this.f8373h;
        l1Var.f13303d = drawable;
        l1Var.c();
    }
}
