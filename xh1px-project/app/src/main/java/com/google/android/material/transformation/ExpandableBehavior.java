package com.google.android.material.transformation;

import C.c;
import O5.a;
import P.O;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.WeakHashMap;
import v5.InterfaceC1677a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends c {

    /* renamed from: a, reason: collision with root package name */
    public int f10351a = 0;

    public ExpandableBehavior() {
    }

    @Override // C.c
    public abstract boolean f(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // C.c
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (InterfaceC1677a) view2;
        boolean z8 = ((FloatingActionButton) obj).f10168r.f6992a;
        int i4 = 2;
        if (z8) {
            int i8 = this.f10351a;
            if (i8 != 0 && i8 != 2) {
                return false;
            }
        } else if (this.f10351a != 1) {
            return false;
        }
        if (z8) {
            i4 = 1;
        }
        this.f10351a = i4;
        w((View) obj, view, z8, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // C.c
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        InterfaceC1677a interfaceC1677a;
        int i8;
        WeakHashMap weakHashMap = O.f4214a;
        if (!view.isLaidOut()) {
            ArrayList k = coordinatorLayout.k(view);
            int size = k.size();
            int i9 = 0;
            while (true) {
                if (i9 < size) {
                    View view2 = (View) k.get(i9);
                    if (f(view, view2)) {
                        interfaceC1677a = (InterfaceC1677a) view2;
                        break;
                    }
                    i9++;
                } else {
                    interfaceC1677a = null;
                    break;
                }
            }
            if (interfaceC1677a != null) {
                boolean z8 = ((FloatingActionButton) interfaceC1677a).f10168r.f6992a;
                int i10 = 2;
                if (!z8 ? this.f10351a == 1 : !((i8 = this.f10351a) != 0 && i8 != 2)) {
                    if (z8) {
                        i10 = 1;
                    }
                    this.f10351a = i10;
                    view.getViewTreeObserver().addOnPreDrawListener(new a(this, view, i10, interfaceC1677a));
                }
            }
        }
        return false;
    }

    public abstract void w(View view, View view2, boolean z8, boolean z9);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
