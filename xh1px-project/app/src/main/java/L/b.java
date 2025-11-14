package L;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b {
    public static ArrayList a(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static String b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }
}
