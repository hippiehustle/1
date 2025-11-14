package m;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* renamed from: m.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1048k {
    public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i4) {
        callback.onProvideKeyboardShortcuts(list, menu, i4);
    }
}
