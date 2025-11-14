package m;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* renamed from: m.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1047j {
    public static boolean a(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    public static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i4) {
        return callback.onWindowStartingActionMode(callback2, i4);
    }
}
