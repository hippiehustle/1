package o;

import android.view.View;

/* renamed from: o.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1191h implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final C1187f f13261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1197k f13262e;

    public RunnableC1191h(C1197k c1197k, C1187f c1187f) {
        this.f13262e = c1197k;
        this.f13261d = c1187f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n.k kVar;
        C1197k c1197k = this.f13262e;
        n.m mVar = c1197k.f13273f;
        if (mVar != null && (kVar = mVar.f12645e) != null) {
            kVar.A(mVar);
        }
        View view = (View) c1197k.k;
        if (view != null && view.getWindowToken() != null) {
            C1187f c1187f = this.f13261d;
            if (!c1187f.b()) {
                if (c1187f.f12708e != null) {
                    c1187f.d(0, 0, false, false);
                }
            }
            c1197k.f13288w = c1187f;
        }
        c1197k.f13290y = null;
    }
}
