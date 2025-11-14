package C5;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f643e;

    public /* synthetic */ b(d dVar, int i4) {
        this.f642d = i4;
        this.f643e = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f642d) {
            case 0:
                d dVar = this.f643e;
                if (dVar.f651h > 0) {
                    SystemClock.uptimeMillis();
                }
                dVar.setVisibility(0);
                return;
            default:
                d dVar2 = this.f643e;
                ((m) dVar2.getCurrentDrawable()).c(false, false, true);
                if ((dVar2.getProgressDrawable() == null || !dVar2.getProgressDrawable().isVisible()) && (dVar2.getIndeterminateDrawable() == null || !dVar2.getIndeterminateDrawable().isVisible())) {
                    dVar2.setVisibility(4);
                }
                dVar2.getClass();
                return;
        }
    }
}
