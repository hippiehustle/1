package androidx.navigation.fragment;

import B0.e;
import Z.g;
import Z5.n;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.buzbuz.smartautoclicker.R;
import g0.AbstractComponentCallbacksC0755y;
import g0.C0732a;
import i.AbstractC0862a;
import kotlin.Metadata;
import n0.AbstractC1122L;
import n0.C1146x;
import o6.j;
import p0.AbstractC1303k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Lg0/y;", "", "<init>", "()V", "navigation-fragment_release"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class NavHostFragment extends AbstractComponentCallbacksC0755y {

    /* renamed from: c0, reason: collision with root package name */
    public final n f8870c0 = new n(new e(24, this));

    /* renamed from: d0, reason: collision with root package name */
    public View f8871d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f8872e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f8873f0;

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void C(Context context, AttributeSet attributeSet, Bundle bundle) {
        j.e(context, "context");
        j.e(attributeSet, "attrs");
        super.C(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1122L.f12743b);
        j.d(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f8872e0 = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1303k.f13675c);
        j.d(obtainStyledAttributes2, "obtainStyledAttributes(...)");
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.f8873f0 = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void E(Bundle bundle) {
        if (this.f8873f0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void H(View view) {
        j.e(view, "view");
        if (view instanceof ViewGroup) {
            view.setTag(R.id.nav_controller_view_tag, S());
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getParent() != null) {
                Object parent = viewGroup.getParent();
                j.c(parent, "null cannot be cast to non-null type android.view.View");
                View view2 = (View) parent;
                this.f8871d0 = view2;
                if (view2.getId() == this.f11086B) {
                    View view3 = this.f8871d0;
                    j.b(view3);
                    view3.setTag(R.id.nav_controller_view_tag, S());
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
    }

    public final C1146x S() {
        return (C1146x) this.f8870c0.getValue();
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void v(Context context) {
        j.e(context, "context");
        super.v(context);
        if (this.f8873f0) {
            C0732a c0732a = new C0732a(m());
            c0732a.i(this);
            c0732a.e();
        }
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void w(Bundle bundle) {
        S();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.f8873f0 = true;
            C0732a c0732a = new C0732a(m());
            c0732a.i(this);
            c0732a.e();
        }
        super.w(bundle);
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        j.e(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        j.d(context, "getContext(...)");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int i4 = this.f11086B;
        if (i4 == 0 || i4 == -1) {
            i4 = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i4);
        return fragmentContainerView;
    }

    @Override // g0.AbstractComponentCallbacksC0755y
    public final void z() {
        this.f11093I = true;
        View view = this.f8871d0;
        if (view != null && AbstractC0862a.f(view) == S()) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.f8871d0 = null;
    }
}
