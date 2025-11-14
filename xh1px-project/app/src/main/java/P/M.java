package P;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class M {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0258f b(View view, C0258f c0258f) {
        ContentInfo d2 = c0258f.f4266a.d();
        Objects.requireNonNull(d2);
        ContentInfo performReceiveContent = view.performReceiveContent(d2);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == d2) {
            return c0258f;
        }
        return new C0258f(new W0.d(performReceiveContent));
    }
}
