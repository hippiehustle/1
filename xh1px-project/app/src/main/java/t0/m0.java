package t0;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public int f14891a;

    /* renamed from: b, reason: collision with root package name */
    public int f14892b;

    /* renamed from: c, reason: collision with root package name */
    public int f14893c;

    /* renamed from: d, reason: collision with root package name */
    public int f14894d;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f14895e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14896f;

    /* renamed from: g, reason: collision with root package name */
    public int f14897g;

    public final void a(RecyclerView recyclerView) {
        int i4 = this.f14894d;
        if (i4 >= 0) {
            this.f14894d = -1;
            recyclerView.S(i4);
            this.f14896f = false;
            return;
        }
        if (this.f14896f) {
            Interpolator interpolator = this.f14895e;
            if (interpolator != null && this.f14893c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i8 = this.f14893c;
            if (i8 >= 1) {
                recyclerView.f8948h0.c(this.f14891a, this.f14892b, i8, interpolator);
                int i9 = this.f14897g + 1;
                this.f14897g = i9;
                if (i9 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f14896f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        this.f14897g = 0;
    }
}
