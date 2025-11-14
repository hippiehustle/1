package H4;

import O7.i0;
import Z5.j;
import a6.x;
import android.graphics.PointF;
import android.graphics.Rect;
import java.util.Map;

/* loaded from: classes.dex */
public final class d extends c {
    @Override // H4.c
    public final void a(int i4, Rect rect) {
        Map O02 = x.O0(new j(N4.d.f3771d, new PointF((rect.width() - i4) / 2.0f, (rect.height() - i4) / 2.0f)));
        i0 i0Var = this.f2013g;
        i0Var.getClass();
        i0Var.h(null, O02);
    }

    @Override // H4.c
    public final void c(N4.d dVar) {
        if (dVar != N4.d.f3771d) {
            return;
        }
        i0 i0Var = this.f2011e;
        i0Var.h(null, Integer.valueOf(((Number) i0Var.f()).intValue() + 1));
    }
}
