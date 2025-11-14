package A4;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.divider.MaterialDivider;

/* loaded from: classes.dex */
public final class b implements M0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f284d;

    /* renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f285e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f286f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f287g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f288h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f289i;

    public /* synthetic */ b(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, int i4) {
        this.f284d = i4;
        this.f285e = constraintLayout;
        this.f286f = textView;
        this.f287g = textView2;
        this.f288h = textView3;
        this.f289i = textView4;
    }

    public static b a(View view) {
        int i4 = R.id.avgTitle;
        if (((TextView) E2.b.r(view, R.id.avgTitle)) != null) {
            i4 = R.id.avgValue;
            TextView textView = (TextView) E2.b.r(view, R.id.avgValue);
            if (textView != null) {
                i4 = R.id.description;
                TextView textView2 = (TextView) E2.b.r(view, R.id.description);
                if (textView2 != null) {
                    i4 = R.id.maxTitle;
                    if (((TextView) E2.b.r(view, R.id.maxTitle)) != null) {
                        i4 = R.id.maxValue;
                        TextView textView3 = (TextView) E2.b.r(view, R.id.maxValue);
                        if (textView3 != null) {
                            i4 = R.id.minTitle;
                            if (((TextView) E2.b.r(view, R.id.minTitle)) != null) {
                                i4 = R.id.minValue;
                                TextView textView4 = (TextView) E2.b.r(view, R.id.minValue);
                                if (textView4 != null) {
                                    i4 = R.id.separator_left;
                                    if (((MaterialDivider) E2.b.r(view, R.id.separator_left)) != null) {
                                        i4 = R.id.separator_right;
                                        if (((MaterialDivider) E2.b.r(view, R.id.separator_right)) != null) {
                                            return new b((ConstraintLayout) view, textView, textView2, textView3, textView4, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    public static b b(View view) {
        int i4 = R.id.processed_count;
        TextView textView = (TextView) E2.b.r(view, R.id.processed_count);
        if (textView != null) {
            i4 = R.id.processed_title;
            TextView textView2 = (TextView) E2.b.r(view, R.id.processed_title);
            if (textView2 != null) {
                i4 = R.id.separator_left;
                if (((MaterialDivider) E2.b.r(view, R.id.separator_left)) != null) {
                    i4 = R.id.triggered_count;
                    TextView textView3 = (TextView) E2.b.r(view, R.id.triggered_count);
                    if (textView3 != null) {
                        i4 = R.id.triggered_title;
                        TextView textView4 = (TextView) E2.b.r(view, R.id.triggered_title);
                        if (textView4 != null) {
                            return new b((ConstraintLayout) view, textView, textView2, textView3, textView4, 1);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @Override // M0.a
    public final View getRoot() {
        switch (this.f284d) {
            case 0:
                return this.f285e;
            default:
                return this.f285e;
        }
    }
}
