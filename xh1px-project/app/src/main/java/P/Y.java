package P;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.buzbuz.smartautoclicker.R;
import i0.C0878a;
import java.util.List;

/* loaded from: classes.dex */
public final class Y extends c0 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f4236e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final C0878a f4237f = new C0878a(0);

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f4238g = new DecelerateInterpolator(1.5f);

    /* renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f4239h = new AccelerateInterpolator(1.5f);

    public static void e(View view) {
        C0256d j = j(view);
        if (j != null) {
            ((View) j.f4257h).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                e(viewGroup.getChildAt(i4));
            }
        }
    }

    public static void f(View view, t0 t0Var, boolean z8) {
        C0256d j = j(view);
        if (j != null) {
            j.f4254e = t0Var;
            if (!z8) {
                View view2 = (View) j.f4257h;
                int[] iArr = (int[]) j.f4258i;
                view2.getLocationOnScreen(iArr);
                z8 = true;
                j.f4255f = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                f(viewGroup.getChildAt(i4), t0Var, z8);
            }
        }
    }

    public static void g(View view, t0 t0Var, List list) {
        C0256d j = j(view);
        if (j != null) {
            j.b(t0Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                g(viewGroup.getChildAt(i4), t0Var, list);
            }
        }
    }

    public static void h(View view, A.i iVar) {
        C0256d j = j(view);
        if (j != null) {
            View view2 = (View) j.f4257h;
            int[] iArr = (int[]) j.f4258i;
            view2.getLocationOnScreen(iArr);
            int i4 = j.f4255f - iArr[1];
            j.f4256g = i4;
            view2.setTranslationY(i4);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
                h(viewGroup.getChildAt(i8), iVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public static C0256d j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof X) {
            return ((X) tag).f4234a;
        }
        return null;
    }
}
