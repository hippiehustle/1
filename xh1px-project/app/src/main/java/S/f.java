package S;

import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public abstract class f {
    public static void a(NestedScrollView nestedScrollView, float f8) {
        try {
            nestedScrollView.setFrameContentVelocity(f8);
        } catch (LinkageError unused) {
        }
    }
}
