package J0;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class y {
    public static int a(ViewGroup viewGroup, int i4) {
        return viewGroup.getChildDrawingOrder(i4);
    }

    public static void b(ViewGroup viewGroup, boolean z8) {
        viewGroup.suppressLayout(z8);
    }
}
