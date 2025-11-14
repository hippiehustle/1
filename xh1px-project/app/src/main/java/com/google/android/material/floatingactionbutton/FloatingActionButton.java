package com.google.android.material.floatingactionbutton;

import C.b;
import C.f;
import C.g;
import G.d;
import G5.h;
import G5.w;
import M5.a;
import P.O;
import X6.c;
import a.AbstractC0405a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e5.AbstractC0645a;
import f5.e;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.C1216u;
import t2.C1562a;
import u6.AbstractC1638C;
import v5.InterfaceC1677a;
import w5.C1708a;
import w5.j;
import w5.l;
import x5.p;
import x5.u;

/* loaded from: classes.dex */
public class FloatingActionButton extends u implements InterfaceC1677a, w, b {

    /* renamed from: e */
    public ColorStateList f10157e;

    /* renamed from: f */
    public PorterDuff.Mode f10158f;

    /* renamed from: g */
    public ColorStateList f10159g;

    /* renamed from: h */
    public PorterDuff.Mode f10160h;

    /* renamed from: i */
    public ColorStateList f10161i;
    public int j;
    public int k;

    /* renamed from: l */
    public int f10162l;

    /* renamed from: m */
    public int f10163m;

    /* renamed from: n */
    public boolean f10164n;

    /* renamed from: o */
    public final Rect f10165o;

    /* renamed from: p */
    public final Rect f10166p;

    /* renamed from: q */
    public final d f10167q;

    /* renamed from: r */
    public final c f10168r;

    /* renamed from: s */
    public l f10169s;

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton), attributeSet, R.attr.floatingActionButtonStyle);
        this.f16224d = getVisibility();
        this.f10165o = new Rect();
        this.f10166p = new Rect();
        Context context2 = getContext();
        TypedArray h8 = p.h(context2, attributeSet, AbstractC0645a.f10644o, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f10157e = AbstractC0405a.C(context2, h8, 1);
        this.f10158f = p.j(h8.getInt(2, -1), null);
        this.f10161i = AbstractC0405a.C(context2, h8, 12);
        this.j = h8.getInt(7, -1);
        this.k = h8.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = h8.getDimensionPixelSize(3, 0);
        float dimension = h8.getDimension(4, 0.0f);
        float dimension2 = h8.getDimension(9, 0.0f);
        float dimension3 = h8.getDimension(11, 0.0f);
        this.f10164n = h8.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(h8.getDimensionPixelSize(10, 0));
        e a3 = e.a(context2, h8, 15);
        e a4 = e.a(context2, h8, 8);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0645a.f10614C, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        G5.l a9 = G5.l.a(context2, resourceId, resourceId2, G5.l.f1793m).a();
        boolean z8 = h8.getBoolean(5, false);
        setEnabled(h8.getBoolean(0, true));
        h8.recycle();
        d dVar = new d(this);
        this.f10167q = dVar;
        dVar.e(attributeSet, R.attr.floatingActionButtonStyle);
        this.f10168r = new c(this);
        getImpl().n(a9);
        getImpl().g(this.f10157e, this.f10158f, this.f10161i, dimensionPixelSize);
        getImpl().k = dimensionPixelSize2;
        j impl = getImpl();
        if (impl.f15767h != dimension) {
            impl.f15767h = dimension;
            impl.k(dimension, impl.f15768i, impl.j);
        }
        j impl2 = getImpl();
        if (impl2.f15768i != dimension2) {
            impl2.f15768i = dimension2;
            impl2.k(impl2.f15767h, dimension2, impl2.j);
        }
        j impl3 = getImpl();
        if (impl3.j != dimension3) {
            impl3.j = dimension3;
            impl3.k(impl3.f15767h, impl3.f15768i, dimension3);
        }
        getImpl().f15770m = a3;
        getImpl().f15771n = a4;
        getImpl().f15765f = z8;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [w5.l, w5.j] */
    private j getImpl() {
        if (this.f10169s == null) {
            this.f10169s = new j(this, new C1562a(this));
        }
        return this.f10169s;
    }

    public final int c(int i4) {
        int i8 = this.k;
        if (i8 != 0) {
            return i8;
        }
        Resources resources = getResources();
        if (i4 != -1) {
            if (i4 != 1) {
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return c(1);
        }
        return c(0);
    }

    public final void d(boolean z8) {
        int i4;
        AnimatorSet c6;
        j impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f15776s;
        if (floatingActionButton.getVisibility() == 0) {
            if (impl.f15775r == 1) {
                return;
            }
        } else if (impl.f15775r != 2) {
            return;
        }
        Animator animator = impl.f15769l;
        if (animator != null) {
            animator.cancel();
        }
        FloatingActionButton floatingActionButton2 = impl.f15776s;
        WeakHashMap weakHashMap = O.f4214a;
        if (floatingActionButton2.isLaidOut() && !floatingActionButton2.isInEditMode()) {
            e eVar = impl.f15771n;
            if (eVar != null) {
                c6 = impl.b(eVar, 0.0f, 0.0f, 0.0f);
            } else {
                c6 = impl.c(0.0f, 0.4f, 0.4f, j.f15751C, j.f15752D);
            }
            c6.addListener(new w5.c(impl, z8));
            c6.start();
            return;
        }
        if (z8) {
            i4 = 8;
        } else {
            i4 = 4;
        }
        floatingActionButton.a(i4, z8);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().j(getDrawableState());
    }

    public final void e() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f10159g;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f10160h;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(C1216u.c(colorForState, mode));
    }

    public final void f(boolean z8) {
        AnimatorSet c6;
        float f8;
        float f9;
        j impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f15776s;
        Matrix matrix = impl.f15781x;
        FloatingActionButton floatingActionButton2 = impl.f15776s;
        boolean z9 = true;
        if (floatingActionButton.getVisibility() != 0) {
            if (impl.f15775r == 2) {
                return;
            }
        } else if (impl.f15775r != 1) {
            return;
        }
        Animator animator = impl.f15769l;
        if (animator != null) {
            animator.cancel();
        }
        if (impl.f15770m != null) {
            z9 = false;
        }
        WeakHashMap weakHashMap = O.f4214a;
        if (floatingActionButton2.isLaidOut() && !floatingActionButton2.isInEditMode()) {
            if (floatingActionButton.getVisibility() != 0) {
                float f10 = 0.0f;
                floatingActionButton.setAlpha(0.0f);
                if (z9) {
                    f8 = 0.4f;
                } else {
                    f8 = 0.0f;
                }
                floatingActionButton.setScaleY(f8);
                if (z9) {
                    f9 = 0.4f;
                } else {
                    f9 = 0.0f;
                }
                floatingActionButton.setScaleX(f9);
                if (z9) {
                    f10 = 0.4f;
                }
                impl.f15773p = f10;
                impl.a(f10, matrix);
                floatingActionButton2.setImageMatrix(matrix);
            }
            e eVar = impl.f15770m;
            if (eVar != null) {
                c6 = impl.b(eVar, 1.0f, 1.0f, 1.0f);
            } else {
                c6 = impl.c(1.0f, 1.0f, 1.0f, j.f15749A, j.f15750B);
            }
            c6.addListener(new O5.c(impl, z8));
            c6.start();
            return;
        }
        floatingActionButton.a(0, z8);
        floatingActionButton.setAlpha(1.0f);
        floatingActionButton.setScaleY(1.0f);
        floatingActionButton.setScaleX(1.0f);
        impl.f15773p = 1.0f;
        impl.a(1.0f, matrix);
        floatingActionButton2.setImageMatrix(matrix);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f10157e;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f10158f;
    }

    @Override // C.b
    public C.c getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f15768i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    public Drawable getContentBackground() {
        return getImpl().f15764e;
    }

    public int getCustomSize() {
        return this.k;
    }

    public int getExpandedComponentIdHint() {
        return this.f10168r.f6993b;
    }

    public e getHideMotionSpec() {
        return getImpl().f15771n;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f10161i;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f10161i;
    }

    public G5.l getShapeAppearanceModel() {
        G5.l lVar = getImpl().f15760a;
        lVar.getClass();
        return lVar;
    }

    public e getShowMotionSpec() {
        return getImpl().f15770m;
    }

    public int getSize() {
        return this.j;
    }

    public int getSizeDimension() {
        return c(this.j);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f10159g;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f10160h;
    }

    public boolean getUseCompatPadding() {
        return this.f10164n;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().h();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f15776s;
        h hVar = impl.f15761b;
        if (hVar != null) {
            AbstractC1638C.L(floatingActionButton, hVar);
        }
        if (!(impl instanceof l)) {
            ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
            if (impl.f15782y == null) {
                impl.f15782y = new g(1, impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f15782y);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f15776s.getViewTreeObserver();
        g gVar = impl.f15782y;
        if (gVar != null) {
            viewTreeObserver.removeOnPreDrawListener(gVar);
            impl.f15782y = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i4, int i8) {
        int sizeDimension = getSizeDimension();
        this.f10162l = (sizeDimension - this.f10163m) / 2;
        getImpl().q();
        int min = Math.min(View.resolveSize(sizeDimension, i4), View.resolveSize(sizeDimension, i8));
        Rect rect = this.f10165o;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof K5.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        K5.a aVar = (K5.a) parcelable;
        super.onRestoreInstanceState(aVar.f6209d);
        Bundle bundle = (Bundle) aVar.f2728f.get("expandableWidgetHelper");
        bundle.getClass();
        c cVar = this.f10168r;
        cVar.getClass();
        cVar.f6992a = bundle.getBoolean("expanded", false);
        cVar.f6993b = bundle.getInt("expandedComponentIdHint", 0);
        if (cVar.f6992a) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) cVar.f6994c;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).i(floatingActionButton);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        K5.a aVar = new K5.a(onSaveInstanceState);
        c cVar = this.f10168r;
        cVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", cVar.f6992a);
        bundle.putInt("expandedComponentIdHint", cVar.f6993b);
        aVar.f2728f.put("expandableWidgetHelper", bundle);
        return aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i4;
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f10166p;
            rect.set(0, 0, measuredWidth, measuredHeight);
            int i8 = rect.left;
            Rect rect2 = this.f10165o;
            rect.left = i8 + rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            l lVar = this.f10169s;
            if (lVar.f15765f) {
                i4 = Math.max((lVar.k - lVar.f15776s.getSizeDimension()) / 2, 0);
            } else {
                i4 = 0;
            }
            int i9 = -i4;
            rect.inset(i9, i9);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f10157e != colorStateList) {
            this.f10157e = colorStateList;
            j impl = getImpl();
            h hVar = impl.f15761b;
            if (hVar != null) {
                hVar.setTintList(colorStateList);
            }
            C1708a c1708a = impl.f15763d;
            if (c1708a != null) {
                if (colorStateList != null) {
                    c1708a.f15722m = colorStateList.getColorForState(c1708a.getState(), c1708a.f15722m);
                }
                c1708a.f15725p = colorStateList;
                c1708a.f15723n = true;
                c1708a.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f10158f != mode) {
            this.f10158f = mode;
            h hVar = getImpl().f15761b;
            if (hVar != null) {
                hVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f8) {
        j impl = getImpl();
        if (impl.f15767h != f8) {
            impl.f15767h = f8;
            impl.k(f8, impl.f15768i, impl.j);
        }
    }

    public void setCompatElevationResource(int i4) {
        setCompatElevation(getResources().getDimension(i4));
    }

    public void setCompatHoveredFocusedTranslationZ(float f8) {
        j impl = getImpl();
        if (impl.f15768i != f8) {
            impl.f15768i = f8;
            impl.k(impl.f15767h, f8, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i4) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i4));
    }

    public void setCompatPressedTranslationZ(float f8) {
        j impl = getImpl();
        if (impl.j != f8) {
            impl.j = f8;
            impl.k(impl.f15767h, impl.f15768i, f8);
        }
    }

    public void setCompatPressedTranslationZResource(int i4) {
        setCompatPressedTranslationZ(getResources().getDimension(i4));
    }

    public void setCustomSize(int i4) {
        if (i4 >= 0) {
            if (i4 != this.k) {
                this.k = i4;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        h hVar = getImpl().f15761b;
        if (hVar != null) {
            hVar.l(f8);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z8) {
        if (z8 != getImpl().f15765f) {
            getImpl().f15765f = z8;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i4) {
        this.f10168r.f6993b = i4;
    }

    public void setHideMotionSpec(e eVar) {
        getImpl().f15771n = eVar;
    }

    public void setHideMotionSpecResource(int i4) {
        setHideMotionSpec(e.b(getContext(), i4));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            j impl = getImpl();
            float f8 = impl.f15773p;
            impl.f15773p = f8;
            Matrix matrix = impl.f15781x;
            impl.a(f8, matrix);
            impl.f15776s.setImageMatrix(matrix);
            if (this.f10159g != null) {
                e();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i4) {
        this.f10167q.g(i4);
        e();
    }

    public void setMaxImageSize(int i4) {
        this.f10163m = i4;
        j impl = getImpl();
        if (impl.f15774q != i4) {
            impl.f15774q = i4;
            float f8 = impl.f15773p;
            impl.f15773p = f8;
            Matrix matrix = impl.f15781x;
            impl.a(f8, matrix);
            impl.f15776s.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i4) {
        setRippleColor(ColorStateList.valueOf(i4));
    }

    @Override // android.view.View
    public void setScaleX(float f8) {
        super.setScaleX(f8);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setScaleY(float f8) {
        super.setScaleY(f8);
        getImpl().getClass();
    }

    public void setShadowPaddingEnabled(boolean z8) {
        j impl = getImpl();
        impl.f15766g = z8;
        impl.q();
    }

    @Override // G5.w
    public void setShapeAppearanceModel(G5.l lVar) {
        getImpl().n(lVar);
    }

    public void setShowMotionSpec(e eVar) {
        getImpl().f15770m = eVar;
    }

    public void setShowMotionSpecResource(int i4) {
        setShowMotionSpec(e.b(getContext(), i4));
    }

    public void setSize(int i4) {
        this.k = 0;
        if (i4 != this.j) {
            this.j = i4;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f10159g != colorStateList) {
            this.f10159g = colorStateList;
            e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f10160h != mode) {
            this.f10160h = mode;
            e();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f8) {
        super.setTranslationX(f8);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationY(float f8) {
        super.setTranslationY(f8);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationZ(float f8) {
        super.setTranslationZ(f8);
        getImpl().l();
    }

    public void setUseCompatPadding(boolean z8) {
        if (this.f10164n != z8) {
            this.f10164n = z8;
            getImpl().i();
        }
    }

    @Override // x5.u, android.widget.ImageView, android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
    }

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends C.c {

        /* renamed from: a */
        public Rect f10170a;

        /* renamed from: b */
        public final boolean f10171b;

        public BaseBehavior() {
            this.f10171b = true;
        }

        @Override // C.c
        public final boolean e(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f10165o;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // C.c
        public final void g(f fVar) {
            if (fVar.f539h == 0) {
                fVar.f539h = 80;
            }
        }

        @Override // C.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z8;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof f) {
                    z8 = ((f) layoutParams).f532a instanceof BottomSheetBehavior;
                } else {
                    z8 = false;
                }
                if (z8) {
                    x(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // C.c
        public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
            int i8;
            boolean z8;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList k = coordinatorLayout.k(floatingActionButton);
            int size = k.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                View view2 = (View) k.get(i10);
                if (view2 instanceof AppBarLayout) {
                    if (w(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof f) {
                        z8 = ((f) layoutParams).f532a instanceof BottomSheetBehavior;
                    } else {
                        z8 = false;
                    }
                    if (z8 && x(view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.r(floatingActionButton, i4);
            Rect rect = floatingActionButton.f10165o;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                f fVar = (f) floatingActionButton.getLayoutParams();
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) {
                    i8 = rect.right;
                } else if (floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin) {
                    i8 = -rect.left;
                } else {
                    i8 = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                    i9 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                    i9 = -rect.top;
                }
                if (i9 != 0) {
                    WeakHashMap weakHashMap = O.f4214a;
                    floatingActionButton.offsetTopAndBottom(i9);
                }
                if (i8 != 0) {
                    WeakHashMap weakHashMap2 = O.f4214a;
                    floatingActionButton.offsetLeftAndRight(i8);
                }
            }
            return true;
        }

        public final boolean w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            f fVar = (f) floatingActionButton.getLayoutParams();
            if (!this.f10171b || fVar.f537f != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.f10170a == null) {
                this.f10170a = new Rect();
            }
            Rect rect = this.f10170a;
            ThreadLocal threadLocal = x5.c.f16188a;
            rect.set(0, 0, appBarLayout.getWidth(), appBarLayout.getHeight());
            x5.c.b(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.d(false);
                return true;
            }
            floatingActionButton.f(false);
            return true;
        }

        public final boolean x(View view, FloatingActionButton floatingActionButton) {
            f fVar = (f) floatingActionButton.getLayoutParams();
            if (!this.f10171b || fVar.f537f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.d(false);
                return true;
            }
            floatingActionButton.f(false);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0645a.f10645p);
            this.f10171b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f10161i != colorStateList) {
            this.f10161i = colorStateList;
            getImpl().m(this.f10161i);
        }
    }
}
