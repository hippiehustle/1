package v4;

import O7.V;
import O7.i0;
import Y3.z;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.Z;
import com.buzbuz.smartautoclicker.R;
import i.AbstractC0863b;
import i1.C0879a;

/* renamed from: v4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1676k extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final C0879a f15537b;

    /* renamed from: c, reason: collision with root package name */
    public final C4.f f15538c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f15539d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f15540e;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f15541f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f15542g;

    /* renamed from: h, reason: collision with root package name */
    public final z f15543h;

    public C1676k(Context context, C0879a c0879a, C4.f fVar) {
        o6.j.e(c0879a, "appComponentsProvider");
        o6.j.e(fVar, "debuggingRepository");
        this.f15537b = c0879a;
        this.f15538c = fVar;
        SharedPreferences sharedPreferences = fVar.f632b;
        i0 c6 = V.c(Boolean.valueOf(AbstractC0863b.j(sharedPreferences, context)));
        this.f15539d = c6;
        this.f15540e = c6;
        o6.j.e(sharedPreferences, "<this>");
        i0 c9 = V.c(Boolean.valueOf(sharedPreferences.getBoolean("Debug_Report_Enabled", context.getResources().getBoolean(R.bool.default_debug_report_enabled))));
        this.f15541f = c9;
        this.f15542g = c9;
        this.f15543h = new z(fVar.f634d, 18);
    }
}
