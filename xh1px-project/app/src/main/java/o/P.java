package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import h.AbstractC0805a;
import m.C1039b;
import n.ViewTreeObserverOnGlobalLayoutListenerC1107d;

/* loaded from: classes.dex */
public final class P extends Spinner {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f13122l = {R.attr.spinnerMode};

    /* renamed from: d, reason: collision with root package name */
    public final C1207p f13123d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f13124e;

    /* renamed from: f, reason: collision with root package name */
    public final H f13125f;

    /* renamed from: g, reason: collision with root package name */
    public SpinnerAdapter f13126g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13127h;

    /* renamed from: i, reason: collision with root package name */
    public final O f13128i;
    public int j;
    public final Rect k;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public P(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.buzbuz.smartautoclicker.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.k = new Rect();
        a1.a(this, getContext());
        int[] iArr = AbstractC0805a.f11294v;
        R.g J6 = R.g.J(context, attributeSet, iArr, com.buzbuz.smartautoclicker.R.attr.spinnerStyle);
        TypedArray typedArray2 = (TypedArray) J6.f4988f;
        this.f13123d = new C1207p(this);
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f13124e = new C1039b(context, resourceId);
        } else {
            this.f13124e = context;
        }
        int i4 = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, f13122l, com.buzbuz.smartautoclicker.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i4 = typedArray.getInt(0, 0);
                    }
                } catch (Exception e9) {
                    e = e9;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                }
            } catch (Throwable th) {
                th = th;
                typedArray3 = typedArray;
                if (typedArray3 != null) {
                    typedArray3.recycle();
                }
                throw th;
            }
        } catch (Exception e10) {
            e = e10;
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray3 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i4 != 0) {
            if (i4 == 1) {
                M m6 = new M(this, this.f13124e, attributeSet);
                R.g J8 = R.g.J(this.f13124e, attributeSet, iArr, com.buzbuz.smartautoclicker.R.attr.spinnerStyle);
                this.j = ((TypedArray) J8.f4988f).getLayoutDimension(3, -2);
                m6.g(J8.A(1));
                m6.f13108F = typedArray2.getString(2);
                J8.L();
                this.f13128i = m6;
                this.f13125f = new H(this, this, m6);
            }
        } else {
            J j = new J(this);
            this.f13128i = j;
            j.f13092f = typedArray2.getString(2);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.buzbuz.smartautoclicker.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        J6.L();
        this.f13127h = true;
        SpinnerAdapter spinnerAdapter = this.f13126g;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f13126g = null;
        }
        this.f13123d.k(attributeSet, com.buzbuz.smartautoclicker.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i4 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i8 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i8 = Math.max(i8, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.k;
            drawable.getPadding(rect);
            return rect.left + rect.right + i8;
        }
        return i8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1207p c1207p = this.f13123d;
        if (c1207p != null) {
            c1207p.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        O o7 = this.f13128i;
        if (o7 != null) {
            return o7.a();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        O o7 = this.f13128i;
        if (o7 != null) {
            return o7.m();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f13128i != null) {
            return this.j;
        }
        return super.getDropDownWidth();
    }

    public final O getInternalPopup() {
        return this.f13128i;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        O o7 = this.f13128i;
        if (o7 != null) {
            return o7.d();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f13124e;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        O o7 = this.f13128i;
        if (o7 != null) {
            return o7.n();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1207p c1207p = this.f13123d;
        if (c1207p != null) {
            return c1207p.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1207p c1207p = this.f13123d;
        if (c1207p != null) {
            return c1207p.i();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        O o7 = this.f13128i;
        if (o7 != null && o7.b()) {
            o7.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i4, int i8) {
        super.onMeasure(i4, i8);
        if (this.f13128i != null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        N n3 = (N) parcelable;
        super.onRestoreInstanceState(n3.getSuperState());
        if (n3.f13113d && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1107d(2, this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, o.N] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z8;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        O o7 = this.f13128i;
        if (o7 != null && o7.b()) {
            z8 = true;
        } else {
            z8 = false;
        }
        baseSavedState.f13113d = z8;
        return baseSavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        H h8 = this.f13125f;
        if (h8 != null && h8.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        O o7 = this.f13128i;
        if (o7 != null) {
            if (!o7.b()) {
                this.f13128i.l(getTextDirection(), getTextAlignment());
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1207p c1207p = this.f13123d;
        if (c1207p != null) {
            c1207p.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C1207p c1207p = this.f13123d;
        if (c1207p != null) {
            c1207p.n(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i4) {
        O o7 = this.f13128i;
        if (o7 != null) {
            o7.j(i4);
            o7.k(i4);
        } else {
            super.setDropDownHorizontalOffset(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i4) {
        O o7 = this.f13128i;
        if (o7 != null) {
            o7.h(i4);
        } else {
            super.setDropDownVerticalOffset(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i4) {
        if (this.f13128i != null) {
            this.j = i4;
        } else {
            super.setDropDownWidth(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        O o7 = this.f13128i;
        if (o7 != null) {
            o7.g(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i4) {
        setPopupBackgroundDrawable(h4.g.k(getPopupContext(), i4));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        O o7 = this.f13128i;
        if (o7 != null) {
            o7.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1207p c1207p = this.f13123d;
        if (c1207p != null) {
            c1207p.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1207p c1207p = this.f13123d;
        if (c1207p != null) {
            c1207p.t(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.widget.ListAdapter, java.lang.Object, o.K] */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f13127h) {
            this.f13126g = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        O o7 = this.f13128i;
        if (o7 != 0) {
            Context context = this.f13124e;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ?? obj = new Object();
            obj.f13096d = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.f13097e = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                I.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            o7.o(obj);
        }
    }
}
