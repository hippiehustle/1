package com.google.android.material.transformation;

import A.i;
import C.f;
import P.O;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.buzbuz.smartautoclicker.R;
import f5.e;
import java.util.HashMap;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i, reason: collision with root package name */
    public HashMap f10361i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final i D(Context context, boolean z8) {
        int i4;
        if (z8) {
            i4 = R.animator.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i4 = R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        }
        i iVar = new i(22);
        iVar.f88e = e.b(context, i4);
        iVar.f89f = new G5.e(21);
        return iVar;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void w(View view, View view2, boolean z8, boolean z9) {
        boolean z10;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z8) {
                this.f10361i = new HashMap(childCount);
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if ((childAt.getLayoutParams() instanceof f) && (((f) childAt.getLayoutParams()).f532a instanceof FabTransformationScrimBehavior)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (childAt != view2 && !z10) {
                    if (!z8) {
                        HashMap hashMap = this.f10361i;
                        if (hashMap != null && hashMap.containsKey(childAt)) {
                            int intValue = ((Integer) this.f10361i.get(childAt)).intValue();
                            WeakHashMap weakHashMap = O.f4214a;
                            childAt.setImportantForAccessibility(intValue);
                        }
                    } else {
                        this.f10361i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap weakHashMap2 = O.f4214a;
                        childAt.setImportantForAccessibility(4);
                    }
                }
            }
            if (!z8) {
                this.f10361i = null;
            }
        }
        super.w(view, view2, z8, z9);
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
