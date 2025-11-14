package F3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.buzbuz.smartautoclicker.R;

/* loaded from: classes.dex */
public final class d implements M0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1322d;

    /* renamed from: e, reason: collision with root package name */
    public final View f1323e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewGroup f1324f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1325g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1326h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1327i;
    public final Object j;
    public final Object k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f1328l;

    public /* synthetic */ d(ViewGroup viewGroup, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, View view, Object obj6, int i4) {
        this.f1322d = i4;
        this.f1324f = viewGroup;
        this.f1325g = obj;
        this.f1326h = obj2;
        this.f1327i = obj3;
        this.j = obj4;
        this.k = obj5;
        this.f1323e = view;
        this.f1328l = obj6;
    }

    public static d a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.item_image_event, viewGroup, false);
        int i4 = R.id.btn_reorder;
        ImageButton imageButton = (ImageButton) E2.b.r(inflate, R.id.btn_reorder);
        if (imageButton != null) {
            i4 = R.id.icon_enabled;
            ImageView imageView = (ImageView) E2.b.r(inflate, R.id.icon_enabled);
            if (imageView != null) {
                i4 = R.id.image_action;
                ImageView imageView2 = (ImageView) E2.b.r(inflate, R.id.image_action);
                if (imageView2 != null) {
                    i4 = R.id.layout_actions;
                    if (((LinearLayout) E2.b.r(inflate, R.id.layout_actions)) != null) {
                        i4 = R.id.layout_conditions;
                        if (((LinearLayout) E2.b.r(inflate, R.id.layout_conditions)) != null) {
                            i4 = R.id.layout_enabled;
                            if (((LinearLayout) E2.b.r(inflate, R.id.layout_enabled)) != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                i4 = R.id.text_actions_count;
                                TextView textView = (TextView) E2.b.r(inflate, R.id.text_actions_count);
                                if (textView != null) {
                                    i4 = R.id.text_conditions_count;
                                    TextView textView2 = (TextView) E2.b.r(inflate, R.id.text_conditions_count);
                                    if (textView2 != null) {
                                        i4 = R.id.text_enabled;
                                        TextView textView3 = (TextView) E2.b.r(inflate, R.id.text_enabled);
                                        if (textView3 != null) {
                                            i4 = R.id.text_name;
                                            TextView textView4 = (TextView) E2.b.r(inflate, R.id.text_name);
                                            if (textView4 != null) {
                                                return new d(constraintLayout, imageButton, imageView, imageView2, textView, textView2, textView3, textView4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
    }

    @Override // M0.a
    public final View getRoot() {
        switch (this.f1322d) {
            case 0:
                return (LinearLayout) this.f1324f;
            case 1:
                return (ConstraintLayout) this.f1324f;
            default:
                return (CoordinatorLayout) this.f1324f;
        }
    }

    public d(ConstraintLayout constraintLayout, ImageButton imageButton, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f1322d = 1;
        this.f1324f = constraintLayout;
        this.f1325g = imageButton;
        this.f1323e = imageView;
        this.f1326h = imageView2;
        this.f1327i = textView;
        this.j = textView2;
        this.k = textView3;
        this.f1328l = textView4;
    }
}
