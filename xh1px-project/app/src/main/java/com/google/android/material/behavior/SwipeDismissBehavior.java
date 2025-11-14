package com.google.android.material.behavior;

import C.c;
import P.O;
import Q.f;
import W.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import g0.L;
import i5.C0884a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends c {

    /* renamed from: a, reason: collision with root package name */
    public e f9929a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9930b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9931c;

    /* renamed from: d, reason: collision with root package name */
    public int f9932d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f9933e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f9934f = 0.5f;

    /* renamed from: g, reason: collision with root package name */
    public final C0884a f9935g = new C0884a(this);

    @Override // C.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z8 = this.f9930b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f9930b = false;
            }
        } else {
            z8 = coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f9930b = z8;
        }
        if (z8) {
            if (this.f9929a == null) {
                this.f9929a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f9935g);
            }
            if (!this.f9931c && this.f9929a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // C.c
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        WeakHashMap weakHashMap = O.f4214a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            O.j(view, 1048576);
            O.h(view, 0);
            if (w(view)) {
                O.k(view, f.j, new L(2, this));
            }
        }
        return false;
    }

    @Override // C.c
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f9929a != null) {
            if (!this.f9931c || motionEvent.getActionMasked() != 3) {
                this.f9929a.j(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean w(View view) {
        return true;
    }
}
