package q5;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends W.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f14151q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f14151q = chip;
    }

    @Override // W.b
    public final int n(float f8, float f9) {
        RectF closeIconTouchBounds;
        Rect rect = Chip.f10043A;
        Chip chip = this.f14151q;
        if (chip.d()) {
            closeIconTouchBounds = chip.getCloseIconTouchBounds();
            if (closeIconTouchBounds.contains(f8, f9)) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    @Override // W.b
    public final void o(ArrayList arrayList) {
        f fVar;
        arrayList.add(0);
        Rect rect = Chip.f10043A;
        Chip chip = this.f14151q;
        if (chip.d() && (fVar = chip.f10046h) != null && fVar.f14175O && chip.k != null) {
            arrayList.add(1);
        }
    }

    @Override // W.b
    public final boolean s(int i4, int i8, Bundle bundle) {
        boolean z8 = false;
        if (i8 == 16) {
            Chip chip = this.f14151q;
            if (i4 == 0) {
                return chip.performClick();
            }
            if (i4 == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.k;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z8 = true;
                }
                if (chip.f10059w) {
                    chip.f10058v.x(1, 1);
                }
            }
        }
        return z8;
    }

    @Override // W.b
    public final void t(Q.g gVar) {
        boolean z8;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4709a;
        Chip chip = this.f14151q;
        f fVar = chip.f10046h;
        if (fVar != null && fVar.f14181U) {
            z8 = true;
        } else {
            z8 = false;
        }
        accessibilityNodeInfo.setCheckable(z8);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        gVar.i(chip.getAccessibilityClassName());
        gVar.m(chip.getText());
    }

    @Override // W.b
    public final void u(int i4, Q.g gVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4709a;
        CharSequence charSequence = "";
        if (i4 == 1) {
            Chip chip = this.f14151q;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, charSequence).trim());
            }
            closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
            accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
            gVar.b(Q.f.f4695e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            return;
        }
        accessibilityNodeInfo.setContentDescription("");
        accessibilityNodeInfo.setBoundsInParent(Chip.f10043A);
    }

    @Override // W.b
    public final void v(int i4, boolean z8) {
        if (i4 == 1) {
            Chip chip = this.f14151q;
            chip.f10053q = z8;
            chip.refreshDrawableState();
        }
    }
}
