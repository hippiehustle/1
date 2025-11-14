package P;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* renamed from: P.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272u {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0271t f4309a;

    public C0272u(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f4309a = new C0270s(nestedScrollView);
        } else {
            this.f4309a = new G5.e(5);
        }
    }
}
