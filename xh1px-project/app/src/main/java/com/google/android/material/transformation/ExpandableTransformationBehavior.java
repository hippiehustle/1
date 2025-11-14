package com.google.android.material.transformation;

import H5.e;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b, reason: collision with root package name */
    public AnimatorSet f10352b;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void w(View view, View view2, boolean z8, boolean z9) {
        boolean z10;
        AnimatorSet animatorSet = this.f10352b;
        if (animatorSet != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            animatorSet.cancel();
        }
        AnimatorSet x8 = x(view, view2, z8, z10);
        this.f10352b = x8;
        x8.addListener(new e(5, this));
        this.f10352b.start();
        if (!z9) {
            this.f10352b.end();
        }
    }

    public abstract AnimatorSet x(View view, View view2, boolean z8, boolean z9);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
