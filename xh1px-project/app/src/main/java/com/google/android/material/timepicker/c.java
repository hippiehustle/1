package com.google.android.material.timepicker;

import O7.C0235h;
import P.C0254b;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.buzbuz.smartautoclicker.R;

/* loaded from: classes.dex */
public final class c extends C0254b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f10344d;

    public c(ClockFaceView clockFaceView) {
        this.f10344d = clockFaceView;
    }

    @Override // P.C0254b
    public final void d(View view, Q.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4709a;
        this.f4246a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f10344d.f10315A.get(intValue - 1));
        }
        gVar.j(C0235h.a(view.isSelected(), 0, 1, intValue, 1));
        accessibilityNodeInfo.setClickable(true);
        gVar.b(Q.f.f4695e);
    }

    @Override // P.C0254b
    public final boolean g(View view, int i4, Bundle bundle) {
        if (i4 == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = this.f10344d;
            view.getHitRect(clockFaceView.f10326x);
            float centerX = clockFaceView.f10326x.centerX();
            float centerY = clockFaceView.f10326x.centerY();
            clockFaceView.f10325w.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            clockFaceView.f10325w.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
        return super.g(view, i4, bundle);
    }
}
