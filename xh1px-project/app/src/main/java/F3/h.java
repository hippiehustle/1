package F3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public final class h implements M0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1347d;

    /* renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f1348e;

    /* renamed from: f, reason: collision with root package name */
    public final MaterialTextView f1349f;

    /* renamed from: g, reason: collision with root package name */
    public final MaterialTextView f1350g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f1351h;

    public /* synthetic */ h(ConstraintLayout constraintLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2, ImageView imageView, int i4) {
        this.f1347d = i4;
        this.f1348e = constraintLayout;
        this.f1349f = materialTextView;
        this.f1350g = materialTextView2;
        this.f1351h = imageView;
    }

    public static h a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.item_trigger_condition, viewGroup, false);
        int i4 = R.id.condition_details;
        MaterialTextView materialTextView = (MaterialTextView) E2.b.r(inflate, R.id.condition_details);
        if (materialTextView != null) {
            i4 = R.id.condition_name;
            MaterialTextView materialTextView2 = (MaterialTextView) E2.b.r(inflate, R.id.condition_name);
            if (materialTextView2 != null) {
                i4 = R.id.condition_type_icon;
                ImageView imageView = (ImageView) E2.b.r(inflate, R.id.condition_type_icon);
                if (imageView != null) {
                    return new h((ConstraintLayout) inflate, materialTextView, materialTextView2, imageView, 2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // M0.a
    public final View getRoot() {
        switch (this.f1347d) {
            case 0:
                return this.f1348e;
            case 1:
                return this.f1348e;
            default:
                return this.f1348e;
        }
    }
}
