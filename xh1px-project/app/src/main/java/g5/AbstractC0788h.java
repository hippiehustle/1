package g5;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: g5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0788h {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f11191a = {R.attr.stateListAnimator};

    public static void a(AppBarLayout appBarLayout, float f8) {
        int integer = appBarLayout.getResources().getInteger(com.buzbuz.smartautoclicker.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, com.buzbuz.smartautoclicker.R.attr.state_liftable, -2130904076}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f8).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }
}
