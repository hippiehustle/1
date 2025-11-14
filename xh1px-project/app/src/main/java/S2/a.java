package S2;

import android.graphics.Canvas;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a extends View implements i {
    public abstract List<h> getViewComponents$ui_fDroidRelease();

    @Override // android.view.View, S2.i
    public final void invalidate() {
        Iterator<T> it = getViewComponents$ui_fDroidRelease().iterator();
        while (it.hasNext()) {
            ((h) it.next()).c();
        }
        super.invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        o6.j.e(canvas, "canvas");
        Iterator<T> it = getViewComponents$ui_fDroidRelease().iterator();
        while (it.hasNext()) {
            ((h) it.next()).b(canvas);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i8, int i9, int i10) {
        super.onSizeChanged(i4, i8, i9, i10);
        Iterator<T> it = getViewComponents$ui_fDroidRelease().iterator();
        while (it.hasNext()) {
            ((h) it.next()).d(i4, i8);
        }
        invalidate();
    }
}
