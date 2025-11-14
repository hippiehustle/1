package com.google.android.material.timepicker;

import G5.j;
import P.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.buzbuz.smartautoclicker.R;
import e5.AbstractC0645a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* renamed from: t, reason: collision with root package name */
    public final E.a f10345t;

    /* renamed from: u, reason: collision with root package name */
    public int f10346u;

    /* renamed from: v, reason: collision with root package name */
    public final G5.h f10347v;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        G5.h hVar = new G5.h();
        this.f10347v = hVar;
        j jVar = new j(0.5f);
        F3.f e9 = hVar.f1769d.f1752a.e();
        e9.f1337i = jVar;
        e9.j = jVar;
        e9.k = jVar;
        e9.f1338l = jVar;
        hVar.setShapeAppearanceModel(e9.a());
        this.f10347v.m(ColorStateList.valueOf(-1));
        G5.h hVar2 = this.f10347v;
        WeakHashMap weakHashMap = O.f4214a;
        setBackground(hVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0645a.K, R.attr.materialClockStyle, 0);
        this.f10346u = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f10345t = new E.a(12, this);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = O.f4214a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            E.a aVar = this.f10345t;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
        }
    }

    public abstract void d();

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        d();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            E.a aVar = this.f10345t;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i4) {
        this.f10347v.m(ColorStateList.valueOf(i4));
    }
}
