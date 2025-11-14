package P;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f4228a;

    public U(View view) {
        this.f4228a = new WeakReference(view);
    }

    public final void a(float f8) {
        View view = (View) this.f4228a.get();
        if (view != null) {
            view.animate().alpha(f8);
        }
    }

    public final void b() {
        View view = (View) this.f4228a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.f4228a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(V v8) {
        View view = (View) this.f4228a.get();
        if (view != null) {
            if (v8 != null) {
                view.animate().setListener(new H5.e(v8, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f8) {
        View view = (View) this.f4228a.get();
        if (view != null) {
            view.animate().translationY(f8);
        }
    }
}
