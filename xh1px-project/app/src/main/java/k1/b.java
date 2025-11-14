package k1;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U4.a f11956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f11957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f11958f;

    public b(U4.a aVar, long j, View view) {
        this.f11956d = aVar;
        this.f11957e = j;
        this.f11958f = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (!((Boolean) this.f11956d.a()).booleanValue() && this.f11957e >= System.currentTimeMillis()) {
            return false;
        }
        this.f11958f.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
