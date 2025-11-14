package com.google.android.material.appbar;

import P.C0254b;
import Q.f;
import Q.g;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import g5.C0783c;

/* loaded from: classes.dex */
public final class b extends C0254b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f9914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f9915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f9916f;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f9916f = baseBehavior;
        this.f9914d = appBarLayout;
        this.f9915e = coordinatorLayout;
    }

    @Override // P.C0254b
    public final void d(View view, g gVar) {
        this.f4246a.onInitializeAccessibilityNodeInfo(view, gVar.f4709a);
        gVar.i(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.f9914d;
        if (appBarLayout.getTotalScrollRange() != 0) {
            CoordinatorLayout coordinatorLayout = this.f9915e;
            AppBarLayout.BaseBehavior baseBehavior = this.f9916f;
            View B8 = AppBarLayout.BaseBehavior.B(baseBehavior, coordinatorLayout);
            if (B8 != null) {
                int childCount = appBarLayout.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    if (((C0783c) appBarLayout.getChildAt(i4).getLayoutParams()).f11171a != 0) {
                        if (baseBehavior.y() != (-appBarLayout.getTotalScrollRange())) {
                            gVar.b(f.f4696f);
                            gVar.l(true);
                        }
                        if (baseBehavior.y() != 0) {
                            if (B8.canScrollVertically(-1)) {
                                if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                                    gVar.b(f.f4697g);
                                    gVar.l(true);
                                    return;
                                }
                                return;
                            }
                            gVar.b(f.f4697g);
                            gVar.l(true);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // P.C0254b
    public final boolean g(View view, int i4, Bundle bundle) {
        AppBarLayout appBarLayout = this.f9914d;
        if (i4 == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i4 == 8192) {
            AppBarLayout.BaseBehavior baseBehavior = this.f9916f;
            if (baseBehavior.y() != 0) {
                CoordinatorLayout coordinatorLayout = this.f9915e;
                View B8 = AppBarLayout.BaseBehavior.B(baseBehavior, coordinatorLayout);
                if (B8.canScrollVertically(-1)) {
                    int i8 = -appBarLayout.getDownNestedPreScrollRange();
                    if (i8 != 0) {
                        baseBehavior.E(coordinatorLayout, this.f9914d, B8, i8, new int[]{0, 0});
                        return true;
                    }
                } else {
                    appBarLayout.setExpanded(true);
                    return true;
                }
            }
            return false;
        }
        return super.g(view, i4, bundle);
    }
}
