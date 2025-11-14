package C5;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.checkbox.MaterialCheckBox;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public K0.b f644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f646c;

    public /* synthetic */ c(View view, int i4) {
        this.f645b = i4;
        this.f646c = view;
    }

    public final void a(Drawable drawable) {
        switch (this.f645b) {
            case 0:
                d dVar = (d) this.f646c;
                dVar.setIndeterminate(false);
                dVar.a(dVar.f648e);
                return;
            case 1:
                d dVar2 = (d) this.f646c;
                if (!dVar2.j) {
                    dVar2.setVisibility(dVar2.k);
                    return;
                }
                return;
            default:
                ColorStateList colorStateList = ((MaterialCheckBox) this.f646c).f10034r;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                    return;
                }
                return;
        }
    }

    public void b(Drawable drawable) {
        switch (this.f645b) {
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) this.f646c;
                ColorStateList colorStateList = materialCheckBox.f10034r;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(materialCheckBox.f10038v, colorStateList.getDefaultColor()));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void c(Drawable drawable) {
    }
}
