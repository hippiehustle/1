package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.buzbuz.smartautoclicker.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: o.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1213s0 extends ListView {

    /* renamed from: d, reason: collision with root package name */
    public final Rect f13369d;

    /* renamed from: e, reason: collision with root package name */
    public int f13370e;

    /* renamed from: f, reason: collision with root package name */
    public int f13371f;

    /* renamed from: g, reason: collision with root package name */
    public int f13372g;

    /* renamed from: h, reason: collision with root package name */
    public int f13373h;

    /* renamed from: i, reason: collision with root package name */
    public int f13374i;
    public C1210q0 j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f13375l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13376m;

    /* renamed from: n, reason: collision with root package name */
    public S.d f13377n;

    /* renamed from: o, reason: collision with root package name */
    public L5.x f13378o;

    public C1213s0(Context context, boolean z8) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f13369d = new Rect();
        this.f13370e = 0;
        this.f13371f = 0;
        this.f13372g = 0;
        this.f13373h = 0;
        this.f13375l = z8;
        setCacheColorHint(0);
    }

    public final int a(int i4, int i8) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i9 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i10 = 0;
        View view = null;
        for (int i11 = 0; i11 < count; i11++) {
            int itemViewType = adapter.getItemViewType(i11);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(i11, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i12 = layoutParams.height;
            if (i12 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i4, makeMeasureSpec);
            view.forceLayout();
            if (i11 > 0) {
                i9 += dividerHeight;
            }
            i9 += view.getMeasuredHeight();
            if (i9 >= i8) {
                return i8;
            }
        }
        return i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i4) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z12 = false;
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z8 = true;
                    if (z8 || z12) {
                        this.f13376m = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.f13374i - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    if (!z8) {
                        if (this.f13377n == null) {
                            this.f13377n = new S.d(this);
                        }
                        S.d dVar = this.f13377n;
                        boolean z13 = dVar.f5165s;
                        dVar.f5165s = true;
                        dVar.onTouch(this, motionEvent);
                    } else {
                        S.d dVar2 = this.f13377n;
                        if (dVar2 != null) {
                            if (dVar2.f5165s) {
                                dVar2.d();
                            }
                            dVar2.f5165s = false;
                        }
                    }
                    return z8;
                }
                z8 = false;
                if (z8) {
                }
                this.f13376m = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f13374i - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                if (!z8) {
                }
                return z8;
            }
            z8 = true;
        } else {
            z8 = false;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i4);
        if (findPointerIndex >= 0) {
            int x8 = (int) motionEvent.getX(findPointerIndex);
            int y4 = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x8, y4);
            if (pointToPosition == -1) {
                z12 = true;
            } else {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f8 = x8;
                float f9 = y4;
                this.f13376m = true;
                int i8 = Build.VERSION.SDK_INT;
                AbstractC1204n0.a(this, f8, f9);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i9 = this.f13374i;
                if (i9 != -1 && (childAt = getChildAt(i9 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f13374i = pointToPosition;
                AbstractC1204n0.a(childAt3, f8 - childAt3.getLeft(), f9 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                if (selector != null && pointToPosition != -1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f13369d;
                rect.set(left, top, right, bottom);
                rect.left -= this.f13370e;
                rect.top -= this.f13371f;
                rect.right += this.f13372g;
                rect.bottom += this.f13373h;
                if (i8 >= 33) {
                    z10 = AbstractC1208p0.a(this);
                } else {
                    Field field = AbstractC1211r0.f13364a;
                    if (field != null) {
                        try {
                            z10 = field.getBoolean(this);
                        } catch (IllegalAccessException e9) {
                            e9.printStackTrace();
                        }
                    }
                    z10 = false;
                }
                if (childAt3.isEnabled() != z10) {
                    boolean z14 = !z10;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC1208p0.b(this, z14);
                    } else {
                        Field field2 = AbstractC1211r0.f13364a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z14));
                            } catch (IllegalAccessException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z9) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    if (getVisibility() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    selector.setVisible(z11, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f8, f9);
                }
                C1210q0 c1210q0 = this.j;
                if (c1210q0 != null) {
                    c1210q0.f13358e = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z8 = true;
                z12 = false;
            }
            if (z8) {
            }
            this.f13376m = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f13374i - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            if (!z8) {
            }
            return z8;
        }
        z8 = false;
        if (z8) {
        }
        this.f13376m = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f13374i - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (!z8) {
        }
        return z8;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f13369d;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f13378o == null) {
            super.drawableStateChanged();
            C1210q0 c1210q0 = this.j;
            if (c1210q0 != null) {
                c1210q0.f13358e = true;
            }
            Drawable selector = getSelector();
            if (selector != null && this.f13376m && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (!this.f13375l && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (!this.f13375l && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (!this.f13375l && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if ((this.f13375l && this.k) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f13378o = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f13378o == null) {
            L5.x xVar = new L5.x(9, this);
            this.f13378o = xVar;
            post(xVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i4 >= 30 && AbstractC1206o0.f13331d) {
                    try {
                        AbstractC1206o0.f13328a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC1206o0.f13329b.invoke(this, Integer.valueOf(pointToPosition));
                        AbstractC1206o0.f13330c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e9) {
                        e9.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e10.printStackTrace();
                    }
                } else {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f13376m && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f13374i = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        L5.x xVar = this.f13378o;
        if (xVar != null) {
            C1213s0 c1213s0 = (C1213s0) xVar.f3046e;
            c1213s0.f13378o = null;
            c1213s0.removeCallbacks(xVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z8) {
        this.k = z8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.graphics.drawable.Drawable$Callback, android.graphics.drawable.Drawable, o.q0] */
    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1210q0 c1210q0 = null;
        if (drawable != 0) {
            ?? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.f13357d;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.f13357d = drawable;
            drawable.setCallback(drawable2);
            drawable2.f13358e = true;
            c1210q0 = drawable2;
        }
        this.j = c1210q0;
        super.setSelector(c1210q0);
        Rect rect = new Rect();
        if (drawable != 0) {
            drawable.getPadding(rect);
        }
        this.f13370e = rect.left;
        this.f13371f = rect.top;
        this.f13372g = rect.right;
        this.f13373h = rect.bottom;
    }
}
