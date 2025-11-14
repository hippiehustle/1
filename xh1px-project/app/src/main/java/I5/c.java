package I5;

import Q.g;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.slider.Slider;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class c extends W.b {

    /* renamed from: q, reason: collision with root package name */
    public final Slider f2104q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f2105r;

    public c(Slider slider) {
        super(slider);
        this.f2105r = new Rect();
        this.f2104q = slider;
    }

    @Override // W.b
    public final int n(float f8, float f9) {
        int i4 = 0;
        while (true) {
            Slider slider = this.f2104q;
            if (i4 < slider.getValues().size()) {
                Rect rect = this.f2105r;
                slider.u(i4, rect);
                if (rect.contains((int) f8, (int) f9)) {
                    return i4;
                }
                i4++;
            } else {
                return -1;
            }
        }
    }

    @Override // W.b
    public final void o(ArrayList arrayList) {
        for (int i4 = 0; i4 < this.f2104q.getValues().size(); i4++) {
            arrayList.add(Integer.valueOf(i4));
        }
    }

    @Override // W.b
    public final boolean s(int i4, int i8, Bundle bundle) {
        Slider slider = this.f2104q;
        if (slider.isEnabled()) {
            if (i8 != 4096 && i8 != 8192) {
                if (i8 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") && slider.s(i4, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                    slider.v();
                    slider.postInvalidate();
                    p(i4);
                    return true;
                }
                return false;
            }
            float f8 = slider.f2134b0;
            if (f8 == 0.0f) {
                f8 = 1.0f;
            }
            if ((slider.f2130U - slider.f2129T) / f8 > 20) {
                f8 *= Math.round(r1 / r4);
            }
            if (i8 == 8192) {
                f8 = -f8;
            }
            if (slider.k()) {
                f8 = -f8;
            }
            if (slider.s(i4, AbstractC1492c.h(slider.getValues().get(i4).floatValue() + f8, slider.getValueFrom(), slider.getValueTo()))) {
                slider.v();
                slider.postInvalidate();
                p(i4);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // W.b
    public final void u(int i4, g gVar) {
        String str;
        String str2;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4709a;
        gVar.b(Q.f.f4702n);
        Slider slider = this.f2104q;
        List<Float> values = slider.getValues();
        Float f8 = values.get(i4);
        float floatValue = f8.floatValue();
        float valueFrom = slider.getValueFrom();
        float valueTo = slider.getValueTo();
        if (slider.isEnabled()) {
            if (floatValue > valueFrom) {
                gVar.a(8192);
            }
            if (floatValue < valueTo) {
                gVar.a(4096);
            }
        }
        accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, floatValue));
        gVar.i(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        if (slider.getContentDescription() != null) {
            sb.append(slider.getContentDescription());
            sb.append(",");
        }
        if (((int) floatValue) == floatValue) {
            str = "%.0f";
        } else {
            str = "%.2f";
        }
        String format = String.format(str, f8);
        String string = slider.getContext().getString(R.string.material_slider_value);
        if (values.size() > 1) {
            if (i4 == slider.getValues().size() - 1) {
                str2 = slider.getContext().getString(R.string.material_slider_range_end);
            } else if (i4 == 0) {
                str2 = slider.getContext().getString(R.string.material_slider_range_start);
            } else {
                str2 = "";
            }
            string = str2;
        }
        Locale locale = Locale.US;
        sb.append(string + ", " + format);
        accessibilityNodeInfo.setContentDescription(sb.toString());
        Rect rect = this.f2105r;
        slider.u(i4, rect);
        accessibilityNodeInfo.setBoundsInParent(rect);
    }
}
