package z5;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import c.C0548b;
import com.buzbuz.smartautoclicker.R;
import h4.AbstractC0832f;

/* renamed from: z5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1870a {

    /* renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f16685a;

    /* renamed from: b, reason: collision with root package name */
    public final View f16686b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16687c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16688d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16689e;

    /* renamed from: f, reason: collision with root package name */
    public C0548b f16690f;

    public AbstractC1870a(View view) {
        this.f16686b = view;
        Context context = view.getContext();
        this.f16685a = AbstractC0832f.y(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
        this.f16687c = AbstractC0832f.x(context, R.attr.motionDurationMedium2, 300);
        this.f16688d = AbstractC0832f.x(context, R.attr.motionDurationShort3, 150);
        this.f16689e = AbstractC0832f.x(context, R.attr.motionDurationShort2, 100);
    }
}
