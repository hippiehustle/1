package P;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class w0 extends q4.X {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsController f4311e;

    /* renamed from: f, reason: collision with root package name */
    public final Window f4312f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(Window window, G5.e eVar) {
        super(13);
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f4311e = insetsController;
        this.f4312f = window;
    }

    @Override // q4.X
    public boolean A() {
        int systemBarsAppearance;
        this.f4311e.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = this.f4311e.getSystemBarsAppearance();
        if ((systemBarsAppearance & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // q4.X
    public final void N(boolean z8) {
        Window window = this.f4312f;
        if (z8) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f4311e.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f4311e.setSystemBarsAppearance(0, 16);
    }

    @Override // q4.X
    public final void O(boolean z8) {
        Window window = this.f4312f;
        if (z8) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f4311e.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f4311e.setSystemBarsAppearance(0, 8);
    }
}
