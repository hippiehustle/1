package o;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class A0 {
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void b(PopupWindow popupWindow, boolean z8) {
        popupWindow.setIsClippedToScreen(z8);
    }
}
