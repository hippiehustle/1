package o;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class J0 extends E0 implements F0 {

    /* renamed from: G, reason: collision with root package name */
    public static final Method f13094G;

    /* renamed from: F, reason: collision with root package name */
    public g0.L f13095F;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f13094G = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // o.F0
    public final void I(n.m mVar, n.o oVar) {
        g0.L l6 = this.f13095F;
        if (l6 != null) {
            l6.I(mVar, oVar);
        }
    }

    @Override // o.F0
    public final void i(n.m mVar, MenuItem menuItem) {
        g0.L l6 = this.f13095F;
        if (l6 != null) {
            l6.i(mVar, menuItem);
        }
    }

    @Override // o.E0
    public final C1213s0 p(Context context, boolean z8) {
        I0 i02 = new I0(context, z8);
        i02.setHoverListener(this);
        return i02;
    }
}
