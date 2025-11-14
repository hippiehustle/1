package com.google.android.material.bottomnavigation;

import A5.i;
import A5.q;
import G5.e;
import R.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.buzbuz.smartautoclicker.R;
import e5.AbstractC0645a;
import k5.b;
import k5.c;
import k5.d;
import x5.p;

/* loaded from: classes.dex */
public class BottomNavigationView extends q {
    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView);
        g i4 = p.i(getContext(), attributeSet, AbstractC0645a.f10636e, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]);
        TypedArray typedArray = (TypedArray) i4.f4988f;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
        if (typedArray.hasValue(0)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
        }
        typedArray.getBoolean(1, true);
        i4.L();
        p.d(this, new e(22));
    }

    @Override // A5.q
    public final i a(Context context) {
        return new b(context);
    }

    @Override // A5.q
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i8) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i8) != 1073741824 && suggestedMinimumHeight > 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i8), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i4, i8);
    }

    public void setItemHorizontalTranslationEnabled(boolean z8) {
        b bVar = (b) getMenuView();
        if (bVar.f12138O != z8) {
            bVar.setItemHorizontalTranslationEnabled(z8);
            getPresenter().g(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(c cVar) {
        setOnItemReselectedListener(cVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(d dVar) {
        setOnItemSelectedListener(dVar);
    }
}
