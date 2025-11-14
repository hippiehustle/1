package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f10343d;

    public b(ClockFaceView clockFaceView) {
        this.f10343d = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f10343d;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f10325w.f10332g) - clockFaceView.f10319E;
        if (height != clockFaceView.f10346u) {
            clockFaceView.f10346u = height;
            clockFaceView.d();
            ClockHandView clockHandView = clockFaceView.f10325w;
            clockHandView.f10338o = clockFaceView.f10346u;
            clockHandView.invalidate();
        }
        return true;
    }
}
