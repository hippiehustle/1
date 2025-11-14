package com.google.android.material.floatingactionbutton;

import C.c;
import C.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import e5.AbstractC0645a;

/* loaded from: classes.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends c {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    @Override // C.c
    public final /* synthetic */ boolean e(View view, Rect rect) {
        throw new ClassCastException();
    }

    @Override // C.c
    public final void g(f fVar) {
        if (fVar.f539h == 0) {
            fVar.f539h = 80;
        }
    }

    @Override // C.c
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // C.c
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        throw new ClassCastException();
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0645a.f10643n);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
}
