package C;

import android.graphics.RenderNode;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ RenderNode c() {
        return new RenderNode("OffscreenLayer.main");
    }

    public static /* synthetic */ WindowInsets.Builder f() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder g(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ RenderNode t() {
        return new RenderNode("OffscreenLayer.shadow");
    }
}
