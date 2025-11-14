package P;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class u0 extends q4.X {

    /* renamed from: e, reason: collision with root package name */
    public final Window f4310e;

    public u0(Window window, G5.e eVar) {
        super(13);
        this.f4310e = window;
    }

    @Override // q4.X
    public final boolean A() {
        if ((this.f4310e.getDecorView().getSystemUiVisibility() & 8192) != 0) {
            return true;
        }
        return false;
    }

    @Override // q4.X
    public final void O(boolean z8) {
        if (z8) {
            Window window = this.f4310e;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
            return;
        }
        f0(8192);
    }

    public final void f0(int i4) {
        View decorView = this.f4310e.getDecorView();
        decorView.setSystemUiVisibility((~i4) & decorView.getSystemUiVisibility());
    }
}
