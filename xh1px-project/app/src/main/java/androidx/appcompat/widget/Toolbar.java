package androidx.appcompat.widget;

import A5.h;
import L5.x;
import N.f;
import P.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.buzbuz.smartautoclicker.R;
import g0.I;
import g0.L;
import h.AbstractC0805a;
import h4.g;
import i.AbstractC0862a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import m.C1044g;
import n.m;
import n.o;
import o.C1178a0;
import o.C1197k;
import o.C1224y;
import o.InterfaceC1196j0;
import o.N0;
import o.e1;
import o.f1;
import o.g1;
import o.h1;
import o.i1;
import o.j1;
import o.l1;
import o.t1;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f8458A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f8459B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f8460C;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f8461D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f8462E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f8463F;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f8464G;

    /* renamed from: H, reason: collision with root package name */
    public final ArrayList f8465H;

    /* renamed from: I, reason: collision with root package name */
    public final int[] f8466I;

    /* renamed from: J, reason: collision with root package name */
    public final A4.c f8467J;
    public ArrayList K;

    /* renamed from: L, reason: collision with root package name */
    public i1 f8468L;

    /* renamed from: M, reason: collision with root package name */
    public final L f8469M;

    /* renamed from: N, reason: collision with root package name */
    public l1 f8470N;

    /* renamed from: O, reason: collision with root package name */
    public C1197k f8471O;

    /* renamed from: P, reason: collision with root package name */
    public g1 f8472P;

    /* renamed from: Q, reason: collision with root package name */
    public f f8473Q;

    /* renamed from: R, reason: collision with root package name */
    public W5.a f8474R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f8475S;

    /* renamed from: T, reason: collision with root package name */
    public OnBackInvokedCallback f8476T;

    /* renamed from: U, reason: collision with root package name */
    public OnBackInvokedDispatcher f8477U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f8478V;

    /* renamed from: W, reason: collision with root package name */
    public final x f8479W;

    /* renamed from: d, reason: collision with root package name */
    public ActionMenuView f8480d;

    /* renamed from: e, reason: collision with root package name */
    public C1178a0 f8481e;

    /* renamed from: f, reason: collision with root package name */
    public C1178a0 f8482f;

    /* renamed from: g, reason: collision with root package name */
    public C1224y f8483g;

    /* renamed from: h, reason: collision with root package name */
    public AppCompatImageView f8484h;

    /* renamed from: i, reason: collision with root package name */
    public final Drawable f8485i;
    public final CharSequence j;
    public C1224y k;

    /* renamed from: l, reason: collision with root package name */
    public View f8486l;

    /* renamed from: m, reason: collision with root package name */
    public Context f8487m;

    /* renamed from: n, reason: collision with root package name */
    public int f8488n;

    /* renamed from: o, reason: collision with root package name */
    public int f8489o;

    /* renamed from: p, reason: collision with root package name */
    public int f8490p;

    /* renamed from: q, reason: collision with root package name */
    public final int f8491q;

    /* renamed from: r, reason: collision with root package name */
    public final int f8492r;

    /* renamed from: s, reason: collision with root package name */
    public int f8493s;

    /* renamed from: t, reason: collision with root package name */
    public int f8494t;

    /* renamed from: u, reason: collision with root package name */
    public int f8495u;

    /* renamed from: v, reason: collision with root package name */
    public int f8496v;

    /* renamed from: w, reason: collision with root package name */
    public N0 f8497w;

    /* renamed from: x, reason: collision with root package name */
    public int f8498x;

    /* renamed from: y, reason: collision with root package name */
    public int f8499y;

    /* renamed from: z, reason: collision with root package name */
    public final int f8500z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i4 = 0; i4 < menu.size(); i4++) {
            arrayList.add(menu.getItem(i4));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C1044g(getContext());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, o.h1] */
    public static h1 h() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f13264b = 0;
        marginLayoutParams.f13263a = 8388627;
        return marginLayoutParams;
    }

    public static h1 i(ViewGroup.LayoutParams layoutParams) {
        boolean z8 = layoutParams instanceof h1;
        if (z8) {
            h1 h1Var = (h1) layoutParams;
            h1 h1Var2 = new h1(h1Var);
            h1Var2.f13264b = 0;
            h1Var2.f13264b = h1Var.f13264b;
            return h1Var2;
        }
        if (z8) {
            h1 h1Var3 = new h1((h1) layoutParams);
            h1Var3.f13264b = 0;
            return h1Var3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            h1 h1Var4 = new h1(marginLayoutParams);
            h1Var4.f13264b = 0;
            ((ViewGroup.MarginLayoutParams) h1Var4).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) h1Var4).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) h1Var4).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) h1Var4).bottomMargin = marginLayoutParams.bottomMargin;
            return h1Var4;
        }
        h1 h1Var5 = new h1(layoutParams);
        h1Var5.f13264b = 0;
        return h1Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i4) {
        boolean z8;
        if (getLayoutDirection() == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, getLayoutDirection());
        arrayList.clear();
        if (z8) {
            for (int i8 = childCount - 1; i8 >= 0; i8--) {
                View childAt = getChildAt(i8);
                h1 h1Var = (h1) childAt.getLayoutParams();
                if (h1Var.f13264b == 0 && u(childAt)) {
                    int i9 = h1Var.f13263a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i9, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = getChildAt(i10);
            h1 h1Var2 = (h1) childAt2.getLayoutParams();
            if (h1Var2.f13264b == 0 && u(childAt2)) {
                int i11 = h1Var2.f13263a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i11, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z8) {
        h1 h1Var;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            h1Var = h();
        } else if (!checkLayoutParams(layoutParams)) {
            h1Var = i(layoutParams);
        } else {
            h1Var = (h1) layoutParams;
        }
        h1Var.f13264b = 1;
        if (z8 && this.f8486l != null) {
            view.setLayoutParams(h1Var);
            this.f8465H.add(view);
        } else {
            addView(view, h1Var);
        }
    }

    public final void c() {
        if (this.k == null) {
            C1224y c1224y = new C1224y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.k = c1224y;
            c1224y.setImageDrawable(this.f8485i);
            this.k.setContentDescription(this.j);
            h1 h8 = h();
            h8.f13263a = (this.f8491q & 112) | 8388611;
            h8.f13264b = 2;
            this.k.setLayoutParams(h8);
            this.k.setOnClickListener(new h(5, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof h1)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.N0, java.lang.Object] */
    public final void d() {
        if (this.f8497w == null) {
            ?? obj = new Object();
            obj.f13114a = 0;
            obj.f13115b = 0;
            obj.f13116c = Integer.MIN_VALUE;
            obj.f13117d = Integer.MIN_VALUE;
            obj.f13118e = 0;
            obj.f13119f = 0;
            obj.f13120g = false;
            obj.f13121h = false;
            this.f8497w = obj;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f8480d;
        if (actionMenuView.f8394s == null) {
            m mVar = (m) actionMenuView.getMenu();
            if (this.f8472P == null) {
                this.f8472P = new g1(this);
            }
            this.f8480d.setExpandedActionViewsExclusive(true);
            mVar.b(this.f8472P, this.f8487m);
            w();
        }
    }

    public final void f() {
        if (this.f8480d == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f8480d = actionMenuView;
            actionMenuView.setPopupTheme(this.f8488n);
            this.f8480d.setOnMenuItemClickListener(this.f8469M);
            ActionMenuView actionMenuView2 = this.f8480d;
            f fVar = this.f8473Q;
            W5.a aVar = new W5.a(22, this);
            actionMenuView2.f8399x = fVar;
            actionMenuView2.f8400y = aVar;
            h1 h8 = h();
            h8.f13263a = (this.f8491q & 112) | 8388613;
            this.f8480d.setLayoutParams(h8);
            b(this.f8480d, false);
        }
    }

    public final void g() {
        if (this.f8483g == null) {
            this.f8483g = new C1224y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            h1 h8 = h();
            h8.f13263a = (this.f8491q & 112) | 8388611;
            this.f8483g.setLayoutParams(h8);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C1224y c1224y = this.k;
        if (c1224y != null) {
            return c1224y.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C1224y c1224y = this.k;
        if (c1224y != null) {
            return c1224y.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        N0 n02 = this.f8497w;
        if (n02 != null) {
            if (n02.f13120g) {
                return n02.f13114a;
            }
            return n02.f13115b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i4 = this.f8499y;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        N0 n02 = this.f8497w;
        if (n02 != null) {
            return n02.f13114a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        N0 n02 = this.f8497w;
        if (n02 != null) {
            return n02.f13115b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        N0 n02 = this.f8497w;
        if (n02 != null) {
            if (n02.f13120g) {
                return n02.f13115b;
            }
            return n02.f13114a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i4 = this.f8498x;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        m mVar;
        ActionMenuView actionMenuView = this.f8480d;
        if (actionMenuView != null && (mVar = actionMenuView.f8394s) != null && mVar.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.f8499y, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f8498x, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f8484h;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f8484h;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f8480d.getMenu();
    }

    public View getNavButtonView() {
        return this.f8483g;
    }

    public CharSequence getNavigationContentDescription() {
        C1224y c1224y = this.f8483g;
        if (c1224y != null) {
            return c1224y.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C1224y c1224y = this.f8483g;
        if (c1224y != null) {
            return c1224y.getDrawable();
        }
        return null;
    }

    public C1197k getOuterActionMenuPresenter() {
        return this.f8471O;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f8480d.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f8487m;
    }

    public int getPopupTheme() {
        return this.f8488n;
    }

    public CharSequence getSubtitle() {
        return this.f8459B;
    }

    public final TextView getSubtitleTextView() {
        return this.f8482f;
    }

    public CharSequence getTitle() {
        return this.f8458A;
    }

    public int getTitleMarginBottom() {
        return this.f8496v;
    }

    public int getTitleMarginEnd() {
        return this.f8494t;
    }

    public int getTitleMarginStart() {
        return this.f8493s;
    }

    public int getTitleMarginTop() {
        return this.f8495u;
    }

    public final TextView getTitleTextView() {
        return this.f8481e;
    }

    public InterfaceC1196j0 getWrapper() {
        if (this.f8470N == null) {
            this.f8470N = new l1(this, true);
        }
        return this.f8470N;
    }

    public final int j(View view, int i4) {
        int i8;
        h1 h1Var = (h1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i4 > 0) {
            i8 = (measuredHeight - i4) / 2;
        } else {
            i8 = 0;
        }
        int i9 = h1Var.f13263a & 112;
        if (i9 != 16 && i9 != 48 && i9 != 80) {
            i9 = this.f8500z & 112;
        }
        if (i9 != 48) {
            if (i9 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i10 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i11 = ((ViewGroup.MarginLayoutParams) h1Var).topMargin;
                if (i10 < i11) {
                    i10 = i11;
                } else {
                    int i12 = (((height - paddingBottom) - measuredHeight) - i10) - paddingTop;
                    int i13 = ((ViewGroup.MarginLayoutParams) h1Var).bottomMargin;
                    if (i12 < i13) {
                        i10 = Math.max(0, i10 - (i13 - i12));
                    }
                }
                return paddingTop + i10;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) h1Var).bottomMargin) - i8;
        }
        return getPaddingTop() - i8;
    }

    public void m(int i4) {
        getMenuInflater().inflate(i4, getMenu());
    }

    public final void n() {
        Iterator it = this.K.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f8467J.f292f).iterator();
        while (it2.hasNext()) {
            ((I) it2.next()).f10866a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.K = currentMenuItems2;
    }

    public final boolean o(View view) {
        if (view.getParent() != this && !this.f8465H.contains(view)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f8479W);
        w();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f8463F = false;
        }
        if (!this.f8463F) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f8463F = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f8463F = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028f A[LOOP:0: B:39:0x028d->B:40:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a7 A[LOOP:1: B:43:0x02a5->B:44:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c7 A[LOOP:2: B:47:0x02c5->B:48:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x031a A[LOOP:3: B:56:0x0318->B:57:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        boolean z9;
        int i11;
        int i12;
        int i13;
        int max;
        boolean u8;
        boolean u9;
        boolean z10;
        int i14;
        C1178a0 c1178a0;
        C1178a0 c1178a02;
        boolean z11;
        int i15;
        int paddingTop;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int size;
        int i22;
        int i23;
        int size2;
        int i24;
        int size3;
        int i25;
        int i26;
        int i27;
        int size4;
        if (getLayoutDirection() == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i28 = width - paddingRight;
        int[] iArr = this.f8466I;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = O.f4214a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight >= 0) {
            i11 = Math.min(minimumHeight, i10 - i8);
        } else {
            i11 = 0;
        }
        if (u(this.f8483g)) {
            if (z9) {
                i13 = r(this.f8483g, i28, i11, iArr);
                i12 = paddingLeft;
                if (u(this.k)) {
                    if (z9) {
                        i13 = r(this.k, i13, i11, iArr);
                    } else {
                        i12 = q(this.k, i12, i11, iArr);
                    }
                }
                if (u(this.f8480d)) {
                    if (z9) {
                        i12 = q(this.f8480d, i12, i11, iArr);
                    } else {
                        i13 = r(this.f8480d, i13, i11, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i12);
                iArr[1] = Math.max(0, currentContentInsetRight - (i28 - i13));
                max = Math.max(i12, currentContentInsetLeft);
                int min = Math.min(i13, i28 - currentContentInsetRight);
                if (u(this.f8486l)) {
                    if (z9) {
                        min = r(this.f8486l, min, i11, iArr);
                    } else {
                        max = q(this.f8486l, max, i11, iArr);
                    }
                }
                if (u(this.f8484h)) {
                    if (z9) {
                        min = r(this.f8484h, min, i11, iArr);
                    } else {
                        max = q(this.f8484h, max, i11, iArr);
                    }
                }
                u8 = u(this.f8481e);
                u9 = u(this.f8482f);
                if (!u8) {
                    h1 h1Var = (h1) this.f8481e.getLayoutParams();
                    z10 = z9;
                    i14 = this.f8481e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) h1Var).topMargin + ((ViewGroup.MarginLayoutParams) h1Var).bottomMargin;
                } else {
                    z10 = z9;
                    i14 = 0;
                }
                if (!u9) {
                    h1 h1Var2 = (h1) this.f8482f.getLayoutParams();
                    i14 = this.f8482f.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) h1Var2).topMargin + ((ViewGroup.MarginLayoutParams) h1Var2).bottomMargin + i14;
                }
                if (!u8 || u9) {
                    if (!u8) {
                        c1178a0 = this.f8481e;
                    } else {
                        c1178a0 = this.f8482f;
                    }
                    if (!u9) {
                        c1178a02 = this.f8482f;
                    } else {
                        c1178a02 = this.f8481e;
                    }
                    h1 h1Var3 = (h1) c1178a0.getLayoutParams();
                    h1 h1Var4 = (h1) c1178a02.getLayoutParams();
                    int i29 = i14;
                    if ((!u8 && this.f8481e.getMeasuredWidth() > 0) || (u9 && this.f8482f.getMeasuredWidth() > 0)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i15 = this.f8500z & 112;
                    int i30 = max;
                    if (i15 == 48) {
                        if (i15 != 80) {
                            int i31 = (((height - paddingTop2) - paddingBottom) - i29) / 2;
                            int i32 = ((ViewGroup.MarginLayoutParams) h1Var3).topMargin + this.f8495u;
                            if (i31 < i32) {
                                i31 = i32;
                            } else {
                                int i33 = (((height - paddingBottom) - i29) - i31) - paddingTop2;
                                int i34 = ((ViewGroup.MarginLayoutParams) h1Var3).bottomMargin;
                                int i35 = this.f8496v;
                                if (i33 < i34 + i35) {
                                    i31 = Math.max(0, i31 - ((((ViewGroup.MarginLayoutParams) h1Var4).bottomMargin + i35) - i33));
                                }
                            }
                            paddingTop = paddingTop2 + i31;
                        } else {
                            paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) h1Var4).bottomMargin) - this.f8496v) - i29;
                        }
                    } else {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) h1Var3).topMargin + this.f8495u;
                    }
                    if (!z10) {
                        if (z11) {
                            i19 = this.f8493s;
                        } else {
                            i19 = 0;
                        }
                        int i36 = i19 - iArr[1];
                        min -= Math.max(0, i36);
                        iArr[1] = Math.max(0, -i36);
                        if (u8) {
                            h1 h1Var5 = (h1) this.f8481e.getLayoutParams();
                            int measuredWidth = min - this.f8481e.getMeasuredWidth();
                            int measuredHeight = this.f8481e.getMeasuredHeight() + paddingTop;
                            this.f8481e.layout(measuredWidth, paddingTop, min, measuredHeight);
                            i20 = measuredWidth - this.f8494t;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) h1Var5).bottomMargin;
                        } else {
                            i20 = min;
                        }
                        if (u9) {
                            int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((h1) this.f8482f.getLayoutParams())).topMargin;
                            this.f8482f.layout(min - this.f8482f.getMeasuredWidth(), i37, min, this.f8482f.getMeasuredHeight() + i37);
                            i21 = min - this.f8494t;
                        } else {
                            i21 = min;
                        }
                        if (z11) {
                            min = Math.min(i20, i21);
                        }
                        max = i30;
                    } else {
                        if (z11) {
                            i16 = this.f8493s;
                        } else {
                            i16 = 0;
                        }
                        int i38 = i16 - iArr[0];
                        max = Math.max(0, i38) + i30;
                        iArr[0] = Math.max(0, -i38);
                        if (u8) {
                            h1 h1Var6 = (h1) this.f8481e.getLayoutParams();
                            int measuredWidth2 = this.f8481e.getMeasuredWidth() + max;
                            int measuredHeight2 = this.f8481e.getMeasuredHeight() + paddingTop;
                            this.f8481e.layout(max, paddingTop, measuredWidth2, measuredHeight2);
                            i17 = measuredWidth2 + this.f8494t;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) h1Var6).bottomMargin;
                        } else {
                            i17 = max;
                        }
                        if (u9) {
                            int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((h1) this.f8482f.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.f8482f.getMeasuredWidth() + max;
                            this.f8482f.layout(max, i39, measuredWidth3, this.f8482f.getMeasuredHeight() + i39);
                            i18 = measuredWidth3 + this.f8494t;
                        } else {
                            i18 = max;
                        }
                        if (z11) {
                            max = Math.max(i17, i18);
                        }
                    }
                }
                ArrayList arrayList = this.f8464G;
                a(arrayList, 3);
                size = arrayList.size();
                i22 = max;
                for (i23 = 0; i23 < size; i23++) {
                    i22 = q((View) arrayList.get(i23), i22, i11, iArr);
                }
                a(arrayList, 5);
                size2 = arrayList.size();
                for (i24 = 0; i24 < size2; i24++) {
                    min = r((View) arrayList.get(i24), min, i11, iArr);
                }
                a(arrayList, 1);
                int i40 = iArr[0];
                int i41 = iArr[1];
                size3 = arrayList.size();
                int i42 = i40;
                i25 = 0;
                int i43 = 0;
                while (i25 < size3) {
                    View view = (View) arrayList.get(i25);
                    h1 h1Var7 = (h1) view.getLayoutParams();
                    int i44 = i41;
                    int i45 = ((ViewGroup.MarginLayoutParams) h1Var7).leftMargin - i42;
                    int i46 = ((ViewGroup.MarginLayoutParams) h1Var7).rightMargin - i44;
                    int max2 = Math.max(0, i45);
                    int max3 = Math.max(0, i46);
                    int max4 = Math.max(0, -i45);
                    int max5 = Math.max(0, -i46);
                    i43 += view.getMeasuredWidth() + max2 + max3;
                    i25++;
                    i42 = max4;
                    i41 = max5;
                }
                i27 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i43 / 2);
                int i47 = i43 + i27;
                if (i27 >= i22) {
                    if (i47 > min) {
                        i22 = i27 - (i47 - min);
                    } else {
                        i22 = i27;
                    }
                }
                size4 = arrayList.size();
                for (i26 = 0; i26 < size4; i26++) {
                    i22 = q((View) arrayList.get(i26), i22, i11, iArr);
                }
                arrayList.clear();
            }
            i12 = q(this.f8483g, paddingLeft, i11, iArr);
        } else {
            i12 = paddingLeft;
        }
        i13 = i28;
        if (u(this.k)) {
        }
        if (u(this.f8480d)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i12);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i28 - i13));
        max = Math.max(i12, currentContentInsetLeft2);
        int min2 = Math.min(i13, i28 - currentContentInsetRight2);
        if (u(this.f8486l)) {
        }
        if (u(this.f8484h)) {
        }
        u8 = u(this.f8481e);
        u9 = u(this.f8482f);
        if (!u8) {
        }
        if (!u9) {
        }
        if (!u8) {
        }
        if (!u8) {
        }
        if (!u9) {
        }
        h1 h1Var32 = (h1) c1178a0.getLayoutParams();
        h1 h1Var42 = (h1) c1178a02.getLayoutParams();
        int i292 = i14;
        if (!u8) {
        }
        z11 = false;
        i15 = this.f8500z & 112;
        int i302 = max;
        if (i15 == 48) {
        }
        if (!z10) {
        }
        ArrayList arrayList2 = this.f8464G;
        a(arrayList2, 3);
        size = arrayList2.size();
        i22 = max;
        while (i23 < size) {
        }
        a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i24 < size2) {
        }
        a(arrayList2, 1);
        int i402 = iArr[0];
        int i412 = iArr[1];
        size3 = arrayList2.size();
        int i422 = i402;
        i25 = 0;
        int i432 = 0;
        while (i25 < size3) {
        }
        i27 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i432 / 2);
        int i472 = i432 + i27;
        if (i27 >= i22) {
        }
        size4 = arrayList2.size();
        while (i26 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i4, int i8) {
        char c6;
        Object[] objArr;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z8 = t1.f13385a;
        int i16 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c6 = 0;
        } else {
            c6 = 1;
            objArr = false;
        }
        if (u(this.f8483g)) {
            t(this.f8483g, i4, 0, i8, this.f8492r);
            i9 = k(this.f8483g) + this.f8483g.getMeasuredWidth();
            i10 = Math.max(0, l(this.f8483g) + this.f8483g.getMeasuredHeight());
            i11 = View.combineMeasuredStates(0, this.f8483g.getMeasuredState());
        } else {
            i9 = 0;
            i10 = 0;
            i11 = 0;
        }
        if (u(this.k)) {
            t(this.k, i4, 0, i8, this.f8492r);
            i9 = k(this.k) + this.k.getMeasuredWidth();
            i10 = Math.max(i10, l(this.k) + this.k.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.k.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i9);
        int max2 = Math.max(0, currentContentInsetStart - i9);
        Object[] objArr2 = objArr;
        int[] iArr = this.f8466I;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (u(this.f8480d)) {
            t(this.f8480d, i4, max, i8, this.f8492r);
            i12 = k(this.f8480d) + this.f8480d.getMeasuredWidth();
            i10 = Math.max(i10, l(this.f8480d) + this.f8480d.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f8480d.getMeasuredState());
        } else {
            i12 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i12);
        iArr[c6] = Math.max(0, currentContentInsetEnd - i12);
        if (u(this.f8486l)) {
            max3 += s(this.f8486l, i4, max3, i8, 0, iArr);
            i10 = Math.max(i10, l(this.f8486l) + this.f8486l.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f8486l.getMeasuredState());
        }
        if (u(this.f8484h)) {
            max3 += s(this.f8484h, i4, max3, i8, 0, iArr);
            i10 = Math.max(i10, l(this.f8484h) + this.f8484h.getMeasuredHeight());
            i11 = View.combineMeasuredStates(i11, this.f8484h.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (((h1) childAt.getLayoutParams()).f13264b == 0 && u(childAt)) {
                max3 += s(childAt, i4, max3, i8, 0, iArr);
                int max4 = Math.max(i10, l(childAt) + childAt.getMeasuredHeight());
                i11 = View.combineMeasuredStates(i11, childAt.getMeasuredState());
                i10 = max4;
            } else {
                max3 = max3;
            }
        }
        int i18 = max3;
        int i19 = this.f8495u + this.f8496v;
        int i20 = this.f8493s + this.f8494t;
        if (u(this.f8481e)) {
            s(this.f8481e, i4, i18 + i20, i8, i19, iArr);
            int k = k(this.f8481e) + this.f8481e.getMeasuredWidth();
            i13 = l(this.f8481e) + this.f8481e.getMeasuredHeight();
            i14 = View.combineMeasuredStates(i11, this.f8481e.getMeasuredState());
            i15 = k;
        } else {
            i13 = 0;
            i14 = i11;
            i15 = 0;
        }
        if (u(this.f8482f)) {
            i15 = Math.max(i15, s(this.f8482f, i4, i18 + i20, i8, i19 + i13, iArr));
            i13 += l(this.f8482f) + this.f8482f.getMeasuredHeight();
            i14 = View.combineMeasuredStates(i14, this.f8482f.getMeasuredState());
        }
        int max5 = Math.max(i10, i13);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i18 + i15;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i4, (-16777216) & i14);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i8, i14 << 16);
        if (this.f8475S) {
            int childCount2 = getChildCount();
            for (int i21 = 0; i21 < childCount2; i21++) {
                View childAt2 = getChildAt(i21);
                if (!u(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i16);
        }
        i16 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i16);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        m mVar;
        MenuItem findItem;
        if (!(parcelable instanceof j1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j1 j1Var = (j1) parcelable;
        super.onRestoreInstanceState(j1Var.f6209d);
        ActionMenuView actionMenuView = this.f8480d;
        if (actionMenuView != null) {
            mVar = actionMenuView.f8394s;
        } else {
            mVar = null;
        }
        int i4 = j1Var.f13267f;
        if (i4 != 0 && this.f8472P != null && mVar != null && (findItem = mVar.findItem(i4)) != null) {
            findItem.expandActionView();
        }
        if (j1Var.f13268g) {
            x xVar = this.f8479W;
            removeCallbacks(xVar);
            post(xVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        d();
        N0 n02 = this.f8497w;
        boolean z8 = true;
        if (i4 != 1) {
            z8 = false;
        }
        if (z8 == n02.f13120g) {
            return;
        }
        n02.f13120g = z8;
        if (n02.f13121h) {
            if (z8) {
                int i8 = n02.f13117d;
                if (i8 == Integer.MIN_VALUE) {
                    i8 = n02.f13118e;
                }
                n02.f13114a = i8;
                int i9 = n02.f13116c;
                if (i9 == Integer.MIN_VALUE) {
                    i9 = n02.f13119f;
                }
                n02.f13115b = i9;
                return;
            }
            int i10 = n02.f13116c;
            if (i10 == Integer.MIN_VALUE) {
                i10 = n02.f13118e;
            }
            n02.f13114a = i10;
            int i11 = n02.f13117d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = n02.f13119f;
            }
            n02.f13115b = i11;
            return;
        }
        n02.f13114a = n02.f13118e;
        n02.f13115b = n02.f13119f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, o.j1, V.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        o oVar;
        ?? bVar = new V.b(super.onSaveInstanceState());
        g1 g1Var = this.f8472P;
        if (g1Var != null && (oVar = g1Var.f13259e) != null) {
            bVar.f13267f = oVar.f12669a;
        }
        bVar.f13268g = p();
        return bVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f8462E = false;
        }
        if (!this.f8462E) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f8462E = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f8462E = false;
        return true;
    }

    public final boolean p() {
        C1197k c1197k;
        ActionMenuView actionMenuView = this.f8480d;
        if (actionMenuView != null && (c1197k = actionMenuView.f8398w) != null && c1197k.e()) {
            return true;
        }
        return false;
    }

    public final int q(View view, int i4, int i8, int[] iArr) {
        h1 h1Var = (h1) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) h1Var).leftMargin - iArr[0];
        int max = Math.max(0, i9) + i4;
        iArr[0] = Math.max(0, -i9);
        int j = j(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j, max + measuredWidth, view.getMeasuredHeight() + j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) h1Var).rightMargin + max;
    }

    public final int r(View view, int i4, int i8, int[] iArr) {
        h1 h1Var = (h1) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) h1Var).rightMargin - iArr[1];
        int max = i4 - Math.max(0, i9);
        iArr[1] = Math.max(0, -i9);
        int j = j(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j, max, view.getMeasuredHeight() + j);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) h1Var).leftMargin);
    }

    public final int s(View view, int i4, int i8, int i9, int i10, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = marginLayoutParams.leftMargin - iArr[0];
        int i12 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i12) + Math.max(0, i11);
        iArr[0] = Math.max(0, -i11);
        iArr[1] = Math.max(0, -i12);
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + max + i8, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public void setBackInvokedCallbackEnabled(boolean z8) {
        if (this.f8478V != z8) {
            this.f8478V = z8;
            w();
        }
    }

    public void setCollapseContentDescription(int i4) {
        setCollapseContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setCollapseIcon(int i4) {
        setCollapseIcon(g.k(getContext(), i4));
    }

    public void setCollapsible(boolean z8) {
        this.f8475S = z8;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f8499y) {
            this.f8499y = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f8498x) {
            this.f8498x = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i4) {
        setLogo(g.k(getContext(), i4));
    }

    public void setLogoDescription(int i4) {
        setLogoDescription(getContext().getText(i4));
    }

    public void setNavigationContentDescription(int i4) {
        setNavigationContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setNavigationIcon(int i4) {
        setNavigationIcon(g.k(getContext(), i4));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f8483g.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(i1 i1Var) {
        this.f8468L = i1Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f8480d.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i4) {
        if (this.f8488n != i4) {
            this.f8488n = i4;
            if (i4 == 0) {
                this.f8487m = getContext();
            } else {
                this.f8487m = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setSubtitle(int i4) {
        setSubtitle(getContext().getText(i4));
    }

    public void setSubtitleTextColor(int i4) {
        setSubtitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setTitle(int i4) {
        setTitle(getContext().getText(i4));
    }

    public void setTitleMarginBottom(int i4) {
        this.f8496v = i4;
        requestLayout();
    }

    public void setTitleMarginEnd(int i4) {
        this.f8494t = i4;
        requestLayout();
    }

    public void setTitleMarginStart(int i4) {
        this.f8493s = i4;
        requestLayout();
    }

    public void setTitleMarginTop(int i4) {
        this.f8495u = i4;
        requestLayout();
    }

    public void setTitleTextColor(int i4) {
        setTitleTextColor(ColorStateList.valueOf(i4));
    }

    public final void t(View view, int i4, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i9, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i10 >= 0) {
            if (mode != 0) {
                i10 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i10);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean u(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final boolean v() {
        C1197k c1197k;
        ActionMenuView actionMenuView = this.f8480d;
        if (actionMenuView != null && (c1197k = actionMenuView.f8398w) != null && c1197k.n()) {
            return true;
        }
        return false;
    }

    public final void w() {
        boolean z8;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a3 = f1.a(this);
            g1 g1Var = this.f8472P;
            if (g1Var != null && g1Var.f13259e != null && a3 != null && isAttachedToWindow() && this.f8478V) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8 && this.f8477U == null) {
                if (this.f8476T == null) {
                    this.f8476T = f1.b(new e1(this, 0));
                }
                f1.c(a3, this.f8476T);
                this.f8477U = a3;
                return;
            }
            if (!z8 && (onBackInvokedDispatcher = this.f8477U) != null) {
                f1.d(onBackInvokedDispatcher, this.f8476T);
                this.f8477U = null;
            }
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f8500z = 8388627;
        this.f8464G = new ArrayList();
        this.f8465H = new ArrayList();
        this.f8466I = new int[2];
        this.f8467J = new A4.c(new e1(this, 1));
        this.K = new ArrayList();
        int i8 = 10;
        this.f8469M = new L(i8, this);
        this.f8479W = new x(i8, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0805a.f11297y;
        R.g J6 = R.g.J(context2, attributeSet, iArr, R.attr.toolbarStyle);
        O.l(this, context, iArr, attributeSet, (TypedArray) J6.f4988f, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) J6.f4988f;
        this.f8489o = typedArray.getResourceId(28, 0);
        this.f8490p = typedArray.getResourceId(19, 0);
        this.f8500z = typedArray.getInteger(0, 8388627);
        this.f8491q = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f8496v = dimensionPixelOffset;
        this.f8495u = dimensionPixelOffset;
        this.f8494t = dimensionPixelOffset;
        this.f8493s = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f8493s = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f8494t = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f8495u = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f8496v = dimensionPixelOffset5;
        }
        this.f8492r = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        N0 n02 = this.f8497w;
        n02.f13121h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            n02.f13118e = dimensionPixelSize;
            n02.f13114a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            n02.f13119f = dimensionPixelSize2;
            n02.f13115b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            n02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f8498x = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f8499y = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f8485i = J6.A(4);
        this.j = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f8487m = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable A2 = J6.A(16);
        if (A2 != null) {
            setNavigationIcon(A2);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable A8 = J6.A(11);
        if (A8 != null) {
            setLogo(A8);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(J6.z(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(J6.z(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        J6.L();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, o.h1] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f13263a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0805a.f11276b);
        marginLayoutParams.f13263a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.f13264b = 0;
        return marginLayoutParams;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C1224y c1224y = this.k;
        if (c1224y != null) {
            c1224y.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.k.setImageDrawable(drawable);
        } else {
            C1224y c1224y = this.k;
            if (c1224y != null) {
                c1224y.setImageDrawable(this.f8485i);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f8484h == null) {
                this.f8484h = new AppCompatImageView(getContext(), null);
            }
            if (!o(this.f8484h)) {
                b(this.f8484h, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f8484h;
            if (appCompatImageView != null && o(appCompatImageView)) {
                removeView(this.f8484h);
                this.f8465H.remove(this.f8484h);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f8484h;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f8484h == null) {
            this.f8484h = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.f8484h;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C1224y c1224y = this.f8483g;
        if (c1224y != null) {
            c1224y.setContentDescription(charSequence);
            AbstractC0862a.w(this.f8483g, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f8483g)) {
                b(this.f8483g, true);
            }
        } else {
            C1224y c1224y = this.f8483g;
            if (c1224y != null && o(c1224y)) {
                removeView(this.f8483g);
                this.f8465H.remove(this.f8483g);
            }
        }
        C1224y c1224y2 = this.f8483g;
        if (c1224y2 != null) {
            c1224y2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f8482f == null) {
                Context context = getContext();
                C1178a0 c1178a0 = new C1178a0(context, null);
                this.f8482f = c1178a0;
                c1178a0.setSingleLine();
                this.f8482f.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f8490p;
                if (i4 != 0) {
                    this.f8482f.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.f8461D;
                if (colorStateList != null) {
                    this.f8482f.setTextColor(colorStateList);
                }
            }
            if (!o(this.f8482f)) {
                b(this.f8482f, true);
            }
        } else {
            C1178a0 c1178a02 = this.f8482f;
            if (c1178a02 != null && o(c1178a02)) {
                removeView(this.f8482f);
                this.f8465H.remove(this.f8482f);
            }
        }
        C1178a0 c1178a03 = this.f8482f;
        if (c1178a03 != null) {
            c1178a03.setText(charSequence);
        }
        this.f8459B = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f8461D = colorStateList;
        C1178a0 c1178a0 = this.f8482f;
        if (c1178a0 != null) {
            c1178a0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f8481e == null) {
                Context context = getContext();
                C1178a0 c1178a0 = new C1178a0(context, null);
                this.f8481e = c1178a0;
                c1178a0.setSingleLine();
                this.f8481e.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f8489o;
                if (i4 != 0) {
                    this.f8481e.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.f8460C;
                if (colorStateList != null) {
                    this.f8481e.setTextColor(colorStateList);
                }
            }
            if (!o(this.f8481e)) {
                b(this.f8481e, true);
            }
        } else {
            C1178a0 c1178a02 = this.f8481e;
            if (c1178a02 != null && o(c1178a02)) {
                removeView(this.f8481e);
                this.f8465H.remove(this.f8481e);
            }
        }
        C1178a0 c1178a03 = this.f8481e;
        if (c1178a03 != null) {
            c1178a03.setText(charSequence);
        }
        this.f8458A = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f8460C = colorStateList;
        C1178a0 c1178a0 = this.f8481e;
        if (c1178a0 != null) {
            c1178a0.setTextColor(colorStateList);
        }
    }
}
