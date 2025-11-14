package f5;

import android.util.Property;
import android.view.ViewGroup;
import com.buzbuz.smartautoclicker.R;

/* loaded from: classes.dex */
public final class c extends Property {

    /* renamed from: a, reason: collision with root package name */
    public static final c f10771a = new Property(Float.class, "childrenAlpha");

    @Override // android.util.Property
    public final Object get(Object obj) {
        Float f8 = (Float) ((ViewGroup) obj).getTag(R.id.mtrl_internal_children_alpha_tag);
        if (f8 != null) {
            return f8;
        }
        return Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        Float f8 = (Float) obj2;
        float floatValue = f8.floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, f8);
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            viewGroup.getChildAt(i4).setAlpha(floatValue);
        }
    }
}
