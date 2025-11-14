package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.buzbuz.smartautoclicker.R;
import h.AbstractC0805a;
import o.C1177a;
import o.O0;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f8336d;

    /* renamed from: e, reason: collision with root package name */
    public View f8337e;

    /* renamed from: f, reason: collision with root package name */
    public View f8338f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f8339g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f8340h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f8341i;
    public final boolean j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8342l;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1177a(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0805a.f11275a);
        boolean z8 = false;
        this.f8339g = obtainStyledAttributes.getDrawable(0);
        this.f8340h = obtainStyledAttributes.getDrawable(2);
        this.f8342l = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.j = true;
            this.f8341i = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.j ? !(this.f8339g != null || this.f8340h != null) : this.f8341i == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f8339g;
        if (drawable != null && drawable.isStateful()) {
            this.f8339g.setState(getDrawableState());
        }
        Drawable drawable2 = this.f8340h;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f8340h.setState(getDrawableState());
        }
        Drawable drawable3 = this.f8341i;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f8341i.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8339g;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f8340h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f8341i;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f8337e = findViewById(R.id.action_bar);
        this.f8338f = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f8336d && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i4, int i8, int i9, int i10) {
        super.onLayout(z8, i4, i8, i9, i10);
        boolean z9 = true;
        if (this.j) {
            Drawable drawable = this.f8341i;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z9 = false;
            }
        } else {
            if (this.f8339g != null) {
                if (this.f8337e.getVisibility() == 0) {
                    this.f8339g.setBounds(this.f8337e.getLeft(), this.f8337e.getTop(), this.f8337e.getRight(), this.f8337e.getBottom());
                } else {
                    View view = this.f8338f;
                    if (view != null && view.getVisibility() == 0) {
                        this.f8339g.setBounds(this.f8338f.getLeft(), this.f8338f.getTop(), this.f8338f.getRight(), this.f8338f.getBottom());
                    } else {
                        this.f8339g.setBounds(0, 0, 0, 0);
                    }
                }
            } else {
                z9 = false;
            }
            this.k = false;
        }
        if (z9) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i8) {
        int i9;
        if (this.f8337e == null && View.MeasureSpec.getMode(i8) == Integer.MIN_VALUE && (i9 = this.f8342l) >= 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(Math.min(i9, View.MeasureSpec.getSize(i8)), Integer.MIN_VALUE);
        }
        super.onMeasure(i4, i8);
        if (this.f8337e == null) {
            return;
        }
        View.MeasureSpec.getMode(i8);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f8339g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f8339g);
        }
        this.f8339g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f8337e;
            if (view != null) {
                this.f8339g.setBounds(view.getLeft(), this.f8337e.getTop(), this.f8337e.getRight(), this.f8337e.getBottom());
            }
        }
        boolean z8 = false;
        if (!this.j ? !(this.f8339g != null || this.f8340h != null) : this.f8341i == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f8341i;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f8341i);
        }
        this.f8341i = drawable;
        boolean z8 = this.j;
        boolean z9 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z8 && (drawable2 = this.f8341i) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z8 ? !(this.f8339g != null || this.f8340h != null) : this.f8341i == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f8340h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f8340h);
        }
        this.f8340h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.k && this.f8340h != null) {
                throw null;
            }
        }
        boolean z8 = false;
        if (!this.j ? !(this.f8339g != null || this.f8340h != null) : this.f8341i == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z8) {
        int i4;
        this.f8336d = z8;
        if (z8) {
            i4 = 393216;
        } else {
            i4 = 262144;
        }
        setDescendantFocusability(i4);
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
        Drawable drawable = this.f8339g;
        if (drawable != null) {
            drawable.setVisible(z8, false);
        }
        Drawable drawable2 = this.f8340h;
        if (drawable2 != null) {
            drawable2.setVisible(z8, false);
        }
        Drawable drawable3 = this.f8341i;
        if (drawable3 != null) {
            drawable3.setVisible(z8, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f8339g;
        boolean z8 = this.j;
        if (drawable != drawable2 || z8) {
            if (drawable != this.f8340h || !this.k) {
                if ((drawable == this.f8341i && z8) || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i4) {
        if (i4 != 0) {
            return super.startActionModeForChild(view, callback, i4);
        }
        return null;
    }

    public void setTabContainer(O0 o02) {
    }
}
