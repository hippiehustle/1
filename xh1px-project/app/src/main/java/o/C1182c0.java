package o;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* renamed from: o.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1182c0 extends AbstractC1186e0 {
    @Override // o.AbstractC1186e0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C1188f0.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
