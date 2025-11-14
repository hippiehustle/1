package com.google.android.material.transformation;

import A.i;
import E2.b;
import P.F;
import P.O;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import f5.AbstractC0710a;
import f5.c;
import f5.e;
import f5.f;
import java.util.ArrayList;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f10353c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f10354d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f10355e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f10356f;

    /* renamed from: g, reason: collision with root package name */
    public float f10357g;

    /* renamed from: h, reason: collision with root package name */
    public float f10358h;

    public FabTransformationBehavior() {
        this.f10353c = new Rect();
        this.f10354d = new RectF();
        this.f10355e = new RectF();
        this.f10356f = new int[2];
    }

    public static float B(i iVar, f fVar, float f8) {
        long j = fVar.f10775a;
        long j5 = fVar.f10776b;
        f d2 = ((e) iVar.f88e).d("expansion");
        return AbstractC0710a.a(f8, 0.0f, fVar.b().getInterpolation(((float) (((d2.f10775a + d2.f10776b) + 17) - j)) / ((float) j5)));
    }

    public static Pair y(float f8, float f9, boolean z8, i iVar) {
        f d2;
        f d3;
        if (f8 != 0.0f && f9 != 0.0f) {
            if ((z8 && f9 < 0.0f) || (!z8 && f9 > 0.0f)) {
                d2 = ((e) iVar.f88e).d("translationXCurveUpwards");
                d3 = ((e) iVar.f88e).d("translationYCurveUpwards");
            } else {
                d2 = ((e) iVar.f88e).d("translationXCurveDownwards");
                d3 = ((e) iVar.f88e).d("translationYCurveDownwards");
            }
        } else {
            d2 = ((e) iVar.f88e).d("translationXLinear");
            d3 = ((e) iVar.f88e).d("translationYLinear");
        }
        return new Pair(d2, d3);
    }

    public final float A(View view, View view2, G5.e eVar) {
        RectF rectF = this.f10354d;
        C(view, rectF);
        rectF.offset(this.f10357g, this.f10358h);
        RectF rectF2 = this.f10355e;
        C(view2, rectF2);
        eVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void C(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f10356f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract i D(Context context, boolean z8);

    @Override // com.google.android.material.transformation.ExpandableBehavior, C.c
    public final boolean f(View view, View view2) {
        if (view.getVisibility() != 8) {
            if (view2 instanceof FloatingActionButton) {
                int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
                if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // C.c
    public final void g(C.f fVar) {
        if (fVar.f539h == 0) {
            fVar.f539h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet x(View view, View view2, boolean z8, boolean z9) {
        ObjectAnimator ofFloat;
        int i4;
        float f8;
        ObjectAnimator ofFloat2;
        ObjectAnimator ofFloat3;
        ViewGroup viewGroup;
        ObjectAnimator ofFloat4;
        i D7 = D(view2.getContext(), z8);
        if (z8) {
            this.f10357g = view.getTranslationX();
            this.f10358h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        WeakHashMap weakHashMap = O.f4214a;
        float e9 = F.e(view2) - F.e(view);
        if (z8) {
            if (!z9) {
                view2.setTranslationZ(-e9);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -e9);
        }
        ((e) D7.f88e).d("elevation").a(ofFloat);
        arrayList.add(ofFloat);
        float z10 = z(view, view2, (G5.e) D7.f89f);
        float A2 = A(view, view2, (G5.e) D7.f89f);
        Pair y4 = y(z10, A2, z8, D7);
        f fVar = (f) y4.first;
        f fVar2 = (f) y4.second;
        RectF rectF = this.f10354d;
        if (z8) {
            if (!z9) {
                view2.setTranslationX(-z10);
                view2.setTranslationY(-A2);
            }
            i4 = 0;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            f8 = 0.0f;
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float B8 = B(D7, fVar, -z10);
            float B9 = B(D7, fVar2, -A2);
            Rect rect = this.f10353c;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.f10355e;
            C(view2, rectF2);
            rectF2.offset(B8, B9);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
        } else {
            i4 = 0;
            f8 = 0.0f;
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -z10);
            ofFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -A2);
        }
        fVar.a(ofFloat2);
        fVar2.a(ofFloat3);
        arrayList.add(ofFloat2);
        arrayList.add(ofFloat3);
        rectF.width();
        rectF.height();
        float z11 = z(view, view2, (G5.e) D7.f89f);
        float A8 = A(view, view2, (G5.e) D7.f89f);
        Pair y5 = y(z11, A8, z8, D7);
        f fVar3 = (f) y5.first;
        f fVar4 = (f) y5.second;
        Property property = View.TRANSLATION_X;
        if (!z8) {
            z11 = this.f10357g;
        }
        float[] fArr = new float[1];
        fArr[i4] = z11;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        if (!z8) {
            A8 = this.f10358h;
        }
        float[] fArr2 = new float[1];
        fArr2[i4] = A8;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        fVar3.a(ofFloat5);
        fVar4.a(ofFloat6);
        arrayList.add(ofFloat5);
        arrayList.add(ofFloat6);
        if (view2 instanceof ViewGroup) {
            View findViewById = view2.findViewById(R.id.mtrl_child_content_container);
            if (findViewById != null) {
                if (findViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) findViewById;
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = (ViewGroup) view2;
            }
            if (viewGroup != null) {
                if (z8) {
                    if (!z9) {
                        c.f10771a.set(viewGroup, Float.valueOf(f8));
                    }
                    c cVar = c.f10771a;
                    float[] fArr3 = new float[1];
                    fArr3[i4] = 1.0f;
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, cVar, fArr3);
                } else {
                    c cVar2 = c.f10771a;
                    float[] fArr4 = new float[1];
                    fArr4[i4] = f8;
                    ofFloat4 = ObjectAnimator.ofFloat(viewGroup, cVar2, fArr4);
                }
                ((e) D7.f88e).d("contentFade").a(ofFloat4);
                arrayList.add(ofFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        b.E(animatorSet, arrayList);
        animatorSet.addListener(new O5.b(z8, view2, view));
        int size = arrayList2.size();
        for (int i8 = i4; i8 < size; i8++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i8));
        }
        return animatorSet;
    }

    public final float z(View view, View view2, G5.e eVar) {
        RectF rectF = this.f10354d;
        C(view, rectF);
        rectF.offset(this.f10357g, this.f10358h);
        RectF rectF2 = this.f10355e;
        C(view2, rectF2);
        eVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10353c = new Rect();
        this.f10354d = new RectF();
        this.f10355e = new RectF();
        this.f10356f = new int[2];
    }
}
