package F1;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.buzbuz.smartautoclicker.R;
import i.AbstractC0862a;
import o6.j;

/* loaded from: classes.dex */
public final class a extends E1.c {

    /* renamed from: I, reason: collision with root package name */
    public final Intent f1286I;

    /* renamed from: J, reason: collision with root package name */
    public final Intent f1287J;

    public a(Intent intent) {
        super(3);
        this.f1286I = intent;
        this.f1287J = null;
    }

    @Override // E1.c
    public final FrameLayout I(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.overlay_menu_back_to_previous, (ViewGroup) null, false);
        int i4 = R.id.btn_back;
        if (((ImageButton) E2.b.r(inflate, R.id.btn_back)) != null) {
            i4 = R.id.btn_move;
            if (((ImageButton) E2.b.r(inflate, R.id.btn_move)) != null) {
                i4 = R.id.menu_background;
                if (((CardView) E2.b.r(inflate, R.id.menu_background)) != null) {
                    i4 = R.id.menu_items;
                    if (((LinearLayout) E2.b.r(inflate, R.id.menu_items)) != null) {
                        FrameLayout frameLayout = (FrameLayout) inflate;
                        j.d(frameLayout, "getRoot(...)");
                        return frameLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // E1.c
    public final void K(int i4) {
        if (i4 == R.id.btn_back) {
            a();
        }
    }

    @Override // E1.c, w1.e
    public final void p() {
        super.p();
        if (!AbstractC0862a.r(k(), this.f1286I)) {
            Intent intent = this.f1287J;
            if (intent != null && AbstractC0862a.r(k(), intent)) {
                return;
            }
            Log.e("ActivityStarterOverlayMenu", "Can't start any of the activities");
        }
    }

    public a(Intent intent, Intent intent2) {
        super(3);
        this.f1286I = intent;
        this.f1287J = intent2;
    }
}
