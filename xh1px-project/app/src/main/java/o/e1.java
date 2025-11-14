package o;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Toolbar f13240e;

    public /* synthetic */ e1(Toolbar toolbar, int i4) {
        this.f13239d = i4;
        this.f13240e = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n.o oVar;
        switch (this.f13239d) {
            case 0:
                g1 g1Var = this.f13240e.f8472P;
                if (g1Var == null) {
                    oVar = null;
                } else {
                    oVar = g1Var.f13259e;
                }
                if (oVar != null) {
                    oVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f13240e.n();
                return;
        }
    }
}
