package com.google.android.material.behavior;

import C.c;
import H5.e;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.buzbuz.smartautoclicker.R;
import f5.AbstractC0710a;
import h4.AbstractC0832f;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends c {

    /* renamed from: b, reason: collision with root package name */
    public int f9922b;

    /* renamed from: c, reason: collision with root package name */
    public int f9923c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f9924d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f9925e;

    /* renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f9928h;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f9921a = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public int f9926f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f9927g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // C.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        this.f9926f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f9922b = AbstractC0832f.x(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f9923c = AbstractC0832f.x(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f9924d = AbstractC0832f.y(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0710a.f10769d);
        this.f9925e = AbstractC0832f.y(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0710a.f10768c);
        return false;
    }

    @Override // C.c
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i4, int i8, int i9, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f9921a;
        if (i4 > 0) {
            if (this.f9927g != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.f9928h;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f9927g = 1;
                Iterator it = linkedHashSet.iterator();
                if (!it.hasNext()) {
                    this.f9928h = view.animate().translationY(this.f9926f).setInterpolator(this.f9925e).setDuration(this.f9923c).setListener(new e(7, this));
                    return;
                }
                it.next().getClass();
                throw new ClassCastException();
            }
            return;
        }
        if (i4 < 0 && this.f9927g != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.f9928h;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.f9927g = 2;
            Iterator it2 = linkedHashSet.iterator();
            if (!it2.hasNext()) {
                this.f9928h = view.animate().translationY(0).setInterpolator(this.f9924d).setDuration(this.f9922b).setListener(new e(7, this));
                return;
            }
            it2.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // C.c
    public boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i8) {
        if (i4 == 2) {
            return true;
        }
        return false;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
