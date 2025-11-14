package u5;

import E2.d;
import android.content.Context;
import com.buzbuz.smartautoclicker.R;
import h4.AbstractC0832f;

/* renamed from: u5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1635a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f15350f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15351a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15352b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15353c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15354d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15355e;

    public C1635a(Context context) {
        boolean F2 = d.F(context, R.attr.elevationOverlayEnabled, false);
        int m6 = AbstractC0832f.m(context, R.attr.elevationOverlayColor, 0);
        int m8 = AbstractC0832f.m(context, R.attr.elevationOverlayAccentColor, 0);
        int m9 = AbstractC0832f.m(context, R.attr.colorSurface, 0);
        float f8 = context.getResources().getDisplayMetrics().density;
        this.f15351a = F2;
        this.f15352b = m6;
        this.f15353c = m8;
        this.f15354d = m9;
        this.f15355e = f8;
    }
}
