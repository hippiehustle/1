package com.google.android.material.transformation;

import E2.b;
import O5.c;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import f5.f;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    public final f f10359c;

    /* renamed from: d, reason: collision with root package name */
    public final f f10360d;

    public FabTransformationScrimBehavior() {
        this.f10359c = new f(75L);
        this.f10360d = new f(0L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, C.c
    public final boolean f(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // C.c
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet x(View view, View view2, boolean z8, boolean z9) {
        f fVar;
        ObjectAnimator ofFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        if (z8) {
            fVar = this.f10359c;
        } else {
            fVar = this.f10360d;
        }
        if (z8) {
            if (!z9) {
                view2.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        fVar.a(ofFloat);
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        b.E(animatorSet, arrayList);
        animatorSet.addListener(new c(view2, z8));
        return animatorSet;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10359c = new f(75L);
        this.f10360d = new f(0L);
    }
}
