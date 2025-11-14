package G;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1675f;

    public /* synthetic */ l(Object obj, int i4, int i8) {
        this.f1673d = i8;
        this.f1675f = obj;
        this.f1674e = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1673d) {
            case 0:
                ((b) this.f1675f).g(this.f1674e);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1675f;
                View view = (View) sideSheetBehavior.f10221p.get();
                if (view != null) {
                    sideSheetBehavior.z(view, this.f1674e, false);
                    return;
                }
                return;
        }
    }
}
