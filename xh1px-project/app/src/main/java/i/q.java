package i;

import P.U;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0860C f11730e;

    public /* synthetic */ q(LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C, int i4) {
        this.f11729d = i4;
        this.f11730e = layoutInflaterFactory2C0860C;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f11729d) {
            case 0:
                LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = this.f11730e;
                if ((layoutInflaterFactory2C0860C.f11576c0 & 1) != 0) {
                    layoutInflaterFactory2C0860C.t(0);
                }
                if ((layoutInflaterFactory2C0860C.f11576c0 & 4096) != 0) {
                    layoutInflaterFactory2C0860C.t(108);
                }
                layoutInflaterFactory2C0860C.f11575b0 = false;
                layoutInflaterFactory2C0860C.f11576c0 = 0;
                return;
            default:
                LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C2 = this.f11730e;
                layoutInflaterFactory2C0860C2.f11596z.showAtLocation(layoutInflaterFactory2C0860C2.f11595y, 55, 0, 0);
                U u8 = layoutInflaterFactory2C0860C2.f11551B;
                if (u8 != null) {
                    u8.b();
                }
                if (layoutInflaterFactory2C0860C2.f11552C && (viewGroup = layoutInflaterFactory2C0860C2.f11553D) != null && viewGroup.isLaidOut()) {
                    layoutInflaterFactory2C0860C2.f11595y.setAlpha(0.0f);
                    U a3 = P.O.a(layoutInflaterFactory2C0860C2.f11595y);
                    a3.a(1.0f);
                    layoutInflaterFactory2C0860C2.f11551B = a3;
                    a3.d(new t(0, this));
                    return;
                }
                layoutInflaterFactory2C0860C2.f11595y.setAlpha(1.0f);
                layoutInflaterFactory2C0860C2.f11595y.setVisibility(0);
                return;
        }
    }
}
