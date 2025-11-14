package com.google.android.material.datepicker;

import O7.C0235h;
import P.C0254b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import l5.DialogC1035e;

/* loaded from: classes.dex */
public final class i extends C0254b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10089e;

    public /* synthetic */ i(int i4, Object obj) {
        this.f10088d = i4;
        this.f10089e = obj;
    }

    @Override // P.C0254b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f10088d) {
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f10089e).f10173g);
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // P.C0254b
    public final void d(View view, Q.g gVar) {
        String string;
        int i4 = this.f10088d;
        Object obj = this.f10089e;
        View.AccessibilityDelegate accessibilityDelegate = this.f4246a;
        switch (i4) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, gVar.f4709a);
                k kVar = (k) obj;
                if (kVar.f10102n0.getVisibility() == 0) {
                    string = kVar.n().getString(R.string.mtrl_picker_toggle_to_year_selection);
                } else {
                    string = kVar.n().getString(R.string.mtrl_picker_toggle_to_day_selection);
                }
                gVar.k(string);
                return;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4709a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (((DialogC1035e) obj).f12306m) {
                    gVar.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                    return;
                } else {
                    accessibilityNodeInfo.setDismissable(false);
                    return;
                }
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, gVar.f4709a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i8 = MaterialButtonToggleGroup.f10003n;
                int i9 = -1;
                if (view instanceof MaterialButton) {
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i10 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i10) == view) {
                                i9 = i11;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i10) instanceof MaterialButton) && materialButtonToggleGroup.c(i10)) {
                                    i11++;
                                }
                                i10++;
                            }
                        }
                    }
                }
                gVar.j(C0235h.a(((MaterialButton) view).f10000r, 0, 1, i9, 1));
                return;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                AccessibilityNodeInfo accessibilityNodeInfo2 = gVar.f4709a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.f10174h);
                accessibilityNodeInfo2.setChecked(checkableImageButton.f10173g);
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = gVar.f4709a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).f10177A);
                return;
        }
    }

    @Override // P.C0254b
    public boolean g(View view, int i4, Bundle bundle) {
        switch (this.f10088d) {
            case 1:
                if (i4 == 1048576) {
                    DialogC1035e dialogC1035e = (DialogC1035e) this.f10089e;
                    if (dialogC1035e.f12306m) {
                        dialogC1035e.cancel();
                        return true;
                    }
                }
                return super.g(view, i4, bundle);
            default:
                return super.g(view, i4, bundle);
        }
    }
}
