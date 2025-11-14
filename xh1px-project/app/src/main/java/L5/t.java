package L5;

import P.O;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class t extends ArrayAdapter {

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f3028d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f3029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MaterialAutoCompleteTextView f3030f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(MaterialAutoCompleteTextView materialAutoCompleteTextView, Context context, int i4, String[] strArr) {
        super(context, i4, strArr);
        this.f3030f = materialAutoCompleteTextView;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        MaterialAutoCompleteTextView materialAutoCompleteTextView = this.f3030f;
        ColorStateList colorStateList2 = materialAutoCompleteTextView.f10238o;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f3029e = colorStateList;
        if (materialAutoCompleteTextView.f10237n != 0 && materialAutoCompleteTextView.f10238o != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{H.b.c(materialAutoCompleteTextView.f10238o.getColorForState(iArr3, 0), materialAutoCompleteTextView.f10237n), H.b.c(materialAutoCompleteTextView.f10238o.getColorForState(iArr2, 0), materialAutoCompleteTextView.f10237n), materialAutoCompleteTextView.f10237n});
        }
        this.f3028d = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i4, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = this.f3030f;
            Drawable drawable = null;
            if (materialAutoCompleteTextView.getText().toString().contentEquals(textView.getText()) && materialAutoCompleteTextView.f10237n != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(materialAutoCompleteTextView.f10237n);
                if (this.f3029e != null) {
                    colorDrawable.setTintList(this.f3028d);
                    drawable = new RippleDrawable(this.f3029e, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = O.f4214a;
            textView.setBackground(drawable);
        }
        return view2;
    }
}
