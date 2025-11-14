package g5;

import P.O;
import P.t0;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import java.util.WeakHashMap;
import s3.AbstractC1492c;

/* renamed from: g5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0785e extends AbstractC0786f {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f11181c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f11182d;

    /* renamed from: e, reason: collision with root package name */
    public int f11183e;

    /* renamed from: f, reason: collision with root package name */
    public int f11184f;

    public AbstractC0785e() {
        this.f11181c = new Rect();
        this.f11182d = new Rect();
        this.f11183e = 0;
    }

    @Override // C.c
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i8, int i9) {
        AppBarLayout z8;
        int i10;
        t0 lastWindowInsets;
        int i11 = view.getLayoutParams().height;
        if ((i11 == -1 || i11 == -2) && (z8 = AppBarLayout.ScrollingViewBehavior.z(coordinatorLayout.k(view))) != null) {
            int size = View.MeasureSpec.getSize(i9);
            if (size > 0) {
                WeakHashMap weakHashMap = O.f4214a;
                if (z8.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.a() + lastWindowInsets.d();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int totalScrollRange = z8.getTotalScrollRange() + size;
            int measuredHeight = z8.getMeasuredHeight();
            if (this instanceof SearchBar$ScrollingViewBehavior) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                totalScrollRange -= measuredHeight;
            }
            if (i11 == -1) {
                i10 = 1073741824;
            } else {
                i10 = Integer.MIN_VALUE;
            }
            coordinatorLayout.s(i4, i8, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i10), view);
            return true;
        }
        return false;
    }

    @Override // g5.AbstractC0786f
    public final void x(CoordinatorLayout coordinatorLayout, View view, int i4) {
        AppBarLayout z8 = AppBarLayout.ScrollingViewBehavior.z(coordinatorLayout.k(view));
        if (z8 != null) {
            C.f fVar = (C.f) view.getLayoutParams();
            int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
            int bottom = z8.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin;
            int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin;
            int bottom2 = ((z8.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
            Rect rect = this.f11181c;
            rect.set(paddingLeft, bottom, width, bottom2);
            t0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap weakHashMap = O.f4214a;
                if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rect.left = lastWindowInsets.b() + rect.left;
                    rect.right -= lastWindowInsets.c();
                }
            }
            int i8 = fVar.f534c;
            if (i8 == 0) {
                i8 = 8388659;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            Rect rect2 = this.f11182d;
            Gravity.apply(i8, measuredWidth, measuredHeight, rect, rect2, i4);
            int y4 = y(z8);
            view.layout(rect2.left, rect2.top - y4, rect2.right, rect2.bottom - y4);
            this.f11183e = rect2.top - z8.getBottom();
            return;
        }
        coordinatorLayout.r(view, i4);
        this.f11183e = 0;
    }

    public final int y(View view) {
        int i4;
        int i8;
        if (this.f11184f == 0) {
            return 0;
        }
        float f8 = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            C.c cVar = ((C.f) appBarLayout.getLayoutParams()).f532a;
            if (cVar instanceof AppBarLayout.BaseBehavior) {
                i4 = ((AppBarLayout.BaseBehavior) cVar).y();
            } else {
                i4 = 0;
            }
            if ((downNestedPreScrollRange == 0 || totalScrollRange + i4 > downNestedPreScrollRange) && (i8 = totalScrollRange - downNestedPreScrollRange) != 0) {
                f8 = (i4 / i8) + 1.0f;
            }
        }
        int i9 = this.f11184f;
        return AbstractC1492c.i((int) (f8 * i9), 0, i9);
    }

    public AbstractC0785e(int i4) {
        super(0);
        this.f11181c = new Rect();
        this.f11182d = new Rect();
        this.f11183e = 0;
    }
}
