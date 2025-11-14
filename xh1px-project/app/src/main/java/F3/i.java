package F3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes.dex */
public final class i implements M0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1352d;

    /* renamed from: e, reason: collision with root package name */
    public final MaterialCardView f1353e;

    /* renamed from: f, reason: collision with root package name */
    public final a f1354f;

    public /* synthetic */ i(MaterialCardView materialCardView, a aVar, int i4) {
        this.f1352d = i4;
        this.f1353e = materialCardView;
        this.f1354f = aVar;
    }

    public static i a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.item_image_condition_grid, viewGroup, false);
        View r8 = E2.b.r(inflate, R.id.card_image_condition);
        if (r8 != null) {
            return new i((MaterialCardView) inflate, a.i(r8), 0);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.card_image_condition)));
    }

    @Override // M0.a
    public final View getRoot() {
        switch (this.f1352d) {
            case 0:
                return this.f1353e;
            default:
                return this.f1353e;
        }
    }
}
