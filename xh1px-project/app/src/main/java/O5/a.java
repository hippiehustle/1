package O5;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;
import v5.InterfaceC1677a;

/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f4034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1677a f4036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ExpandableBehavior f4037g;

    public a(ExpandableBehavior expandableBehavior, View view, int i4, InterfaceC1677a interfaceC1677a) {
        this.f4037g = expandableBehavior;
        this.f4034d = view;
        this.f4035e = i4;
        this.f4036f = interfaceC1677a;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f4034d;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.f4037g;
        if (expandableBehavior.f10351a == this.f4035e) {
            Object obj = this.f4036f;
            expandableBehavior.w((View) obj, view, ((FloatingActionButton) obj).f10168r.f6992a, false);
        }
        return false;
    }
}
