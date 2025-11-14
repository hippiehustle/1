package o;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: o.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1186e0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C1188f0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
