package P;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class B implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f4202d = new WeakHashMap();

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z8;
        int i4;
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry entry : this.f4202d.entrySet()) {
                View view = (View) entry.getKey();
                boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                if (view.isShown() && view.getWindowVisibility() == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (booleanValue != z8) {
                    if (z8) {
                        i4 = 16;
                    } else {
                        i4 = 32;
                    }
                    O.h(view, i4);
                    entry.setValue(Boolean.valueOf(z8));
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
