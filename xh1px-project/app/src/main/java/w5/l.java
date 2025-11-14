package w5;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends j {
    public StateListAnimator K;

    @Override // w5.j
    public final float e() {
        return this.f15776s.getElevation();
    }

    @Override // w5.j
    public final void f(Rect rect) {
        if (((FloatingActionButton) this.f15777t.f15048d).f10164n) {
            super.f(rect);
            return;
        }
        if (this.f15765f) {
            FloatingActionButton floatingActionButton = this.f15776s;
            int sizeDimension = floatingActionButton.getSizeDimension();
            int i4 = this.k;
            if (sizeDimension < i4) {
                int sizeDimension2 = (i4 - floatingActionButton.getSizeDimension()) / 2;
                rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // w5.j
    public final void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i4) {
        Drawable drawable;
        G5.l lVar = this.f15760a;
        lVar.getClass();
        G5.h hVar = new G5.h(lVar);
        this.f15761b = hVar;
        hVar.setTintList(colorStateList);
        if (mode != null) {
            this.f15761b.setTintMode(mode);
        }
        G5.h hVar2 = this.f15761b;
        FloatingActionButton floatingActionButton = this.f15776s;
        hVar2.k(floatingActionButton.getContext());
        if (i4 > 0) {
            Context context = floatingActionButton.getContext();
            G5.l lVar2 = this.f15760a;
            lVar2.getClass();
            C1708a c1708a = new C1708a(lVar2);
            int color = context.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context.getColor(R.color.design_fab_stroke_top_inner_color);
            int color3 = context.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context.getColor(R.color.design_fab_stroke_end_outer_color);
            c1708a.f15720i = color;
            c1708a.j = color2;
            c1708a.k = color3;
            c1708a.f15721l = color4;
            float f8 = i4;
            if (c1708a.f15719h != f8) {
                c1708a.f15719h = f8;
                c1708a.f15713b.setStrokeWidth(f8 * 1.3333f);
                c1708a.f15723n = true;
                c1708a.invalidateSelf();
            }
            if (colorStateList != null) {
                c1708a.f15722m = colorStateList.getColorForState(c1708a.getState(), c1708a.f15722m);
            }
            c1708a.f15725p = colorStateList;
            c1708a.f15723n = true;
            c1708a.invalidateSelf();
            this.f15763d = c1708a;
            C1708a c1708a2 = this.f15763d;
            c1708a2.getClass();
            G5.h hVar3 = this.f15761b;
            hVar3.getClass();
            drawable = new LayerDrawable(new Drawable[]{c1708a2, hVar3});
        } else {
            this.f15763d = null;
            drawable = this.f15761b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(E5.a.b(colorStateList2), drawable, null);
        this.f15762c = rippleDrawable;
        this.f15764e = rippleDrawable;
    }

    @Override // w5.j
    public final void i() {
        q();
    }

    @Override // w5.j
    public final void k(float f8, float f9, float f10) {
        int i4 = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f15776s;
        if (floatingActionButton.getStateListAnimator() == this.K) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(j.f15753E, r(f8, f10));
            stateListAnimator.addState(j.f15754F, r(f8, f9));
            stateListAnimator.addState(j.f15755G, r(f8, f9));
            stateListAnimator.addState(j.f15756H, r(f8, f9));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f8).setDuration(0L));
            if (i4 <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(j.f15759z);
            stateListAnimator.addState(j.f15757I, animatorSet);
            stateListAnimator.addState(j.f15758J, r(0.0f, 0.0f));
            this.K = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (o()) {
            q();
        }
    }

    @Override // w5.j
    public final void m(ColorStateList colorStateList) {
        Drawable drawable = this.f15762c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(E5.a.b(colorStateList));
        } else {
            super.m(colorStateList);
        }
    }

    @Override // w5.j
    public final boolean o() {
        if (!((FloatingActionButton) this.f15777t.f15048d).f10164n) {
            if (!this.f15765f || this.f15776s.getSizeDimension() >= this.k) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final AnimatorSet r(float f8, float f9) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f8};
        FloatingActionButton floatingActionButton = this.f15776s;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f9).setDuration(100L));
        animatorSet.setInterpolator(j.f15759z);
        return animatorSet;
    }

    @Override // w5.j
    public final void h() {
    }

    @Override // w5.j
    public final void p() {
    }

    @Override // w5.j
    public final void j(int[] iArr) {
    }
}
