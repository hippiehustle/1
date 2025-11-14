package P;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class v0 extends u0 {
    @Override // q4.X
    public final void N(boolean z8) {
        if (z8) {
            Window window = this.f4310e;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
            return;
        }
        f0(16);
    }
}
