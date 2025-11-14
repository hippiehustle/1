package F3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.buzbuz.smartautoclicker.R;

/* loaded from: classes.dex */
public final class l implements M0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1367d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f1368e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageButton f1369f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageButton f1370g;

    public /* synthetic */ l(FrameLayout frameLayout, ImageButton imageButton, ImageButton imageButton2, int i4) {
        this.f1367d = i4;
        this.f1368e = frameLayout;
        this.f1369f = imageButton;
        this.f1370g = imageButton2;
    }

    public static l a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.overlay_validation_menu, (ViewGroup) null, false);
        int i4 = R.id.btn_cancel;
        ImageButton imageButton = (ImageButton) E2.b.r(inflate, R.id.btn_cancel);
        if (imageButton != null) {
            i4 = R.id.btn_confirm;
            ImageButton imageButton2 = (ImageButton) E2.b.r(inflate, R.id.btn_confirm);
            if (imageButton2 != null) {
                i4 = R.id.btn_move;
                if (((ImageButton) E2.b.r(inflate, R.id.btn_move)) != null) {
                    i4 = R.id.menu_background;
                    if (((CardView) E2.b.r(inflate, R.id.menu_background)) != null) {
                        i4 = R.id.menu_items;
                        if (((LinearLayout) E2.b.r(inflate, R.id.menu_items)) != null) {
                            return new l((FrameLayout) inflate, imageButton, imageButton2, 1);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // M0.a
    public final View getRoot() {
        switch (this.f1367d) {
            case 0:
                return this.f1368e;
            default:
                return this.f1368e;
        }
    }
}
