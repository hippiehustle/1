package com.google.android.material.snackbar;

import J5.c;
import W0.d;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import t7.C1594d;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h, reason: collision with root package name */
    public final C1594d f10229h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t7.d] */
    public BaseTransientBottomBar$Behavior() {
        ?? obj = new Object();
        this.f9933e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f9934f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f9932d = 0;
        this.f10229h = obj;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, C.c
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f10229h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (d.f6487f == null) {
                    d.f6487f = new d(9);
                }
                synchronized (d.f6487f.f6489e) {
                }
            }
        } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (d.f6487f == null) {
                d.f6487f = new d(9);
            }
            synchronized (d.f6487f.f6489e) {
            }
        }
        return super.k(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean w(View view) {
        this.f10229h.getClass();
        return view instanceof c;
    }
}
