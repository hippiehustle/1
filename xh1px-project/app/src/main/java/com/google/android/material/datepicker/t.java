package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;
import t0.J;

/* loaded from: classes.dex */
public final class t extends J {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f10148q = 0;

    public /* synthetic */ t(Context context) {
        super(context);
    }

    @Override // t0.J
    public int b(View view, int i4) {
        switch (this.f10148q) {
            case 1:
                return 0;
            default:
                return super.b(view, i4);
        }
    }

    @Override // t0.J
    public int c(View view, int i4) {
        switch (this.f10148q) {
            case 1:
                return 0;
            default:
                return super.c(view, i4);
        }
    }

    @Override // t0.J
    public float d(DisplayMetrics displayMetrics) {
        switch (this.f10148q) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // t0.J
    public PointF f(int i4) {
        switch (this.f10148q) {
            case 1:
                return null;
            default:
                return super.f(i4);
        }
    }

    public t(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
