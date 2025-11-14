package androidx.coordinatorlayout.widget;

import A0.i;
import A4.a;
import C.b;
import C.e;
import C.f;
import C.g;
import C.h;
import O.d;
import P.C0267o;
import P.D;
import P.F;
import P.InterfaceC0265m;
import P.InterfaceC0266n;
import P.O;
import P.t0;
import W0.c;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.buzbuz.smartautoclicker.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import t.j;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0265m, InterfaceC0266n {

    /* renamed from: A, reason: collision with root package name */
    public static final d f8529A;

    /* renamed from: w, reason: collision with root package name */
    public static final String f8530w;

    /* renamed from: x, reason: collision with root package name */
    public static final Class[] f8531x;

    /* renamed from: y, reason: collision with root package name */
    public static final ThreadLocal f8532y;

    /* renamed from: z, reason: collision with root package name */
    public static final i f8533z;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8534d;

    /* renamed from: e, reason: collision with root package name */
    public final a f8535e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f8536f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f8537g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f8538h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f8539i;
    public boolean j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f8540l;

    /* renamed from: m, reason: collision with root package name */
    public View f8541m;

    /* renamed from: n, reason: collision with root package name */
    public View f8542n;

    /* renamed from: o, reason: collision with root package name */
    public g f8543o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8544p;

    /* renamed from: q, reason: collision with root package name */
    public t0 f8545q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8546r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f8547s;

    /* renamed from: t, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f8548t;

    /* renamed from: u, reason: collision with root package name */
    public c f8549u;

    /* renamed from: v, reason: collision with root package name */
    public final C0267o f8550v;

    static {
        String str;
        Package r02 = CoordinatorLayout.class.getPackage();
        if (r02 != null) {
            str = r02.getName();
        } else {
            str = null;
        }
        f8530w = str;
        f8533z = new i(4);
        f8531x = new Class[]{Context.class, AttributeSet.class};
        f8532y = new ThreadLocal();
        f8529A = new d(12);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [P.o, java.lang.Object] */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f8534d = new ArrayList();
        this.f8535e = new a(2);
        this.f8536f = new ArrayList();
        this.f8537g = new ArrayList();
        this.f8538h = new int[2];
        this.f8539i = new int[2];
        this.f8550v = new Object();
        int[] iArr = B.a.f412a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f8540l = intArray;
            float f8 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i4 = 0; i4 < length; i4++) {
                this.f8540l[i4] = (int) (r1[i4] * f8);
            }
        }
        this.f8547s = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new e(this));
        WeakHashMap weakHashMap = O.f4214a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f8529A.a();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void m(int i4, Rect rect, Rect rect2, f fVar, int i8, int i9) {
        int width;
        int height;
        int i10 = fVar.f534c;
        if (i10 == 0) {
            i10 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, i4);
        int i11 = fVar.f535d;
        if ((i11 & 7) == 0) {
            i11 |= 8388611;
        }
        if ((i11 & 112) == 0) {
            i11 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, i4);
        int i12 = absoluteGravity & 7;
        int i13 = absoluteGravity & 112;
        int i14 = absoluteGravity2 & 7;
        int i15 = absoluteGravity2 & 112;
        if (i14 != 1) {
            if (i14 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i15 != 16) {
            if (i15 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i12 != 1) {
            if (i12 != 5) {
                width -= i8;
            }
        } else {
            width -= i8 / 2;
        }
        if (i13 != 16) {
            if (i13 != 80) {
                height -= i9;
            }
        } else {
            height -= i9 / 2;
        }
        rect2.set(width, height, i8 + width, i9 + height);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f o(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f533b) {
            if (view instanceof b) {
                C.c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                C.c cVar = fVar.f532a;
                if (cVar != behavior) {
                    if (cVar != null) {
                        cVar.j();
                    }
                    fVar.f532a = behavior;
                    fVar.f533b = true;
                    if (behavior != null) {
                        behavior.g(fVar);
                    }
                }
                fVar.f533b = true;
                return fVar;
            }
            C.d dVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                dVar = (C.d) cls.getAnnotation(C.d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    C.c cVar2 = (C.c) dVar.value().getDeclaredConstructor(null).newInstance(null);
                    C.c cVar3 = fVar.f532a;
                    if (cVar3 != cVar2) {
                        if (cVar3 != null) {
                            cVar3.j();
                        }
                        fVar.f532a = cVar2;
                        fVar.f533b = true;
                        if (cVar2 != null) {
                            cVar2.g(fVar);
                        }
                    }
                } catch (Exception e9) {
                    Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e9);
                }
            }
            fVar.f533b = true;
        }
        return fVar;
    }

    public static void w(View view, int i4) {
        f fVar = (f) view.getLayoutParams();
        int i8 = fVar.f540i;
        if (i8 != i4) {
            WeakHashMap weakHashMap = O.f4214a;
            view.offsetLeftAndRight(i4 - i8);
            fVar.f540i = i4;
        }
    }

    public static void x(View view, int i4) {
        f fVar = (f) view.getLayoutParams();
        int i8 = fVar.j;
        if (i8 != i4) {
            WeakHashMap weakHashMap = O.f4214a;
            view.offsetTopAndBottom(i4 - i8);
            fVar.j = i4;
        }
    }

    @Override // P.InterfaceC0265m
    public final void a(View view, View view2, int i4, int i8) {
        C0267o c0267o = this.f8550v;
        if (i8 == 1) {
            c0267o.f4299b = i4;
        } else {
            c0267o.f4298a = i4;
        }
        this.f8542n = view2;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            ((f) getChildAt(i9).getLayoutParams()).getClass();
        }
    }

    @Override // P.InterfaceC0265m
    public final void b(View view, int i4) {
        C0267o c0267o = this.f8550v;
        if (i4 == 1) {
            c0267o.f4299b = 0;
        } else {
            c0267o.f4298a = 0;
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i4)) {
                C.c cVar = fVar.f532a;
                if (cVar != null) {
                    cVar.u(this, childAt, view, i4);
                }
                if (i4 != 0) {
                    if (i4 == 1) {
                        fVar.f543n = false;
                    }
                } else {
                    fVar.f542m = false;
                }
                fVar.f544o = false;
            }
        }
        this.f8542n = null;
    }

    @Override // P.InterfaceC0265m
    public final void c(View view, int i4, int i8, int[] iArr, int i9) {
        C.c cVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z8 = false;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i9) && (cVar = fVar.f532a) != null) {
                    int[] iArr2 = this.f8538h;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.o(this, childAt, view, i4, i8, iArr2, i9);
                    if (i4 > 0) {
                        min = Math.max(i10, iArr2[0]);
                    } else {
                        min = Math.min(i10, iArr2[0]);
                    }
                    i10 = min;
                    if (i8 > 0) {
                        min2 = Math.max(i11, iArr2[1]);
                    } else {
                        min2 = Math.min(i11, iArr2[1]);
                    }
                    i11 = min2;
                    z8 = true;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
        if (z8) {
            q(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof f) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // P.InterfaceC0266n
    public final void d(View view, int i4, int i8, int i9, int i10, int i11, int[] iArr) {
        C.c cVar;
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        boolean z8 = false;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i11) && (cVar = fVar.f532a) != null) {
                    int[] iArr2 = this.f8538h;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.p(this, childAt, i8, i9, i10, iArr2);
                    if (i9 > 0) {
                        i12 = Math.max(i12, iArr2[0]);
                    } else {
                        i12 = Math.min(i12, iArr2[0]);
                    }
                    if (i10 > 0) {
                        i13 = Math.max(i13, iArr2[1]);
                    } else {
                        i13 = Math.min(i13, iArr2[1]);
                    }
                    z8 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i12;
        iArr[1] = iArr[1] + i13;
        if (z8) {
            q(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C.c cVar = ((f) view.getLayoutParams()).f532a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z8;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f8547s;
        if (drawable != null && drawable.isStateful()) {
            z8 = drawable.setState(drawableState);
        } else {
            z8 = false;
        }
        if (z8) {
            invalidate();
        }
    }

    @Override // P.InterfaceC0265m
    public final void e(View view, int i4, int i8, int i9, int i10, int i11) {
        d(view, i4, i8, i9, i10, 0, this.f8539i);
    }

    @Override // P.InterfaceC0265m
    public final boolean f(View view, View view2, int i4, int i8) {
        View view3;
        int i9;
        int i10;
        int childCount = getChildCount();
        int i11 = 0;
        boolean z8 = false;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 8) {
                view3 = view;
                i9 = i4;
                i10 = i8;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                C.c cVar = fVar.f532a;
                if (cVar != null) {
                    view3 = view;
                    i9 = i4;
                    i10 = i8;
                    boolean t8 = cVar.t(this, childAt, view3, i9, i10);
                    z8 |= t8;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            fVar.f543n = t8;
                        }
                    } else {
                        fVar.f542m = t8;
                    }
                } else {
                    view3 = view;
                    i9 = i4;
                    i10 = i8;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            fVar.f543n = false;
                        }
                    } else {
                        fVar.f542m = false;
                    }
                }
            }
            i11++;
            view = view3;
            i4 = i9;
            i8 = i10;
        }
        return z8;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.f8534d);
    }

    public final t0 getLastWindowInsets() {
        return this.f8545q;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0267o c0267o = this.f8550v;
        return c0267o.f4299b | c0267o.f4298a;
    }

    public Drawable getStatusBarBackground() {
        return this.f8547s;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(f fVar, Rect rect, int i4, int i8) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i4) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i8) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i4 + max, i8 + max2);
    }

    public final void i(View view) {
        List list = (List) ((j) this.f8535e.f281f).get(view);
        if (list != null && !list.isEmpty()) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                View view2 = (View) list.get(i4);
                C.c cVar = ((f) view2.getLayoutParams()).f532a;
                if (cVar != null) {
                    cVar.h(this, view2, view);
                }
            }
        }
    }

    public final void j(View view, Rect rect, boolean z8) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z8) {
                l(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    public final ArrayList k(View view) {
        j jVar = (j) this.f8535e.f281f;
        int i4 = jVar.f14670f;
        ArrayList arrayList = null;
        for (int i8 = 0; i8 < i4; i8++) {
            ArrayList arrayList2 = (ArrayList) jVar.i(i8);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(jVar.f(i8));
            }
        }
        ArrayList arrayList3 = this.f8537g;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void l(View view, Rect rect) {
        ThreadLocal threadLocal = C.i.f549a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = C.i.f549a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        C.i.a(this, view, matrix);
        ThreadLocal threadLocal3 = C.i.f550b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int n(int i4) {
        int[] iArr = this.f8540l;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i4);
            return 0;
        }
        if (i4 >= 0 && i4 < iArr.length) {
            return iArr[i4];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i4 + " out of range for " + this);
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i4 = 0;
        v(false);
        if (this.f8544p) {
            if (this.f8543o == null) {
                this.f8543o = new g(i4, this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f8543o);
        }
        if (this.f8545q == null) {
            WeakHashMap weakHashMap = O.f4214a;
            if (getFitsSystemWindows()) {
                D.c(this);
            }
        }
        this.k = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.f8544p && this.f8543o != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f8543o);
        }
        View view = this.f8542n;
        if (view != null) {
            b(view, 0);
        }
        this.k = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i4;
        super.onDraw(canvas);
        if (this.f8546r && this.f8547s != null) {
            t0 t0Var = this.f8545q;
            if (t0Var != null) {
                i4 = t0Var.d();
            } else {
                i4 = 0;
            }
            if (i4 > 0) {
                this.f8547s.setBounds(0, 0, getWidth(), i4);
                this.f8547s.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v(true);
        }
        boolean t8 = t(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return t8;
        }
        v(true);
        return t8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        C.c cVar;
        WeakHashMap weakHashMap = O.f4214a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f8534d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) arrayList.get(i11);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f532a) == null || !cVar.l(this, view, layoutDirection))) {
                r(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i4, int i8) {
        boolean z8;
        boolean z9;
        boolean z10;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C.c cVar;
        int i15;
        int i16;
        boolean z11;
        int i17;
        int i18;
        ArrayList arrayList;
        int i19;
        int i20;
        View view;
        int i21;
        int max;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.u();
        int childCount = coordinatorLayout.getChildCount();
        int i22 = 0;
        int i23 = 0;
        loop0: while (true) {
            if (i23 < childCount) {
                View childAt = coordinatorLayout.getChildAt(i23);
                j jVar = (j) coordinatorLayout.f8535e.f281f;
                int i24 = jVar.f14670f;
                for (int i25 = 0; i25 < i24; i25++) {
                    ArrayList arrayList2 = (ArrayList) jVar.i(i25);
                    if (arrayList2 != null && arrayList2.contains(childAt)) {
                        z8 = true;
                        break loop0;
                    }
                }
                i23++;
            } else {
                z8 = false;
                break;
            }
        }
        if (z8 != coordinatorLayout.f8544p) {
            if (z8) {
                if (coordinatorLayout.k) {
                    if (coordinatorLayout.f8543o == null) {
                        coordinatorLayout.f8543o = new g(i22, coordinatorLayout);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.f8543o);
                }
                coordinatorLayout.f8544p = true;
            } else {
                if (coordinatorLayout.k && coordinatorLayout.f8543o != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.f8543o);
                }
                coordinatorLayout.f8544p = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = O.f4214a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        if (layoutDirection == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        int i26 = paddingLeft + paddingRight;
        int i27 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        if (coordinatorLayout.f8545q != null && coordinatorLayout.getFitsSystemWindows()) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList3 = coordinatorLayout.f8534d;
        int size3 = arrayList3.size();
        int i28 = 0;
        int i29 = 0;
        while (i28 < size3) {
            View view2 = (View) arrayList3.get(i28);
            int i30 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList3;
                i12 = size3;
                i21 = i28;
                i15 = paddingLeft;
                suggestedMinimumWidth = i30;
                z11 = false;
                i17 = paddingRight;
            } else {
                f fVar = (f) view2.getLayoutParams();
                int i31 = fVar.f536e;
                if (i31 >= 0 && mode != 0) {
                    int n3 = coordinatorLayout.n(i31);
                    int i32 = fVar.f534c;
                    if (i32 == 0) {
                        i32 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i32, layoutDirection) & 7;
                    i9 = suggestedMinimumHeight;
                    if ((absoluteGravity == 3 && !z9) || (absoluteGravity == 5 && z9)) {
                        max = Math.max(0, (size - paddingRight) - n3);
                    } else if ((absoluteGravity == 5 && !z9) || (absoluteGravity == 3 && z9)) {
                        max = Math.max(0, n3 - paddingLeft);
                    }
                    int i33 = size3;
                    i11 = max;
                    i10 = i33;
                    if (!z10 && !view2.getFitsSystemWindows()) {
                        i12 = i10;
                        int c6 = coordinatorLayout.f8545q.c() + coordinatorLayout.f8545q.b();
                        int a3 = coordinatorLayout.f8545q.a() + coordinatorLayout.f8545q.d();
                        i13 = View.MeasureSpec.makeMeasureSpec(size - c6, mode);
                        i14 = View.MeasureSpec.makeMeasureSpec(size2 - a3, mode2);
                    } else {
                        i12 = i10;
                        i13 = i4;
                        i14 = i8;
                    }
                    cVar = fVar.f532a;
                    if (cVar == null) {
                        z11 = false;
                        i15 = paddingLeft;
                        i16 = i30;
                        i17 = paddingRight;
                        i18 = i9;
                        arrayList = arrayList3;
                        int i34 = i13;
                        i21 = i28;
                        int i35 = i14;
                        boolean m6 = cVar.m(this, view2, i34, i11, i35);
                        view = view2;
                        i13 = i34;
                        i19 = i11;
                        i20 = i35;
                        if (m6) {
                            coordinatorLayout = this;
                            int max2 = Math.max(i16, view.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                            int max3 = Math.max(i18, view.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                            i29 = View.combineMeasuredStates(i29, view.getMeasuredState());
                            suggestedMinimumWidth = max2;
                            suggestedMinimumHeight = max3;
                        }
                    } else {
                        i15 = paddingLeft;
                        i16 = i30;
                        z11 = false;
                        i17 = paddingRight;
                        i18 = i9;
                        arrayList = arrayList3;
                        i19 = i11;
                        i20 = i14;
                        view = view2;
                        i21 = i28;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, i13, i19, i20, 0);
                    int max22 = Math.max(i16, view.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int max32 = Math.max(i18, view.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    i29 = View.combineMeasuredStates(i29, view.getMeasuredState());
                    suggestedMinimumWidth = max22;
                    suggestedMinimumHeight = max32;
                } else {
                    i9 = suggestedMinimumHeight;
                }
                i10 = size3;
                i11 = 0;
                if (!z10) {
                }
                i12 = i10;
                i13 = i4;
                i14 = i8;
                cVar = fVar.f532a;
                if (cVar == null) {
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, i13, i19, i20, 0);
                int max222 = Math.max(i16, view.getMeasuredWidth() + i26 + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int max322 = Math.max(i18, view.getMeasuredHeight() + i27 + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                i29 = View.combineMeasuredStates(i29, view.getMeasuredState());
                suggestedMinimumWidth = max222;
                suggestedMinimumHeight = max322;
            }
            i28 = i21 + 1;
            paddingLeft = i15;
            paddingRight = i17;
            size3 = i12;
            arrayList3 = arrayList;
        }
        int i36 = i29;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i4, (-16777216) & i36), View.resolveSizeAndState(suggestedMinimumHeight, i8, i36 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f8, float f9, boolean z8) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    C.c cVar = fVar.f532a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f8, float f9) {
        C.c cVar;
        int childCount = getChildCount();
        boolean z8 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f532a) != null) {
                    z8 |= cVar.n(view);
                }
            }
        }
        return z8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i4, int i8, int[] iArr) {
        c(view, i4, i8, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i4, int i8, int i9, int i10) {
        e(view, i4, i8, i9, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i4) {
        a(view, view2, i4, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f6209d);
        SparseArray sparseArray = hVar.f548f;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            C.c cVar = o(childAt).f532a;
            if (id != -1 && cVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                cVar.r(childAt, parcelable2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, V.b, C.h] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable s8;
        ?? bVar = new V.b(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            C.c cVar = ((f) childAt.getLayoutParams()).f532a;
            if (id != -1 && cVar != null && (s8 = cVar.s(childAt)) != null) {
                sparseArray.append(id, s8);
            }
        }
        bVar.f548f = sparseArray;
        return bVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i4) {
        return f(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        boolean v8;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f8541m == null) {
            z8 = t(motionEvent, 1);
        } else {
            z8 = false;
        }
        C.c cVar = ((f) this.f8541m.getLayoutParams()).f532a;
        if (cVar != null) {
            v8 = cVar.v(this, this.f8541m, motionEvent);
            motionEvent2 = null;
            if (this.f8541m != null) {
                v8 |= super.onTouchEvent(motionEvent);
            } else if (z8) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return v8;
            }
            v(false);
            return v8;
        }
        v8 = false;
        motionEvent2 = null;
        if (this.f8541m != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked == 1) {
        }
        v(false);
        return v8;
    }

    public final boolean p(View view, int i4, int i8) {
        d dVar = f8529A;
        Rect g8 = g();
        l(view, g8);
        try {
            return g8.contains(i4, i8);
        } finally {
            g8.setEmpty();
            dVar.c(g8);
        }
    }

    public final void q(int i4) {
        int i8;
        Rect rect;
        int i9;
        ArrayList arrayList;
        boolean z8;
        boolean z9;
        boolean z10;
        int width;
        int i10;
        int i11;
        int i12;
        int height;
        int i13;
        int i14;
        int i15;
        ArrayList arrayList2;
        f fVar;
        int i16;
        int i17;
        Rect rect2;
        int i18;
        View view;
        boolean z11;
        C.c cVar;
        WeakHashMap weakHashMap = O.f4214a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList3 = this.f8534d;
        int size = arrayList3.size();
        Rect g8 = g();
        Rect g9 = g();
        Rect g10 = g();
        int i19 = 0;
        while (true) {
            d dVar = f8529A;
            if (i19 < size) {
                View view2 = (View) arrayList3.get(i19);
                f fVar2 = (f) view2.getLayoutParams();
                if (i4 == 0 && view2.getVisibility() == 8) {
                    arrayList = arrayList3;
                    i9 = size;
                    rect = g10;
                    i8 = i19;
                } else {
                    int i20 = 0;
                    while (i20 < i19) {
                        if (fVar2.f541l == ((View) arrayList3.get(i20))) {
                            f fVar3 = (f) view2.getLayoutParams();
                            if (fVar3.k != null) {
                                Rect g11 = g();
                                Rect g12 = g();
                                f fVar4 = fVar2;
                                Rect g13 = g();
                                l(fVar3.k, g11);
                                j(view2, g12, false);
                                int measuredWidth = view2.getMeasuredWidth();
                                View view3 = view2;
                                int measuredHeight = view3.getMeasuredHeight();
                                arrayList2 = arrayList3;
                                fVar = fVar4;
                                i16 = i20;
                                layoutDirection = layoutDirection;
                                i18 = i19;
                                view = view3;
                                m(layoutDirection, g11, g13, fVar3, measuredWidth, measuredHeight);
                                i17 = size;
                                rect2 = g10;
                                if (g13.left == g12.left && g13.top == g12.top) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                h(fVar3, g13, measuredWidth, measuredHeight);
                                int i21 = g13.left - g12.left;
                                int i22 = g13.top - g12.top;
                                if (i21 != 0) {
                                    WeakHashMap weakHashMap2 = O.f4214a;
                                    view.offsetLeftAndRight(i21);
                                }
                                if (i22 != 0) {
                                    WeakHashMap weakHashMap3 = O.f4214a;
                                    view.offsetTopAndBottom(i22);
                                }
                                if (z11 && (cVar = fVar3.f532a) != null) {
                                    cVar.h(this, view, fVar3.k);
                                }
                                g11.setEmpty();
                                dVar.c(g11);
                                g12.setEmpty();
                                dVar.c(g12);
                                g13.setEmpty();
                                dVar.c(g13);
                                i20 = i16 + 1;
                                fVar2 = fVar;
                                view2 = view;
                                arrayList3 = arrayList2;
                                size = i17;
                                i19 = i18;
                                g10 = rect2;
                            }
                        }
                        arrayList2 = arrayList3;
                        fVar = fVar2;
                        i16 = i20;
                        i17 = size;
                        rect2 = g10;
                        i18 = i19;
                        view = view2;
                        i20 = i16 + 1;
                        fVar2 = fVar;
                        view2 = view;
                        arrayList3 = arrayList2;
                        size = i17;
                        i19 = i18;
                        g10 = rect2;
                    }
                    ArrayList arrayList4 = arrayList3;
                    f fVar5 = fVar2;
                    int i23 = size;
                    Rect rect3 = g10;
                    i8 = i19;
                    View view4 = view2;
                    j(view4, g9, true);
                    if (fVar5.f538g != 0 && !g9.isEmpty()) {
                        int absoluteGravity = Gravity.getAbsoluteGravity(fVar5.f538g, layoutDirection);
                        int i24 = absoluteGravity & 112;
                        if (i24 != 48) {
                            if (i24 == 80) {
                                g8.bottom = Math.max(g8.bottom, getHeight() - g9.top);
                            }
                        } else {
                            g8.top = Math.max(g8.top, g9.bottom);
                        }
                        int i25 = absoluteGravity & 7;
                        if (i25 != 3) {
                            if (i25 == 5) {
                                g8.right = Math.max(g8.right, getWidth() - g9.left);
                            }
                        } else {
                            g8.left = Math.max(g8.left, g9.right);
                        }
                    }
                    if (fVar5.f539h != 0 && view4.getVisibility() == 0) {
                        WeakHashMap weakHashMap4 = O.f4214a;
                        if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                            f fVar6 = (f) view4.getLayoutParams();
                            C.c cVar2 = fVar6.f532a;
                            Rect g14 = g();
                            Rect g15 = g();
                            g15.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                            if (cVar2 != null && cVar2.e(view4, g14)) {
                                if (!g15.contains(g14)) {
                                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + g14.toShortString() + " | Bounds:" + g15.toShortString());
                                }
                            } else {
                                g14.set(g15);
                            }
                            g15.setEmpty();
                            dVar.c(g15);
                            if (g14.isEmpty()) {
                                g14.setEmpty();
                                dVar.c(g14);
                            } else {
                                int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar6.f539h, layoutDirection);
                                if ((absoluteGravity2 & 48) == 48 && (i14 = (g14.top - ((ViewGroup.MarginLayoutParams) fVar6).topMargin) - fVar6.j) < (i15 = g8.top)) {
                                    x(view4, i15 - i14);
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - g14.bottom) - ((ViewGroup.MarginLayoutParams) fVar6).bottomMargin) + fVar6.j) < (i13 = g8.bottom)) {
                                    x(view4, height - i13);
                                    z9 = true;
                                }
                                if (!z9) {
                                    x(view4, 0);
                                }
                                if ((absoluteGravity2 & 3) == 3 && (i11 = (g14.left - ((ViewGroup.MarginLayoutParams) fVar6).leftMargin) - fVar6.f540i) < (i12 = g8.left)) {
                                    w(view4, i12 - i11);
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - g14.right) - ((ViewGroup.MarginLayoutParams) fVar6).rightMargin) + fVar6.f540i) < (i10 = g8.right)) {
                                    w(view4, width - i10);
                                    z10 = true;
                                }
                                if (!z10) {
                                    w(view4, 0);
                                }
                                g14.setEmpty();
                                dVar.c(g14);
                            }
                        }
                    }
                    if (i4 != 2) {
                        rect = rect3;
                        rect.set(((f) view4.getLayoutParams()).f545p);
                        if (rect.equals(g9)) {
                            arrayList = arrayList4;
                            i9 = i23;
                        } else {
                            ((f) view4.getLayoutParams()).f545p.set(g9);
                        }
                    } else {
                        rect = rect3;
                    }
                    int i26 = i8 + 1;
                    i9 = i23;
                    while (true) {
                        arrayList = arrayList4;
                        if (i26 >= i9) {
                            break;
                        }
                        View view5 = (View) arrayList.get(i26);
                        f fVar7 = (f) view5.getLayoutParams();
                        C.c cVar3 = fVar7.f532a;
                        if (cVar3 != null && cVar3.f(view5, view4)) {
                            if (i4 == 0 && fVar7.f544o) {
                                fVar7.f544o = false;
                            } else {
                                if (i4 != 2) {
                                    z8 = cVar3.h(this, view5, view4);
                                } else {
                                    cVar3.i(this, view4);
                                    z8 = true;
                                }
                                if (i4 == 1) {
                                    fVar7.f544o = z8;
                                }
                            }
                        }
                        i26++;
                        arrayList4 = arrayList;
                    }
                }
                i19 = i8 + 1;
                g10 = rect;
                size = i9;
                arrayList3 = arrayList;
            } else {
                Rect rect4 = g10;
                g8.setEmpty();
                dVar.c(g8);
                g9.setEmpty();
                dVar.c(g9);
                rect4.setEmpty();
                dVar.c(rect4);
                return;
            }
        }
    }

    public final void r(View view, int i4) {
        Rect g8;
        Rect g9;
        int i8;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.k;
        if (view2 == null && fVar.f537f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        d dVar = f8529A;
        if (view2 != null) {
            g8 = g();
            g9 = g();
            try {
                l(view2, g8);
                f fVar2 = (f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m(i4, g8, g9, fVar2, measuredWidth, measuredHeight);
                h(fVar2, g9, measuredWidth, measuredHeight);
                view.layout(g9.left, g9.top, g9.right, g9.bottom);
                return;
            } finally {
                g8.setEmpty();
                dVar.c(g8);
                g9.setEmpty();
                dVar.c(g9);
            }
        }
        int i9 = fVar.f536e;
        if (i9 >= 0) {
            f fVar3 = (f) view.getLayoutParams();
            int i10 = fVar3.f534c;
            if (i10 == 0) {
                i10 = 8388661;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(i10, i4);
            int i11 = absoluteGravity & 7;
            int i12 = absoluteGravity & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i4 == 1) {
                i9 = width - i9;
            }
            int n3 = n(i9) - measuredWidth2;
            if (i11 != 1) {
                if (i11 == 5) {
                    n3 += measuredWidth2;
                }
            } else {
                n3 += measuredWidth2 / 2;
            }
            if (i12 != 16) {
                if (i12 != 80) {
                    i8 = 0;
                } else {
                    i8 = measuredHeight2;
                }
            } else {
                i8 = measuredHeight2 / 2;
            }
            int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin, Math.min(n3, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin));
            int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin, Math.min(i8, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        f fVar4 = (f) view.getLayoutParams();
        g8 = g();
        g8.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin);
        if (this.f8545q != null) {
            WeakHashMap weakHashMap = O.f4214a;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                g8.left = this.f8545q.b() + g8.left;
                g8.top = this.f8545q.d() + g8.top;
                g8.right -= this.f8545q.c();
                g8.bottom -= this.f8545q.a();
            }
        }
        g9 = g();
        int i13 = fVar4.f534c;
        if ((i13 & 7) == 0) {
            i13 |= 8388611;
        }
        if ((i13 & 112) == 0) {
            i13 |= 48;
        }
        Gravity.apply(i13, view.getMeasuredWidth(), view.getMeasuredHeight(), g8, g9, i4);
        view.layout(g9.left, g9.top, g9.right, g9.bottom);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z8) {
        C.c cVar = ((f) view.getLayoutParams()).f532a;
        if (cVar != null && cVar.q(this, view, rect, z8)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z8) {
        super.requestDisallowInterceptTouchEvent(z8);
        if (z8 && !this.j) {
            v(false);
            this.j = true;
        }
    }

    public final void s(int i4, int i8, int i9, View view) {
        measureChildWithMargins(view, i4, i8, i9, 0);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z8) {
        super.setFitsSystemWindows(z8);
        y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f8548t = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z8;
        Drawable drawable2 = this.f8547s;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f8547s = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f8547s.setState(getDrawableState());
                }
                Drawable drawable4 = this.f8547s;
                WeakHashMap weakHashMap = O.f4214a;
                drawable4.setLayoutDirection(getLayoutDirection());
                Drawable drawable5 = this.f8547s;
                if (getVisibility() == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                drawable5.setVisible(z8, false);
                this.f8547s.setCallback(this);
            }
            WeakHashMap weakHashMap2 = O.f4214a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i4) {
        setStatusBarBackground(new ColorDrawable(i4));
    }

    public void setStatusBarBackgroundResource(int i4) {
        Drawable drawable;
        if (i4 != 0) {
            drawable = getContext().getDrawable(i4);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        boolean z8;
        super.setVisibility(i4);
        if (i4 == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Drawable drawable = this.f8547s;
        if (drawable != null && drawable.isVisible() != z8) {
            this.f8547s.setVisible(z8, false);
        }
    }

    public final boolean t(MotionEvent motionEvent, int i4) {
        int i8;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f8536f;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i9 = childCount - 1; i9 >= 0; i9--) {
            if (isChildrenDrawingOrderEnabled) {
                i8 = getChildDrawingOrder(childCount, i9);
            } else {
                i8 = i9;
            }
            arrayList.add(getChildAt(i8));
        }
        i iVar = f8533z;
        if (iVar != null) {
            Collections.sort(arrayList, iVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z8 = false;
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) arrayList.get(i10);
            C.c cVar = ((f) view.getLayoutParams()).f532a;
            if (z8 && actionMasked != 0) {
                if (cVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i4 != 0) {
                        if (i4 == 1) {
                            cVar.v(this, view, motionEvent2);
                        }
                    } else {
                        cVar.k(this, view, motionEvent2);
                    }
                }
            } else if (!z8 && cVar != null) {
                if (i4 != 0) {
                    if (i4 == 1) {
                        z8 = cVar.v(this, view, motionEvent);
                    }
                } else {
                    z8 = cVar.k(this, view, motionEvent);
                }
                if (z8) {
                    this.f8541m = view;
                }
            }
        }
        arrayList.clear();
        return z8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f9, code lost:
    
        if ((android.view.Gravity.getAbsoluteGravity(r8.f539h, r12) & r13) == r13) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u() {
        ArrayList arrayList = this.f8534d;
        arrayList.clear();
        a aVar = this.f8535e;
        j jVar = (j) aVar.f281f;
        O.c cVar = (O.c) aVar.f280e;
        j jVar2 = (j) aVar.f281f;
        int i4 = jVar.f14670f;
        for (int i8 = 0; i8 < i4; i8++) {
            ArrayList arrayList2 = (ArrayList) jVar.i(i8);
            if (arrayList2 != null) {
                arrayList2.clear();
                cVar.c(arrayList2);
            }
        }
        jVar.clear();
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            f o7 = o(childAt);
            int i10 = o7.f537f;
            if (i10 == -1) {
                o7.f541l = null;
                o7.k = null;
            } else {
                View view = o7.k;
                if (view != null && view.getId() == i10) {
                    View view2 = o7.k;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent != null && parent != childAt) {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        } else {
                            o7.f541l = null;
                            o7.k = null;
                        }
                    }
                    o7.f541l = view2;
                }
                View findViewById = findViewById(i10);
                o7.k = findViewById;
                if (findViewById != null) {
                    if (findViewById == this) {
                        if (isInEditMode()) {
                            o7.f541l = null;
                            o7.k = null;
                        } else {
                            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        }
                    } else {
                        for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                            if (parent2 == childAt) {
                                if (isInEditMode()) {
                                    o7.f541l = null;
                                    o7.k = null;
                                } else {
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                            } else {
                                if (parent2 instanceof View) {
                                    findViewById = parent2;
                                }
                            }
                        }
                        o7.f541l = findViewById;
                    }
                } else if (isInEditMode()) {
                    o7.f541l = null;
                    o7.k = null;
                } else {
                    throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(i10) + " to anchor view " + childAt);
                }
            }
            if (!jVar2.containsKey(childAt)) {
                jVar2.put(childAt, null);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i9) {
                    View childAt2 = getChildAt(i11);
                    if (childAt2 != o7.f541l) {
                        WeakHashMap weakHashMap = O.f4214a;
                        int layoutDirection = getLayoutDirection();
                        int absoluteGravity = Gravity.getAbsoluteGravity(((f) childAt2.getLayoutParams()).f538g, layoutDirection);
                        if (absoluteGravity != 0) {
                        }
                        C.c cVar2 = o7.f532a;
                        if (cVar2 == null) {
                            continue;
                        } else if (!cVar2.f(childAt, childAt2)) {
                            continue;
                        }
                    }
                    if (!jVar2.containsKey(childAt2) && !jVar2.containsKey(childAt2)) {
                        jVar2.put(childAt2, null);
                    }
                    if (jVar2.containsKey(childAt2) && jVar2.containsKey(childAt)) {
                        ArrayList arrayList3 = (ArrayList) jVar2.get(childAt2);
                        if (arrayList3 == null) {
                            arrayList3 = (ArrayList) cVar.a();
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            jVar2.put(childAt2, arrayList3);
                        }
                        arrayList3.add(childAt);
                    } else {
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                }
            }
        }
        ArrayList arrayList4 = (ArrayList) aVar.f282g;
        arrayList4.clear();
        HashSet hashSet = (HashSet) aVar.f283h;
        hashSet.clear();
        int i12 = jVar2.f14670f;
        for (int i13 = 0; i13 < i12; i13++) {
            aVar.g(jVar2.f(i13), arrayList4, hashSet);
        }
        arrayList.addAll(arrayList4);
        Collections.reverse(arrayList);
    }

    public final void v(boolean z8) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            C.c cVar = ((f) childAt.getLayoutParams()).f532a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z8) {
                    cVar.k(this, childAt, obtain);
                } else {
                    cVar.v(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            ((f) getChildAt(i8).getLayoutParams()).getClass();
        }
        this.f8541m = null;
        this.j = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f8547s) {
            return false;
        }
        return true;
    }

    public final void y() {
        WeakHashMap weakHashMap = O.f4214a;
        if (getFitsSystemWindows()) {
            if (this.f8549u == null) {
                this.f8549u = new c(3, this);
            }
            F.l(this, this.f8549u);
            setSystemUiVisibility(1280);
            return;
        }
        F.l(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }
}
